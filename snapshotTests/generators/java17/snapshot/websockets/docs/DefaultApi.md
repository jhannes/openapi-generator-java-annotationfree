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

public class Example {
    public static void main(String[] args) {
        DefaultApi client = new HttpDefaultApi();

        try {
            WebSocketCommandDto result = client.commandsGet();
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling DefaultApi#commandsGet");
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

