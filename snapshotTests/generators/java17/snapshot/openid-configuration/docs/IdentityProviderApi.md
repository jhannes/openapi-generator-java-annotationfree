# IdentityProviderApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authorization**](IdentityProviderApi.md#authorization) | **GET** /authorize | 
[**fetchToken**](IdentityProviderApi.md#fetchToken) | **POST** /token | 
[**getUserinfo**](IdentityProviderApi.md#getUserinfo) | **GET** /userinfo | 



## authorization

> authorization(responseType, clientId, redirectUri, responseMode, state, scope, loginHint, prompt, acrValues, nonce, display)



Starts an authentication flow. If the request is successful, the user is returned to the redirect_uri with a parameter, otherwise the user is redirected with an error parameter

### Example

```java
import io.github.jhannes.openapi.openid_configuration.api.*;
import io.github.jhannes.openapi.openid_configuration.models.*;

public class Example {
    public static void main(String[] args) {
        IdentityProviderApi client = new HttpIdentityProviderApi();

        ResponseTypeDto responseType = ResponseTypeDto.fromValue("code"); // ResponseTypeDto | 
        String clientId = "clientId_example"; // String | 
        URI redirectUri = new URI(); // URI | 
        String responseMode = "query"; // String | 
        String state = "state_example"; // String | 
        String scope = "scope_example"; // String | 
        String loginHint = "loginHint_example"; // String | 
        List<String> prompt = Arrays.asList(); // List<String> | 
        List<String> acrValues = Arrays.asList(); // List<String> | Requested Authentication Context Class Reference values. Space-separated string that specifies the acr values that the Authorization Server is being requested to use for processing this Authentication Request, with the values appearing in order of preference. The Authentication Context Class satisfied by the authentication performed is returned as the acr Claim Value, as specified in Section 2
        String nonce = "nonce_example"; // String | OPTIONAL. String value used to associate a Client session with an ID Token, and to mitigate replay attacks. The value is passed through unmodified from the Authentication Request to the ID Token
        String display = "page"; // String | 
        try {
            client.authorization(responseType, clientId, redirectUri, responseMode, state, scope, loginHint, prompt, acrValues, nonce, display);
        } catch (IOException e) {
            System.err.println("Exception when calling IdentityProviderApi#authorization");
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **responseType** | [**ResponseTypeDto**](.md)|  | [enum: code, token, id_token, code id_token, id_token token]
 **clientId** | **String**|  |
 **redirectUri** | **URI**|  |
 **responseMode** | **String**|  | [optional]
 **state** | **String**|  | [optional]
 **scope** | **String**|  | [optional]
 **loginHint** | **String**|  | [optional]
 **prompt** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: none, login, consent, select_account]
 **acrValues** | [**List&lt;String&gt;**](String.md)| Requested Authentication Context Class Reference values. Space-separated string that specifies the acr values that the Authorization Server is being requested to use for processing this Authentication Request, with the values appearing in order of preference. The Authentication Context Class satisfied by the authentication performed is returned as the acr Claim Value, as specified in Section 2 | [optional]
 **nonce** | **String**| OPTIONAL. String value used to associate a Client session with an ID Token, and to mitigate replay attacks. The value is passed through unmodified from the Authentication Request to the ID Token | [optional]
 **display** | **String**|  | [optional] [enum: page, popup, touch, wap]

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
| **304** | User is redirected back to redirect_uri |  -  |


## fetchToken

> TokenResponseDto fetchToken(grantType, code, clientId, authorization, clientSecret, redirectUri, subjectToken, audience)



### Example

```java
import io.github.jhannes.openapi.openid_configuration.api.*;
import io.github.jhannes.openapi.openid_configuration.models.*;

public class Example {
    public static void main(String[] args) {
        IdentityProviderApi client = new HttpIdentityProviderApi();

        GrantTypeDto grantType = GrantTypeDto.fromValue("implicit"); // GrantTypeDto | 
        String code = "code_example"; // String | 
        String clientId = "clientId_example"; // String | 
        String authorization = "authorization_example"; // String | Used with token-exchange to validate client_name - use Basic authentication with client_id:client_secret
        String clientSecret = "clientSecret_example"; // String | 
        URI redirectUri = new URI(); // URI | 
        String subjectToken = "subjectToken_example"; // String | Used with grant_type=urn:ietf:params:oauth:grant-type:token-exchange to do a token exchange
        String audience = "audience_example"; // String | Used with token-exchange to indicate which application the token will be used with
        try {
            TokenResponseDto result = client.fetchToken(grantType, code, clientId, authorization, clientSecret, redirectUri, subjectToken, audience);
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling IdentityProviderApi#fetchToken");
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grantType** | [**GrantTypeDto**](GrantTypeDto.md)|  | [enum: implicit, authorization_code, client_credentials, refresh_token, urn:ietf:params:oauth:grant-type:token-exchange]
 **code** | **String**|  |
 **clientId** | **String**|  |
 **authorization** | **String**| Used with token-exchange to validate client_name - use Basic authentication with client_id:client_secret | [optional]
 **clientSecret** | **String**|  | [optional]
 **redirectUri** | **URI**|  | [optional]
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
| **400** | Errors in request |  -  |


## getUserinfo

> UserinfoDto getUserinfo(authorization)



Returns information about the currently logged in user

### Example

```java
import io.github.jhannes.openapi.openid_configuration.api.*;
import io.github.jhannes.openapi.openid_configuration.models.*;

public class Example {
    public static void main(String[] args) {
        IdentityProviderApi client = new HttpIdentityProviderApi();

        String authorization = "authorization_example"; // String | 
        try {
            UserinfoDto result = client.getUserinfo(authorization);
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling IdentityProviderApi#getUserinfo");
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  |

### Return type

[**UserinfoDto**](UserinfoDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the actual user information |  -  |
| **401** | Returned if the access token was invalid or expired |  -  |

