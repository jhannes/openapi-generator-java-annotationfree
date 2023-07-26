/*
 * Sample API
 * Optional multiline or single-line description in [CommonMark](http://commonmark.org/help/) or HTML.
 *
 * The version of the OpenAPI document: 0.1.9
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.jhannes.openapi.typeHierarchy.model;

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
* WorkingDogDto
*/
public class WorkingDogDto extends DogDto implements PetDto {

    private List<WorkingDogCapabilityDto> capabilities = new ArrayList<>();

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
                "pet_type",
                "capabilities",
                "name",
        };
    }

    public List<String> missingRequiredFields() {
        List<String> result = super.missingRequiredFields();
        if (isMissing(getCapabilities())) result.add("capabilities");
        return result;
    }

    public void readOnlyFieldsWithValue(List<String> result) {
        super.readOnlyFieldsWithValue(result);
    }

    public <T extends WorkingDogDto> T copyTo(T target) {
        super.copyTo(target);
        if (this.getCapabilities() != null) target.setCapabilities(this.getCapabilities());
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


    @Override
    public WorkingDogDto petType(String petType) {
        super.petType(petType);
        return this;
    }

    public <T> WorkingDogDto capabilities(Collection<T> items, Function<T, WorkingDogCapabilityDto> mapper) {
        return capabilities(items.stream().map(mapper).collect(Collectors.toList()));
    }

    public <T> List<T> getCapabilities(Function<WorkingDogCapabilityDto, T> mapper) {
        return getCapabilities().stream().map(mapper).collect(Collectors.toList());
    }

    public WorkingDogDto addCapabilitiesItem(WorkingDogCapabilityDto capabilitiesItem) {
        this.capabilities.add(capabilitiesItem);
        return this;
    }

    /**
     * Get capabilities
     * @return capabilities
     */
    public List<WorkingDogCapabilityDto> getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(List<WorkingDogCapabilityDto> capabilities) {
        this.capabilities = capabilities;
    }

    public WorkingDogDto capabilities(List<WorkingDogCapabilityDto> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    @Override
    public WorkingDogDto id(String id) {
        super.id(id);
        return this;
    }

    @Override
    public WorkingDogDto name(String name) {
        super.name(name);
        return this;
    }

    @Override
    public WorkingDogDto birthDate(String birthDate) {
        super.birthDate(birthDate);
        return this;
    }

    @Override
    public WorkingDogDto ownerAddress(AddressDto ownerAddress) {
        super.ownerAddress(ownerAddress);
        return this;
    }

    @Override
    public WorkingDogDto bark(Boolean bark) {
        super.bark(bark);
        return this;
    }

    @Override
    public WorkingDogDto breed(BreedEnum breed) {
        super.breed(breed);
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
        WorkingDogDto workingDog = (WorkingDogDto) o;
        return Objects.equals(this.getPetType(), workingDog.getPetType()) &&
                Objects.equals(this.getCapabilities(), workingDog.getCapabilities()) &&
                Objects.equals(this.getId(), workingDog.getId()) &&
                Objects.equals(this.getName(), workingDog.getName()) &&
                Objects.equals(this.getBirthDate(), workingDog.getBirthDate()) &&
                Objects.equals(this.getOwnerAddress(), workingDog.getOwnerAddress()) &&
                Objects.equals(this.getBark(), workingDog.getBark()) &&
                Objects.equals(this.getBreed(), workingDog.getBreed()) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPetType(), getCapabilities(), getId(), getName(), getBirthDate(), getOwnerAddress(), getBark(), getBreed());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WorkingDogDto {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    capabilities: ").append(toIndentedString(getCapabilities())).append("\n");
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

