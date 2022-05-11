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
import org.actioncontroller.client.ApiClientProxy;
import org.actioncontroller.client.HttpClientException;
import org.actioncontroller.client.HttpURLConnectionApiClient;

public class Example {
    public static void main(String[] args) {
        HttpURLConnectionApiClient client = new HttpURLConnectionApiClient("http://localhost");
        DefaultApi apiInstance = ApiClientProxy.create(DefaultApi.class, httpClient);

        LogMessageDto logMessageDto = new LogMessageDto(); // LogMessageDto | 
        try {
            apiInstance.logMessage(logMessageDto);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling DefaultApi#logMessage");
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
import org.actioncontroller.client.ApiClientProxy;
import org.actioncontroller.client.HttpClientException;
import org.actioncontroller.client.HttpURLConnectionApiClient;

public class Example {
    public static void main(String[] args) {
        HttpURLConnectionApiClient client = new HttpURLConnectionApiClient("http://localhost");
        DefaultApi apiInstance = ApiClientProxy.create(DefaultApi.class, httpClient);

        try {
            AnyPartyDto result = apiInstance.partiesGet();
            System.out.println(result);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling DefaultApi#partiesGet");
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
import org.actioncontroller.client.ApiClientProxy;
import org.actioncontroller.client.HttpClientException;
import org.actioncontroller.client.HttpURLConnectionApiClient;

public class Example {
    public static void main(String[] args) {
        HttpURLConnectionApiClient client = new HttpURLConnectionApiClient("http://localhost");
        DefaultApi apiInstance = ApiClientProxy.create(DefaultApi.class, httpClient);

        UUID id = new UUID(); // UUID | 
        AnyPartyDto anyPartyDto = new AnyPartyDto(); // AnyPartyDto | 
        try {
            apiInstance.partiesIdPut(id, anyPartyDto);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling DefaultApi#partiesIdPut");
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
 **id** | [**UUID**](.md)|  |
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
import org.actioncontroller.client.ApiClientProxy;
import org.actioncontroller.client.HttpClientException;
import org.actioncontroller.client.HttpURLConnectionApiClient;

public class Example {
    public static void main(String[] args) {
        HttpURLConnectionApiClient client = new HttpURLConnectionApiClient("http://localhost");
        DefaultApi apiInstance = ApiClientProxy.create(DefaultApi.class, httpClient);

        AnyPartyDto anyPartyDto = new AnyPartyDto(); // AnyPartyDto | 
        try {
            apiInstance.partiesPost(anyPartyDto);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling DefaultApi#partiesPost");
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

