# DefaultApi

All URIs are relative to *http://api.example.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**petsPost**](DefaultApi.md#petsPost) | **POST** /pets | 



## petsPost

> petsPost(petDto)



### Example

```java
import io.github.jhannes.openapi.typeHierarchy.api.*;
import io.github.jhannes.openapi.typeHierarchy.models.*;

public class Example {
    public static void main(String[] args) {
        DefaultApi client = new HttpDefaultApi();

        PetDto petDto = new PetDto(); // PetDto | 
        try {
            client.petsPost(petDto);
        } catch (IOException e) {
            System.err.println("Exception when calling DefaultApi#petsPost");
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
| **200** | Updated |  -  |

