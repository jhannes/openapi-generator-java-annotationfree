/*
 * Sample API
 * A small example to demonstrate individual problems
 *
 * The version of the OpenAPI document: 0.1.9
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.jhannes.openapi.bigExample.model;

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
* PetStoreDto
*/
public class PetStoreDto {

    private Map<String, PetDto> pets = null;

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
        };
    }

    public List<String> missingRequiredFields() {
        List<String> result = new ArrayList<>();
        return result;
    }

    public void readOnlyFieldsWithValue(List<String> result) {
        if (pets != null) {
            pets.values().forEach(o -> o.readOnlyFieldsWithValue(result));
        }
    }

    public <T extends PetStoreDto> T copyTo(T target) {
        if (this.getPets() != null) target.setPets(this.getPets());
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


    public PetStoreDto putPetsItem(String key, PetDto petsItem) {
         if (this.pets == null) {
             this.pets = new HashMap<>();
         }
         this.pets.put(key, petsItem);
         return this;
    }

    /**
     * Get pets
     * @return pets
     */
    public Map<String, PetDto> getPets() {
        return pets;
    }

    public void setPets(Map<String, PetDto> pets) {
        this.pets = pets;
    }

    public PetStoreDto pets(Map<String, PetDto> pets) {
        this.pets = pets;
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
        PetStoreDto petStore = (PetStoreDto) o;
        return Objects.equals(this.getPets(), petStore.getPets());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPets());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PetStoreDto {\n");
        sb.append("    pets: ").append(toIndentedString(getPets())).append("\n");
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

