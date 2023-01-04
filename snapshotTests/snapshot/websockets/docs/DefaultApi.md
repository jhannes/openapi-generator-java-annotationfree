# DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**commandsGet**](DefaultApi.md#commandsGet) | **GET** /commands | 



## commandsGet

> WebSocketCommandDto commandsGet()



### Example

```java
import io.github.jhannes.openapi.websockets.api.*;
import io.github.jhannes.openapi.websockets.models.*;
import org.actioncontroller.client.ApiClientProxy;
import org.actioncontroller.client.HttpClientException;
import org.actioncontroller.client.HttpURLConnectionApiClient;

public class Example {
    public static void main(String[] args) {
        HttpURLConnectionApiClient client = new HttpURLConnectionApiClient("http://localhost");
        DefaultApi apiInstance = ApiClientProxy.create(DefaultApi.class, httpClient);

        try {
            WebSocketCommandDto result = apiInstance.commandsGet();
            System.out.println(result);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling DefaultApi#commandsGet");
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

