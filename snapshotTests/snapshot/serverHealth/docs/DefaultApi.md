# DefaultApi

All URIs are relative to */health*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listHealthResult**](DefaultApi.md#listHealthResult) | **GET** / | 



## listHealthResult

> HealthSummaryDto listHealthResult()



### Example

```java
import io.github.jhannes.openapi.serverHealth.api.*;
import io.github.jhannes.openapi.serverHealth.models.*;

public class Example {
    public static void main(String[] args) {
        DefaultApi client = new HttpDefaultApi();

        try {
            HealthSummaryDto result = client.listHealthResult();
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling DefaultApi#listHealthResult");
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**HealthSummaryDto**](HealthSummaryDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The server is operating as expected |  -  |

