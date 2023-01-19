package io.github.jhannes.openapi.javaannotationfree;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.media.ComposedSchema;
import io.swagger.v3.oas.models.media.Schema;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class JavaCodegen extends AbstractJavaCodegen {

    private final Logger LOGGER = LoggerFactory.getLogger(AbstractJavaCodegen.class);
    private Set<String> mixinInterfaces = new HashSet<>();

    public JavaCodegen() {
        embeddedTemplateDir = templateDir = "JavaAnnotationfree";
        artifactId = "openapi-java-client";
        supportsMixins = true;
    }

    @Override
    public void processOpts() {
        super.processOpts();
        supportingFiles.add(new SupportingFile("README.mustache", "", "README.md").doNotOverwrite());

        if (additionalProperties.get(CodegenConstants.GENERATE_MODEL_TESTS) == Boolean.TRUE) {
            supportingFiles.add(new SupportingFile("sample_model_data.mustache",  sourceFolder + File.separator + modelPackage().replace('.', File.separatorChar), "SampleModelData.java"));
        }
        additionalProperties.put("curly", "{");
    }

    @Override
    public String getName() {
        return "java-annotationfree";
    }

    @Override
    public String getLibrary() {
        return "action-controller";
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void processOpenAPI(OpenAPI openAPI) {
        for (Schema<?> schema : openAPI.getComponents().getSchemas().values()) {
            if (schema instanceof ComposedSchema) {
                ComposedSchema composedSchema = (ComposedSchema) schema;
                if (composedSchema.getAllOf() != null) {
                    for (Iterator<Schema> iterator = composedSchema.getAllOf().iterator(); iterator.hasNext(); ) {
                        Schema parentSchema = iterator.next();
                        String $ref = parentSchema.get$ref();
                        if ($ref.endsWith("_allOf")) {
                            assert $ref.startsWith("#/components/schemas/");
                            Schema parent = openAPI.getComponents().getSchemas().get($ref.substring("#/components/schemas/".length()));
                            if (schema.getProperties() == null) {
                                schema.setProperties(parent.getProperties());
                            } else if (parentSchema.getProperties() != null) {
                                schema.getProperties().putAll(parent.getProperties());
                            }
                            if (schema.getRequired() == null) {
                                schema.setRequired(parent.getRequired());
                            } else if (parent.getRequired() != null) {
                                schema.getRequired().addAll(parent.getRequired());
                            }

                            iterator.remove();
                        }
                    }
                }
            }
        }
        openAPI.getComponents().getSchemas().entrySet().removeIf(model -> model.getKey().endsWith("_allOf"));
        super.processOpenAPI(openAPI);
    }


    @Override
    public OperationsMap postProcessOperationsWithModels(OperationsMap objs, List<ModelMap> allModels) {
        objs = super.postProcessOperationsWithModels(objs, allModels);

        Set<String> exceptionPayloads = new HashSet<>();

        for (CodegenOperation operation : (objs.getOperations()).getOperation()) {
            for (CodegenResponse response : operation.responses) {
                if (response.is4xx && response.dataType != null) {
                    exceptionPayloads.add(response.dataType);
                    ((Collection<String>)operation.vendorExtensions.get("x-java-import")).add(response.dataType);
                }
            }
        }
        //objs.put("exceptionPayloads", exceptionPayloads);

        return objs;
    }

    @Override
    public Map<String, ModelsMap> postProcessAllModels(Map<String, ModelsMap> objs) {
        Map<String, ModelsMap> result = super.postProcessAllModels(objs);

        Map<String, CodegenModel> allModels = getAllModels(objs);

        Map<String, List<CodegenModel>> interfacesOfSubtypes = new HashMap<>();
        Set<String> multiplyInheritedTypes = new HashSet<>();
        for (CodegenModel codegenModel : allModels.values()) {
            if (!codegenModel.oneOf.isEmpty()) {
                Set<CodegenDiscriminator.MappedModel> mappedModels = new HashSet<>();
                HashMap<String, String> mapping = new HashMap<>();
                for (String className : codegenModel.oneOf) {
                    interfacesOfSubtypes
                            .computeIfAbsent(className, k -> new ArrayList<>())
                            .add(codegenModel);
                    String subtype = allModels.get(className).name;
                    mapping.put(subtype, className);
                    mappedModels.add(new CodegenDiscriminator.MappedModel(subtype, className));
                }
                if (codegenModel.discriminator != null && codegenModel.discriminator.getMapping() == null) {
                    codegenModel.discriminator.setMapping(mapping);
                    codegenModel.discriminator.setMappedModels(mappedModels);
                }
            }
            if (!codegenModel.allOf.isEmpty()) {
                if (codegenModel.allOf.size() >= 2) {
                    //codegenModel.interfaces = new ArrayList<>(codegenModel.allOf);
                    List<String> interfaceNames = new ArrayList<>();
                    for (CodegenModel supertype : codegenModel.interfaceModels) {
                        multiplyInheritedTypes.add(supertype.name);
                        interfaceNames.add(supertype.name + "Interface");
                    }
                    codegenModel.interfaces = interfaceNames;
                } else if (codegenModel.parent == null) {
                    // Mark inherited variables from allOf
                    codegenModel.parent = codegenModel.allOf.iterator().next();
                    codegenModel.parentModel = allModels.get(codegenModel.parent);
                    for (CodegenProperty var : codegenModel.vars) {
                        if (codegenModel.parentModel.vars.stream().anyMatch(v -> v.name.equals(var.name))) {
                            var.isInherited = true;
                        }
                    }
                    codegenModel.interfaces = null;
                }
            }
            for (CodegenProperty variable : codegenModel.vars) {
                if (variable.get_enum() != null && variable.get_enum().size() == 1) {
                    variable.defaultValue = "\"" + variable.get_enum().get(0) + "\"";
                    variable.dataType = "\"" + variable.get_enum().get(0) + "\"";
                    variable.datatypeWithEnum = "String";
                    variable.isEnum = false;
                }
            }
            for (CodegenProperty variable : codegenModel.allVars) {
                if (variable.get_enum() != null && variable.get_enum().size() == 1) {
                    variable.defaultValue = "\"" + variable.get_enum().get(0) + "\"";
                    variable.dataType = "\"" + variable.get_enum().get(0) + "\"";
                    variable.datatypeWithEnum = "String";
                    variable.isEnum = false;
                }
            }
        }

        for (String type : multiplyInheritedTypes) {
            CodegenModel dtoModel = result.get(type).getModels().get(0).getModel();

            CodegenModel interfaceModel = new CodegenModel() {
                public boolean isMixin = true;
            };
            interfaceModel.classname = type + "Interface";
            interfaceModel.vars.addAll(dtoModel.vars);
            interfaceModel.allVars.addAll(dtoModel.allVars);

            ModelMap modelMap = new ModelMap();
            modelMap.setModel(interfaceModel);
            ModelsMap models = new ModelsMap();
            models.putAll(result.get(type));
            models.setModels(List.of(modelMap));
            result.put(interfaceModel.classname, models);

            dtoModel.interfaces = List.of(interfaceModel.classname);
            mixinInterfaces.add(interfaceModel.classname);
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
        return result;
    }

    @Override
    public String toModelName(String name) {
        return mixinInterfaces.contains(name) ? name : super.toModelName(name);
    }

    @Override
    public String toAllOfName(List<String> names, ComposedSchema composedSchema) {
        Map<String, Object> exts = composedSchema.getExtensions();
        if (exts != null && exts.containsKey("x-all-of-name")) {
            return (String) exts.get("x-all-of-name");
        }
        if (names.size() == 0) {
            this.LOGGER.error("allOf has no member defined: {}. Default to ERROR_ALLOF_SCHEMA", composedSchema);
            return "ERROR_ALLOF_SCHEMA";
        } else if (names.size() == 1) {
            return names.get(0);
        } else {
            return "oneOf<" + String.join(",", names) + ">";
        }
    }
}
