# CasesApi

All URIs are relative to */api*

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
import io.github.jhannes.openapi.infectionTracker.api.*;
import io.github.jhannes.openapi.infectionTracker.models.*;

public class Example {
    public static void main(String[] args) {
        CasesApi client = new HttpCasesApi();

        UUID caseId = UUID.randomUUID(); // UUID | 
        try {
            InfectionDto result = client.getCaseDetails(caseId);
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling CasesApi#getCaseDetails");
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **caseId** | **UUID**|  |

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
import io.github.jhannes.openapi.infectionTracker.api.*;
import io.github.jhannes.openapi.infectionTracker.models.*;

public class Example {
    public static void main(String[] args) {
        CasesApi client = new HttpCasesApi();

        try {
            InfectionDto result = client.listCases();
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling CasesApi#listCases");
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
import io.github.jhannes.openapi.infectionTracker.api.*;
import io.github.jhannes.openapi.infectionTracker.models.*;

public class Example {
    public static void main(String[] args) {
        CasesApi client = new HttpCasesApi();

        InfectionInformationDto infectionInformationDto = new InfectionInformationDto(); // InfectionInformationDto | 
        try {
            client.newCase(infectionInformationDto);
        } catch (IOException e) {
            System.err.println("Exception when calling CasesApi#newCase");
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
import io.github.jhannes.openapi.infectionTracker.api.*;
import io.github.jhannes.openapi.infectionTracker.models.*;

public class Example {
    public static void main(String[] args) {
        CasesApi client = new HttpCasesApi();

        UUID caseId = UUID.randomUUID(); // UUID | 
        ExposureDto exposureDto = new ExposureDto(); // ExposureDto | 
        try {
            client.registerExposure(caseId, exposureDto);
        } catch (IOException e) {
            System.err.println("Exception when calling CasesApi#registerExposure");
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **caseId** | **UUID**|  |
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

