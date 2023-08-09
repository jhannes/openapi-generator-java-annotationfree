# PetApi

All URIs are relative to *http://petstore.swagger.io/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPet**](PetApi.md#addPet) | **POST** /pet | Add a new pet to the store
[**deletePet**](PetApi.md#deletePet) | **DELETE** /pet/{petId} | Deletes a pet
[**downloadImage**](PetApi.md#downloadImage) | **GET** /pet/{petId}/image | downloads image
[**findPetsByStatus**](PetApi.md#findPetsByStatus) | **GET** /pet/findByStatus | Finds Pets by status
[**findPetsByTags**](PetApi.md#findPetsByTags) | **GET** /pet/findByTags | Finds Pets by tags
[**getPetById**](PetApi.md#getPetById) | **GET** /pet/{petId} | Find pet by ID
[**updatePet**](PetApi.md#updatePet) | **PUT** /pet | Update an existing pet
[**updatePetWithForm**](PetApi.md#updatePetWithForm) | **POST** /pet/{petId} | Updates a pet in the store with form data
[**uploadFile**](PetApi.md#uploadFile) | **POST** /pet/{petId}/uploadImage | uploads an image



## addPet

> addPet(petDto)

Add a new pet to the store

### Example

```java
import io.github.jhannes.openapi.petstore.api.*;
import io.github.jhannes.openapi.petstore.models.*;

public class Example {
    public static void main(String[] args) {
    
        // Configure HTTP basic authorization: petstore_auth
        HttpURLConnectionApiClient client = new HttpURLConnectionApiClient("http://petstore.swagger.io/v2") {
            @Override
            public ClientExchange createExchange() {
                String authentication = "Bearer " + "BEARER TOKEN";
                exchange.setHeader("Authorization", authentication);
                return exchange;
            }
        };

        PetDto petDto = new PetDto(); // PetDto | Pet object that needs to be added to the store
        try {
            client.addPet(petDto);
        } catch (IOException e) {
            System.err.println("Exception when calling PetApi#addPet");
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **petDto** | [**PetDto**](PetDto.md)| Pet object that needs to be added to the store | [optional]

### Return type

null (empty response body)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

- **Content-Type**: application/json, application/xml
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **405** | Invalid input |  -  |


## deletePet

> deletePet(petId, apiKey)

Deletes a pet

### Example

```java
import io.github.jhannes.openapi.petstore.api.*;
import io.github.jhannes.openapi.petstore.models.*;

public class Example {
    public static void main(String[] args) {
    
        // Configure HTTP basic authorization: petstore_auth
        HttpURLConnectionApiClient client = new HttpURLConnectionApiClient("http://petstore.swagger.io/v2") {
            @Override
            public ClientExchange createExchange() {
                String authentication = "Bearer " + "BEARER TOKEN";
                exchange.setHeader("Authorization", authentication);
                return exchange;
            }
        };

        Long petId = 56L; // Long | Pet id to delete
        String apiKey = "apiKey_example"; // String | 
        try {
            client.deletePet(petId, apiKey);
        } catch (IOException e) {
            System.err.println("Exception when calling PetApi#deletePet");
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **petId** | **Long**| Pet id to delete |
 **apiKey** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Invalid pet value |  -  |


## downloadImage

> File downloadImage(petId)

downloads image

### Example

```java
import io.github.jhannes.openapi.petstore.api.*;
import io.github.jhannes.openapi.petstore.models.*;

public class Example {
    public static void main(String[] args) {
        PetApi client = new HttpPetApi();

        Long petId = 56L; // Long | 
        try {
            File result = client.downloadImage(petId);
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling PetApi#downloadImage");
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **petId** | **Long**|  |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: image/jpeg

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The primary pet image |  -  |


## findPetsByStatus

> List&lt;PetDto&gt; findPetsByStatus(status)

Finds Pets by status

Multiple status values can be provided with comma separated strings

### Example

```java
import io.github.jhannes.openapi.petstore.api.*;
import io.github.jhannes.openapi.petstore.models.*;

public class Example {
    public static void main(String[] args) {
    
        // Configure HTTP basic authorization: petstore_auth
        HttpURLConnectionApiClient client = new HttpURLConnectionApiClient("http://petstore.swagger.io/v2") {
            @Override
            public ClientExchange createExchange() {
                String authentication = "Bearer " + "BEARER TOKEN";
                exchange.setHeader("Authorization", authentication);
                return exchange;
            }
        };

        List<String> status = Arrays.asList(); // List<String> | Status values that need to be considered for filter
        try {
            List<PetDto> result = client.findPetsByStatus(status);
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling PetApi#findPetsByStatus");
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | [**List&lt;String&gt;**](String.md)| Status values that need to be considered for filter | [optional] [enum: available, pending, sold]

### Return type

[**List&lt;PetDto&gt;**](PetDto.md)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Invalid status value |  -  |


## findPetsByTags

> List&lt;PetDto&gt; findPetsByTags(tags)

Finds Pets by tags

Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.

### Example

```java
import io.github.jhannes.openapi.petstore.api.*;
import io.github.jhannes.openapi.petstore.models.*;

public class Example {
    public static void main(String[] args) {
    
        // Configure HTTP basic authorization: petstore_auth
        HttpURLConnectionApiClient client = new HttpURLConnectionApiClient("http://petstore.swagger.io/v2") {
            @Override
            public ClientExchange createExchange() {
                String authentication = "Bearer " + "BEARER TOKEN";
                exchange.setHeader("Authorization", authentication);
                return exchange;
            }
        };

        List<String> tags = Arrays.asList(); // List<String> | Tags to filter by
        try {
            List<PetDto> result = client.findPetsByTags(tags);
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling PetApi#findPetsByTags");
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| Tags to filter by | [optional]

### Return type

[**List&lt;PetDto&gt;**](PetDto.md)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Invalid tag value |  -  |


## getPetById

> PetDto getPetById(petId)

Find pet by ID

Returns a pet when ID &lt; 10.  ID &gt; 10 or nonintegers will simulate API error conditions

### Example

```java
import io.github.jhannes.openapi.petstore.api.*;
import io.github.jhannes.openapi.petstore.models.*;

public class Example {
    public static void main(String[] args) {
    
        // Configure HTTP basic authorization: petstore_auth
        HttpURLConnectionApiClient client = new HttpURLConnectionApiClient("http://petstore.swagger.io/v2") {
            @Override
            public ClientExchange createExchange() {
                String authentication = "Bearer " + "BEARER TOKEN";
                exchange.setHeader("Authorization", authentication);
                return exchange;
            }
        };
// Configure HTTP bearer authorization: api_key
        PetApi client = new HttpPetApi() {
            protected HttpURLConnection openConnection(String relativeUrl) throws IOException {
                HttpURLConnection connection = super.openConnection(relativeUrl);
                connection.setRequestParameter("api_key", apiKey);
                return connection;
            }
        };

        Long petId = 56L; // Long | ID of pet that needs to be fetched
        try {
            PetDto result = client.getPetById(petId);
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling PetApi#getPetById");
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **petId** | **Long**| ID of pet that needs to be fetched |

### Return type

[**PetDto**](PetDto.md)

### Authorization

[petstore_auth](../README.md#petstore_auth), [api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Invalid ID supplied |  -  |
| **404** | Pet not found |  -  |


## updatePet

> updatePet(petDto)

Update an existing pet

### Example

```java
import io.github.jhannes.openapi.petstore.api.*;
import io.github.jhannes.openapi.petstore.models.*;

public class Example {
    public static void main(String[] args) {
    
        // Configure HTTP basic authorization: petstore_auth
        HttpURLConnectionApiClient client = new HttpURLConnectionApiClient("http://petstore.swagger.io/v2") {
            @Override
            public ClientExchange createExchange() {
                String authentication = "Bearer " + "BEARER TOKEN";
                exchange.setHeader("Authorization", authentication);
                return exchange;
            }
        };

        PetDto petDto = new PetDto(); // PetDto | Pet object that needs to be added to the store
        try {
            client.updatePet(petDto);
        } catch (IOException e) {
            System.err.println("Exception when calling PetApi#updatePet");
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **petDto** | [**PetDto**](PetDto.md)| Pet object that needs to be added to the store | [optional]

### Return type

null (empty response body)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

- **Content-Type**: application/json, application/xml
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Invalid ID supplied |  -  |
| **404** | Pet not found |  -  |
| **405** | Validation exception |  -  |


## updatePetWithForm

> updatePetWithForm(petId, name, status)

Updates a pet in the store with form data

### Example

```java
import io.github.jhannes.openapi.petstore.api.*;
import io.github.jhannes.openapi.petstore.models.*;

public class Example {
    public static void main(String[] args) {
    
        // Configure HTTP basic authorization: petstore_auth
        HttpURLConnectionApiClient client = new HttpURLConnectionApiClient("http://petstore.swagger.io/v2") {
            @Override
            public ClientExchange createExchange() {
                String authentication = "Bearer " + "BEARER TOKEN";
                exchange.setHeader("Authorization", authentication);
                return exchange;
            }
        };

        String petId = "petId_example"; // String | ID of pet that needs to be updated
        String name = "name_example"; // String | Updated name of the pet
        String status = "status_example"; // String | Updated status of the pet
        try {
            client.updatePetWithForm(petId, name, status);
        } catch (IOException e) {
            System.err.println("Exception when calling PetApi#updatePetWithForm");
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **petId** | **String**| ID of pet that needs to be updated |
 **name** | **String**| Updated name of the pet | [optional]
 **status** | **String**| Updated status of the pet | [optional]

### Return type

null (empty response body)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **405** | Invalid input |  -  |


## uploadFile

> uploadFile(petId, additionalMetadata, _file)

uploads an image

### Example

```java
import io.github.jhannes.openapi.petstore.api.*;
import io.github.jhannes.openapi.petstore.models.*;

public class Example {
    public static void main(String[] args) {
    
        // Configure HTTP basic authorization: petstore_auth
        HttpURLConnectionApiClient client = new HttpURLConnectionApiClient("http://petstore.swagger.io/v2") {
            @Override
            public ClientExchange createExchange() {
                String authentication = "Bearer " + "BEARER TOKEN";
                exchange.setHeader("Authorization", authentication);
                return exchange;
            }
        };

        Long petId = 56L; // Long | ID of pet to update
        String additionalMetadata = "additionalMetadata_example"; // String | Additional data to pass to server
        File _file = new File("/path/to/file"); // File | file to upload
        try {
            client.uploadFile(petId, additionalMetadata, _file);
        } catch (IOException e) {
            System.err.println("Exception when calling PetApi#uploadFile");
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **petId** | **Long**| ID of pet to update |
 **additionalMetadata** | **String**| Additional data to pass to server | [optional]
 **_file** | **File**| file to upload | [optional]

### Return type

null (empty response body)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | successful operation |  -  |

