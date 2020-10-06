# ExposuresApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listExposures**](ExposuresApi.md#listExposures) | **GET** /api/exposures | 
[**updateExposure**](ExposuresApi.md#updateExposure) | **PUT** /api/exposures/{exposureId} | 


<a name="listExposures"></a>
# **listExposures**
> ExposureDto listExposures()



### Example
```java
// Import classes:
import io.github.jhannes.openapi.infectionTracker.ApiClient;
import io.github.jhannes.openapi.infectionTracker.ApiException;
import io.github.jhannes.openapi.infectionTracker.Configuration;
import io.github.jhannes.openapi.infectionTracker.models.*;
import io.github.jhannes.openapi.infectionTracker.api.ExposuresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api");

    ExposuresApi apiInstance = new ExposuresApi(defaultClient);
    try {
      ExposureDto result = apiInstance.listExposures();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExposuresApi#listExposures");
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

[**ExposureDto**](ExposureDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List exposures that the case worker can follow up |  -  |

<a name="updateExposure"></a>
# **updateExposure**
> updateExposure(exposureId, exposureDto)



### Example
```java
// Import classes:
import io.github.jhannes.openapi.infectionTracker.ApiClient;
import io.github.jhannes.openapi.infectionTracker.ApiException;
import io.github.jhannes.openapi.infectionTracker.Configuration;
import io.github.jhannes.openapi.infectionTracker.models.*;
import io.github.jhannes.openapi.infectionTracker.api.ExposuresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api");

    ExposuresApi apiInstance = new ExposuresApi(defaultClient);
    UUID exposureId = new UUID(); // UUID | 
    ExposureDto exposureDto = new ExposureDto(); // ExposureDto | 
    try {
      apiInstance.updateExposure(exposureId, exposureDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExposuresApi#updateExposure");
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
 **exposureId** | [**UUID**](.md)|  |
 **exposureDto** | [**ExposureDto**](ExposureDto.md)|  | [optional]

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
**200** | The exposure was registered |  -  |

