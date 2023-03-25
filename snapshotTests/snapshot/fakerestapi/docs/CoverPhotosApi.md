# CoverPhotosApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1CoverPhotosBooksCoversIdBookGet**](CoverPhotosApi.md#apiV1CoverPhotosBooksCoversIdBookGet) | **GET** /api/v1/CoverPhotos/books/covers/{idBook} | 
[**apiV1CoverPhotosGet**](CoverPhotosApi.md#apiV1CoverPhotosGet) | **GET** /api/v1/CoverPhotos | 
[**apiV1CoverPhotosIdDelete**](CoverPhotosApi.md#apiV1CoverPhotosIdDelete) | **DELETE** /api/v1/CoverPhotos/{id} | 
[**apiV1CoverPhotosIdGet**](CoverPhotosApi.md#apiV1CoverPhotosIdGet) | **GET** /api/v1/CoverPhotos/{id} | 
[**apiV1CoverPhotosIdPut**](CoverPhotosApi.md#apiV1CoverPhotosIdPut) | **PUT** /api/v1/CoverPhotos/{id} | 
[**apiV1CoverPhotosPost**](CoverPhotosApi.md#apiV1CoverPhotosPost) | **POST** /api/v1/CoverPhotos | 



## apiV1CoverPhotosBooksCoversIdBookGet

> List&lt;CoverPhotoDto&gt; apiV1CoverPhotosBooksCoversIdBookGet(idBook)



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
        CoverPhotosApi apiInstance = ApiClientProxy.create(CoverPhotosApi.class, httpClient);

        Integer idBook = 56; // Integer | 
        try {
            List<CoverPhotoDto> result = apiInstance.apiV1CoverPhotosBooksCoversIdBookGet(idBook);
            System.out.println(result);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling CoverPhotosApi#apiV1CoverPhotosBooksCoversIdBookGet");
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

[**List&lt;CoverPhotoDto&gt;**](CoverPhotoDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain; v=1.0, application/json; v=1.0, text/json; v=1.0

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiV1CoverPhotosGet

> List&lt;CoverPhotoDto&gt; apiV1CoverPhotosGet()



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
        CoverPhotosApi apiInstance = ApiClientProxy.create(CoverPhotosApi.class, httpClient);

        try {
            List<CoverPhotoDto> result = apiInstance.apiV1CoverPhotosGet();
            System.out.println(result);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling CoverPhotosApi#apiV1CoverPhotosGet");
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

[**List&lt;CoverPhotoDto&gt;**](CoverPhotoDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain; v=1.0, application/json; v=1.0, text/json; v=1.0

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiV1CoverPhotosIdDelete

> apiV1CoverPhotosIdDelete(id)



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
        CoverPhotosApi apiInstance = ApiClientProxy.create(CoverPhotosApi.class, httpClient);

        Integer id = 56; // Integer | 
        try {
            apiInstance.apiV1CoverPhotosIdDelete(id);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling CoverPhotosApi#apiV1CoverPhotosIdDelete");
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


## apiV1CoverPhotosIdGet

> CoverPhotoDto apiV1CoverPhotosIdGet(id)



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
        CoverPhotosApi apiInstance = ApiClientProxy.create(CoverPhotosApi.class, httpClient);

        Integer id = 56; // Integer | 
        try {
            CoverPhotoDto result = apiInstance.apiV1CoverPhotosIdGet(id);
            System.out.println(result);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling CoverPhotosApi#apiV1CoverPhotosIdGet");
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

[**CoverPhotoDto**](CoverPhotoDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain; v=1.0, application/json; v=1.0, text/json; v=1.0

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiV1CoverPhotosIdPut

> CoverPhotoDto apiV1CoverPhotosIdPut(id, coverPhotoDto)



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
        CoverPhotosApi apiInstance = ApiClientProxy.create(CoverPhotosApi.class, httpClient);

        Integer id = 56; // Integer | 
        CoverPhotoDto coverPhotoDto = new CoverPhotoDto(); // CoverPhotoDto | 
        try {
            CoverPhotoDto result = apiInstance.apiV1CoverPhotosIdPut(id, coverPhotoDto);
            System.out.println(result);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling CoverPhotosApi#apiV1CoverPhotosIdPut");
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
 **coverPhotoDto** | [**CoverPhotoDto**](CoverPhotoDto.md)|  | [optional]

### Return type

[**CoverPhotoDto**](CoverPhotoDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json; v=1.0, text/json; v=1.0, application/*+json; v=1.0
- **Accept**: text/plain; v=1.0, application/json; v=1.0, text/json; v=1.0

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiV1CoverPhotosPost

> CoverPhotoDto apiV1CoverPhotosPost(coverPhotoDto)



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
        CoverPhotosApi apiInstance = ApiClientProxy.create(CoverPhotosApi.class, httpClient);

        CoverPhotoDto coverPhotoDto = new CoverPhotoDto(); // CoverPhotoDto | 
        try {
            CoverPhotoDto result = apiInstance.apiV1CoverPhotosPost(coverPhotoDto);
            System.out.println(result);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling CoverPhotosApi#apiV1CoverPhotosPost");
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
 **coverPhotoDto** | [**CoverPhotoDto**](CoverPhotoDto.md)|  | [optional]

### Return type

[**CoverPhotoDto**](CoverPhotoDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json; v=1.0, text/json; v=1.0, application/*+json; v=1.0
- **Accept**: text/plain; v=1.0, application/json; v=1.0, text/json; v=1.0

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

