/*
 * FakeRESTApi.Web V1
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.jhannes.openapi.fakerestapi.model;

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
* BookDto
*/
public class BookDto {

    private Integer id = null;

    private String title = null;

    private String description = null;

    private Integer pageCount = null;

    private String excerpt = null;

    private OffsetDateTime publishDate = null;

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
        };
    }

    public List<String> missingRequiredFields() {
        List<String> result = new ArrayList<>();
        return result;
    }

    public void readOnlyFieldsWithValue(List<String> result) {
    }

    public <T extends BookDto> T copyTo(T target) {
        if (this.getId() != null) target.setId(this.getId());
        if (this.getTitle() != null) target.setTitle(this.getTitle());
        if (this.getDescription() != null) target.setDescription(this.getDescription());
        if (this.getPageCount() != null) target.setPageCount(this.getPageCount());
        if (this.getExcerpt() != null) target.setExcerpt(this.getExcerpt());
        if (this.getPublishDate() != null) target.setPublishDate(this.getPublishDate());
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
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BookDto id(Integer id) {
        this.id = id;
        return this;
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

    public BookDto title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BookDto description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get pageCount
     * @return pageCount
     */
    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public BookDto pageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }

    /**
     * Get excerpt
     * @return excerpt
     */
    public String getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }

    public BookDto excerpt(String excerpt) {
        this.excerpt = excerpt;
        return this;
    }

    /**
     * Get publishDate
     * @return publishDate
     */
    public OffsetDateTime getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(OffsetDateTime publishDate) {
        this.publishDate = publishDate;
    }

    public BookDto publishDate(OffsetDateTime publishDate) {
        this.publishDate = publishDate;
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
        BookDto book = (BookDto) o;
        return Objects.equals(this.getId(), book.getId()) &&
                Objects.equals(this.getTitle(), book.getTitle()) &&
                Objects.equals(this.getDescription(), book.getDescription()) &&
                Objects.equals(this.getPageCount(), book.getPageCount()) &&
                Objects.equals(this.getExcerpt(), book.getExcerpt()) &&
                Objects.equals(this.getPublishDate(), book.getPublishDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), getDescription(), getPageCount(), getExcerpt(), getPublishDate());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BookDto {\n");
        sb.append("    id: ").append(toIndentedString(getId())).append("\n");
        sb.append("    title: ").append(toIndentedString(getTitle())).append("\n");
        sb.append("    description: ").append(toIndentedString(getDescription())).append("\n");
        sb.append("    pageCount: ").append(toIndentedString(getPageCount())).append("\n");
        sb.append("    excerpt: ").append(toIndentedString(getExcerpt())).append("\n");
        sb.append("    publishDate: ").append(toIndentedString(getPublishDate())).append("\n");
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

