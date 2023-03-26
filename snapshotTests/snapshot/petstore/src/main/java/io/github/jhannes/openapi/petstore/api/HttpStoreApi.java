/*
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key \"special-key\" to test the authorization filters
 *
 * The version of the OpenAPI document: 1.0.0
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.github.jhannes.openapi.petstore.api;

import java.time.OffsetDateTime;
import io.github.jhannes.openapi.petstore.model.OrderDto;
import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.Optional;

import static java.net.URLEncoder.encode;
import static java.nio.charset.StandardCharsets.UTF_8;

public class HttpStoreApi implements StoreApi {

    private final Jsonb jsonb;

    private final URL baseUrl;

    public HttpStoreApi() throws MalformedURLException {
        this(new URL("http://petstore.swagger.io/v2"));
    }

    public HttpStoreApi(URL baseUrl) {
        this(baseUrl, JsonbBuilder.create());
    }

    public HttpStoreApi(URL baseUrl, Jsonb jsonb) {
        this.baseUrl = baseUrl;
        this.jsonb = jsonb;
    }

    @Override
    public void deleteOrder(
            String orderId
    ) throws IOException {
        URL url = new URL(baseUrl + "/store/order/{orderId}"
                .replace("{orderId}", encode(String.valueOf(orderId), UTF_8)));
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("DELETE");
        if (connection.getResponseCode() >= 300) {
            throw new IOException("Unsuccessful http request " + connection.getResponseCode() + " " + connection.getResponseMessage());
        }
    }

    @Override
    public Map<String, Integer> getInventory(
            Optional<OffsetDateTime> effectiveDateTime
    ) throws IOException {
        List<String> queryParameters = new ArrayList<>();
        effectiveDateTime.ifPresent(p -> queryParameters.add("effectiveDateTime=" + encode(String.valueOf(p), UTF_8)));
        String query = queryParameters.isEmpty() ? "" : "?" + String.join("&", queryParameters);
        URL url = new URL(baseUrl + "/store/inventory" + query);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        if (connection.getResponseCode() >= 300) {
            throw new IOException("Unsuccessful http request " + connection.getResponseCode() + " " + connection.getResponseMessage());
        }
        return jsonb.fromJson(connection.getInputStream(), getParameterizedType(List.class, new Type[]{ Integer.class }));
    }

    @Override
    public OrderDto getOrderById(
            String orderId
    ) throws IOException {
        URL url = new URL(baseUrl + "/store/order/{orderId}"
                .replace("{orderId}", encode(String.valueOf(orderId), UTF_8)));
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        if (connection.getResponseCode() >= 300) {
            throw new IOException("Unsuccessful http request " + connection.getResponseCode() + " " + connection.getResponseMessage());
        }
        return jsonb.fromJson(connection.getInputStream(), OrderDto.class);
    }

    @Override
    public OrderDto placeOrder(
            OrderDto orderDto
    ) throws IOException {
        URL url = new URL(baseUrl + "/store/order");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setDoOutput(true);
        jsonb.toJson(orderDto, connection.getOutputStream());
        if (connection.getResponseCode() >= 300) {
            throw new IOException("Unsuccessful http request " + connection.getResponseCode() + " " + connection.getResponseMessage());
        }
        return jsonb.fromJson(connection.getInputStream(), OrderDto.class);
    }

    private static ParameterizedType getParameterizedType(Class<?> rawType, final Type[] typeArguments) {
        return new ParameterizedType() {
            @Override
            public Type[] getActualTypeArguments() {
                return typeArguments;
            }

            @Override
            public Type getRawType() {
                return rawType;
            }

            @Override
            public Type getOwnerType() {
                return null;
            }
        };
    }
}
