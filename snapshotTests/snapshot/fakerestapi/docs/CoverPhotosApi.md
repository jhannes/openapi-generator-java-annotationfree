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

public class Example {
    public static void main(String[] args) {
        CoverPhotosApi client = new HttpCoverPhotosApi();

        Integer idBook = 56; // Integer | 
        try {
            List<CoverPhotoDto> result = client.apiV1CoverPhotosBooksCoversIdBookGet(idBook);
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling CoverPhotosApi#apiV1CoverPhotosBooksCoversIdBookGet");
            e.printStackTrace();
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

public class Example {
    public static void main(String[] args) {
        CoverPhotosApi client = new HttpCoverPhotosApi();

        try {
            List<CoverPhotoDto> result = client.apiV1CoverPhotosGet();
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling CoverPhotosApi#apiV1CoverPhotosGet");
            e.printStackTrace();
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

public class Example {
    public static void main(String[] args) {
        CoverPhotosApi client = new HttpCoverPhotosApi();

        Integer id = 56; // Integer | 
        try {
            client.apiV1CoverPhotosIdDelete(id);
        } catch (IOException e) {
            System.err.println("Exception when calling CoverPhotosApi#apiV1CoverPhotosIdDelete");
            e.printStackTrace();
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

public class Example {
    public static void main(String[] args) {
        CoverPhotosApi client = new HttpCoverPhotosApi();

        Integer id = 56; // Integer | 
        try {
            CoverPhotoDto result = client.apiV1CoverPhotosIdGet(id);
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling CoverPhotosApi#apiV1CoverPhotosIdGet");
            e.printStackTrace();
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

public class Example {
    public static void main(String[] args) {
        CoverPhotosApi client = new HttpCoverPhotosApi();

        Integer id = 56; // Integer | 
        CoverPhotoDto coverPhotoDto = new CoverPhotoDto(); // CoverPhotoDto | 
        try {
            CoverPhotoDto result = client.apiV1CoverPhotosIdPut(id, coverPhotoDto);
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling CoverPhotosApi#apiV1CoverPhotosIdPut");
            e.printStackTrace();
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

public class Example {
    public static void main(String[] args) {
        CoverPhotosApi client = new HttpCoverPhotosApi();

        CoverPhotoDto coverPhotoDto = new CoverPhotoDto(); // CoverPhotoDto | 
        try {
            CoverPhotoDto result = client.apiV1CoverPhotosPost(coverPhotoDto);
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling CoverPhotosApi#apiV1CoverPhotosPost");
            e.printStackTrace();
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

