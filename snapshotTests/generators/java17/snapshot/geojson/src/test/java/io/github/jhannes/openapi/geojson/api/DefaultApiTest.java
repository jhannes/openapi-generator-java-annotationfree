/*
 * GeoJSON
 * GeoJSON
 *
 * The version of the OpenAPI document: 0.1.9
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.jhannes.openapi.geojson.api;

import io.github.jhannes.openapi.geojson.model.GeometryCollectionDto;
import io.github.jhannes.openapi.geojson.model.GeometryDto;
import io.github.jhannes.openapi.geojson.model.PolygonDto;
import io.github.jhannes.openapi.geojson.model.SampleModelData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * API tests for DefaultApi
 */
public class DefaultApiTest {

    private final DefaultApi api = new HttpDefaultApi();
    private final SampleModelData sampleData = new SampleModelData(-1);

    public DefaultApiTest() throws MalformedURLException {
    }

    @Test
    public void getGeometryTest() throws IOException {
        //GeometryDto response = api.getGeometry();
        // TODO: test validations
    }

    @Test
    public void getLocationTest() throws IOException {
        //GeometryCollectionDto response = api.getLocation();
        // TODO: test validations
    }

    @Test
    public void getPolygonTest() throws IOException {
        //PolygonDto response = api.getPolygon();
        // TODO: test validations
    }

}