package io.github.jhannes.openapi.javaannotationfree;

import org.openapitools.codegen.languages.JavaClientCodegen;

public class JavaCodegen extends JavaClientCodegen {

    public JavaCodegen() {
        super();
        embeddedTemplateDir = templateDir = "JavaAnnotationfree";
    }

    @Override
    public String getName() {
        return "java-annotationfree";
    }
}
