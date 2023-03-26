# DefaultApi

All URIs are relative to */v1*

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

public class Example {
    public static void main(String[] args) {
        DefaultApi client = new HttpDefaultApi();

        try {
            GeometryDto result = client.getGeometry();
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling DefaultApi#getGeometry");
            e.printStackTrace();
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

public class Example {
    public static void main(String[] args) {
        DefaultApi client = new HttpDefaultApi();

        try {
            GeometryCollectionDto result = client.getLocation();
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling DefaultApi#getLocation");
            e.printStackTrace();
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

public class Example {
    public static void main(String[] args) {
        DefaultApi client = new HttpDefaultApi();

        try {
            PolygonDto result = client.getPolygon();
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling DefaultApi#getPolygon");
            e.printStackTrace();
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

