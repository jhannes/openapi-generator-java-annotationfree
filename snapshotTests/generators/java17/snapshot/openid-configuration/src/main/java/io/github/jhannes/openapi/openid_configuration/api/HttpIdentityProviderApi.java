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

import io.github.jhannes.openapi.openid_configuration.model.GrantTypeDto;
import io.github.jhannes.openapi.openid_configuration.model.OauthErrorDto;
import io.github.jhannes.openapi.openid_configuration.model.ResponseTypeDto;
import io.github.jhannes.openapi.openid_configuration.model.TokenResponseDto;
import java.net.URI;
import io.github.jhannes.openapi.openid_configuration.model.UserinfoDto;
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

public class HttpIdentityProviderApi implements IdentityProviderApi {

    private final Jsonb jsonb;

    private final URL baseUrl;

    public HttpIdentityProviderApi() throws MalformedURLException {
        this(new URL("http://localhost"));
    }

    public HttpIdentityProviderApi(URL baseUrl) {
        this(baseUrl, JsonbBuilder.create());
    }

    public HttpIdentityProviderApi(URL baseUrl, Jsonb jsonb) {
        this.baseUrl = baseUrl;
        this.jsonb = jsonb;
    }

    @Override
    public TokenResponseDto fetchToken(
            GrantTypeDto grant_type,
            String code,
            String client_id,
            Optional<String> authorization,
            Optional<String> client_secret,
            Optional<URI> redirect_uri,
            Optional<String> subject_token,
            Optional<String> audience
    ) throws IOException {
        HttpURLConnection connection = openConnection("/token");
        connection.setRequestMethod("POST");
        authorization.ifPresent(p -> connection.setRequestProperty("Authorization", String.valueOf(p)));
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        connection.setDoOutput(true);
        List<String> formParameters = new ArrayList<>();
        formParameters.add("grant_type=" + encode(String.valueOf(grant_type), UTF_8));
        formParameters.add("code=" + encode(String.valueOf(code), UTF_8));
        formParameters.add("client_id=" + encode(String.valueOf(client_id), UTF_8));
        client_secret.ifPresent(p -> formParameters.add("client_secret=" + encode(String.valueOf(p), UTF_8)));
        redirect_uri.ifPresent(p -> formParameters.add("redirect_uri=" + encode(String.valueOf(p), UTF_8)));
        subject_token.ifPresent(p -> formParameters.add("subject_token=" + encode(String.valueOf(p), UTF_8)));
        audience.ifPresent(p -> formParameters.add("audience=" + encode(String.valueOf(p), UTF_8)));
        connection.getOutputStream().write(String.join("&", formParameters).getBytes());
        if (connection.getResponseCode() >= 300) {
            throw new IOException("Unsuccessful http request " + connection.getResponseCode() + " " + connection.getResponseMessage());
        }
        return jsonb.fromJson(connection.getInputStream(), TokenResponseDto.class);
    }

    @Override
    public UserinfoDto getUserinfo(
            String authorization
    ) throws IOException {
        HttpURLConnection connection = openConnection("/userinfo");
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Authorization", String.valueOf(authorization));
        if (connection.getResponseCode() >= 300) {
            throw new IOException("Unsuccessful http request " + connection.getResponseCode() + " " + connection.getResponseMessage());
        }
        return jsonb.fromJson(connection.getInputStream(), UserinfoDto.class);
    }

    @Override
    public void startAuthorization(
            String client_id,
            Optional<ResponseTypeDto> response_type,
            Optional<String> state,
            Optional<URI> redirect_uri,
            Optional<String> scope
    ) throws IOException {
        List<String> queryParameters = new ArrayList<>();
        response_type.ifPresent(p -> queryParameters.add("response_type=" + encode(String.valueOf(p), UTF_8)));
        queryParameters.add("client_id=" + encode(String.valueOf(client_id), UTF_8));
        state.ifPresent(p -> queryParameters.add("state=" + encode(String.valueOf(p), UTF_8)));
        redirect_uri.ifPresent(p -> queryParameters.add("redirect_uri=" + encode(String.valueOf(p), UTF_8)));
        scope.ifPresent(p -> queryParameters.add("scope=" + encode(String.valueOf(p), UTF_8)));
        String query = queryParameters.isEmpty() ? "" : "?" + String.join("&", queryParameters);
        HttpURLConnection connection = openConnection("/authorize" + query);
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