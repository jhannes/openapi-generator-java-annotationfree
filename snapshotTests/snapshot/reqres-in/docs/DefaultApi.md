# DefaultApi

All URIs are relative to *https://reqres.in/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**loginPost**](DefaultApi.md#loginPost) | **POST** /login | Creates a session
[**logoutPost**](DefaultApi.md#logoutPost) | **POST** /logout | Ends a session
[**registerPost**](DefaultApi.md#registerPost) | **POST** /register | Creates a user
[**usersGet**](DefaultApi.md#usersGet) | **GET** /users | Fetches a user list
[**usersIdDelete**](DefaultApi.md#usersIdDelete) | **DELETE** /users/{id} | Deletes a user
[**usersIdGet**](DefaultApi.md#usersIdGet) | **GET** /users/{id} | Fetches a user
[**usersIdPatch**](DefaultApi.md#usersIdPatch) | **PATCH** /users/{id} | Updates a user
[**usersIdPut**](DefaultApi.md#usersIdPut) | **PUT** /users/{id} | Updates a user



## loginPost

> LoginPost200ResponseDto loginPost(loginPostRequestDto)

Creates a session

### Example

```java
import io.github.jhannes.openapi.reqres_in.api.*;
import io.github.jhannes.openapi.reqres_in.models.*;

public class Example {
    public static void main(String[] args) {
        DefaultApi client = new HttpDefaultApi();

        LoginPostRequestDto loginPostRequestDto = new LoginPostRequestDto(); // LoginPostRequestDto | 
        try {
            LoginPost200ResponseDto result = client.loginPost(loginPostRequestDto);
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling DefaultApi#loginPost");
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loginPostRequestDto** | [**LoginPostRequestDto**](LoginPostRequestDto.md)|  |

### Return type

[**LoginPost200ResponseDto**](LoginPost200ResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Login error |  -  |


## logoutPost

> logoutPost()

Ends a session

### Example

```java
import io.github.jhannes.openapi.reqres_in.api.*;
import io.github.jhannes.openapi.reqres_in.models.*;

public class Example {
    public static void main(String[] args) {
        DefaultApi client = new HttpDefaultApi();

        try {
            client.logoutPost();
        } catch (IOException e) {
            System.err.println("Exception when calling DefaultApi#logoutPost");
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

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


## registerPost

> RegisterPost200ResponseDto registerPost(loginPostRequestDto)

Creates a user

### Example

```java
import io.github.jhannes.openapi.reqres_in.api.*;
import io.github.jhannes.openapi.reqres_in.models.*;

public class Example {
    public static void main(String[] args) {
        DefaultApi client = new HttpDefaultApi();

        LoginPostRequestDto loginPostRequestDto = new LoginPostRequestDto(); // LoginPostRequestDto | 
        try {
            RegisterPost200ResponseDto result = client.registerPost(loginPostRequestDto);
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling DefaultApi#registerPost");
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loginPostRequestDto** | [**LoginPostRequestDto**](LoginPostRequestDto.md)|  |

### Return type

[**RegisterPost200ResponseDto**](RegisterPost200ResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Register error |  -  |


## usersGet

> UsersGet200ResponseDto usersGet(page, perPage)

Fetches a user list

### Example

```java
import io.github.jhannes.openapi.reqres_in.api.*;
import io.github.jhannes.openapi.reqres_in.models.*;

public class Example {
    public static void main(String[] args) {
        DefaultApi client = new HttpDefaultApi();

        Integer page = 56; // Integer | 
        Integer perPage = 56; // Integer | 
        try {
            UsersGet200ResponseDto result = client.usersGet(page, perPage);
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling DefaultApi#usersGet");
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**|  | [optional]
 **perPage** | **Integer**|  | [optional]

### Return type

[**UsersGet200ResponseDto**](UsersGet200ResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## usersIdDelete

> usersIdDelete(id)

Deletes a user

### Example

```java
import io.github.jhannes.openapi.reqres_in.api.*;
import io.github.jhannes.openapi.reqres_in.models.*;

public class Example {
    public static void main(String[] args) {
        DefaultApi client = new HttpDefaultApi();

        Integer id = 56; // Integer | 
        try {
            client.usersIdDelete(id);
        } catch (IOException e) {
            System.err.println("Exception when calling DefaultApi#usersIdDelete");
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
| **204** | Success |  -  |


## usersIdGet

> UsersIdDelete200ResponseDto usersIdGet(id)

Fetches a user

### Example

```java
import io.github.jhannes.openapi.reqres_in.api.*;
import io.github.jhannes.openapi.reqres_in.models.*;

public class Example {
    public static void main(String[] args) {
        DefaultApi client = new HttpDefaultApi();

        Integer id = 56; // Integer | 
        try {
            UsersIdDelete200ResponseDto result = client.usersIdGet(id);
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling DefaultApi#usersIdGet");
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

[**UsersIdDelete200ResponseDto**](UsersIdDelete200ResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## usersIdPatch

> UsersIdDelete200Response1Dto usersIdPatch(id)

Updates a user

### Example

```java
import io.github.jhannes.openapi.reqres_in.api.*;
import io.github.jhannes.openapi.reqres_in.models.*;

public class Example {
    public static void main(String[] args) {
        DefaultApi client = new HttpDefaultApi();

        Integer id = 56; // Integer | 
        try {
            UsersIdDelete200Response1Dto result = client.usersIdPatch(id);
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling DefaultApi#usersIdPatch");
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

[**UsersIdDelete200Response1Dto**](UsersIdDelete200Response1Dto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## usersIdPut

> UsersIdDelete200Response1Dto usersIdPut(id)

Updates a user

### Example

```java
import io.github.jhannes.openapi.reqres_in.api.*;
import io.github.jhannes.openapi.reqres_in.models.*;

public class Example {
    public static void main(String[] args) {
        DefaultApi client = new HttpDefaultApi();

        Integer id = 56; // Integer | 
        try {
            UsersIdDelete200Response1Dto result = client.usersIdPut(id);
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling DefaultApi#usersIdPut");
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

[**UsersIdDelete200Response1Dto**](UsersIdDelete200Response1Dto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

