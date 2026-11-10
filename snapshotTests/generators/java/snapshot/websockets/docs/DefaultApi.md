# DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**commandsGet**](DefaultApi.md#commandsGet) | **GET** /commands |  |
| [**commandsGetWithHttpInfo**](DefaultApi.md#commandsGetWithHttpInfo) | **GET** /commands |  |



## commandsGet

> WebSocketCommandDto commandsGet()



### Example

```java
// Import classes:
import io.github.jhannes.openapi.websockets.ApiClient;
import io.github.jhannes.openapi.websockets.ApiException;
import io.github.jhannes.openapi.websockets.Configuration;
import io.github.jhannes.openapi.websockets.models.*;
import io.github.jhannes.openapi.websockets.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            WebSocketCommandDto result = apiInstance.commandsGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#commandsGet");
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

[**WebSocketCommandDto**](WebSocketCommandDto.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a log of all commands |  -  |

## commandsGetWithHttpInfo

> ApiResponse<WebSocketCommandDto> commandsGetWithHttpInfo()



### Example

```java
// Import classes:
import io.github.jhannes.openapi.websockets.ApiClient;
import io.github.jhannes.openapi.websockets.ApiException;
import io.github.jhannes.openapi.websockets.ApiResponse;
import io.github.jhannes.openapi.websockets.Configuration;
import io.github.jhannes.openapi.websockets.models.*;
import io.github.jhannes.openapi.websockets.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            ApiResponse<WebSocketCommandDto> response = apiInstance.commandsGetWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#commandsGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**WebSocketCommandDto**](WebSocketCommandDto.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a log of all commands |  -  |

