# DefaultApi

All URIs are relative to *http://localhost/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getGeometry**](DefaultApi.md#getGeometry) | **GET** /geometry | 
[**getLocation**](DefaultApi.md#getLocation) | **GET** /collection | 
[**getPolygon**](DefaultApi.md#getPolygon) | **GET** /polygon | 



## getGeometry

> GeometryDto getGeometry()



### Example

```java
import io.github.jhannes.openapi.geojson.api.*;
import io.github.jhannes.openapi.geojson.models.*;
import org.actioncontroller.client.ApiClientProxy;
import org.actioncontroller.client.HttpClientException;
import org.actioncontroller.client.HttpURLConnectionApiClient;

public class Example {
    public static void main(String[] args) {
        HttpURLConnectionApiClient client = new HttpURLConnectionApiClient("http://localhost/v1");
        DefaultApi apiInstance = ApiClientProxy.create(DefaultApi.class, httpClient);

        try {
            GeometryDto result = apiInstance.getGeometry();
            System.out.println(result);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling DefaultApi#getGeometry");
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

[**GeometryDto**](GeometryDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |


## getLocation

> GeometryCollectionDto getLocation()



### Example

```java
import io.github.jhannes.openapi.geojson.api.*;
import io.github.jhannes.openapi.geojson.models.*;
import org.actioncontroller.client.ApiClientProxy;
import org.actioncontroller.client.HttpClientException;
import org.actioncontroller.client.HttpURLConnectionApiClient;

public class Example {
    public static void main(String[] args) {
        HttpURLConnectionApiClient client = new HttpURLConnectionApiClient("http://localhost/v1");
        DefaultApi apiInstance = ApiClientProxy.create(DefaultApi.class, httpClient);

        try {
            GeometryCollectionDto result = apiInstance.getLocation();
            System.out.println(result);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling DefaultApi#getLocation");
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

[**GeometryCollectionDto**](GeometryCollectionDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |


## getPolygon

> PolygonDto getPolygon()



### Example

```java
import io.github.jhannes.openapi.geojson.api.*;
import io.github.jhannes.openapi.geojson.models.*;
import org.actioncontroller.client.ApiClientProxy;
import org.actioncontroller.client.HttpClientException;
import org.actioncontroller.client.HttpURLConnectionApiClient;

public class Example {
    public static void main(String[] args) {
        HttpURLConnectionApiClient client = new HttpURLConnectionApiClient("http://localhost/v1");
        DefaultApi apiInstance = ApiClientProxy.create(DefaultApi.class, httpClient);

        try {
            PolygonDto result = apiInstance.getPolygon();
            System.out.println(result);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling DefaultApi#getPolygon");
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

[**PolygonDto**](PolygonDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |

