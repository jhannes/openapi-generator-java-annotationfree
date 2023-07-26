/*
 * WebSockets
 * An example of sending requests and commands
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: johannes@brodwall.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.jhannes.openapi.websockets.model;

import java.io.File;
import java.net.URI;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
* StringSnapshotDto
*/
public class StringSnapshotDto extends ChangeTrackedDto {

    private String name = null;

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
                "createdAt",
                "createdBy",
        };
    }

    public List<String> missingRequiredFields() {
        List<String> result = super.missingRequiredFields();
        return result;
    }

    public void readOnlyFieldsWithValue(List<String> result) {
        super.readOnlyFieldsWithValue(result);
    }

    public <T extends StringSnapshotDto> T copyTo(T target) {
        super.copyTo(target);
        if (this.getName() != null) target.setName(this.getName());
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
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StringSnapshotDto name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public StringSnapshotDto createdAt(OffsetDateTime createdAt) {
        super.createdAt(createdAt);
        return this;
    }

    @Override
    public StringSnapshotDto createdBy(String createdBy) {
        super.createdBy(createdBy);
        return this;
    }

    @Override
    public StringSnapshotDto updatedAt(OffsetDateTime updatedAt) {
        super.updatedAt(updatedAt);
        return this;
    }

    @Override
    public StringSnapshotDto updatedBy(String updatedBy) {
        super.updatedBy(updatedBy);
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
        StringSnapshotDto stringSnapshot = (StringSnapshotDto) o;
        return Objects.equals(this.getName(), stringSnapshot.getName()) &&
                Objects.equals(this.getCreatedAt(), stringSnapshot.getCreatedAt()) &&
                Objects.equals(this.getCreatedBy(), stringSnapshot.getCreatedBy()) &&
                Objects.equals(this.getUpdatedAt(), stringSnapshot.getUpdatedAt()) &&
                Objects.equals(this.getUpdatedBy(), stringSnapshot.getUpdatedBy()) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCreatedAt(), getCreatedBy(), getUpdatedAt(), getUpdatedBy());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StringSnapshotDto {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    name: ").append(toIndentedString(getName())).append("\n");
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

