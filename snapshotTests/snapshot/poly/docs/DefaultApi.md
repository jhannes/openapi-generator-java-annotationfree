# DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**logMessage**](DefaultApi.md#logMessage) | **POST** /log | 
[**partiesGet**](DefaultApi.md#partiesGet) | **GET** /parties | 
[**partiesIdPut**](DefaultApi.md#partiesIdPut) | **PUT** /parties/{id} | 
[**partiesPost**](DefaultApi.md#partiesPost) | **POST** /parties | 



## logMessage

> logMessage(logMessageDto)



### Example

```java
import io.github.jhannes.openapi.poly.api.*;
import io.github.jhannes.openapi.poly.models.*;

public class Example {
    public static void main(String[] args) {
        DefaultApi client = new HttpDefaultApi();

        LogMessageDto logMessageDto = new LogMessageDto(); // LogMessageDto | 
        try {
            client.logMessage(logMessageDto);
        } catch (IOException e) {
            System.err.println("Exception when calling DefaultApi#logMessage");
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logMessageDto** | [**LogMessageDto**](LogMessageDto.md)|  | [optional]

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
| **200** | Log message was saved |  -  |


## partiesGet

> AnyPartyDto partiesGet()



### Example

```java
import io.github.jhannes.openapi.poly.api.*;
import io.github.jhannes.openapi.poly.models.*;

public class Example {
    public static void main(String[] args) {
        DefaultApi client = new HttpDefaultApi();

        try {
            AnyPartyDto result = client.partiesGet();
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling DefaultApi#partiesGet");
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**AnyPartyDto**](AnyPartyDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns all parties that the user can see |  -  |


## partiesIdPut

> partiesIdPut(id, anyPartyDto)



### Example

```java
import io.github.jhannes.openapi.poly.api.*;
import io.github.jhannes.openapi.poly.models.*;

public class Example {
    public static void main(String[] args) {
        DefaultApi client = new HttpDefaultApi();

        UUID id = UUID.randomUUID(); // UUID | 
        AnyPartyDto anyPartyDto = new AnyPartyDto(); // AnyPartyDto | 
        try {
            client.partiesIdPut(id, anyPartyDto);
        } catch (IOException e) {
            System.err.println("Exception when calling DefaultApi#partiesIdPut");
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**|  |
 **anyPartyDto** | [**AnyPartyDto**](AnyPartyDto.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The party was updated |  -  |
| **400** | Something went wrong |  -  |


## partiesPost

> partiesPost(anyPartyDto)



### Example

```java
import io.github.jhannes.openapi.poly.api.*;
import io.github.jhannes.openapi.poly.models.*;

public class Example {
    public static void main(String[] args) {
        DefaultApi client = new HttpDefaultApi();

        AnyPartyDto anyPartyDto = new AnyPartyDto(); // AnyPartyDto | 
        try {
            client.partiesPost(anyPartyDto);
        } catch (IOException e) {
            System.err.println("Exception when calling DefaultApi#partiesPost");
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **anyPartyDto** | [**AnyPartyDto**](AnyPartyDto.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The party was created |  -  |
| **400** | Something went wrong |  -  |

