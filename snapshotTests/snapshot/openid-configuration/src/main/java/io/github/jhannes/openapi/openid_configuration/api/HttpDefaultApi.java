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

import io.github.jhannes.openapi.openid_configuration.model.DiscoveryDocumentDto;
import io.github.jhannes.openapi.openid_configuration.model.JwksDocumentDto;
import io.github.jhannes.openapi.openid_configuration.model.TokenResponseDto;
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

public class HttpDefaultApi implements DefaultApi {

    private final Jsonb jsonb;

    private final URL baseUrl;

    public HttpDefaultApi() throws MalformedURLException {
        this(new URL("http://localhost"));
    }

    public HttpDefaultApi(URL baseUrl) {
        this(baseUrl, JsonbBuilder.create());
    }

    public HttpDefaultApi(URL baseUrl, Jsonb jsonb) {
        this.baseUrl = baseUrl;
        this.jsonb = jsonb;
    }

    @Override
    public TokenResponseDto fetchToken(
            Optional<String> authorization,
            Optional<String> grant_type,
            Optional<String> code,
            Optional<String> client_id,
            Optional<String> client_secret,
            Optional<String> redirect_uri,
            Optional<String> subject_token,
            Optional<String> audience
    ) throws IOException {
        HttpURLConnection connection = openConnection("/token");
        connection.setRequestMethod("POST");
        authorization.ifPresent(p -> connection.setRequestProperty("Authorization", String.valueOf(p)));
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        connection.setDoOutput(true);
        List<String> formParameters = new ArrayList<>();
        grant_type.ifPresent(p -> formParameters.add("grant_type=" + encode(String.valueOf(p), UTF_8)));
        code.ifPresent(p -> formParameters.add("code=" + encode(String.valueOf(p), UTF_8)));
        client_id.ifPresent(p -> formParameters.add("client_id=" + encode(String.valueOf(p), UTF_8)));
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
    public JwksDocumentDto wellKnownKeysGet(
    ) throws IOException {
        HttpURLConnection connection = openConnection("/.well-known/keys");
        connection.setRequestMethod("GET");
        if (connection.getResponseCode() >= 300) {
            throw new IOException("Unsuccessful http request " + connection.getResponseCode() + " " + connection.getResponseMessage());
        }
        return jsonb.fromJson(connection.getInputStream(), JwksDocumentDto.class);
    }

    @Override
    public DiscoveryDocumentDto wellKnownOpenidConfigurationGet(
    ) throws IOException {
        HttpURLConnection connection = openConnection("/.well-known/openid-configuration");
        connection.setRequestMethod("GET");
        if (connection.getResponseCode() >= 300) {
            throw new IOException("Unsuccessful http request " + connection.getResponseCode() + " " + connection.getResponseMessage());
        }
        return jsonb.fromJson(connection.getInputStream(), DiscoveryDocumentDto.class);
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
