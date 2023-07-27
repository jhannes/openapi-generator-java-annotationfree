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
* SnapshotSetDto
*/
public class SnapshotSetDto implements MessageFromServerDto {

    private List<ConversationSnapshotDto> conversations = new ArrayList<>();

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
                "conversations",
        };
    }

    public List<String> missingRequiredFields() {
        List<String> result = new ArrayList<>();
        if (isMissing(getConversations())) result.add("conversations");
        return result;
    }

    public void readOnlyFieldsWithValue(List<String> result) {
        if (conversations != null) {
            conversations.forEach(o -> o.readOnlyFieldsWithValue(result));
        }
    }

    public <T extends SnapshotSetDto> T copyTo(T target) {
        if (this.getConversations() != null) target.setConversations(this.getConversations());
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


    public <T> SnapshotSetDto conversations(Collection<T> items, Function<T, ConversationSnapshotDto> mapper) {
        return conversations(items.stream().map(mapper).collect(Collectors.toList()));
    }

    public <T> List<T> getConversations(Function<ConversationSnapshotDto, T> mapper) {
        return getConversations().stream().map(mapper).collect(Collectors.toList());
    }

    public SnapshotSetDto addConversationsItem(ConversationSnapshotDto conversationsItem) {
        this.conversations.add(conversationsItem);
        return this;
    }

    /**
     * Get conversations
     * @return conversations
     */
    public List<ConversationSnapshotDto> getConversations() {
        return conversations;
    }

    public void setConversations(List<ConversationSnapshotDto> conversations) {
        this.conversations = conversations;
    }

    public SnapshotSetDto conversations(List<ConversationSnapshotDto> conversations) {
        this.conversations = conversations;
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
        SnapshotSetDto snapshotSet = (SnapshotSetDto) o;
        return Objects.equals(this.getConversations(), snapshotSet.getConversations());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getConversations());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SnapshotSetDto {\n");
        sb.append("    conversations: ").append(toIndentedString(getConversations())).append("\n");
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
