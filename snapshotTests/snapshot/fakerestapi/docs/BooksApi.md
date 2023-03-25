# BooksApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1BooksGet**](BooksApi.md#apiV1BooksGet) | **GET** /api/v1/Books | 
[**apiV1BooksIdDelete**](BooksApi.md#apiV1BooksIdDelete) | **DELETE** /api/v1/Books/{id} | 
[**apiV1BooksIdGet**](BooksApi.md#apiV1BooksIdGet) | **GET** /api/v1/Books/{id} | 
[**apiV1BooksIdPut**](BooksApi.md#apiV1BooksIdPut) | **PUT** /api/v1/Books/{id} | 
[**apiV1BooksPost**](BooksApi.md#apiV1BooksPost) | **POST** /api/v1/Books | 



## apiV1BooksGet

> List&lt;BookDto&gt; apiV1BooksGet()



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
        BooksApi apiInstance = ApiClientProxy.create(BooksApi.class, httpClient);

        try {
            List<BookDto> result = apiInstance.apiV1BooksGet();
            System.out.println(result);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling BooksApi#apiV1BooksGet");
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

[**List&lt;BookDto&gt;**](BookDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain; v=1.0, application/json; v=1.0, text/json; v=1.0

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiV1BooksIdDelete

> apiV1BooksIdDelete(id)



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
        BooksApi apiInstance = ApiClientProxy.create(BooksApi.class, httpClient);

        Integer id = 56; // Integer | 
        try {
            apiInstance.apiV1BooksIdDelete(id);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling BooksApi#apiV1BooksIdDelete");
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


## apiV1BooksIdGet

> BookDto apiV1BooksIdGet(id)



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
        BooksApi apiInstance = ApiClientProxy.create(BooksApi.class, httpClient);

        Integer id = 56; // Integer | 
        try {
            BookDto result = apiInstance.apiV1BooksIdGet(id);
            System.out.println(result);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling BooksApi#apiV1BooksIdGet");
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

[**BookDto**](BookDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain; v=1.0, application/json; v=1.0, text/json; v=1.0

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiV1BooksIdPut

> apiV1BooksIdPut(id, bookDto)



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
        BooksApi apiInstance = ApiClientProxy.create(BooksApi.class, httpClient);

        Integer id = 56; // Integer | 
        BookDto bookDto = new BookDto(); // BookDto | 
        try {
            apiInstance.apiV1BooksIdPut(id, bookDto);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling BooksApi#apiV1BooksIdPut");
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
 **bookDto** | [**BookDto**](BookDto.md)|  | [optional]

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


## apiV1BooksPost

> apiV1BooksPost(bookDto)



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
        BooksApi apiInstance = ApiClientProxy.create(BooksApi.class, httpClient);

        BookDto bookDto = new BookDto(); // BookDto | 
        try {
            apiInstance.apiV1BooksPost(bookDto);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling BooksApi#apiV1BooksPost");
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
 **bookDto** | [**BookDto**](BookDto.md)|  | [optional]

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

