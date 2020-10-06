# DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**partiesGet**](DefaultApi.md#partiesGet) | **GET** /parties | 
[**partiesIdPut**](DefaultApi.md#partiesIdPut) | **PUT** /parties/{id} | 
[**partiesPost**](DefaultApi.md#partiesPost) | **POST** /parties | 


<a name="partiesGet"></a>
# **partiesGet**
> AnyPartyDto partiesGet()



### Example
```java
// Import classes:
import io.github.jhannes.openapi.poly.ApiClient;
import io.github.jhannes.openapi.poly.ApiException;
import io.github.jhannes.openapi.poly.Configuration;
import io.github.jhannes.openapi.poly.models.*;
import io.github.jhannes.openapi.poly.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      AnyPartyDto result = apiInstance.partiesGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#partiesGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AnyPartyDto**](AnyPartyDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns all parties that the user can see |  -  |

<a name="partiesIdPut"></a>
# **partiesIdPut**
> partiesIdPut(id, anyPartyDto)



### Example
```java
// Import classes:
import io.github.jhannes.openapi.poly.ApiClient;
import io.github.jhannes.openapi.poly.ApiException;
import io.github.jhannes.openapi.poly.Configuration;
import io.github.jhannes.openapi.poly.models.*;
import io.github.jhannes.openapi.poly.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID id = new UUID(); // UUID | 
    AnyPartyDto anyPartyDto = new AnyPartyDto(); // AnyPartyDto | 
    try {
      apiInstance.partiesIdPut(id, anyPartyDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#partiesIdPut");
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
 **id** | [**UUID**](.md)|  |
 **anyPartyDto** | [**AnyPartyDto**](AnyPartyDto.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The party was updated |  -  |
**400** | Something went wrong |  -  |

<a name="partiesPost"></a>
# **partiesPost**
> partiesPost(anyPartyDto)



### Example
```java
// Import classes:
import io.github.jhannes.openapi.poly.ApiClient;
import io.github.jhannes.openapi.poly.ApiException;
import io.github.jhannes.openapi.poly.Configuration;
import io.github.jhannes.openapi.poly.models.*;
import io.github.jhannes.openapi.poly.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    AnyPartyDto anyPartyDto = new AnyPartyDto(); // AnyPartyDto | 
    try {
      apiInstance.partiesPost(anyPartyDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#partiesPost");
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
 **anyPartyDto** | [**AnyPartyDto**](AnyPartyDto.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The party was created |  -  |
**400** | Something went wrong |  -  |

