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
* PointDto
*/
public class PointDto implements GeometryDto {

    private String type = "Point";

    private List<Double> coordinates = new ArrayList<>();

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
                "coordinates",
        };
    }

    public List<String> missingRequiredFields() {
        List<String> result = new ArrayList<>();
        if (isMissing(getType())) result.add("type");
        if (isMissing(getCoordinates())) result.add("coordinates");
        return result;
    }

    public void readOnlyFieldsWithValue(List<String> result) {
    }

    public <T extends PointDto> T copyTo(T target) {
        if (this.getType() != null) target.setType(this.getType());
        if (this.getCoordinates() != null) target.setCoordinates(this.getCoordinates());
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

    public PointDto type(String type) {
        this.type = type;
        return this;
    }

    public <T> PointDto coordinates(Collection<T> items, Function<T, Double> mapper) {
        return coordinates(items.stream().map(mapper).collect(Collectors.toList()));
    }

    public <T> List<T> getCoordinates(Function<Double, T> mapper) {
        return getCoordinates().stream().map(mapper).collect(Collectors.toList());
    }

    public PointDto addCoordinatesItem(Double coordinatesItem) {
        this.coordinates.add(coordinatesItem);
        return this;
    }

    /**
     * Point in 3D space
     * @return coordinates
     */
    public List<Double> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Double> coordinates) {
        this.coordinates = coordinates;
    }

    public PointDto coordinates(List<Double> coordinates) {
        this.coordinates = coordinates;
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
        PointDto point = (PointDto) o;
        return Objects.equals(this.getType(), point.getType()) &&
                Objects.equals(this.getCoordinates(), point.getCoordinates());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(), getCoordinates());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PointDto {\n");
        sb.append("    type: ").append(toIndentedString(getType())).append("\n");
        sb.append("    coordinates: ").append(toIndentedString(getCoordinates())).append("\n");
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
