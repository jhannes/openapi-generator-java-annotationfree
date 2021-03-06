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
                <version>4.3.1</version>
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
                        <version>0.1.0</version>
                    </dependency>
                </dependencies>
            </plugin>
        </plugins>
    </build>

```
