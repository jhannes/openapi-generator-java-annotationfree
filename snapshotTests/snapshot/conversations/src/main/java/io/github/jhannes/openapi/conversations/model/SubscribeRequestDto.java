/*
 * Conversations
 * Conversations for real time and offline peer-to-peer web chat
 *
 * The version of the OpenAPI document: 1.0.0
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.jhannes.openapi.conversations.model;

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
* SubscribeRequestDto
*/
public class SubscribeRequestDto implements RequestToServerDto {

    private String request = "SubscribeRequest";

    private UUID clientId;

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
                "request",
                "clientId",
        };
    }

    public List<String> missingRequiredFields() {
        List<String> result = new ArrayList<>();
        if (isMissing(getRequest())) result.add("request");
        if (isMissing(getClientId())) result.add("clientId");
        return result;
    }

    public void readOnlyFieldsWithValue(List<String> result) {
    }

    public <T extends SubscribeRequestDto> T copyTo(T target) {
        if (this.getRequest() != null) target.setRequest(this.getRequest());
        if (this.getClientId() != null) target.setClientId(this.getClientId());
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
     * Get request
     * @return request
     */
    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public SubscribeRequestDto request(String request) {
        this.request = request;
        return this;
    }

    /**
     * Get clientId
     * @return clientId
     */
    public UUID getClientId() {
        return clientId;
    }

    public void setClientId(UUID clientId) {
        this.clientId = clientId;
    }

    public SubscribeRequestDto clientId(UUID clientId) {
        this.clientId = clientId;
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
        SubscribeRequestDto subscribeRequest = (SubscribeRequestDto) o;
        return Objects.equals(this.getRequest(), subscribeRequest.getRequest()) &&
                Objects.equals(this.getClientId(), subscribeRequest.getClientId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRequest(), getClientId());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SubscribeRequestDto {\n");
        sb.append("    request: ").append(toIndentedString(getRequest())).append("\n");
        sb.append("    clientId: ").append(toIndentedString(getClientId())).append("\n");
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

