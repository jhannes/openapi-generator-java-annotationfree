# AuthorsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1AuthorsAuthorsBooksIdBookGet**](AuthorsApi.md#apiV1AuthorsAuthorsBooksIdBookGet) | **GET** /api/v1/Authors/authors/books/{idBook} | 
[**apiV1AuthorsGet**](AuthorsApi.md#apiV1AuthorsGet) | **GET** /api/v1/Authors | 
[**apiV1AuthorsIdDelete**](AuthorsApi.md#apiV1AuthorsIdDelete) | **DELETE** /api/v1/Authors/{id} | 
[**apiV1AuthorsIdGet**](AuthorsApi.md#apiV1AuthorsIdGet) | **GET** /api/v1/Authors/{id} | 
[**apiV1AuthorsIdPut**](AuthorsApi.md#apiV1AuthorsIdPut) | **PUT** /api/v1/Authors/{id} | 
[**apiV1AuthorsPost**](AuthorsApi.md#apiV1AuthorsPost) | **POST** /api/v1/Authors | 



## apiV1AuthorsAuthorsBooksIdBookGet

> List&lt;AuthorDto&gt; apiV1AuthorsAuthorsBooksIdBookGet(idBook)



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
        AuthorsApi apiInstance = ApiClientProxy.create(AuthorsApi.class, httpClient);

        Integer idBook = 56; // Integer | 
        try {
            List<AuthorDto> result = apiInstance.apiV1AuthorsAuthorsBooksIdBookGet(idBook);
            System.out.println(result);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling AuthorsApi#apiV1AuthorsAuthorsBooksIdBookGet");
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
 **idBook** | **Integer**|  |

### Return type

[**List&lt;AuthorDto&gt;**](AuthorDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain; v=1.0, application/json; v=1.0, text/json; v=1.0

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiV1AuthorsGet

> List&lt;AuthorDto&gt; apiV1AuthorsGet()



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
        AuthorsApi apiInstance = ApiClientProxy.create(AuthorsApi.class, httpClient);

        try {
            List<AuthorDto> result = apiInstance.apiV1AuthorsGet();
            System.out.println(result);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling AuthorsApi#apiV1AuthorsGet");
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

[**List&lt;AuthorDto&gt;**](AuthorDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain; v=1.0, application/json; v=1.0, text/json; v=1.0

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiV1AuthorsIdDelete

> apiV1AuthorsIdDelete(id)



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
        AuthorsApi apiInstance = ApiClientProxy.create(AuthorsApi.class, httpClient);

        Integer id = 56; // Integer | 
        try {
            apiInstance.apiV1AuthorsIdDelete(id);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling AuthorsApi#apiV1AuthorsIdDelete");
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


## apiV1AuthorsIdGet

> AuthorDto apiV1AuthorsIdGet(id)



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
        AuthorsApi apiInstance = ApiClientProxy.create(AuthorsApi.class, httpClient);

        Integer id = 56; // Integer | 
        try {
            AuthorDto result = apiInstance.apiV1AuthorsIdGet(id);
            System.out.println(result);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling AuthorsApi#apiV1AuthorsIdGet");
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

[**AuthorDto**](AuthorDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain; v=1.0, application/json; v=1.0, text/json; v=1.0

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiV1AuthorsIdPut

> AuthorDto apiV1AuthorsIdPut(id, authorDto)



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
        AuthorsApi apiInstance = ApiClientProxy.create(AuthorsApi.class, httpClient);

        Integer id = 56; // Integer | 
        AuthorDto authorDto = new AuthorDto(); // AuthorDto | 
        try {
            AuthorDto result = apiInstance.apiV1AuthorsIdPut(id, authorDto);
            System.out.println(result);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling AuthorsApi#apiV1AuthorsIdPut");
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
 **authorDto** | [**AuthorDto**](AuthorDto.md)|  | [optional]

### Return type

[**AuthorDto**](AuthorDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json; v=1.0, text/json; v=1.0, application/*+json; v=1.0
- **Accept**: text/plain; v=1.0, application/json; v=1.0, text/json; v=1.0

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiV1AuthorsPost

> AuthorDto apiV1AuthorsPost(authorDto)



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
        AuthorsApi apiInstance = ApiClientProxy.create(AuthorsApi.class, httpClient);

        AuthorDto authorDto = new AuthorDto(); // AuthorDto | 
        try {
            AuthorDto result = apiInstance.apiV1AuthorsPost(authorDto);
            System.out.println(result);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling AuthorsApi#apiV1AuthorsPost");
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
 **authorDto** | [**AuthorDto**](AuthorDto.md)|  | [optional]

### Return type

[**AuthorDto**](AuthorDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json; v=1.0, text/json; v=1.0, application/*+json; v=1.0
- **Accept**: text/plain; v=1.0, application/json; v=1.0, text/json; v=1.0

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

