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
* PersonInterface
*/
public interface PersonInterface extends RecipientInterface {

    /**
     * Gets or Sets gender
     */
    public enum GenderEnum {

        MALE("male"),
        FEMALE("female"),
        OTHER("other"),
        UNSPECIFIED("unspecified");

        private String value;

        GenderEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static GenderEnum fromValue(String text) {
            for (GenderEnum b : GenderEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }

    List<String> missingRequiredFields();

    void readOnlyFieldsWithValue(List<String> result);


    /**
     * Get id
     * read only
     * @return id
     */
    UUID getId();

    /** <strong>read only</strong> */
    void setId(UUID id);

    PersonInterface id(UUID id);

    /**
     * Get type
     * @return type
     */
    String getType();

    void setType(String type);

    PersonInterface type(String type);

    /**
     * Get givenName
     * @return givenName
     */
    String getGivenName();

    void setGivenName(String givenName);

    PersonInterface givenName(String givenName);

    /**
     * Get familyName
     * @return familyName
     */
    String getFamilyName();

    void setFamilyName(String familyName);

    PersonInterface familyName(String familyName);

    /**
     * Get phone
     * @return phone
     */
    String getPhone();

    void setPhone(String phone);

    PersonInterface phone(String phone);

    /**
     * Get birthDate
     * @return birthDate
     */
    LocalDate getBirthDate();

    void setBirthDate(LocalDate birthDate);

    PersonInterface birthDate(LocalDate birthDate);

    /**
     * Get gender
     * @return gender
     */
    GenderEnum getGender();

    void setGender(GenderEnum gender);

    PersonInterface gender(GenderEnum gender);

    @Override
    PersonInterface email(String email);

    default <T extends PersonInterface> T copyTo(T target) {
        if (this.getId() != null) target.setId(this.getId());
        if (this.getType() != null) target.setType(this.getType());
        if (this.getGivenName() != null) target.setGivenName(this.getGivenName());
        if (this.getFamilyName() != null) target.setFamilyName(this.getFamilyName());
        if (this.getPhone() != null) target.setPhone(this.getPhone());
        if (this.getBirthDate() != null) target.setBirthDate(this.getBirthDate());
        if (this.getGender() != null) target.setGender(this.getGender());
        if (this.getEmail() != null) target.setEmail(this.getEmail());
        return target;
    }
}

