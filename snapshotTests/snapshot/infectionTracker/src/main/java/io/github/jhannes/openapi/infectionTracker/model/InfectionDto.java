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


package io.github.jhannes.openapi.infectionTracker.model;

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
* InfectionDto
*/
public class InfectionDto {

    private UUID id;

    private InfectionInformationDto information = new InfectionInformationDto();

    private List<ExposureDto> registeredExposures = new ArrayList<>();

    public static String[] readOnlyFields() {
        return new String[] {
                "id",
        };
    }

    public static String[] writeOnlyFields() {
        return new String[] {
        };
    }

    public static String[] requiredFields() {
        return new String[] {
                "id",
                "information",
                "registeredExposures",
        };
    }

    public List<String> missingRequiredFields() {
        List<String> result = new ArrayList<>();
        if (isMissing(getId())) result.add("id");
        if (isMissing(getInformation())) result.add("information");
        if (isMissing(getRegisteredExposures())) result.add("registeredExposures");
        return result;
    }

    public void readOnlyFieldsWithValue(List<String> result) {
        if (!isMissing(getId())) {
            result.add("InfectionDto.id");
        }
        if (information != null) {
            information.readOnlyFieldsWithValue(result);
        }
        if (registeredExposures != null) {
            registeredExposures.forEach(o -> o.readOnlyFieldsWithValue(result));
        }
    }

    public <T extends InfectionDto> T copyTo(T target) {
        if (this.getId() != null) target.setId(this.getId());
        if (this.getInformation() != null) target.setInformation(this.getInformation());
        if (this.getRegisteredExposures() != null) target.setRegisteredExposures(this.getRegisteredExposures());
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
     * Get id
     * read only
     * @return id
     */
    public UUID getId() {
        return id;
    }

    /** <strong>read only</strong> */
    public void setId(UUID id) {
        this.id = id;
    }

    public InfectionDto id(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Get information
     * @return information
     */
    public InfectionInformationDto getInformation() {
        return information;
    }

    public void setInformation(InfectionInformationDto information) {
        this.information = information;
    }

    public InfectionDto information(InfectionInformationDto information) {
        this.information = information;
        return this;
    }

    public <T> InfectionDto registeredExposures(Collection<T> items, Function<T, ExposureDto> mapper) {
        return registeredExposures(items.stream().map(mapper).collect(Collectors.toList()));
    }

    public <T> List<T> getRegisteredExposures(Function<ExposureDto, T> mapper) {
        return getRegisteredExposures().stream().map(mapper).collect(Collectors.toList());
    }

    public InfectionDto addRegisteredExposuresItem(ExposureDto registeredExposuresItem) {
        this.registeredExposures.add(registeredExposuresItem);
        return this;
    }

    /**
     * Get registeredExposures
     * @return registeredExposures
     */
    public List<ExposureDto> getRegisteredExposures() {
        return registeredExposures;
    }

    public void setRegisteredExposures(List<ExposureDto> registeredExposures) {
        this.registeredExposures = registeredExposures;
    }

    public InfectionDto registeredExposures(List<ExposureDto> registeredExposures) {
        this.registeredExposures = registeredExposures;
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
        InfectionDto infection = (InfectionDto) o;
        return Objects.equals(this.getId(), infection.getId()) &&
                Objects.equals(this.getInformation(), infection.getInformation()) &&
                Objects.equals(this.getRegisteredExposures(), infection.getRegisteredExposures());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getInformation(), getRegisteredExposures());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InfectionDto {\n");
        sb.append("    id: ").append(toIndentedString(getId())).append("\n");
        sb.append("    information: ").append(toIndentedString(getInformation())).append("\n");
        sb.append("    registeredExposures: ").append(toIndentedString(getRegisteredExposures())).append("\n");
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

