/*
 * Sample API
 * A small example to demonstrate individual problems
 *
 * The version of the OpenAPI document: 0.1.9
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.github.jhannes.openapi.readOnly.api;

import java.time.LocalDate;
import io.github.jhannes.openapi.readOnly.model.PetDto;
import java.util.UUID;
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

public class HttpDefaultApi implements DefaultApi {

    private final Jsonb jsonb;

    private final URL baseUrl;

    public HttpDefaultApi() throws MalformedURLException {
        this(new URL("/v1"));
    }

    public HttpDefaultApi(URL baseUrl) {
        this(baseUrl, JsonbBuilder.create());
    }

    public HttpDefaultApi(URL baseUrl, Jsonb jsonb) {
        this.baseUrl = baseUrl;
        this.jsonb = jsonb;
    }

    @Override
    public void addPet(
            UUID storeId,
            PetDto petDto
    ) throws IOException {
        HttpURLConnection connection = openConnection("/{storeId}/pets"
                .replace("{storeId}", encode(String.valueOf(storeId), UTF_8)));
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setDoOutput(true);
        jsonb.toJson(petDto, connection.getOutputStream());
        if (connection.getResponseCode() >= 300) {
            throw new IOException("Unsuccessful http request " + connection.getResponseCode() + " " + connection.getResponseMessage());
        }
    }

    @Override
    public void addPetWithForm(
            UUID petId,
            Optional<String> name,
            Optional<String> status
    ) throws IOException {
        HttpURLConnection connection = openConnection("/pets/{petId}"
                .replace("{petId}", encode(String.valueOf(petId), UTF_8)));
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        connection.setDoOutput(true);
        List<String> formParameters = new ArrayList<>();
        name.ifPresent(p -> formParameters.add("name=" + encode(String.valueOf(p), UTF_8)));
        status.ifPresent(p -> formParameters.add("status=" + encode(String.valueOf(p), UTF_8)));
        connection.getOutputStream().write(String.join("&", formParameters).getBytes());
        if (connection.getResponseCode() >= 300) {
            throw new IOException("Unsuccessful http request " + connection.getResponseCode() + " " + connection.getResponseMessage());
        }
    }

    @Override
    public PetDto listPets(
            UUID storeId,
            Optional<List<String>> status,
            Optional<List<String>> tags,
            Optional<LocalDate> bornAfter
    ) throws IOException {
        List<String> queryParameters = new ArrayList<>();
        status.ifPresent(list -> list.forEach(p -> queryParameters.add("status=" + encode(String.valueOf(p), UTF_8))));
        tags.ifPresent(list -> list.forEach(p -> queryParameters.add("tags=" + encode(String.valueOf(p), UTF_8))));
        bornAfter.ifPresent(p -> queryParameters.add("bornAfter=" + encode(String.valueOf(p), UTF_8)));
        String queryString = queryParameters.isEmpty() ? "" : "?" + String.join("&", queryParameters);
        HttpURLConnection connection = openConnection("/{storeId}/pets"
                .replace("{storeId}", encode(String.valueOf(storeId), UTF_8)) + queryString);
        connection.setRequestMethod("GET");
        if (connection.getResponseCode() >= 300) {
            throw new IOException("Unsuccessful http request " + connection.getResponseCode() + " " + connection.getResponseMessage());
        }
        return jsonb.fromJson(connection.getInputStream(), PetDto.class);
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
