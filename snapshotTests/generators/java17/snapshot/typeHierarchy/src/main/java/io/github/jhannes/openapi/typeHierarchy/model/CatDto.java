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
* CatDto
*/
public class CatDto extends PetBaseDto implements PetDto {

    private String pet_type = "Cat";

    private Boolean hunts = null;

    private Integer age = null;

    public static String[] readOnlyFields() {
        return new String[] {
                "id",
                "age",
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
        if (!isMissing(getAge())) {
            result.add("CatDto.age");
        }
    }

    public <T extends CatDto> T copyTo(T target) {
        super.copyTo(target);
        if (this.getPetType() != null) target.setPetType(this.getPetType());
        if (this.getHunts() != null) target.setHunts(this.getHunts());
        if (this.getAge() != null) target.setAge(this.getAge());
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
    public CatDto id(String id) {
        super.id(id);
        return this;
    }

    @Override
    public CatDto name(String name) {
        super.name(name);
        return this;
    }

    @Override
    public CatDto birthDate(String birthDate) {
        super.birthDate(birthDate);
        return this;
    }

    @Override
    public CatDto ownerAddress(AddressDto ownerAddress) {
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

    public CatDto petType(String petType) {
        this.pet_type = petType;
        return this;
    }

    /**
     * Get hunts
     * @return hunts
     */
    public Boolean getHunts() {
        return hunts;
    }

    public void setHunts(Boolean hunts) {
        this.hunts = hunts;
    }

    public CatDto hunts(Boolean hunts) {
        this.hunts = hunts;
        return this;
    }

    /**
     * Get age
     * read only
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /** <strong>read only</strong> */
    public void setAge(Integer age) {
        this.age = age;
    }

    public CatDto age(Integer age) {
        this.age = age;
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
        CatDto cat = (CatDto) o;
        return Objects.equals(this.getPetType(), cat.getPetType()) &&
                Objects.equals(this.getHunts(), cat.getHunts()) &&
                Objects.equals(this.getAge(), cat.getAge()) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getBirthDate(), getOwnerAddress(), getPetType(), getHunts(), getAge());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CatDto {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    pet_type: ").append(toIndentedString(getPetType())).append("\n");
        sb.append("    hunts: ").append(toIndentedString(getHunts())).append("\n");
        sb.append("    age: ").append(toIndentedString(getAge())).append("\n");
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

