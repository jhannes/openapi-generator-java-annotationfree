[![Java CI with Maven](https://github.com/jhannes/openapi-generator-java-annotationfree/actions/workflows/maven.yml/badge.svg)](https://github.com/jhannes/openapi-generator-java-annotationfree/actions/workflows/maven.yml)
[![Apache 2.0 License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.github.jhannes.openapi/openapi-generator-java-annotationfree/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.github.jhannes.openapi/openapi-generator-java-annotationfree)

# OpenAPI Generator for TypeScript client library using Fetch API and API interfaces

## Overview

This is a boiler-plate project to generate your own project derived from an OpenAPI specification.
Its goal is to get you started with the basic plumbing so you can put in your own logic.
It won't work without your changes applied.

## What's OpenAPI

The goal of OpenAPI is to define a standard, language-agnostic interface to REST APIs which allows both humans and computers to discover and understand the capabilities of the service without access to source code, documentation, or through network traffic inspection.
When properly described with OpenAPI, a consumer can understand and interact with the remote service with a minimal amount of implementation logic.
Similar to what interfaces have done for lower-level programming, OpenAPI removes the guesswork in calling the service.

Check out [OpenAPI-Spec](https://github.com/OAI/OpenAPI-Specification) for additional information about the OpenAPI project, including additional libraries with support for other languages and more. 

## How do I use this?

Add to your `pom.xml`:

```xml
    <build>
        <plugins>
            <plugin>
                <groupId>org.openapitools</groupId>
                <artifactId>openapi-generator-maven-plugin</artifactId>
                <version>6.2.0</version>
                <executions>
                    <execution>
                        <id>petstore-java</id>
                        <goals>
                            <goal>generate</goal>
                        </goals>
                        <configuration>
                            <inputSpec>${project.basedir}/src/main/openapi-spec/openapi.yaml</inputSpec>
                            <generatorName>java-annotationfree</generatorName>
                            <modelNameSuffix>Dto</modelNameSuffix>
                            <output>target/generated-sources/openapi-java</output>
                            <configOptions>
                                <generateModelTests>true</generateModelTests>
                            </configOptions>
                        </configuration>
                    </execution>
                </executions>
                <dependencies>
                    <dependency>
                        <groupId>io.github.jhannes.openapi</groupId>
                        <artifactId>openapi-generator-java-annotationfree</artifactId>
                        <version>0.4.2</version>
                    </dependency>
                </dependencies>
            </plugin>
        </plugins>
    </build>

```

## Sample output

### [Petstore model](https://github.com/jhannes/openapi-generator-java-annotationfree/tree/main/snapshotTests/snapshot/petstore/src/main/java/io/github/jhannes/openapi/petstore/model)

### [Polymorphism](https://github.com/jhannes/openapi-generator-java-annotationfree/blob/main/snapshotTests/snapshot/poly/src/main/java/io/github/jhannes/openapi/poly/model/GeneralErrorDto.java)

```yaml
components:
  schemas:
    CreationError:
      oneOf:
        - $ref: '#/components/schemas/GeneralError'
        - $ref: '#/components/schemas/DuplicateIdentifierError'
        - $ref: '#/components/schemas/IllegalEmailAddressError'
      discriminator:
        propertyName: code
    UpdateError:
      oneOf:
        - $ref: '#/components/schemas/GeneralError'
        - $ref: '#/components/schemas/NotFoundError'
        - $ref: '#/components/schemas/DuplicateIdentifierError'
        - $ref: '#/components/schemas/IllegalEmailAddressError'
      discriminator:
        propertyName: code
    GeneralError:
      properties:
        code:
          type: string
        description:
          type: string
      required:
        - code
        - description
```

```java
public interface CreationErrorDto  {
    String getCode();

    static GeneralErrorDto GeneralError() {
        GeneralErrorDto result = new GeneralErrorDto();
        result.code("GeneralError");
        return result;
    }

    static Class<? extends CreationErrorDto> getType(String type) {
        switch (type) {
        case "GeneralError":
            return GeneralErrorDto.class;
        default:
            throw new IllegalArgumentException("Illegal code " + type);
        }
    }

    void readOnlyFieldsWithValue(List<String> fields);
}
```

```java
public class GeneralErrorDto implements CreationErrorDto, UpdateErrorDto {

    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public GeneralErrorDto code(String code) {
        this.code = code;
        return this;
    }
}
```