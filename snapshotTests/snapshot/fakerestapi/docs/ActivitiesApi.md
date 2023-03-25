# ActivitiesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1ActivitiesGet**](ActivitiesApi.md#apiV1ActivitiesGet) | **GET** /api/v1/Activities | 
[**apiV1ActivitiesIdDelete**](ActivitiesApi.md#apiV1ActivitiesIdDelete) | **DELETE** /api/v1/Activities/{id} | 
[**apiV1ActivitiesIdGet**](ActivitiesApi.md#apiV1ActivitiesIdGet) | **GET** /api/v1/Activities/{id} | 
[**apiV1ActivitiesIdPut**](ActivitiesApi.md#apiV1ActivitiesIdPut) | **PUT** /api/v1/Activities/{id} | 
[**apiV1ActivitiesPost**](ActivitiesApi.md#apiV1ActivitiesPost) | **POST** /api/v1/Activities | 



## apiV1ActivitiesGet

> List&lt;ActivityDto&gt; apiV1ActivitiesGet()



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
        ActivitiesApi apiInstance = ApiClientProxy.create(ActivitiesApi.class, httpClient);

        try {
            List<ActivityDto> result = apiInstance.apiV1ActivitiesGet();
            System.out.println(result);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling ActivitiesApi#apiV1ActivitiesGet");
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

[**List&lt;ActivityDto&gt;**](ActivityDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain; v=1.0, application/json; v=1.0, text/json; v=1.0

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiV1ActivitiesIdDelete

> apiV1ActivitiesIdDelete(id)



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
        ActivitiesApi apiInstance = ApiClientProxy.create(ActivitiesApi.class, httpClient);

        Integer id = 56; // Integer | 
        try {
            apiInstance.apiV1ActivitiesIdDelete(id);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling ActivitiesApi#apiV1ActivitiesIdDelete");
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


## apiV1ActivitiesIdGet

> List&lt;ActivityDto&gt; apiV1ActivitiesIdGet(id)



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
        ActivitiesApi apiInstance = ApiClientProxy.create(ActivitiesApi.class, httpClient);

        Integer id = 56; // Integer | 
        try {
            List<ActivityDto> result = apiInstance.apiV1ActivitiesIdGet(id);
            System.out.println(result);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling ActivitiesApi#apiV1ActivitiesIdGet");
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

[**List&lt;ActivityDto&gt;**](ActivityDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain; v=1.0, application/json; v=1.0, text/json; v=1.0

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiV1ActivitiesIdPut

> ActivityDto apiV1ActivitiesIdPut(id, activityDto)



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
        ActivitiesApi apiInstance = ApiClientProxy.create(ActivitiesApi.class, httpClient);

        Integer id = 56; // Integer | 
        ActivityDto activityDto = new ActivityDto(); // ActivityDto | 
        try {
            ActivityDto result = apiInstance.apiV1ActivitiesIdPut(id, activityDto);
            System.out.println(result);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling ActivitiesApi#apiV1ActivitiesIdPut");
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
 **activityDto** | [**ActivityDto**](ActivityDto.md)|  | [optional]

### Return type

[**ActivityDto**](ActivityDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json; v=1.0, text/json; v=1.0, application/*+json; v=1.0
- **Accept**: text/plain; v=1.0, application/json; v=1.0, text/json; v=1.0

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiV1ActivitiesPost

> ActivityDto apiV1ActivitiesPost(activityDto)



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
        ActivitiesApi apiInstance = ApiClientProxy.create(ActivitiesApi.class, httpClient);

        ActivityDto activityDto = new ActivityDto(); // ActivityDto | 
        try {
            ActivityDto result = apiInstance.apiV1ActivitiesPost(activityDto);
            System.out.println(result);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling ActivitiesApi#apiV1ActivitiesPost");
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
 **activityDto** | [**ActivityDto**](ActivityDto.md)|  | [optional]

### Return type

[**ActivityDto**](ActivityDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json; v=1.0, text/json; v=1.0, application/*+json; v=1.0
- **Accept**: text/plain; v=1.0, application/json; v=1.0, text/json; v=1.0

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

