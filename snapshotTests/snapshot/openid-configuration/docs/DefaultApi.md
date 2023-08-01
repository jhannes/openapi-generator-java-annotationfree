# DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchToken**](DefaultApi.md#fetchToken) | **POST** /token | 
[**wellKnownKeysGet**](DefaultApi.md#wellKnownKeysGet) | **GET** /.well-known/keys | 
[**wellKnownOpenidConfigurationGet**](DefaultApi.md#wellKnownOpenidConfigurationGet) | **GET** /.well-known/openid-configuration | 



## fetchToken

> TokenResponseDto fetchToken(authorization, grantType, code, clientId, clientSecret, redirectUri, subjectToken, audience)



### Example

```java
import io.github.jhannes.openapi.openid_configuration.api.*;
import io.github.jhannes.openapi.openid_configuration.models.*;

public class Example {
    public static void main(String[] args) {
        DefaultApi client = new HttpDefaultApi();

        String authorization = "authorization_example"; // String | Used with token-exchange to validate client_name - use Basic authentication with client_id:client_secret
        String grantType = "implicit"; // String | 
        String code = "code_example"; // String | 
        String clientId = "clientId_example"; // String | 
        String clientSecret = "clientSecret_example"; // String | 
        String redirectUri = "redirectUri_example"; // String | 
        String subjectToken = "subjectToken_example"; // String | Used with grant_type=urn:ietf:params:oauth:grant-type:token-exchange to do a token exchange
        String audience = "audience_example"; // String | Used with token-exchange to indicate which application the token will be used with
        try {
            TokenResponseDto result = client.fetchToken(authorization, grantType, code, clientId, clientSecret, redirectUri, subjectToken, audience);
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling DefaultApi#fetchToken");
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Used with token-exchange to validate client_name - use Basic authentication with client_id:client_secret | [optional]
 **grantType** | **String**|  | [optional] [enum: implicit, authorization_code, client_credentials, refresh_token]
 **code** | **String**|  | [optional]
 **clientId** | **String**|  | [optional]
 **clientSecret** | **String**|  | [optional]
 **redirectUri** | **String**|  | [optional]
 **subjectToken** | **String**| Used with grant_type&#x3D;urn:ietf:params:oauth:grant-type:token-exchange to do a token exchange | [optional]
 **audience** | **String**| Used with token-exchange to indicate which application the token will be used with | [optional]

### Return type

[**TokenResponseDto**](TokenResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The tokens from the identity service |  -  |


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

