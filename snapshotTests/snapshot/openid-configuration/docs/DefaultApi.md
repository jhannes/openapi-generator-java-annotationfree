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

public class Example {
    public static void main(String[] args) {
        DefaultApi client = new HttpDefaultApi();

        try {
            JwksDocumentDto result = client.wellKnownKeysGet();
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling DefaultApi#wellKnownKeysGet");
            e.printStackTrace();
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

public class Example {
    public static void main(String[] args) {
        DefaultApi client = new HttpDefaultApi();

        try {
            DiscoveryDocumentDto result = client.wellKnownOpenidConfigurationGet();
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling DefaultApi#wellKnownOpenidConfigurationGet");
            e.printStackTrace();
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

