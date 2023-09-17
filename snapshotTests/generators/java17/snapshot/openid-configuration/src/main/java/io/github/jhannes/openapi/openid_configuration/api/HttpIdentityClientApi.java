/*
 * Open ID Connect
 * Open ID Connect Discovery
 *
 * The version of the OpenAPI document: 1.0.0-draft
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.github.jhannes.openapi.openid_configuration.api;

import java.net.URI;
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

public class HttpIdentityClientApi implements IdentityClientApi {

    private final Jsonb jsonb;

    private final URL baseUrl;

    public HttpIdentityClientApi() throws MalformedURLException {
        this(new URL("http://localhost"));
    }

    public HttpIdentityClientApi(URL baseUrl) {
        this(baseUrl, JsonbBuilder.create());
    }

    public HttpIdentityClientApi(URL baseUrl, Jsonb jsonb) {
        this.baseUrl = baseUrl;
        this.jsonb = jsonb;
    }

    @Override
    public void handleCallback(
            Optional<String> state,
            Optional<String> code,
            Optional<String> error,
            Optional<String> error_description,
            Consumer<String> setSetCookie,
            Consumer<URI> setLocation
    ) throws IOException {
        List<String> queryParameters = new ArrayList<>();
        state.ifPresent(p -> queryParameters.add("state=" + encode(String.valueOf(p), UTF_8)));
        code.ifPresent(p -> queryParameters.add("code=" + encode(String.valueOf(p), UTF_8)));
        error.ifPresent(p -> queryParameters.add("error=" + encode(String.valueOf(p), UTF_8)));
        error_description.ifPresent(p -> queryParameters.add("error_description=" + encode(String.valueOf(p), UTF_8)));
        String query = queryParameters.isEmpty() ? "" : "?" + String.join("&", queryParameters);
        HttpURLConnection connection = openConnection("/callback" + query);
        connection.setRequestMethod("GET");
        if (connection.getResponseCode() >= 300) {
            throw new IOException("Unsuccessful http request " + connection.getResponseCode() + " " + connection.getResponseMessage());
        }
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