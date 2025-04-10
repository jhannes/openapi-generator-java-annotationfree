# DefaultApi

All URIs are relative to *http://api.example.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**petsPost**](DefaultApi.md#petsPost) | **POST** /pets |  |
| [**petsPostWithHttpInfo**](DefaultApi.md#petsPostWithHttpInfo) | **POST** /pets |  |



## petsPost

> void petsPost(petDto)



### Example

```java
// Import classes:
import io.github.jhannes.openapi.typeHierarchy.ApiClient;
import io.github.jhannes.openapi.typeHierarchy.ApiException;
import io.github.jhannes.openapi.typeHierarchy.Configuration;
import io.github.jhannes.openapi.typeHierarchy.models.*;
import io.github.jhannes.openapi.typeHierarchy.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.example.com/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        PetDto petDto = new PetDto(); // PetDto | 
        try {
            apiInstance.petsPost(petDto);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#petsPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **petDto** | [**PetDto**](PetDto.md)|  | [optional] |

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

## petsPostWithHttpInfo

> ApiResponse<Void> petsPost petsPostWithHttpInfo(petDto)



### Example

```java
// Import classes:
import io.github.jhannes.openapi.typeHierarchy.ApiClient;
import io.github.jhannes.openapi.typeHierarchy.ApiException;
import io.github.jhannes.openapi.typeHierarchy.ApiResponse;
import io.github.jhannes.openapi.typeHierarchy.Configuration;
import io.github.jhannes.openapi.typeHierarchy.models.*;
import io.github.jhannes.openapi.typeHierarchy.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.example.com/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        PetDto petDto = new PetDto(); // PetDto | 
        try {
            ApiResponse<Void> response = apiInstance.petsPostWithHttpInfo(petDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#petsPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **petDto** | [**PetDto**](PetDto.md)|  | [optional] |

### Return type


ApiResponse<Void>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated |  -  |

