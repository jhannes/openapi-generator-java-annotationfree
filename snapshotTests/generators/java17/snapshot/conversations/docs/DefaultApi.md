# DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiCommandsPost**](DefaultApi.md#apiCommandsPost) | **POST** /api/commands | 
[**apiConversationsGet**](DefaultApi.md#apiConversationsGet) | **GET** /api/conversations | 



## apiCommandsPost

> apiCommandsPost(commandToServerDto)



### Example

```java
import io.github.jhannes.openapi.conversations.api.*;
import io.github.jhannes.openapi.conversations.models.*;

public class Example {
    public static void main(String[] args) {
        DefaultApi client = new HttpDefaultApi();

        CommandToServerDto commandToServerDto = new CommandToServerDto(); // CommandToServerDto | A command sent to the server
        try {
            client.apiCommandsPost(commandToServerDto);
        } catch (IOException e) {
            System.err.println("Exception when calling DefaultApi#apiCommandsPost");
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commandToServerDto** | [**CommandToServerDto**](CommandToServerDto.md)| A command sent to the server |

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
| **200** | Command was accepted |  -  |
| **400** | Command was rejected |  -  |


## apiConversationsGet

> List&lt;ConversationSnapshotDto&gt; apiConversationsGet()



### Example

```java
import io.github.jhannes.openapi.conversations.api.*;
import io.github.jhannes.openapi.conversations.models.*;

public class Example {
    public static void main(String[] args) {
        DefaultApi client = new HttpDefaultApi();

        try {
            List<ConversationSnapshotDto> result = client.apiConversationsGet();
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling DefaultApi#apiConversationsGet");
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;ConversationSnapshotDto&gt;**](ConversationSnapshotDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Current ongoing conversations |  -  |

