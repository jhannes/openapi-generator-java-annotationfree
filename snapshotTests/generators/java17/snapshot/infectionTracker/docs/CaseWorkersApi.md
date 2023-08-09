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

public class Example {
    public static void main(String[] args) {
        CaseWorkersApi client = new HttpCaseWorkersApi();

        try {
            CaseWorkerDto result = client.listCaseWorkers();
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling CaseWorkersApi#listCaseWorkers");
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
| **200** | Returns the case workers that the current user can assign to cases |  -  |


## registerCaseWorker

> registerCaseWorker(caseWorkerDto)



### Example

```java
import io.github.jhannes.openapi.infectionTracker.api.*;
import io.github.jhannes.openapi.infectionTracker.models.*;

public class Example {
    public static void main(String[] args) {
        CaseWorkersApi client = new HttpCaseWorkersApi();

        CaseWorkerDto caseWorkerDto = new CaseWorkerDto(); // CaseWorkerDto | 
        try {
            client.registerCaseWorker(caseWorkerDto);
        } catch (IOException e) {
            System.err.println("Exception when calling CaseWorkersApi#registerCaseWorker");
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **caseWorkerDto** | [**CaseWorkerDto**](CaseWorkerDto.md)|  |

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

