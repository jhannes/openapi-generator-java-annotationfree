# IdentityClientApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**handleCallback**](IdentityClientApi.md#handleCallback) | **GET** /callback | 



## handleCallback

> handleCallback(state, code, error, errorDescription)



Completes the authentication flow. This should be implemented by the openid connect client. The client should normally invoke the token endpoint with the code value provided by the identity provider.

### Example

```java
import io.github.jhannes.openapi.openid_configuration.api.*;
import io.github.jhannes.openapi.openid_configuration.models.*;

public class Example {
    public static void main(String[] args) {
        IdentityClientApi client = new HttpIdentityClientApi();

        String state = "state_example"; // String | 
        String code = "code_example"; // String | 
        String error = "invalid_request"; // String | 
        String errorDescription = "errorDescription_example"; // String | 
        try {
            client.handleCallback(state, code, error, errorDescription);
        } catch (IOException e) {
            System.err.println("Exception when calling IdentityClientApi#handleCallback");
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **String**|  | [optional]
 **code** | **String**|  | [optional]
 **error** | **String**|  | [optional] [enum: invalid_request, unauthorized_client, access_denied, unsupported_response_type, invalid_scope, server_error, temporarily_unavailable, invalid_request_uri, invalid_request_object, request_not_supported, request_uri_not_supported, registration_not_supported, interaction_required, login_required, account_selection_required, consent_required]
 **errorDescription** | **String**|  | [optional]

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
| **200** | Used if the authorization failed and the openid connect client wants to display an error message to the user |  -  |
| **304** | After the authentication is complete, the openid connect client should set a session cookie and return the user to a suitable location |  * Set-Cookie - Used to set the session cookie for the client <br>  * Location - The URI that the open id connect client wants the user the use to continue <br>  |

