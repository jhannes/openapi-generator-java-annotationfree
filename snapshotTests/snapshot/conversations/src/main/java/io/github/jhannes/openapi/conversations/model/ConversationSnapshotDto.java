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
* ConversationSnapshotDto
*/
public class ConversationSnapshotDto extends ChangeTrackedDto {

    private UUID id;

    private ConversationInfoDto info = new ConversationInfoDto();

    private Map<String, ConversationMessageSnapshotDto> messages = new HashMap<>();

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
                "id",
                "info",
                "messages",
                "createdAt",
                "updatedAt",
        };
    }

    public List<String> missingRequiredFields() {
        List<String> result = super.missingRequiredFields();
        if (isMissing(getId())) result.add("id");
        if (isMissing(getInfo())) result.add("info");
        if (isMissing(getMessages())) result.add("messages");
        return result;
    }

    public void readOnlyFieldsWithValue(List<String> result) {
        super.readOnlyFieldsWithValue(result);
        if (info != null) {
            info.readOnlyFieldsWithValue(result);
        }
        if (messages != null) {
            messages.values().forEach(o -> o.readOnlyFieldsWithValue(result));
        }
    }

    public <T extends ConversationSnapshotDto> T copyTo(T target) {
        super.copyTo(target);
        if (this.getId() != null) target.setId(this.getId());
        if (this.getInfo() != null) target.setInfo(this.getInfo());
        if (this.getMessages() != null) target.setMessages(this.getMessages());
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
     * @return id
     */
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public ConversationSnapshotDto id(UUID id) {
        this.id = id;
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

    public ConversationSnapshotDto info(ConversationInfoDto info) {
        this.info = info;
        return this;
    }

    public ConversationSnapshotDto putMessagesItem(String key, ConversationMessageSnapshotDto messagesItem) {
         this.messages.put(key, messagesItem);
         return this;
    }

    /**
     * Get messages
     * @return messages
     */
    public Map<String, ConversationMessageSnapshotDto> getMessages() {
        return messages;
    }

    public void setMessages(Map<String, ConversationMessageSnapshotDto> messages) {
        this.messages = messages;
    }

    public ConversationSnapshotDto messages(Map<String, ConversationMessageSnapshotDto> messages) {
        this.messages = messages;
        return this;
    }

    @Override
    public ConversationSnapshotDto createdAt(OffsetDateTime createdAt) {
        super.createdAt(createdAt);
        return this;
    }

    @Override
    public ConversationSnapshotDto updatedAt(OffsetDateTime updatedAt) {
        super.updatedAt(updatedAt);
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
        ConversationSnapshotDto conversationSnapshot = (ConversationSnapshotDto) o;
        return Objects.equals(this.getId(), conversationSnapshot.getId()) &&
                Objects.equals(this.getInfo(), conversationSnapshot.getInfo()) &&
                Objects.equals(this.getMessages(), conversationSnapshot.getMessages()) &&
                Objects.equals(this.getCreatedAt(), conversationSnapshot.getCreatedAt()) &&
                Objects.equals(this.getUpdatedAt(), conversationSnapshot.getUpdatedAt()) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getInfo(), getMessages(), getCreatedAt(), getUpdatedAt());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ConversationSnapshotDto {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    id: ").append(toIndentedString(getId())).append("\n");
        sb.append("    info: ").append(toIndentedString(getInfo())).append("\n");
        sb.append("    messages: ").append(toIndentedString(getMessages())).append("\n");
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

