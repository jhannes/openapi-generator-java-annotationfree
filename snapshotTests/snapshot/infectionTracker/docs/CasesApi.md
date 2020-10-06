# CasesApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCaseDetails**](CasesApi.md#getCaseDetails) | **GET** /api/cases/{caseId} | 
[**listCases**](CasesApi.md#listCases) | **GET** /api/cases | 
[**newCase**](CasesApi.md#newCase) | **POST** /api/cases | 
[**registerExposure**](CasesApi.md#registerExposure) | **POST** /api/cases/{caseId}/exposures | 



## getCaseDetails

> InfectionDto getCaseDetails(caseId)



### Example

```java
// Import classes:
import io.github.jhannes.openapi.infectionTracker.ApiClient;
import io.github.jhannes.openapi.infectionTracker.ApiException;
import io.github.jhannes.openapi.infectionTracker.Configuration;
import io.github.jhannes.openapi.infectionTracker.models.*;
import io.github.jhannes.openapi.infectionTracker.api.CasesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api");

        CasesApi apiInstance = new CasesApi(defaultClient);
        UUID caseId = new UUID(); // UUID | 
        try {
            InfectionDto result = apiInstance.getCaseDetails(caseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CasesApi#getCaseDetails");
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
 **caseId** | [**UUID**](.md)|  |

### Return type

[**InfectionDto**](InfectionDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The details of an infection case, including the exposures |  -  |


## listCases

> InfectionDto listCases()



### Example

```java
// Import classes:
import io.github.jhannes.openapi.infectionTracker.ApiClient;
import io.github.jhannes.openapi.infectionTracker.ApiException;
import io.github.jhannes.openapi.infectionTracker.Configuration;
import io.github.jhannes.openapi.infectionTracker.models.*;
import io.github.jhannes.openapi.infectionTracker.api.CasesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api");

        CasesApi apiInstance = new CasesApi(defaultClient);
        try {
            InfectionDto result = apiInstance.listCases();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CasesApi#listCases");
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

[**InfectionDto**](InfectionDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The resulting infection case |  -  |


## newCase

> newCase(infectionInformationDto)



### Example

```java
// Import classes:
import io.github.jhannes.openapi.infectionTracker.ApiClient;
import io.github.jhannes.openapi.infectionTracker.ApiException;
import io.github.jhannes.openapi.infectionTracker.Configuration;
import io.github.jhannes.openapi.infectionTracker.models.*;
import io.github.jhannes.openapi.infectionTracker.api.CasesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api");

        CasesApi apiInstance = new CasesApi(defaultClient);
        InfectionInformationDto infectionInformationDto = new InfectionInformationDto(); // InfectionInformationDto | 
        try {
            apiInstance.newCase(infectionInformationDto);
        } catch (ApiException e) {
            System.err.println("Exception when calling CasesApi#newCase");
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
 **infectionInformationDto** | [**InfectionInformationDto**](InfectionInformationDto.md)|  | [optional]

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
| **200** | The case was registered |  -  |


## registerExposure

> registerExposure(caseId, exposureDto)



### Example

```java
// Import classes:
import io.github.jhannes.openapi.infectionTracker.ApiClient;
import io.github.jhannes.openapi.infectionTracker.ApiException;
import io.github.jhannes.openapi.infectionTracker.Configuration;
import io.github.jhannes.openapi.infectionTracker.models.*;
import io.github.jhannes.openapi.infectionTracker.api.CasesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api");

        CasesApi apiInstance = new CasesApi(defaultClient);
        UUID caseId = new UUID(); // UUID | 
        ExposureDto exposureDto = new ExposureDto(); // ExposureDto | 
        try {
            apiInstance.registerExposure(caseId, exposureDto);
        } catch (ApiException e) {
            System.err.println("Exception when calling CasesApi#registerExposure");
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
 **caseId** | [**UUID**](.md)|  |
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

