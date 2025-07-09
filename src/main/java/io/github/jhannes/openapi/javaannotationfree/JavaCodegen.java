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
import java.util.TreeMap;
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
    public String getName() {
        return "java-annotationfree";
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

    @Override
    public String toModelName(String name) {
        return mixinInterfaces.contains(name) ? name : super.toModelName(name);
    }

    @Override
    public Map<String, ModelsMap> postProcessAllModels(Map<String, ModelsMap> objs) {
        Map<String, ModelsMap> result = super.postProcessAllModels(objs);
        processAllOfTypes(result);
        processOneOfInterfaces(result);
        setupDerivedVariables(result);
        return result;
    }

    private void setupDerivedVariables(Map<String, ModelsMap> result) {
        Map<String, CodegenModel> allModels = getAllModels(result);
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
    }

    private void processAllOfTypes(Map<String, ModelsMap> result) {
        Set<String> multiplyInheritedTypes = new HashSet<>();
        Map<String, CodegenModel> allModels = getAllModels(result);
        for (Map.Entry<String, CodegenModel> codegenEntry : allModels.entrySet()) {
            CodegenModel codegenModel = codegenEntry.getValue();
            if (!codegenModel.allOf.isEmpty()) {
                List<CodegenModel> interfacesToBeRemoved = codegenModel.interfaceModels.stream()
                        .filter(element -> element.name.startsWith(codegenModel.name + "_allOf"))
                        .collect(Collectors.toList());
                for (CodegenModel itf : interfacesToBeRemoved) {
                    codegenModel.allOf.remove(itf.classname);
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
    }

    private static CodegenModel createMixin(CodegenModel dtoModel) {
        CodegenModel interfaceModel = new CodegenModel() {
            public boolean isMixin = true;

            public Collection<CodegenModel> getDescendants() {
                Map<String, CodegenModel> result = new TreeMap<>();
                putDescendants(this, result);
                return result.values();
            }

            private void putDescendants(CodegenModel codegenModel, Map<String, CodegenModel> descendants) {
                for (CodegenModel child : codegenModel.children) {
                    if (descendants.containsKey(child.name)) {
                        // prefer interface to implementation
                        if (descendants.get(child.name).interfaceModels.contains(child)) {
                            descendants.put(child.name, child);
                        }
                    } else {
                        descendants.put(child.name, child);
                    }
                    putDescendants(child, descendants);
                }
            }
        };
        interfaceModel.name = dtoModel.name;
        interfaceModel.interfaceModels = new ArrayList<>();
        interfaceModel.classname = dtoModel.name + "Interface";
        for (CodegenProperty property : dtoModel.allVars) {
            CodegenProperty clone = property.clone();
            interfaceModel.allVars.add(clone);
            property.isNew = true;
        }
        return interfaceModel;
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

    private void processOneOfInterfaces(Map<String, ModelsMap> objs) {
        Map<String, List<CodegenModel>> interfacesOfSubtypes = new HashMap<>();
        Map<String, CodegenModel> allModels = getAllModels(objs);
        for (CodegenModel codegenModel : allModels.values()) {
            if (!codegenModel.oneOf.isEmpty()) {
                postProcessOneOf(codegenModel, interfacesOfSubtypes, allModels);
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
    }

    public void postProcessOneOf(CodegenModel codegenModel, Map<String, List<CodegenModel>> interfacesOfSubtypes, Map<String, CodegenModel> allModels) {
        Set<CodegenDiscriminator.MappedModel> mappedModels = new HashSet<>();
        HashMap<String, String> mapping = new HashMap<>();
        CodegenDiscriminator discriminator = codegenModel.discriminator;
        for (String className : codegenModel.oneOf) {
            CodegenModel subModel = allModels.get(className);
            if (subModel.oneOf.isEmpty()) {
                mappedModels.add(new CodegenDiscriminator.MappedModel(subModel.name, subModel.classname));
                mapping.put(subModel.name, subModel.classname);
            } else if (
                    discriminator != null
                            && subModel.discriminator != null
                            && subModel.discriminator.getPropertyName().equals(discriminator.getPropertyName())
            ) {
                if (subModel.discriminator.getMapping() == null) {
                    postProcessOneOf(subModel, interfacesOfSubtypes, allModels);
                }
                mappedModels.addAll(subModel.discriminator.getMappedModels());
                mapping.putAll(subModel.discriminator.getMapping());
            } else if (discriminator != null && subModel.discriminator != null) {
                //not matching discriminators, cannot be matched from spec
                continue;
            }
            List<CodegenModel> subtypeInterfaces = interfacesOfSubtypes.computeIfAbsent(subModel.classname, k -> new ArrayList<>());
            if (!subtypeInterfaces.contains(codegenModel)) {
                subtypeInterfaces.add(codegenModel);
            }
        }
        codegenModel.allVars.removeIf(var -> codegenModel.interfaceModels.stream().anyMatch(model -> varNotInImplementation(var, model)));
        if (discriminator != null && discriminator.getMapping() == null) {
            discriminator.setMapping(mapping);
            discriminator.setMappedModels(mappedModels);
        }
        if (discriminator != null) {
            codegenModel.allVars.removeIf(v -> v.name.equals(discriminator.getPropertyName()));
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
