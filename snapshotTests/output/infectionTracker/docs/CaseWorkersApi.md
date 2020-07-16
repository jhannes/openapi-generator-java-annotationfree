# CaseWorkersApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listCaseWorkers**](CaseWorkersApi.md#listCaseWorkers) | **GET** /api/caseWorkers | 
[**registerCaseWorker**](CaseWorkersApi.md#registerCaseWorker) | **POST** /api/caseWorkers | 


<a name="listCaseWorkers"></a>
# **listCaseWorkers**
> CaseWorkerDto listCaseWorkers()



### Example
```java
// Import classes:
import io.github.jhannes.openapi.infectionTracker.ApiClient;
import io.github.jhannes.openapi.infectionTracker.ApiException;
import io.github.jhannes.openapi.infectionTracker.Configuration;
import io.github.jhannes.openapi.infectionTracker.models.*;
import io.github.jhannes.openapi.infectionTracker.api.CaseWorkersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api");

    CaseWorkersApi apiInstance = new CaseWorkersApi(defaultClient);
    try {
      CaseWorkerDto result = apiInstance.listCaseWorkers();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseWorkersApi#listCaseWorkers");
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

[**CaseWorkerDto**](CaseWorkerDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns the case workers that the current user can assign to cases |  -  |

<a name="registerCaseWorker"></a>
# **registerCaseWorker**
> registerCaseWorker(caseWorkerDto)



### Example
```java
// Import classes:
import io.github.jhannes.openapi.infectionTracker.ApiClient;
import io.github.jhannes.openapi.infectionTracker.ApiException;
import io.github.jhannes.openapi.infectionTracker.Configuration;
import io.github.jhannes.openapi.infectionTracker.models.*;
import io.github.jhannes.openapi.infectionTracker.api.CaseWorkersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api");

    CaseWorkersApi apiInstance = new CaseWorkersApi(defaultClient);
    CaseWorkerDto caseWorkerDto = new CaseWorkerDto(); // CaseWorkerDto | 
    try {
      apiInstance.registerCaseWorker(caseWorkerDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseWorkersApi#registerCaseWorker");
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
 **caseWorkerDto** | [**CaseWorkerDto**](CaseWorkerDto.md)|  | [optional]

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

