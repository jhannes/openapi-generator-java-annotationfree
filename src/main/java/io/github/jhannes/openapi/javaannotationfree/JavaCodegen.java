package io.github.jhannes.openapi.javaannotationfree;

import org.openapitools.codegen.CodegenDiscriminator;
import org.openapitools.codegen.CodegenModel;
import org.openapitools.codegen.CodegenProperty;
import org.openapitools.codegen.SupportingFile;
import org.openapitools.codegen.languages.AbstractJavaCodegen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class JavaCodegen extends AbstractJavaCodegen {

    public JavaCodegen() {
        super();
        embeddedTemplateDir = templateDir = "JavaAnnotationfree";
        artifactId = "openapi-java-client";
    }

    @Override
    public void processOpts() {
        super.processOpts();
        supportingFiles.add(new SupportingFile("README.mustache", "", "README.md").doNotOverwrite());
    }

    @Override
    public String getName() {
        return "java-annotationfree";
    }

    @Override
    public String getLibrary() {
        return "action-controller";
    }

    @Override
    public Map<String, Object> postProcessAllModels(Map<String, Object> objs) {
        Map<String, Object> result = super.postProcessAllModels(objs);

        Map<String, CodegenModel> allModels = new HashMap<>();
        for (Map.Entry<String, Object> entry : result.entrySet()) {
            Map<String, Object> inner = (Map<String, Object>) entry.getValue();
            for (Map<String, Object> model : (List<Map<String, Object>>) inner.get("models")) {
                CodegenModel codegenModel = (CodegenModel) model.get("model");
                allModels.put(codegenModel.classname, codegenModel);
            }
        }

        Map<String, List<CodegenModel>> interfacesOfSubtypes = new HashMap<>();
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
                if (codegenModel.discriminator.getMapping() == null) {
                    codegenModel.discriminator.setMapping(mapping);
                    codegenModel.discriminator.setMappedModels(mappedModels);
                }
            }
            // Mark inherited variables from allOf
            if (!codegenModel.allOf.isEmpty()) {
                if (codegenModel.parent == null) {
                    codegenModel.parent = codegenModel.allOf.iterator().next();
                    codegenModel.parentModel = allModels.get(codegenModel.parent);
                    for (CodegenProperty var : codegenModel.vars) {
                        if (codegenModel.parentModel.vars.stream().anyMatch(v -> v.name.equals(var.name))) {
                            var.isInherited = true;
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
            } else {
                modelEntry.getValue().interfaces = null;
            }
        }
        return result;
    }
}
