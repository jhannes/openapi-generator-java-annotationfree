# ExposuresApi

All URIs are relative to */api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listExposures**](ExposuresApi.md#listExposures) | **GET** /api/exposures | 
[**updateExposure**](ExposuresApi.md#updateExposure) | **PUT** /api/exposures/{exposureId} | 



## listExposures

> ExposureDto listExposures(exposureDate, maxCount)



### Example

```java
import io.github.jhannes.openapi.infectionTracker.api.*;
import io.github.jhannes.openapi.infectionTracker.models.*;

public class Example {
    public static void main(String[] args) {
        ExposuresApi client = new HttpExposuresApi();

        List<LocalDate> exposureDate = Arrays.asList(); // List<LocalDate> | 
        Integer maxCount = 56; // Integer | 
        try {
            ExposureDto result = client.listExposures(exposureDate, maxCount);
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling ExposuresApi#listExposures");
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exposureDate** | [**List&lt;LocalDate&gt;**](LocalDate.md)|  | [optional]
 **maxCount** | **Integer**|  | [optional]

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

public class Example {
    public static void main(String[] args) {
        ExposuresApi client = new HttpExposuresApi();

        UUID exposureId = UUID.randomUUID(); // UUID | 
        ExposureDto exposureDto = new ExposureDto(); // ExposureDto | 
        try {
            client.updateExposure(exposureId, exposureDto);
        } catch (IOException e) {
            System.err.println("Exception when calling ExposuresApi#updateExposure");
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exposureId** | **UUID**|  |
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

