/*
 * FakeRESTApi.Web V1
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.github.jhannes.openapi.fakerestapi.api;

import io.github.jhannes.openapi.fakerestapi.model.ActivityDto;
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

public class HttpActivitiesApi implements ActivitiesApi {

    private final Jsonb jsonb;

    private final URL baseUrl;

    public HttpActivitiesApi() throws MalformedURLException {
        this(new URL("http://localhost"));
    }

    public HttpActivitiesApi(URL baseUrl) {
        this(baseUrl, JsonbBuilder.create());
    }

    public HttpActivitiesApi(URL baseUrl, Jsonb jsonb) {
        this.baseUrl = baseUrl;
        this.jsonb = jsonb;
    }

    @Override
    public List<ActivityDto> apiV1ActivitiesGet(
    ) throws IOException {
        URL url = new URL(baseUrl + "/api/v1/Activities");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        if (connection.getResponseCode() >= 300) {
            throw new IOException("Unsuccessful http request " + connection.getResponseCode() + " " + connection.getResponseMessage());
        }
        return jsonb.fromJson(connection.getInputStream(), getParameterizedType(List.class, new Type[]{ ActivityDto.class }));
    }

    @Override
    public void apiV1ActivitiesIdDelete(
            Integer id
    ) throws IOException {
        URL url = new URL(baseUrl + "/api/v1/Activities/{id}"
                .replace("{id}", encode(String.valueOf(id), UTF_8)));
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("DELETE");
        if (connection.getResponseCode() >= 300) {
            throw new IOException("Unsuccessful http request " + connection.getResponseCode() + " " + connection.getResponseMessage());
        }
    }

    @Override
    public List<ActivityDto> apiV1ActivitiesIdGet(
            Integer id
    ) throws IOException {
        URL url = new URL(baseUrl + "/api/v1/Activities/{id}"
                .replace("{id}", encode(String.valueOf(id), UTF_8)));
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        if (connection.getResponseCode() >= 300) {
            throw new IOException("Unsuccessful http request " + connection.getResponseCode() + " " + connection.getResponseMessage());
        }
        return jsonb.fromJson(connection.getInputStream(), getParameterizedType(List.class, new Type[]{ ActivityDto.class }));
    }

    @Override
    public ActivityDto apiV1ActivitiesIdPut(
            Integer id,
            ActivityDto activityDto
    ) throws IOException {
        URL url = new URL(baseUrl + "/api/v1/Activities/{id}"
                .replace("{id}", encode(String.valueOf(id), UTF_8)));
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("PUT");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setDoOutput(true);
        jsonb.toJson(activityDto, connection.getOutputStream());
        if (connection.getResponseCode() >= 300) {
            throw new IOException("Unsuccessful http request " + connection.getResponseCode() + " " + connection.getResponseMessage());
        }
        return jsonb.fromJson(connection.getInputStream(), ActivityDto.class);
    }

    @Override
    public ActivityDto apiV1ActivitiesPost(
            ActivityDto activityDto
    ) throws IOException {
        URL url = new URL(baseUrl + "/api/v1/Activities");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setDoOutput(true);
        jsonb.toJson(activityDto, connection.getOutputStream());
        if (connection.getResponseCode() >= 300) {
            throw new IOException("Unsuccessful http request " + connection.getResponseCode() + " " + connection.getResponseMessage());
        }
        return jsonb.fromJson(connection.getInputStream(), ActivityDto.class);
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
