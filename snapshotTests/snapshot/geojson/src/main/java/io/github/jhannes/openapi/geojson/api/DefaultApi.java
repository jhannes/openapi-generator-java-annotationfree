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

import java.io.IOException;
import java.util.Map;
import java.util.List;
import java.util.Optional;

public interface DefaultApi {
    /**
     * @return GeometryDto
     */
    GeometryDto getGeometry(
    ) throws IOException;
    /**
     * @return GeometryCollectionDto
     */
    GeometryCollectionDto getLocation(
    ) throws IOException;
    /**
     * @return PolygonDto
     */
    PolygonDto getPolygon(
    ) throws IOException;
}
