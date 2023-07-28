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


package io.github.jhannes.openapi.geojson.model;

import java.io.File;
import java.net.URI;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
* GeoJSon geometry collection
*/
public class GeometryCollectionDto {

    private String type = "GeometryCollection";

    private List<GeometryDto> geometries = new ArrayList<>();

    public static String[] readOnlyFields() {
        return new String[] {
        };
    }

    public static String[] writeOnlyFields() {
        return new String[] {
        };
    }

    public static String[] requiredFields() {
        return new String[] {
                "type",
                "geometries",
        };
    }

    public List<String> missingRequiredFields() {
        List<String> result = new ArrayList<>();
        if (isMissing(getType())) result.add("type");
        if (isMissing(getGeometries())) result.add("geometries");
        return result;
    }

    public void readOnlyFieldsWithValue(List<String> result) {
        if (geometries != null) {
            geometries.forEach(o -> o.readOnlyFieldsWithValue(result));
        }
    }

    public <T extends GeometryCollectionDto> T copyTo(T target) {
        if (this.getType() != null) target.setType(this.getType());
        if (this.getGeometries() != null) target.setGeometries(this.getGeometries());
        return target;
    }

    private boolean isMissing(String s) {
        return s == null || s.isEmpty();
    }

    private boolean isMissing(List<?> list) {
        return list == null;
    }

    private boolean isMissing(Object s) {
        return s == null;
    }


    /**
     * Get type
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public GeometryCollectionDto type(String type) {
        this.type = type;
        return this;
    }

    public <T> GeometryCollectionDto geometries(Collection<T> items, Function<T, GeometryDto> mapper) {
        return geometries(items.stream().map(mapper).collect(Collectors.toList()));
    }

    public <T> List<T> getGeometries(Function<GeometryDto, T> mapper) {
        return getGeometries().stream().map(mapper).collect(Collectors.toList());
    }

    public GeometryCollectionDto addGeometriesItem(GeometryDto geometriesItem) {
        this.geometries.add(geometriesItem);
        return this;
    }

    /**
     * Get geometries
     * @return geometries
     */
    public List<GeometryDto> getGeometries() {
        return geometries;
    }

    public void setGeometries(List<GeometryDto> geometries) {
        this.geometries = geometries;
    }

    public GeometryCollectionDto geometries(List<GeometryDto> geometries) {
        this.geometries = geometries;
        return this;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GeometryCollectionDto geometryCollection = (GeometryCollectionDto) o;
        return Objects.equals(this.getType(), geometryCollection.getType()) &&
                Objects.equals(this.getGeometries(), geometryCollection.getGeometries());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(), getGeometries());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GeometryCollectionDto {\n");
        sb.append("    type: ").append(toIndentedString(getType())).append("\n");
        sb.append("    geometries: ").append(toIndentedString(getGeometries())).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

