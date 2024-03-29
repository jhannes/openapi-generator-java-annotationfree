# openapi-java-client

FakeRESTApi.Web V1

- API version: v1

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>v1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-java-client:v1"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/openapi-java-client-v1.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.github.jhannes.openapi.fakerestapi.api.*;
import io.github.jhannes.openapi.fakerestapi.models.*;

public class Example {
    public static void main(String[] args) {
        ActivitiesApi client = new HttpActivitiesApi();

        try {
            List<ActivityDto> result = client.apiV1ActivitiesGet();
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling ActivitiesApi#apiV1ActivitiesGet");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ActivitiesApi* | [**apiV1ActivitiesGet**](docs/ActivitiesApi.md#apiV1ActivitiesGet) | **GET** /api/v1/Activities | 
*ActivitiesApi* | [**apiV1ActivitiesIdDelete**](docs/ActivitiesApi.md#apiV1ActivitiesIdDelete) | **DELETE** /api/v1/Activities/{id} | 
*ActivitiesApi* | [**apiV1ActivitiesIdGet**](docs/ActivitiesApi.md#apiV1ActivitiesIdGet) | **GET** /api/v1/Activities/{id} | 
*ActivitiesApi* | [**apiV1ActivitiesIdPut**](docs/ActivitiesApi.md#apiV1ActivitiesIdPut) | **PUT** /api/v1/Activities/{id} | 
*ActivitiesApi* | [**apiV1ActivitiesPost**](docs/ActivitiesApi.md#apiV1ActivitiesPost) | **POST** /api/v1/Activities | 
*AuthorsApi* | [**apiV1AuthorsAuthorsBooksIdBookGet**](docs/AuthorsApi.md#apiV1AuthorsAuthorsBooksIdBookGet) | **GET** /api/v1/Authors/authors/books/{idBook} | 
*AuthorsApi* | [**apiV1AuthorsGet**](docs/AuthorsApi.md#apiV1AuthorsGet) | **GET** /api/v1/Authors | 
*AuthorsApi* | [**apiV1AuthorsIdDelete**](docs/AuthorsApi.md#apiV1AuthorsIdDelete) | **DELETE** /api/v1/Authors/{id} | 
*AuthorsApi* | [**apiV1AuthorsIdGet**](docs/AuthorsApi.md#apiV1AuthorsIdGet) | **GET** /api/v1/Authors/{id} | 
*AuthorsApi* | [**apiV1AuthorsIdPut**](docs/AuthorsApi.md#apiV1AuthorsIdPut) | **PUT** /api/v1/Authors/{id} | 
*AuthorsApi* | [**apiV1AuthorsPost**](docs/AuthorsApi.md#apiV1AuthorsPost) | **POST** /api/v1/Authors | 
*BooksApi* | [**apiV1BooksGet**](docs/BooksApi.md#apiV1BooksGet) | **GET** /api/v1/Books | 
*BooksApi* | [**apiV1BooksIdDelete**](docs/BooksApi.md#apiV1BooksIdDelete) | **DELETE** /api/v1/Books/{id} | 
*BooksApi* | [**apiV1BooksIdGet**](docs/BooksApi.md#apiV1BooksIdGet) | **GET** /api/v1/Books/{id} | 
*BooksApi* | [**apiV1BooksIdPut**](docs/BooksApi.md#apiV1BooksIdPut) | **PUT** /api/v1/Books/{id} | 
*BooksApi* | [**apiV1BooksPost**](docs/BooksApi.md#apiV1BooksPost) | **POST** /api/v1/Books | 
*CoverPhotosApi* | [**apiV1CoverPhotosBooksCoversIdBookGet**](docs/CoverPhotosApi.md#apiV1CoverPhotosBooksCoversIdBookGet) | **GET** /api/v1/CoverPhotos/books/covers/{idBook} | 
*CoverPhotosApi* | [**apiV1CoverPhotosGet**](docs/CoverPhotosApi.md#apiV1CoverPhotosGet) | **GET** /api/v1/CoverPhotos | 
*CoverPhotosApi* | [**apiV1CoverPhotosIdDelete**](docs/CoverPhotosApi.md#apiV1CoverPhotosIdDelete) | **DELETE** /api/v1/CoverPhotos/{id} | 
*CoverPhotosApi* | [**apiV1CoverPhotosIdGet**](docs/CoverPhotosApi.md#apiV1CoverPhotosIdGet) | **GET** /api/v1/CoverPhotos/{id} | 
*CoverPhotosApi* | [**apiV1CoverPhotosIdPut**](docs/CoverPhotosApi.md#apiV1CoverPhotosIdPut) | **PUT** /api/v1/CoverPhotos/{id} | 
*CoverPhotosApi* | [**apiV1CoverPhotosPost**](docs/CoverPhotosApi.md#apiV1CoverPhotosPost) | **POST** /api/v1/CoverPhotos | 
*UsersApi* | [**apiV1UsersGet**](docs/UsersApi.md#apiV1UsersGet) | **GET** /api/v1/Users | 
*UsersApi* | [**apiV1UsersIdDelete**](docs/UsersApi.md#apiV1UsersIdDelete) | **DELETE** /api/v1/Users/{id} | 
*UsersApi* | [**apiV1UsersIdGet**](docs/UsersApi.md#apiV1UsersIdGet) | **GET** /api/v1/Users/{id} | 
*UsersApi* | [**apiV1UsersIdPut**](docs/UsersApi.md#apiV1UsersIdPut) | **PUT** /api/v1/Users/{id} | 
*UsersApi* | [**apiV1UsersPost**](docs/UsersApi.md#apiV1UsersPost) | **POST** /api/v1/Users | 


## Documentation for Models

 - [ActivityDto](docs/ActivityDto.md)
 - [AuthorDto](docs/AuthorDto.md)
 - [BookDto](docs/BookDto.md)
 - [CoverPhotoDto](docs/CoverPhotoDto.md)
 - [UserDto](docs/UserDto.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



