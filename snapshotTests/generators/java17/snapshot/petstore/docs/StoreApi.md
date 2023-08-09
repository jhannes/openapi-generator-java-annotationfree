# StoreApi

All URIs are relative to *http://petstore.swagger.io/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteOrder**](StoreApi.md#deleteOrder) | **DELETE** /store/order/{orderId} | Delete purchase order by ID
[**getInventory**](StoreApi.md#getInventory) | **GET** /store/inventory | Returns pet inventories by status
[**getOrderById**](StoreApi.md#getOrderById) | **GET** /store/order/{orderId} | Find purchase order by ID
[**placeOrder**](StoreApi.md#placeOrder) | **POST** /store/order | Place an order for a pet



## deleteOrder

> deleteOrder(orderId)

Delete purchase order by ID

For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors

### Example

```java
import io.github.jhannes.openapi.petstore.api.*;
import io.github.jhannes.openapi.petstore.models.*;

public class Example {
    public static void main(String[] args) {
        StoreApi client = new HttpStoreApi();

        String orderId = "orderId_example"; // String | ID of the order that needs to be deleted
        try {
            client.deleteOrder(orderId);
        } catch (IOException e) {
            System.err.println("Exception when calling StoreApi#deleteOrder");
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| ID of the order that needs to be deleted |

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
| **400** | Invalid ID supplied |  -  |
| **404** | Order not found |  -  |


## getInventory

> Map&lt;String, Integer&gt; getInventory(effectiveDateTime)

Returns pet inventories by status

Returns a map of status codes to quantities

### Example

```java
import io.github.jhannes.openapi.petstore.api.*;
import io.github.jhannes.openapi.petstore.models.*;

public class Example {
    public static void main(String[] args) {
    // Configure HTTP bearer authorization: api_key
        StoreApi client = new HttpStoreApi() {
            protected HttpURLConnection openConnection(String relativeUrl) throws IOException {
                HttpURLConnection connection = super.openConnection(relativeUrl);
                connection.setRequestParameter("api_key", apiKey);
                return connection;
            }
        };

        OffsetDateTime effectiveDateTime = OffsetDateTime.now(); // OffsetDateTime | 
        try {
            Map<String, Integer> result = client.getInventory(effectiveDateTime);
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling StoreApi#getInventory");
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **effectiveDateTime** | **OffsetDateTime**|  | [optional]

### Return type

**Map&lt;String, Integer&gt;**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## getOrderById

> OrderDto getOrderById(orderId)

Find purchase order by ID

For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generated exceptions

### Example

```java
import io.github.jhannes.openapi.petstore.api.*;
import io.github.jhannes.openapi.petstore.models.*;

public class Example {
    public static void main(String[] args) {
        StoreApi client = new HttpStoreApi();

        String orderId = "orderId_example"; // String | ID of pet that needs to be fetched
        try {
            OrderDto result = client.getOrderById(orderId);
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling StoreApi#getOrderById");
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| ID of pet that needs to be fetched |

### Return type

[**OrderDto**](OrderDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Invalid ID supplied |  -  |
| **404** | Order not found |  -  |


## placeOrder

> OrderDto placeOrder(orderDto)

Place an order for a pet

### Example

```java
import io.github.jhannes.openapi.petstore.api.*;
import io.github.jhannes.openapi.petstore.models.*;

public class Example {
    public static void main(String[] args) {
        StoreApi client = new HttpStoreApi();

        OrderDto orderDto = new OrderDto(); // OrderDto | order placed for purchasing the pet
        try {
            OrderDto result = client.placeOrder(orderDto);
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Exception when calling StoreApi#placeOrder");
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderDto** | [**OrderDto**](OrderDto.md)| order placed for purchasing the pet | [optional]

### Return type

[**OrderDto**](OrderDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Invalid Order |  -  |

