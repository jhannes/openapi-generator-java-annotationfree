# CaseWorkersApi

All URIs are relative to */api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listCaseWorkers**](CaseWorkersApi.md#listCaseWorkers) | **GET** /api/caseWorkers | 
[**registerCaseWorker**](CaseWorkersApi.md#registerCaseWorker) | **POST** /api/caseWorkers | 



## listCaseWorkers

> CaseWorkerDto listCaseWorkers()



### Example

```java
import io.github.jhannes.openapi.infectionTracker.api.*;
import io.github.jhannes.openapi.infectionTracker.models.*;
import org.actioncontroller.client.ApiClientProxy;
import org.actioncontroller.client.HttpClientException;
import org.actioncontroller.client.HttpURLConnectionApiClient;

public class Example {
    public static void main(String[] args) {
        HttpURLConnectionApiClient client = new HttpURLConnectionApiClient("/api");
        CaseWorkersApi apiInstance = ApiClientProxy.create(CaseWorkersApi.class, httpClient);

        try {
            CaseWorkerDto result = apiInstance.listCaseWorkers();
            System.out.println(result);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling CaseWorkersApi#listCaseWorkers");
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

[**CaseWorkerDto**](CaseWorkerDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the case workers that the current user can assign to cases |  -  |


## registerCaseWorker

> registerCaseWorker(caseWorkerDto)



### Example

```java
import io.github.jhannes.openapi.infectionTracker.api.*;
import io.github.jhannes.openapi.infectionTracker.models.*;
import org.actioncontroller.client.ApiClientProxy;
import org.actioncontroller.client.HttpClientException;
import org.actioncontroller.client.HttpURLConnectionApiClient;

public class Example {
    public static void main(String[] args) {
        HttpURLConnectionApiClient client = new HttpURLConnectionApiClient("/api");
        CaseWorkersApi apiInstance = ApiClientProxy.create(CaseWorkersApi.class, httpClient);

        CaseWorkerDto caseWorkerDto = new CaseWorkerDto(); // CaseWorkerDto | 
        try {
            apiInstance.registerCaseWorker(caseWorkerDto);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling CaseWorkersApi#registerCaseWorker");
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
| **200** | The exposure was registered |  -  |

