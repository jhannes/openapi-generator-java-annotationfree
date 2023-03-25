# UsersApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1UsersGet**](UsersApi.md#apiV1UsersGet) | **GET** /api/v1/Users | 
[**apiV1UsersIdDelete**](UsersApi.md#apiV1UsersIdDelete) | **DELETE** /api/v1/Users/{id} | 
[**apiV1UsersIdGet**](UsersApi.md#apiV1UsersIdGet) | **GET** /api/v1/Users/{id} | 
[**apiV1UsersIdPut**](UsersApi.md#apiV1UsersIdPut) | **PUT** /api/v1/Users/{id} | 
[**apiV1UsersPost**](UsersApi.md#apiV1UsersPost) | **POST** /api/v1/Users | 



## apiV1UsersGet

> List&lt;UserDto&gt; apiV1UsersGet()



### Example

```java
import io.github.jhannes.openapi.fakerestapi.api.*;
import io.github.jhannes.openapi.fakerestapi.models.*;
import org.actioncontroller.client.ApiClientProxy;
import org.actioncontroller.client.HttpClientException;
import org.actioncontroller.client.HttpURLConnectionApiClient;

public class Example {
    public static void main(String[] args) {
        HttpURLConnectionApiClient client = new HttpURLConnectionApiClient("http://localhost");
        UsersApi apiInstance = ApiClientProxy.create(UsersApi.class, httpClient);

        try {
            List<UserDto> result = apiInstance.apiV1UsersGet();
            System.out.println(result);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling UsersApi#apiV1UsersGet");
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

[**List&lt;UserDto&gt;**](UserDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain; v=1.0, application/json; v=1.0, text/json; v=1.0

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiV1UsersIdDelete

> apiV1UsersIdDelete(id)



### Example

```java
import io.github.jhannes.openapi.fakerestapi.api.*;
import io.github.jhannes.openapi.fakerestapi.models.*;
import org.actioncontroller.client.ApiClientProxy;
import org.actioncontroller.client.HttpClientException;
import org.actioncontroller.client.HttpURLConnectionApiClient;

public class Example {
    public static void main(String[] args) {
        HttpURLConnectionApiClient client = new HttpURLConnectionApiClient("http://localhost");
        UsersApi apiInstance = ApiClientProxy.create(UsersApi.class, httpClient);

        Integer id = 56; // Integer | 
        try {
            apiInstance.apiV1UsersIdDelete(id);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling UsersApi#apiV1UsersIdDelete");
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
 **id** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiV1UsersIdGet

> apiV1UsersIdGet(id)



### Example

```java
import io.github.jhannes.openapi.fakerestapi.api.*;
import io.github.jhannes.openapi.fakerestapi.models.*;
import org.actioncontroller.client.ApiClientProxy;
import org.actioncontroller.client.HttpClientException;
import org.actioncontroller.client.HttpURLConnectionApiClient;

public class Example {
    public static void main(String[] args) {
        HttpURLConnectionApiClient client = new HttpURLConnectionApiClient("http://localhost");
        UsersApi apiInstance = ApiClientProxy.create(UsersApi.class, httpClient);

        Integer id = 56; // Integer | 
        try {
            apiInstance.apiV1UsersIdGet(id);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling UsersApi#apiV1UsersIdGet");
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
 **id** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiV1UsersIdPut

> apiV1UsersIdPut(id, userDto)



### Example

```java
import io.github.jhannes.openapi.fakerestapi.api.*;
import io.github.jhannes.openapi.fakerestapi.models.*;
import org.actioncontroller.client.ApiClientProxy;
import org.actioncontroller.client.HttpClientException;
import org.actioncontroller.client.HttpURLConnectionApiClient;

public class Example {
    public static void main(String[] args) {
        HttpURLConnectionApiClient client = new HttpURLConnectionApiClient("http://localhost");
        UsersApi apiInstance = ApiClientProxy.create(UsersApi.class, httpClient);

        Integer id = 56; // Integer | 
        UserDto userDto = new UserDto(); // UserDto | 
        try {
            apiInstance.apiV1UsersIdPut(id, userDto);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling UsersApi#apiV1UsersIdPut");
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
 **id** | **Integer**|  |
 **userDto** | [**UserDto**](UserDto.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json; v=1.0, text/json; v=1.0, application/*+json; v=1.0
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiV1UsersPost

> apiV1UsersPost(userDto)



### Example

```java
import io.github.jhannes.openapi.fakerestapi.api.*;
import io.github.jhannes.openapi.fakerestapi.models.*;
import org.actioncontroller.client.ApiClientProxy;
import org.actioncontroller.client.HttpClientException;
import org.actioncontroller.client.HttpURLConnectionApiClient;

public class Example {
    public static void main(String[] args) {
        HttpURLConnectionApiClient client = new HttpURLConnectionApiClient("http://localhost");
        UsersApi apiInstance = ApiClientProxy.create(UsersApi.class, httpClient);

        UserDto userDto = new UserDto(); // UserDto | 
        try {
            apiInstance.apiV1UsersPost(userDto);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling UsersApi#apiV1UsersPost");
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
 **userDto** | [**UserDto**](UserDto.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json; v=1.0, text/json; v=1.0, application/*+json; v=1.0
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

