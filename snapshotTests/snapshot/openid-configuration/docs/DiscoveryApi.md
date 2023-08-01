# DiscoveryApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDiscoveryDocument**](DiscoveryApi.md#getDiscoveryDocument) | **GET** /.well-known/openid-configuration | 
[**getJwksDocument**](DiscoveryApi.md#getJwksDocument) | **GET** /.well-known/keys | 



## getDiscoveryDocument

> DiscoveryDocumentDto getDiscoveryDocument()



### Example

```java
import io.github.jhannes.openapi.openid_configuration.api.*;
import io.github.jhannes.openapi.openid_configuration.models.*;

public class Example {
    public static void main(String[] args) {
        DiscoveryApi client = new HttpDiscoveryApi();

        try {
            DiscoveryDocumentDto result = client.getDiscoveryDocument();
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling DiscoveryApi#getDiscoveryDocument");
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


## getJwksDocument

> JwksDocumentDto getJwksDocument()



### Example

```java
import io.github.jhannes.openapi.openid_configuration.api.*;
import io.github.jhannes.openapi.openid_configuration.models.*;

public class Example {
    public static void main(String[] args) {
        DiscoveryApi client = new HttpDiscoveryApi();

        try {
            JwksDocumentDto result = client.getJwksDocument();
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling DiscoveryApi#getJwksDocument");
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

