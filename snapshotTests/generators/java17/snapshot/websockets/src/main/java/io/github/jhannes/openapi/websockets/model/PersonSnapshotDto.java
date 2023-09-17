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
* PersonSnapshotDto
*/
public class PersonSnapshotDto implements ChangeTrackedInterface, PersonInterface {

    private OffsetDateTime createdAt;

    private String createdBy;

    private OffsetDateTime updatedAt = null;

    private String updatedBy = null;

    private String email = null;

    private UUID id = null;

    private String type;

    private PersonNameDto name = new PersonNameDto();

    private String phone = null;

    private LocalDate birthDate = null;

    private GenderEnum gender = null;

    private String extra = null;

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
                "createdAt",
                "createdBy",
                "type",
                "name",
        };
    }

    public List<String> missingRequiredFields() {
        List<String> result = new ArrayList<>();
        if (isMissing(getCreatedAt())) result.add("createdAt");
        if (isMissing(getCreatedBy())) result.add("createdBy");
        if (isMissing(getType())) result.add("type");
        if (isMissing(getName())) result.add("name");
        return result;
    }

    public void readOnlyFieldsWithValue(List<String> result) {
        if (!isMissing(getId())) {
            result.add("PersonSnapshotDto.id");
        }
        if (name != null) {
            name.readOnlyFieldsWithValue(result);
        }
    }

    public <T extends PersonSnapshotDto> T copyTo(T target) {
        if (this.getCreatedAt() != null) target.setCreatedAt(this.getCreatedAt());
        if (this.getCreatedBy() != null) target.setCreatedBy(this.getCreatedBy());
        if (this.getUpdatedAt() != null) target.setUpdatedAt(this.getUpdatedAt());
        if (this.getUpdatedBy() != null) target.setUpdatedBy(this.getUpdatedBy());
        if (this.getEmail() != null) target.setEmail(this.getEmail());
        if (this.getId() != null) target.setId(this.getId());
        if (this.getType() != null) target.setType(this.getType());
        if (this.getName() != null) target.setName(this.getName());
        if (this.getPhone() != null) target.setPhone(this.getPhone());
        if (this.getBirthDate() != null) target.setBirthDate(this.getBirthDate());
        if (this.getGender() != null) target.setGender(this.getGender());
        if (this.getExtra() != null) target.setExtra(this.getExtra());
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
     * Get createdAt
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public PersonSnapshotDto createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdBy
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public PersonSnapshotDto createdBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public PersonSnapshotDto updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedBy
     * @return updatedBy
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public PersonSnapshotDto updatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    /**
     * Get email
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public PersonSnapshotDto email(String email) {
        this.email = email;
        return this;
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

    public PersonSnapshotDto id(UUID id) {
        this.id = id;
        return this;
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

    public PersonSnapshotDto type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    public PersonNameDto getName() {
        return name;
    }

    public void setName(PersonNameDto name) {
        this.name = name;
    }

    public PersonSnapshotDto name(PersonNameDto name) {
        this.name = name;
        return this;
    }

    /**
     * Get phone
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public PersonSnapshotDto phone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Get birthDate
     * @return birthDate
     */
    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public PersonSnapshotDto birthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    /**
     * Get gender
     * @return gender
     */
    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    public PersonSnapshotDto gender(GenderEnum gender) {
        this.gender = gender;
        return this;
    }

    /**
     * Get extra
     * @return extra
     */
    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public PersonSnapshotDto extra(String extra) {
        this.extra = extra;
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
        PersonSnapshotDto personSnapshot = (PersonSnapshotDto) o;
        return Objects.equals(this.getCreatedAt(), personSnapshot.getCreatedAt()) &&
                Objects.equals(this.getCreatedBy(), personSnapshot.getCreatedBy()) &&
                Objects.equals(this.getUpdatedAt(), personSnapshot.getUpdatedAt()) &&
                Objects.equals(this.getUpdatedBy(), personSnapshot.getUpdatedBy()) &&
                Objects.equals(this.getEmail(), personSnapshot.getEmail()) &&
                Objects.equals(this.getId(), personSnapshot.getId()) &&
                Objects.equals(this.getType(), personSnapshot.getType()) &&
                Objects.equals(this.getName(), personSnapshot.getName()) &&
                Objects.equals(this.getPhone(), personSnapshot.getPhone()) &&
                Objects.equals(this.getBirthDate(), personSnapshot.getBirthDate()) &&
                Objects.equals(this.getGender(), personSnapshot.getGender()) &&
                Objects.equals(this.getExtra(), personSnapshot.getExtra());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCreatedAt(), getCreatedBy(), getUpdatedAt(), getUpdatedBy(), getEmail(), getId(), getType(), getName(), getPhone(), getBirthDate(), getGender(), getExtra());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PersonSnapshotDto {\n");
        sb.append("    createdAt: ").append(toIndentedString(getCreatedAt())).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(getCreatedBy())).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(getUpdatedAt())).append("\n");
        sb.append("    updatedBy: ").append(toIndentedString(getUpdatedBy())).append("\n");
        sb.append("    email: ").append(toIndentedString(getEmail())).append("\n");
        sb.append("    id: ").append(toIndentedString(getId())).append("\n");
        sb.append("    type: ").append(toIndentedString(getType())).append("\n");
        sb.append("    name: ").append(toIndentedString(getName())).append("\n");
        sb.append("    phone: ").append(toIndentedString(getPhone())).append("\n");
        sb.append("    birthDate: ").append(toIndentedString(getBirthDate())).append("\n");
        sb.append("    gender: ").append(toIndentedString(getGender())).append("\n");
        sb.append("    extra: ").append(toIndentedString(getExtra())).append("\n");
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
