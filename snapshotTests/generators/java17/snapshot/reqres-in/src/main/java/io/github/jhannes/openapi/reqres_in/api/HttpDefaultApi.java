/*
 * ReqRes API
 * Fake data CRUD API
 *
 * The version of the OpenAPI document: 1
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.github.jhannes.openapi.reqres_in.api;

import io.github.jhannes.openapi.reqres_in.model.LoginPost200ResponseDto;
import io.github.jhannes.openapi.reqres_in.model.LoginPost400ResponseDto;
import io.github.jhannes.openapi.reqres_in.model.LoginPostRequestDto;
import io.github.jhannes.openapi.reqres_in.model.RegisterPost200ResponseDto;
import io.github.jhannes.openapi.reqres_in.model.UsersGet200ResponseDto;
import io.github.jhannes.openapi.reqres_in.model.UsersIdGet200ResponseDto;
import io.github.jhannes.openapi.reqres_in.model.UsersIdPut200ResponseDto;
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

/* With Java 17 support */
public class HttpDefaultApi implements DefaultApi {

    private final Jsonb jsonb;

    private final URL baseUrl;

    public HttpDefaultApi() throws MalformedURLException {
        this(new URL("https://reqres.in/api"));
    }

    public HttpDefaultApi(URL baseUrl) {
        this(baseUrl, JsonbBuilder.create());
    }

    public HttpDefaultApi(URL baseUrl, Jsonb jsonb) {
        this.baseUrl = baseUrl;
        this.jsonb = jsonb;
    }

    @Override
    public LoginPost200ResponseDto loginPost(
            LoginPostRequestDto loginPostRequestDto
    ) throws IOException {
        HttpURLConnection connection = openConnection("/login");
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setDoOutput(true);
        jsonb.toJson(loginPostRequestDto, connection.getOutputStream());
        if (connection.getResponseCode() >= 300) {
            throw new IOException("Unsuccessful http request " + connection.getResponseCode() + " " + connection.getResponseMessage());
        }
        return jsonb.fromJson(connection.getInputStream(), LoginPost200ResponseDto.class);
    }

    @Override
    public void logoutPost(
    ) throws IOException {
        HttpURLConnection connection = openConnection("/logout");
        connection.setRequestMethod("POST");
        if (connection.getResponseCode() >= 300) {
            throw new IOException("Unsuccessful http request " + connection.getResponseCode() + " " + connection.getResponseMessage());
        }
    }

    @Override
    public RegisterPost200ResponseDto registerPost(
            LoginPostRequestDto loginPostRequestDto
    ) throws IOException {
        HttpURLConnection connection = openConnection("/register");
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setDoOutput(true);
        jsonb.toJson(loginPostRequestDto, connection.getOutputStream());
        if (connection.getResponseCode() >= 300) {
            throw new IOException("Unsuccessful http request " + connection.getResponseCode() + " " + connection.getResponseMessage());
        }
        return jsonb.fromJson(connection.getInputStream(), RegisterPost200ResponseDto.class);
    }

    @Override
    public UsersGet200ResponseDto usersGet(
            Optional<Integer> page,
            Optional<Integer> per_page
    ) throws IOException {
        List<String> queryParameters = new ArrayList<>();
        page.ifPresent(p -> queryParameters.add("page=" + encode(String.valueOf(p), UTF_8)));
        per_page.ifPresent(p -> queryParameters.add("per_page=" + encode(String.valueOf(p), UTF_8)));
        String query = queryParameters.isEmpty() ? "" : "?" + String.join("&", queryParameters);
        HttpURLConnection connection = openConnection("/users" + query);
        connection.setRequestMethod("GET");
        if (connection.getResponseCode() >= 300) {
            throw new IOException("Unsuccessful http request " + connection.getResponseCode() + " " + connection.getResponseMessage());
        }
        return jsonb.fromJson(connection.getInputStream(), UsersGet200ResponseDto.class);
    }

    @Override
    public void usersIdDelete(
            Integer id
    ) throws IOException {
        HttpURLConnection connection = openConnection("/users/{id}"
                .replace("{id}", encode(String.valueOf(id), UTF_8)));
        connection.setRequestMethod("DELETE");
        if (connection.getResponseCode() >= 300) {
            throw new IOException("Unsuccessful http request " + connection.getResponseCode() + " " + connection.getResponseMessage());
        }
    }

    @Override
    public UsersIdGet200ResponseDto usersIdGet(
            Integer id
    ) throws IOException {
        HttpURLConnection connection = openConnection("/users/{id}"
                .replace("{id}", encode(String.valueOf(id), UTF_8)));
        connection.setRequestMethod("GET");
        if (connection.getResponseCode() >= 300) {
            throw new IOException("Unsuccessful http request " + connection.getResponseCode() + " " + connection.getResponseMessage());
        }
        return jsonb.fromJson(connection.getInputStream(), UsersIdGet200ResponseDto.class);
    }

    @Override
    public UsersIdPut200ResponseDto usersIdPatch(
            Integer id
    ) throws IOException {
        HttpURLConnection connection = openConnection("/users/{id}"
                .replace("{id}", encode(String.valueOf(id), UTF_8)));
        connection.setRequestMethod("PATCH");
        if (connection.getResponseCode() >= 300) {
            throw new IOException("Unsuccessful http request " + connection.getResponseCode() + " " + connection.getResponseMessage());
        }
        return jsonb.fromJson(connection.getInputStream(), UsersIdPut200ResponseDto.class);
    }

    @Override
    public UsersIdPut200ResponseDto usersIdPut(
            Integer id
    ) throws IOException {
        HttpURLConnection connection = openConnection("/users/{id}"
                .replace("{id}", encode(String.valueOf(id), UTF_8)));
        connection.setRequestMethod("PUT");
        if (connection.getResponseCode() >= 300) {
            throw new IOException("Unsuccessful http request " + connection.getResponseCode() + " " + connection.getResponseMessage());
        }
        return jsonb.fromJson(connection.getInputStream(), UsersIdPut200ResponseDto.class);
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
