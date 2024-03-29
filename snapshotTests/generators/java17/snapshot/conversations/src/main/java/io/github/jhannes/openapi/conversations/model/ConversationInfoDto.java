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
* ConversationInfoDto
*/
public class ConversationInfoDto {

    private String title;

    private String summary = null;

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
                "title",
        };
    }

    public List<String> missingRequiredFields() {
        List<String> result = new ArrayList<>();
        if (isMissing(getTitle())) result.add("title");
        return result;
    }

    public void readOnlyFieldsWithValue(List<String> result) {
    }

    public <T extends ConversationInfoDto> T copyTo(T target) {
        if (this.getTitle() != null) target.setTitle(this.getTitle());
        if (this.getSummary() != null) target.setSummary(this.getSummary());
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
     * Get title
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ConversationInfoDto title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get summary
     * @return summary
     */
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public ConversationInfoDto summary(String summary) {
        this.summary = summary;
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
        ConversationInfoDto conversationInfo = (ConversationInfoDto) o;
        return Objects.equals(this.getTitle(), conversationInfo.getTitle()) &&
                Objects.equals(this.getSummary(), conversationInfo.getSummary());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getSummary());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ConversationInfoDto {\n");
        sb.append("    title: ").append(toIndentedString(getTitle())).append("\n");
        sb.append("    summary: ").append(toIndentedString(getSummary())).append("\n");
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

