# DefaultApi

All URIs are relative to *http://api.example.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**petsPatch**](DefaultApi.md#petsPatch) | **PATCH** /pets | 



## petsPatch

> petsPatch(anyPetDto)



### Example

```java
import io.github.jhannes.openapi.typeHierarchy.api.*;
import io.github.jhannes.openapi.typeHierarchy.models.*;
import org.actioncontroller.client.ApiClientProxy;
import org.actioncontroller.client.HttpClientException;
import org.actioncontroller.client.HttpURLConnectionApiClient;

public class Example {
    public static void main(String[] args) {
        HttpURLConnectionApiClient client = new HttpURLConnectionApiClient("http://api.example.com/v1");
        DefaultApi apiInstance = ApiClientProxy.create(DefaultApi.class, httpClient);

        AnyPetDto anyPetDto = new AnyPetDto(); // AnyPetDto | 
        try {
            apiInstance.petsPatch(anyPetDto);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling DefaultApi#petsPatch");
            System.err.println("Status code: " + e.getStatusCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("URL: " + e.getUrl());
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **anyPetDto** | [**AnyPetDto**](AnyPetDto.md)|  | [optional]

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

