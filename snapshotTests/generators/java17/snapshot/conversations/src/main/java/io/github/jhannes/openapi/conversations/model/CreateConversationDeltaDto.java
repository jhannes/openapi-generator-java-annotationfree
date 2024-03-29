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
* CreateConversationDeltaDto
*/
public class CreateConversationDeltaDto implements DeltaDto {

    private String delta = "CreateConversationDelta";

    private UUID conversationId;

    private ConversationInfoDto info = new ConversationInfoDto();

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
                "delta",
                "conversationId",
                "info",
        };
    }

    public List<String> missingRequiredFields() {
        List<String> result = new ArrayList<>();
        if (isMissing(getDelta())) result.add("delta");
        if (isMissing(getConversationId())) result.add("conversationId");
        if (isMissing(getInfo())) result.add("info");
        return result;
    }

    public void readOnlyFieldsWithValue(List<String> result) {
        if (info != null) {
            info.readOnlyFieldsWithValue(result);
        }
    }

    public <T extends CreateConversationDeltaDto> T copyTo(T target) {
        if (this.getDelta() != null) target.setDelta(this.getDelta());
        if (this.getConversationId() != null) target.setConversationId(this.getConversationId());
        if (this.getInfo() != null) target.setInfo(this.getInfo());
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
     * Get delta
     * @return delta
     */
    public String getDelta() {
        return delta;
    }

    public void setDelta(String delta) {
        this.delta = delta;
    }

    public CreateConversationDeltaDto delta(String delta) {
        this.delta = delta;
        return this;
    }

    /**
     * Get conversationId
     * @return conversationId
     */
    public UUID getConversationId() {
        return conversationId;
    }

    public void setConversationId(UUID conversationId) {
        this.conversationId = conversationId;
    }

    public CreateConversationDeltaDto conversationId(UUID conversationId) {
        this.conversationId = conversationId;
        return this;
    }

    /**
     * Get info
     * @return info
     */
    public ConversationInfoDto getInfo() {
        return info;
    }

    public void setInfo(ConversationInfoDto info) {
        this.info = info;
    }

    public CreateConversationDeltaDto info(ConversationInfoDto info) {
        this.info = info;
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
        CreateConversationDeltaDto createConversationDelta = (CreateConversationDeltaDto) o;
        return Objects.equals(this.getDelta(), createConversationDelta.getDelta()) &&
                Objects.equals(this.getConversationId(), createConversationDelta.getConversationId()) &&
                Objects.equals(this.getInfo(), createConversationDelta.getInfo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDelta(), getConversationId(), getInfo());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CreateConversationDeltaDto {\n");
        sb.append("    delta: ").append(toIndentedString(getDelta())).append("\n");
        sb.append("    conversationId: ").append(toIndentedString(getConversationId())).append("\n");
        sb.append("    info: ").append(toIndentedString(getInfo())).append("\n");
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

