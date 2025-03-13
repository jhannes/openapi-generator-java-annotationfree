package io.github.jhannes.openapi.javaannotationfree;

import org.openapitools.codegen.CodegenConstants;
import org.openapitools.codegen.CodegenDiscriminator;
import org.openapitools.codegen.CodegenModel;
import org.openapitools.codegen.CodegenOperation;
import org.openapitools.codegen.CodegenProperty;
import org.openapitools.codegen.CodegenResponse;
import org.openapitools.codegen.SupportingFile;
import org.openapitools.codegen.languages.AbstractJavaCodegen;
import org.openapitools.codegen.model.ModelMap;
import org.openapitools.codegen.model.ModelsMap;
import org.openapitools.codegen.model.OperationsMap;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class JavaCodegen extends AbstractJavaCodegen {

    private final Set<String> mixinInterfaces = new HashSet<>();

    public JavaCodegen() {
        embeddedTemplateDir = templateDir = "JavaAnnotationfree";
        artifactId = "openapi-java-client";
        supportsMixins = true;
        reservedWords.remove("list");
    }

    @Override
    public void processOpts() {
        if (!additionalProperties.containsKey(CodegenConstants.PACKAGE_NAME)) {
            additionalProperties.put(CodegenConstants.PACKAGE_NAME, "org.openapitools.client");
        }
        if (!additionalProperties.containsKey(CodegenConstants.API_PACKAGE)) {
            additionalProperties.put(CodegenConstants.API_PACKAGE, additionalProperties.get(CodegenConstants.PACKAGE_NAME) + ".api");
        }
        if (!additionalProperties.containsKey(CodegenConstants.MODEL_PACKAGE)) {
            additionalProperties.put(CodegenConstants.MODEL_PACKAGE, additionalProperties.get(CodegenConstants.PACKAGE_NAME) + ".model");
        }
        super.processOpts();
        supportingFiles.add(new SupportingFile("README.mustache", "", "README.md").doNotOverwrite());
        apiTemplateFiles.put("api_http.mustache", ".java");

        if (additionalProperties.get(CodegenConstants.GENERATE_MODEL_TESTS) == Boolean.TRUE) {
            supportingFiles.add(new SupportingFile("sample_model_data.mustache", sourceFolder + File.separator + modelPackage().replace('.', File.separatorChar), "SampleModelData.java"));
        }
        additionalProperties.put("curly", "{");
    }

    @Override
    public String apiFilename(String templateName, String tag) {
        if (templateName.equals("api_http.mustache")) {
            return apiFileFolder() + File.separator + "Http" + toApiName(tag) + ".java";
        }
        return super.apiFilename(templateName, tag);
    }

    @Override
    public String getName() {
        return "java-annotationfree";
    }

    @Override
    public OperationsMap postProcessOperationsWithModels(OperationsMap objs, List<ModelMap> allModels) {
        objs = super.postProcessOperationsWithModels(objs, allModels);

        Set<String> exceptionPayloads = new HashSet<>();

        for (CodegenOperation operation : (objs.getOperations()).getOperation()) {
            for (CodegenResponse response : operation.responses) {
                if (response.is4xx && response.dataType != null) {
                    exceptionPayloads.add(response.dataType);
                    ((Collection<String>) operation.vendorExtensions.get("x-java-import")).add(response.dataType);
                }
            }
        }
        //objs.put("exceptionPayloads", exceptionPayloads);

        return objs;
    }


    public void postProcessOneOf(CodegenModel codegenModel, Map<String, List<CodegenModel>> interfacesOfSubtypes, Map<String, CodegenModel> allModels) {
        Set<CodegenDiscriminator.MappedModel> mappedModels = new HashSet<>();
        HashMap<String, String> mapping = new HashMap<>();
        for (String className : codegenModel.oneOf) {
            CodegenModel subModel = allModels.get(className);
            if (subModel.oneOf.isEmpty()) {
                mappedModels.add(new CodegenDiscriminator.MappedModel(subModel.name, className));
                mapping.put(subModel.name, className);
            } else if (
                    codegenModel.discriminator != null
                    && subModel.discriminator != null
                    && subModel.discriminator.getPropertyName().equals(codegenModel.discriminator.getPropertyName())
            ) {
                if (subModel.discriminator.getMapping() == null) {
                    postProcessOneOf(subModel, interfacesOfSubtypes, allModels);
                }
                mappedModels.addAll(subModel.discriminator.getMappedModels());
                mapping.putAll(subModel.discriminator.getMapping());
            } else if (codegenModel.discriminator != null && subModel.discriminator != null) {
                //not matching discriminators, cannot be matched from spec
                continue;
            }
            List<CodegenModel> subtypeInterfaces = interfacesOfSubtypes.computeIfAbsent(className, k -> new ArrayList<>());
            if (!subtypeInterfaces.contains(codegenModel)) {
                subtypeInterfaces.add(codegenModel);
            }
        }
        codegenModel.allVars.removeIf(var -> codegenModel.interfaceModels.stream().anyMatch(model -> varNotInImplementation(var, model)));
        if (codegenModel.discriminator != null && codegenModel.discriminator.getMapping() == null) {
            codegenModel.discriminator.setMapping(mapping);
            codegenModel.discriminator.setMappedModels(mappedModels);
        }
        if (codegenModel.discriminator != null) {
            codegenModel.allVars.removeIf(v -> v.name.equals(codegenModel.discriminator.getPropertyName()));
        }
    }

    private static boolean varNotInImplementation(CodegenProperty var, CodegenModel model) {
        if (!model.oneOf.isEmpty()) {
            for (CodegenModel subtype : model.interfaceModels) {
                if (varNotInImplementation(var, subtype)) {
                    return true;
                }
            }
        }
        return model.allVars.stream()
                .noneMatch(memberVar -> memberVar.name.equals(var.name) && memberVar.datatypeWithEnum.equals(var.datatypeWithEnum));
    }

    @Override
    public Map<String, ModelsMap> postProcessAllModels(Map<String, ModelsMap> objs) {
        ArrayList<String> elementsToBeRemoved = new ArrayList<>();
        Map<String, ModelsMap> result = super.postProcessAllModels(objs);

        Map<String, CodegenModel> allModels = getAllModels(objs);

        Map<String, List<CodegenModel>> interfacesOfSubtypes = new HashMap<>();
        Set<String> multiplyInheritedTypes = new HashSet<>();
        for (CodegenModel codegenModel : allModels.values()) {
            if (!codegenModel.oneOf.isEmpty()) {
                postProcessOneOf(codegenModel, interfacesOfSubtypes, allModels);
            }
            if (!codegenModel.allOf.isEmpty()) {
                List<CodegenModel> interfacesToBeRemoved = codegenModel.interfaceModels.stream()
                        .filter(element -> element.name.startsWith(codegenModel.name + "_allOf"))
                        .collect(Collectors.toList());
                for (CodegenModel itf : interfacesToBeRemoved) {
                    codegenModel.allOf.remove(itf.classname);
                    elementsToBeRemoved.add(itf.name);
                    codegenModel.interfaceModels.removeIf(e -> e.name.equals(itf.name));
                }
                if (codegenModel.allOf.size() > 1) {
                    List<String> interfaceNames = new ArrayList<>();
                    for (CodegenModel supertype : codegenModel.interfaceModels) {
                        multiplyInheritedTypes.add(supertype.name);
                        interfaceNames.add(supertype.name + "Interface");
                        while (supertype.parentModel != null) {
                            supertype = supertype.parentModel;
                            multiplyInheritedTypes.add(supertype.name);
                        }
                    }
                    codegenModel.interfaces = interfaceNames;
                } else if (codegenModel.parent == null) {
                    // Mark inherited variables from allOf
                    codegenModel.parent = codegenModel.allOf.iterator().next();
                    codegenModel.parentModel = allModels.get(codegenModel.parent);
                    for (CodegenProperty var : codegenModel.allVars) {
                        if (codegenModel.parentModel.allVars.stream().anyMatch(v -> v.name.equals(var.name))) {
                            var.isInherited = true;
                        }
                    }
                    codegenModel.interfaces = null;
                }
            }
        }

        for (String type : multiplyInheritedTypes) {
            CodegenModel dtoModel = result.get(type).getModels().get(0).getModel();

            CodegenModel interfaceModel = new CodegenModel() {
                public boolean isMixin = true;
            };
            interfaceModel.classname = type + "Interface";
            if (dtoModel.parentModel != null) {
                interfaceModel.parent = dtoModel.parentModel.name + "Interface";
            }
            for (CodegenProperty property : dtoModel.allVars) {
                interfaceModel.allVars.add(property.clone());
            }

            ModelMap modelMap = new ModelMap();
            modelMap.setModel(interfaceModel);
            ModelsMap models = new ModelsMap();
            models.putAll(result.get(type));
            models.setModels(List.of(modelMap));
            result.put(interfaceModel.classname, models);

            dtoModel.interfaces = List.of(interfaceModel.classname);
            mixinInterfaces.add(interfaceModel.classname);

            for (CodegenModel codegenModel : allModels.values()) {
                if (codegenModel.interfaces != null && codegenModel.interfaces.contains(interfaceModel.classname)) {
                    for (CodegenProperty property : codegenModel.allVars) {
                        if (property.isEnum) {
                            property.isEnum = false;
                            property.dataType = property.datatypeWithEnum;
                        }
                    }
                }
            }
        }

        // Only support interfaces from oneOfModels
        for (Map.Entry<String, CodegenModel> modelEntry : allModels.entrySet()) {
            modelEntry.getValue().interfaceModels = interfacesOfSubtypes.get(modelEntry.getKey());
            if (modelEntry.getValue().interfaceModels != null) {
                modelEntry.getValue().interfaces = modelEntry.getValue().interfaceModels.stream()
                        .map(CodegenModel::getClassname)
                        .collect(Collectors.toList());
            } else if (!modelEntry.getValue().oneOf.isEmpty()) {
                modelEntry.getValue().interfaces = null;
            }
        }

        for (var element : elementsToBeRemoved) {
            result.remove(element);
        }
        for (ModelsMap modelsMap : result.values()) {
            for (ModelMap model : modelsMap.getModels()) {
                for (CodegenProperty variable : model.getModel().allVars) {
                    if (variable.isModel) {
                        if (allModels.get(variable.dataType).oneOf.isEmpty()) {
                            variable.defaultValue = "new " + variable.dataType + "()";
                        }
                    }
                    if (variable.isArray) {
                        variable.defaultValue = variable.getUniqueItems() ? "new LinkedHashSet<>()" : "new ArrayList<>()";
                    }
                    if (variable.get_enum() != null && variable.get_enum().size() == 1) {
                        variable.defaultValue = "\"" + variable.get_enum().get(0) + "\"";
                        variable.dataType = "\"" + variable.get_enum().get(0) + "\"";
                        variable.datatypeWithEnum = "String";
                        variable.isEnum = false;
                    }
                }
                updateVariablesLists(model.getModel());
            }
        }
        return result;
    }

    private static void updateVariablesLists(CodegenModel codegenModel) {
        codegenModel.vars = new ArrayList<>();
        codegenModel.parentVars = new ArrayList<>();
        codegenModel.optionalVars = new ArrayList<>();
        codegenModel.readOnlyVars = new ArrayList<>();
        codegenModel.readOnlyVars = new ArrayList<>();
        for (CodegenProperty var : codegenModel.allVars) {
            if (var.isInherited) {
                codegenModel.parentVars.add(var.clone());
            } else {
                codegenModel.vars.add(var.clone());
            }

            if (var.required) {
                codegenModel.requiredVars.add(var.clone());
            } else {
                codegenModel.optionalVars.add(var.clone());
            }

            if (var.isReadOnly) {
                codegenModel.readOnlyVars.add(var.clone());
            } else if (!var.isWriteOnly) {
                codegenModel.readWriteVars.add(var.clone());
            }
        }
    }

    @Override
    public String toModelName(String name) {
        return mixinInterfaces.contains(name) ? name : super.toModelName(name);
    }

    @Override
    public String toEnumVarName(String value, String datatype) {
        if (enumNameMapping.containsKey(value)) {
            return enumNameMapping.get(value);
        }

        if (value.isEmpty()) {
            return "EMPTY";
        }

        // for symbol, e.g. $, #
        if (getSymbolName(value) != null) {
            return getSymbolName(value).toUpperCase(Locale.ROOT);
        }

        if (" ".equals(value)) {
            return "SPACE";
        }

        // number
        if ("Integer".equals(datatype) || "Long".equals(datatype) ||
            "Float".equals(datatype) || "Double".equals(datatype) || "BigDecimal".equals(datatype)) {
            String varName = "NUMBER_" + value;
            varName = varName.replaceAll("-", "MINUS_");
            varName = varName.replaceAll("\\+", "PLUS_");
            varName = varName.replaceAll("\\.", "_DOT_");
            return varName;
        }

        // string
        String var = value.replaceAll("\\W+", "_");
        if (var.matches("\\d.*")) {
            var = "_" + var;
        }
        return reservedWords.contains(var) ? escapeReservedWord(var) : var;
    }
}
