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
* CaseWorkerDto
*/
public class CaseWorkerDto {

    private UUID id = null;

    private String fullName;

    private String email;

    private UserRoleDto role;

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
                "fullName",
                "email",
                "role",
        };
    }

    public List<String> missingRequiredFields() {
        List<String> result = new ArrayList<>();
        if (isMissing(getFullName())) result.add("fullName");
        if (isMissing(getEmail())) result.add("email");
        if (isMissing(getRole())) result.add("role");
        return result;
    }

    public void readOnlyFieldsWithValue(List<String> result) {
        if (!isMissing(getId())) {
            result.add("CaseWorkerDto.id");
        }
    }

    public <T extends CaseWorkerDto> T copyTo(T target) {
        if (this.getId() != null) target.setId(this.getId());
        if (this.getFullName() != null) target.setFullName(this.getFullName());
        if (this.getEmail() != null) target.setEmail(this.getEmail());
        if (this.getRole() != null) target.setRole(this.getRole());
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

    public CaseWorkerDto id(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Get fullName
     * example: Florence Nightingale
     * @return fullName
     */
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public CaseWorkerDto fullName(String fullName) {
        this.fullName = fullName;
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

    public CaseWorkerDto email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get role
     * @return role
     */
    public UserRoleDto getRole() {
        return role;
    }

    public void setRole(UserRoleDto role) {
        this.role = role;
    }

    public CaseWorkerDto role(UserRoleDto role) {
        this.role = role;
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
        CaseWorkerDto caseWorker = (CaseWorkerDto) o;
        return Objects.equals(this.getId(), caseWorker.getId()) &&
                Objects.equals(this.getFullName(), caseWorker.getFullName()) &&
                Objects.equals(this.getEmail(), caseWorker.getEmail()) &&
                Objects.equals(this.getRole(), caseWorker.getRole());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFullName(), getEmail(), getRole());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CaseWorkerDto {\n");
        sb.append("    id: ").append(toIndentedString(getId())).append("\n");
        sb.append("    fullName: ").append(toIndentedString(getFullName())).append("\n");
        sb.append("    email: ").append(toIndentedString(getEmail())).append("\n");
        sb.append("    role: ").append(toIndentedString(getRole())).append("\n");
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

