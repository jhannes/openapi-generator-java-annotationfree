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

public class Example {
    public static void main(String[] args) {
        AuthorsApi client = new HttpAuthorsApi();

        Integer idBook = 56; // Integer | 
        try {
            List<AuthorDto> result = client.apiV1AuthorsAuthorsBooksIdBookGet(idBook);
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling AuthorsApi#apiV1AuthorsAuthorsBooksIdBookGet");
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

public class Example {
    public static void main(String[] args) {
        AuthorsApi client = new HttpAuthorsApi();

        try {
            List<AuthorDto> result = client.apiV1AuthorsGet();
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling AuthorsApi#apiV1AuthorsGet");
            e.printStackTrace();
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

public class Example {
    public static void main(String[] args) {
        AuthorsApi client = new HttpAuthorsApi();

        Integer id = 56; // Integer | 
        try {
            client.apiV1AuthorsIdDelete(id);
        } catch (IOException e) {
            System.err.println("Exception when calling AuthorsApi#apiV1AuthorsIdDelete");
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


## apiV1AuthorsIdGet

> AuthorDto apiV1AuthorsIdGet(id)



### Example

```java
import io.github.jhannes.openapi.fakerestapi.api.*;
import io.github.jhannes.openapi.fakerestapi.models.*;

public class Example {
    public static void main(String[] args) {
        AuthorsApi client = new HttpAuthorsApi();

        Integer id = 56; // Integer | 
        try {
            AuthorDto result = client.apiV1AuthorsIdGet(id);
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling AuthorsApi#apiV1AuthorsIdGet");
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

public class Example {
    public static void main(String[] args) {
        AuthorsApi client = new HttpAuthorsApi();

        Integer id = 56; // Integer | 
        AuthorDto authorDto = new AuthorDto(); // AuthorDto | 
        try {
            AuthorDto result = client.apiV1AuthorsIdPut(id, authorDto);
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling AuthorsApi#apiV1AuthorsIdPut");
            e.printStackTrace();
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

public class Example {
    public static void main(String[] args) {
        AuthorsApi client = new HttpAuthorsApi();

        AuthorDto authorDto = new AuthorDto(); // AuthorDto | 
        try {
            AuthorDto result = client.apiV1AuthorsPost(authorDto);
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling AuthorsApi#apiV1AuthorsPost");
            e.printStackTrace();
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

