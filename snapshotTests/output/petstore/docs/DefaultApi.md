# DefaultApi

All URIs are relative to *http://api.example.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**petsPatch**](DefaultApi.md#petsPatch) | **PATCH** /pets | 


<a name="petsPatch"></a>
# **petsPatch**
> petsPatch(anyPetDto)



### Example
```java
// Import classes:
import io.github.jhannes.openapi.petstore.ApiClient;
import io.github.jhannes.openapi.petstore.ApiException;
import io.github.jhannes.openapi.petstore.Configuration;
import io.github.jhannes.openapi.petstore.models.*;
import io.github.jhannes.openapi.petstore.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.example.com/v1");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    AnyPetDto anyPetDto = new AnyPetDto(); // AnyPetDto | 
    try {
      apiInstance.petsPatch(anyPetDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#petsPatch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
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
**200** | Updated |  -  |

