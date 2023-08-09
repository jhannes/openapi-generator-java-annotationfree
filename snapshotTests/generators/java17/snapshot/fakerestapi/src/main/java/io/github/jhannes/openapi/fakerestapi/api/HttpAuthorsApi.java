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

import io.github.jhannes.openapi.fakerestapi.model.AuthorDto;
import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import static java.net.URLEncoder.encode;
import static java.nio.charset.StandardCharsets.UTF_8;

public class HttpAuthorsApi implements AuthorsApi {

    private final Jsonb jsonb;

    private final URL baseUrl;

    public HttpAuthorsApi() throws MalformedURLException {
        this(new URL("http://localhost"));
    }

    public HttpAuthorsApi(URL baseUrl) {
        this(baseUrl, JsonbBuilder.create());
    }

    public HttpAuthorsApi(URL baseUrl, Jsonb jsonb) {
        this.baseUrl = baseUrl;
        this.jsonb = jsonb;
    }

    @Override
    public List<AuthorDto> apiV1AuthorsAuthorsBooksIdBookGet(
            Integer idBook
    ) throws IOException {
        HttpURLConnection connection = openConnection("/api/v1/Authors/authors/books/{idBook}"
                .replace("{idBook}", encode(String.valueOf(idBook), UTF_8)));
        connection.setRequestMethod("GET");
        if (connection.getResponseCode() >= 300) {
            throw new IOException("Unsuccessful http request " + connection.getResponseCode() + " " + connection.getResponseMessage());
        }
        return jsonb.fromJson(connection.getInputStream(), getParameterizedType(List.class, new Type[]{ AuthorDto.class }));
    }

    @Override
    public List<AuthorDto> apiV1AuthorsGet(
    ) throws IOException {
        HttpURLConnection connection = openConnection("/api/v1/Authors");
        connection.setRequestMethod("GET");
        if (connection.getResponseCode() >= 300) {
            throw new IOException("Unsuccessful http request " + connection.getResponseCode() + " " + connection.getResponseMessage());
        }
        return jsonb.fromJson(connection.getInputStream(), getParameterizedType(List.class, new Type[]{ AuthorDto.class }));
    }

    @Override
    public void apiV1AuthorsIdDelete(
            Integer id
    ) throws IOException {
        HttpURLConnection connection = openConnection("/api/v1/Authors/{id}"
                .replace("{id}", encode(String.valueOf(id), UTF_8)));
        connection.setRequestMethod("DELETE");
        if (connection.getResponseCode() >= 300) {
            throw new IOException("Unsuccessful http request " + connection.getResponseCode() + " " + connection.getResponseMessage());
        }
    }

    @Override
    public AuthorDto apiV1AuthorsIdGet(
            Integer id
    ) throws IOException {
        HttpURLConnection connection = openConnection("/api/v1/Authors/{id}"
                .replace("{id}", encode(String.valueOf(id), UTF_8)));
        connection.setRequestMethod("GET");
        if (connection.getResponseCode() >= 300) {
            throw new IOException("Unsuccessful http request " + connection.getResponseCode() + " " + connection.getResponseMessage());
        }
        return jsonb.fromJson(connection.getInputStream(), AuthorDto.class);
    }

    @Override
    public AuthorDto apiV1AuthorsIdPut(
            Integer id,
            AuthorDto authorDto
    ) throws IOException {
        HttpURLConnection connection = openConnection("/api/v1/Authors/{id}"
                .replace("{id}", encode(String.valueOf(id), UTF_8)));
        connection.setRequestMethod("PUT");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setDoOutput(true);
        jsonb.toJson(authorDto, connection.getOutputStream());
        if (connection.getResponseCode() >= 300) {
            throw new IOException("Unsuccessful http request " + connection.getResponseCode() + " " + connection.getResponseMessage());
        }
        return jsonb.fromJson(connection.getInputStream(), AuthorDto.class);
    }

    @Override
    public AuthorDto apiV1AuthorsPost(
            AuthorDto authorDto
    ) throws IOException {
        HttpURLConnection connection = openConnection("/api/v1/Authors");
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setDoOutput(true);
        jsonb.toJson(authorDto, connection.getOutputStream());
        if (connection.getResponseCode() >= 300) {
            throw new IOException("Unsuccessful http request " + connection.getResponseCode() + " " + connection.getResponseMessage());
        }
        return jsonb.fromJson(connection.getInputStream(), AuthorDto.class);
    }

    protected HttpURLConnection openConnection(String relativeUrl) throws IOException {
        return (HttpURLConnection) new URL(baseUrl + relativeUrl).openConnection();
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
