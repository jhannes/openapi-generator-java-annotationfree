package io.github.jhannes.openapi.websockets.model;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public interface PersonInterface {
    static String[] readOnlyFields() {
        return new String[]{
                "id",
        };
    }

    static String[] writeOnlyFields() {
        return new String[]{
        };
    }

    static String[] requiredFields() {
        return new String[]{
                "type",
                "givenName",
                "familyName",
        };
    }

    List<String> missingRequiredFields();

    void readOnlyFieldsWithValue(List<String> result);

    UUID getId();

    void setId(UUID id);

    PersonInterface id(UUID id);

    String getType();

    void setType(String type);

    PersonInterface type(String type);

    String getGivenName();

    void setGivenName(String givenName);

    PersonInterface givenName(String givenName);

    String getFamilyName();

    void setFamilyName(String familyName);

    PersonInterface familyName(String familyName);

    String getEmail();

    void setEmail(String email);

    PersonInterface email(String email);

    String getPhone();

    void setPhone(String phone);

    PersonInterface phone(String phone);

    LocalDate getBirthDate();

    void setBirthDate(LocalDate birthDate);

    PersonInterface birthDate(LocalDate birthDate);
}
