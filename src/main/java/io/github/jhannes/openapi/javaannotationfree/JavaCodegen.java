package io.github.jhannes.openapi.javaannotationfree;

import org.openapitools.codegen.CodegenDiscriminator;
import org.openapitools.codegen.CodegenModel;
import org.openapitools.codegen.CodegenProperty;
import org.openapitools.codegen.SupportingFile;
import org.openapitools.codegen.languages.AbstractJavaCodegen;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JavaCodegen extends AbstractJavaCodegen {

    public JavaCodegen() {
        super();
        embeddedTemplateDir = templateDir = "JavaAnnotationfree";
        artifactId = "openapi-java-client";
    }

    @Override
    public void processOpts() {
        super.processOpts();
        writeOptional(outputFolder, new SupportingFile("README.mustache", "", "README.md"));
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
        for (Map.Entry<String, Object> entry : result.entrySet()) {
            Map<String, Object> inner = (Map<String, Object>) entry.getValue();
            List<Map<String, Object>> models = (List<Map<String, Object>>) inner.get("models");
            for (Map<String, Object> model : models) {
                CodegenModel codegenModel = (CodegenModel) model.get("model");
                if (!codegenModel.oneOf.isEmpty()) {
                    if (codegenModel.discriminator.getMapping() == null) {
                        Set<CodegenDiscriminator.MappedModel> mappedModels = new HashSet<>();
                        HashMap<String, String> mapping = new HashMap<>();
                        for (String className : codegenModel.oneOf) {
                            String subtypeModel = result.entrySet().stream()
                                    .filter(e -> ((Map<String, Object>) e.getValue()).get("classname").equals(className))
                                    .map(Map.Entry::getKey)
                                    .findFirst()
                                    .orElseThrow(() -> new IllegalArgumentException("Undefined model " + className + " referenced from " + codegenModel.getClassname()));
                            mapping.put(subtypeModel, className);
                            mappedModels.add(new CodegenDiscriminator.MappedModel(subtypeModel, className));
                        }
                        codegenModel.discriminator.setMapping(mapping);
                        codegenModel.discriminator.setMappedModels(mappedModels);
                    }
                }
                if (!codegenModel.allOf.isEmpty()) {
                    if (codegenModel.parent == null) {
                        codegenModel.parent = codegenModel.allOf.iterator().next();
                        String parentName = codegenModel.parent.replaceAll(getModelNameSuffix() + "$", "");
                        codegenModel.parentModel = (CodegenModel) ((List<Map<String, Object>>)((Map<String,Object>)objs.get(parentName)).get("models")).get(0).get("model");
                        for (CodegenProperty var : codegenModel.vars) {
                            if (codegenModel.parentModel.vars.stream().anyMatch(v -> v.name.equals(var.name))) {
                                var.isInherited = true;
                            }
                        }

                    }
                }
            }
        }
        return result;
    }
}
