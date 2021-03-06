# ExposuresApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listExposures**](ExposuresApi.md#listExposures) | **GET** /api/exposures | 
[**updateExposure**](ExposuresApi.md#updateExposure) | **PUT** /api/exposures/{exposureId} | 



## listExposures

> ExposureDto listExposures()



### Example

```java
import io.github.jhannes.openapi.infectionTracker.api.*;
import io.github.jhannes.openapi.infectionTracker.models.*;
import org.actioncontroller.client.ApiClientProxy;
import org.actioncontroller.client.HttpClientException;
import org.actioncontroller.client.HttpURLConnectionApiClient;

public class Example {
    public static void main(String[] args) {
        HttpURLConnectionApiClient client = new HttpURLConnectionApiClient("http://localhost/api");
        ExposuresApi apiInstance = ApiClientProxy.create(ExposuresApi.class, httpClient);

        try {
            ExposureDto result = apiInstance.listExposures();
            System.out.println(result);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling ExposuresApi#listExposures");
            System.err.println("Status code: " + e.getStatusCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("URL: " + e.getUrl());
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
| **200** | List exposures that the case worker can follow up |  -  |


## updateExposure

> updateExposure(exposureId, exposureDto)



### Example

```java
import io.github.jhannes.openapi.infectionTracker.api.*;
import io.github.jhannes.openapi.infectionTracker.models.*;
import org.actioncontroller.client.ApiClientProxy;
import org.actioncontroller.client.HttpClientException;
import org.actioncontroller.client.HttpURLConnectionApiClient;

public class Example {
    public static void main(String[] args) {
        HttpURLConnectionApiClient client = new HttpURLConnectionApiClient("http://localhost/api");
        ExposuresApi apiInstance = ApiClientProxy.create(ExposuresApi.class, httpClient);

        UUID exposureId = new UUID(); // UUID | 
        ExposureDto exposureDto = new ExposureDto(); // ExposureDto | 
        try {
            apiInstance.updateExposure(exposureId, exposureDto);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling ExposuresApi#updateExposure");
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
| **200** | The exposure was registered |  -  |

