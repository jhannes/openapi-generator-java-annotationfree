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
* ConversationMessageSnapshotDto
*/
public class ConversationMessageSnapshotDto implements ChangeTrackedInterface, ConversationMessageInterface {

    private OffsetDateTime createdAt;

    private OffsetDateTime updatedAt;

    private String text;

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
                "createdAt",
                "updatedAt",
                "text",
        };
    }

    public List<String> missingRequiredFields() {
        List<String> result = new ArrayList<>();
        if (isMissing(getCreatedAt())) result.add("createdAt");
        if (isMissing(getUpdatedAt())) result.add("updatedAt");
        if (isMissing(getText())) result.add("text");
        return result;
    }

    public void readOnlyFieldsWithValue(List<String> result) {
    }

    public <T extends ConversationMessageSnapshotDto> T copyTo(T target) {
        if (this.getCreatedAt() != null) target.setCreatedAt(this.getCreatedAt());
        if (this.getUpdatedAt() != null) target.setUpdatedAt(this.getUpdatedAt());
        if (this.getText() != null) target.setText(this.getText());
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

    public ConversationMessageSnapshotDto createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
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

    public ConversationMessageSnapshotDto updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get text
     * @return text
     */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ConversationMessageSnapshotDto text(String text) {
        this.text = text;
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
        ConversationMessageSnapshotDto conversationMessageSnapshot = (ConversationMessageSnapshotDto) o;
        return Objects.equals(this.getCreatedAt(), conversationMessageSnapshot.getCreatedAt()) &&
                Objects.equals(this.getUpdatedAt(), conversationMessageSnapshot.getUpdatedAt()) &&
                Objects.equals(this.getText(), conversationMessageSnapshot.getText());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCreatedAt(), getUpdatedAt(), getText());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ConversationMessageSnapshotDto {\n");
        sb.append("    createdAt: ").append(toIndentedString(getCreatedAt())).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(getUpdatedAt())).append("\n");
        sb.append("    text: ").append(toIndentedString(getText())).append("\n");
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

