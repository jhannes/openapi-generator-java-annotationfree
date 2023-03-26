# DefaultApi

All URIs are relative to */v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPet**](DefaultApi.md#addPet) | **POST** /{storeId}/pets | 
[**addPetWithForm**](DefaultApi.md#addPetWithForm) | **POST** /pets/{petId} | 
[**listPets**](DefaultApi.md#listPets) | **GET** /{storeId}/pets | 



## addPet

> addPet(storeId, petDto)



### Example

```java
import io.github.jhannes.openapi.example.api.*;
import io.github.jhannes.openapi.example.models.*;

public class Example {
    public static void main(String[] args) {
        DefaultApi client = new HttpDefaultApi();

        UUID storeId = UUID.randomUUID(); // UUID | 
        PetDto petDto = new PetDto(); // PetDto | 
        try {
            client.addPet(storeId, petDto);
        } catch (IOException e) {
            System.err.println("Exception when calling DefaultApi#addPet");
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **UUID**|  |
 **petDto** | [**PetDto**](PetDto.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## addPetWithForm

> addPetWithForm(petId, name, status)



### Example

```java
import io.github.jhannes.openapi.example.api.*;
import io.github.jhannes.openapi.example.models.*;

public class Example {
    public static void main(String[] args) {
        DefaultApi client = new HttpDefaultApi();

        UUID petId = UUID.randomUUID(); // UUID | 
        String name = "name_example"; // String | Updated name of the pet
        String status = "status_example"; // String | Updated status of the pet
        try {
            client.addPetWithForm(petId, name, status);
        } catch (IOException e) {
            System.err.println("Exception when calling DefaultApi#addPetWithForm");
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **petId** | **UUID**|  |
 **name** | **String**| Updated name of the pet |
 **status** | **String**| Updated status of the pet | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |


## listPets

> PetDto listPets(storeId, status, bornAfter, tags)



### Example

```java
import io.github.jhannes.openapi.example.api.*;
import io.github.jhannes.openapi.example.models.*;

public class Example {
    public static void main(String[] args) {
        DefaultApi client = new HttpDefaultApi();

        UUID storeId = UUID.randomUUID(); // UUID | 
        List<String> status = Arrays.asList(); // List<String> | 
        LocalDate bornAfter = LocalDate.now(); // LocalDate | 
        List<String> tags = Arrays.asList(); // List<String> | 
        try {
            PetDto result = client.listPets(storeId, status, bornAfter, tags);
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling DefaultApi#listPets");
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **UUID**|  |
 **status** | [**List&lt;String&gt;**](String.md)|  |
 **bornAfter** | **LocalDate**|  |
 **tags** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

[**PetDto**](PetDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |

