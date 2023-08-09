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
* DogDto
*/
public class DogDto extends PetBaseDto implements PetDto {

    private String pet_type = "Dog";

    private Boolean bark = null;

    /**
     * Gets or Sets breed
     */
    public enum BreedEnum {

        DINGO("Dingo"),
        HUSKY("Husky"),
        RETRIEVER("Retriever"),
        SHEPHERD("Shepherd");

        private String value;

        BreedEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static BreedEnum fromValue(String text) {
            for (BreedEnum b : BreedEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }

    private BreedEnum breed = null;

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
                "name",
                "pet_type",
        };
    }

    public List<String> missingRequiredFields() {
        List<String> result = super.missingRequiredFields();
        if (isMissing(getPetType())) result.add("pet_type");
        return result;
    }

    public void readOnlyFieldsWithValue(List<String> result) {
        super.readOnlyFieldsWithValue(result);
    }

    public <T extends DogDto> T copyTo(T target) {
        super.copyTo(target);
        if (this.getPetType() != null) target.setPetType(this.getPetType());
        if (this.getBark() != null) target.setBark(this.getBark());
        if (this.getBreed() != null) target.setBreed(this.getBreed());
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
    public DogDto id(String id) {
        super.id(id);
        return this;
    }

    @Override
    public DogDto name(String name) {
        super.name(name);
        return this;
    }

    @Override
    public DogDto birthDate(String birthDate) {
        super.birthDate(birthDate);
        return this;
    }

    @Override
    public DogDto ownerAddress(AddressDto ownerAddress) {
        super.ownerAddress(ownerAddress);
        return this;
    }

    /**
     * Get pet_type
     * @return pet_type
     */
    public String getPetType() {
        return pet_type;
    }

    public void setPetType(String petType) {
        this.pet_type = petType;
    }

    public DogDto petType(String petType) {
        this.pet_type = petType;
        return this;
    }

    /**
     * Get bark
     * @return bark
     */
    public Boolean getBark() {
        return bark;
    }

    public void setBark(Boolean bark) {
        this.bark = bark;
    }

    public DogDto bark(Boolean bark) {
        this.bark = bark;
        return this;
    }

    /**
     * Get breed
     * @return breed
     */
    public BreedEnum getBreed() {
        return breed;
    }

    public void setBreed(BreedEnum breed) {
        this.breed = breed;
    }

    public DogDto breed(BreedEnum breed) {
        this.breed = breed;
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
        DogDto dog = (DogDto) o;
        return Objects.equals(this.getPetType(), dog.getPetType()) &&
                Objects.equals(this.getBark(), dog.getBark()) &&
                Objects.equals(this.getBreed(), dog.getBreed()) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getBirthDate(), getOwnerAddress(), getPetType(), getBark(), getBreed());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DogDto {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    pet_type: ").append(toIndentedString(getPetType())).append("\n");
        sb.append("    bark: ").append(toIndentedString(getBark())).append("\n");
        sb.append("    breed: ").append(toIndentedString(getBreed())).append("\n");
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

