package io.github.jhannes.openapi.fakerestapi.api;

import io.github.jhannes.openapi.fakerestapi.model.ActivityDto;
import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class ActivitiesHttpApi implements ActivitiesApi {

    private final Jsonb jsonb;

    private final URL baseUrl;

    public ActivitiesHttpApi() throws MalformedURLException {
        this(new URL("https://fakerestapi.azurewebsites.net"), JsonbBuilder.create());
    }

    public ActivitiesHttpApi(URL baseUrl, Jsonb jsonb) {
        this.baseUrl = baseUrl;
        this.jsonb = jsonb;
    }

    @Override
    public List<ActivityDto> apiV1ActivitiesGet() throws IOException {
        URL url = new URL(baseUrl + "/api/v1/Activities");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        if (connection.getResponseCode() >= 300) {
            throw new IOException("Unsuccessful http request " + connection.getResponseCode() + " " + connection.getResponseMessage());
        }
        return jsonb.fromJson(connection.getInputStream(), getParameterizedType(List.class, new Type[]{ActivityDto.class}));
    }


    @Override
    public void apiV1ActivitiesIdDelete(Integer id) throws IOException {
        URL url = new URL(String.format(baseUrl + "/api/v1/Activities/%d", id));
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("DELETE");
        if (connection.getResponseCode() >= 300) {
            throw new IOException("Unsuccessful http request " + connection.getResponseCode() + " " + connection.getResponseMessage());
        }
    }

    @Override
    public ActivityDto apiV1ActivitiesIdGet(Integer id) throws IOException {
        URL url = new URL(String.format(baseUrl + "/api/v1/Activities/%d", id));
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        return jsonb.fromJson(connection.getInputStream(), ActivityDto.class);
    }

    @Override
    public ActivityDto apiV1ActivitiesIdPut(Integer id, ActivityDto activityDto) throws IOException {
        URL url = new URL(String.format(baseUrl + "/api/v1/Activities/%d", id));
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
    public ActivityDto apiV1ActivitiesPost(ActivityDto activityDto) throws IOException {
        URL url = new URL(baseUrl + "/api/v1/Activities/");
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
