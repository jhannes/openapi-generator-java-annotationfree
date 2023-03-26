/*
 * Infection Tracker
 * Infection Tracker - A case management system for tracking the spread of diseases
 *
 * The version of the OpenAPI document: 1.0.0-draft
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.github.jhannes.openapi.infectionTracker.api;

import io.github.jhannes.openapi.infectionTracker.model.ExposureDto;
import java.time.LocalDate;
import java.util.UUID;
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

public class HttpExposuresApi implements ExposuresApi {

    private final Jsonb jsonb;

    private final URL baseUrl;

    public HttpExposuresApi() throws MalformedURLException {
        this(new URL("/api"));
    }

    public HttpExposuresApi(URL baseUrl) {
        this(baseUrl, JsonbBuilder.create());
    }

    public HttpExposuresApi(URL baseUrl, Jsonb jsonb) {
        this.baseUrl = baseUrl;
        this.jsonb = jsonb;
    }

    @Override
    public ExposureDto listExposures(
            Optional<List<LocalDate>> exposureDate,
            Optional<Integer> maxCount
    ) throws IOException {
        List<String> queryParameters = new ArrayList<>();
        exposureDate.ifPresent(list -> list.forEach(p -> queryParameters.add("exposureDate=" + encode(String.valueOf(p), UTF_8))));
        maxCount.ifPresent(p -> queryParameters.add("maxCount=" + encode(String.valueOf(p), UTF_8)));
        String query = queryParameters.isEmpty() ? "" : "?" + String.join("&", queryParameters);
        HttpURLConnection connection = openConnection("/api/exposures" + query);
        connection.setRequestMethod("GET");
        if (connection.getResponseCode() >= 300) {
            throw new IOException("Unsuccessful http request " + connection.getResponseCode() + " " + connection.getResponseMessage());
        }
        return jsonb.fromJson(connection.getInputStream(), ExposureDto.class);
    }

    @Override
    public void updateExposure(
            UUID exposureId,
            ExposureDto exposureDto
    ) throws IOException {
        HttpURLConnection connection = openConnection("/api/exposures/{exposureId}"
                .replace("{exposureId}", encode(String.valueOf(exposureId), UTF_8)));
        connection.setRequestMethod("PUT");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setDoOutput(true);
        jsonb.toJson(exposureDto, connection.getOutputStream());
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
