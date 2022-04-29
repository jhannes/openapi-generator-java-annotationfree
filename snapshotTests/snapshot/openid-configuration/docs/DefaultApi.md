# DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**wellKnownKeysGet**](DefaultApi.md#wellKnownKeysGet) | **GET** /.well-known/keys | 
[**wellKnownOpenidConfigurationGet**](DefaultApi.md#wellKnownOpenidConfigurationGet) | **GET** /.well-known/openid-configuration | 



## wellKnownKeysGet

> JwksDocumentDto wellKnownKeysGet()



### Example

```java
import io.github.jhannes.openapi.openid_configuration.api.*;
import io.github.jhannes.openapi.openid_configuration.models.*;
import org.actioncontroller.client.ApiClientProxy;
import org.actioncontroller.client.HttpClientException;
import org.actioncontroller.client.HttpURLConnectionApiClient;

public class Example {
    public static void main(String[] args) {
        HttpURLConnectionApiClient client = new HttpURLConnectionApiClient("http://localhost");
        DefaultApi apiInstance = ApiClientProxy.create(DefaultApi.class, httpClient);

        try {
            JwksDocumentDto result = apiInstance.wellKnownKeysGet();
            System.out.println(result);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling DefaultApi#wellKnownKeysGet");
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

[**JwksDocumentDto**](JwksDocumentDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The cryptographic key description document |  -  |


## wellKnownOpenidConfigurationGet

> DiscoveryDocumentDto wellKnownOpenidConfigurationGet()



### Example

```java
import io.github.jhannes.openapi.openid_configuration.api.*;
import io.github.jhannes.openapi.openid_configuration.models.*;
import org.actioncontroller.client.ApiClientProxy;
import org.actioncontroller.client.HttpClientException;
import org.actioncontroller.client.HttpURLConnectionApiClient;

public class Example {
    public static void main(String[] args) {
        HttpURLConnectionApiClient client = new HttpURLConnectionApiClient("http://localhost");
        DefaultApi apiInstance = ApiClientProxy.create(DefaultApi.class, httpClient);

        try {
            DiscoveryDocumentDto result = apiInstance.wellKnownOpenidConfigurationGet();
            System.out.println(result);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling DefaultApi#wellKnownOpenidConfigurationGet");
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

[**DiscoveryDocumentDto**](DiscoveryDocumentDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The openid discovery document |  -  |

