/*
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key \"special-key\" to test the authorization filters
 *
 * The version of the OpenAPI document: 1.0.0
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.jhannes.openapi.petstore.model;

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
* PetDto
*/
public class PetDto {

    private Long id = null;

    private CategoryDto category = null;

    private String name;

    private List<String> photoUrls = new ArrayList<>();

    private List<TagDto> tags = null;

    /**
     * pet status in the store
     */
    public enum StatusEnum {

        AVAILABLE("available"),
        PENDING("pending"),
        SOLD("sold");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StatusEnum fromValue(String text) {
            for (StatusEnum b : StatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }

    private StatusEnum status = null;

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
                "name",
                "photoUrls",
        };
    }

    public List<String> missingRequiredFields() {
        List<String> result = new ArrayList<>();
        if (isMissing(getName())) result.add("name");
        if (isMissing(getPhotoUrls())) result.add("photoUrls");
        return result;
    }

    public void readOnlyFieldsWithValue(List<String> result) {
        if (category != null) {
            category.readOnlyFieldsWithValue(result);
        }
        if (tags != null) {
            tags.forEach(o -> o.readOnlyFieldsWithValue(result));
        }
    }

    public <T extends PetDto> T copyTo(T target) {
        if (this.getId() != null) target.setId(this.getId());
        if (this.getCategory() != null) target.setCategory(this.getCategory());
        if (this.getName() != null) target.setName(this.getName());
        if (this.getPhotoUrls() != null) target.setPhotoUrls(this.getPhotoUrls());
        if (this.getTags() != null) target.setTags(this.getTags());
        if (this.getStatus() != null) target.setStatus(this.getStatus());
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
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PetDto id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get category
     * @return category
     */
    public CategoryDto getCategory() {
        return category;
    }

    public void setCategory(CategoryDto category) {
        this.category = category;
    }

    public PetDto category(CategoryDto category) {
        this.category = category;
        return this;
    }

    /**
     * Get name
     * example: doggie
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PetDto name(String name) {
        this.name = name;
        return this;
    }

    public <T> PetDto photoUrls(Collection<T> items, Function<T, String> mapper) {
        return photoUrls(items.stream().map(mapper).collect(Collectors.toList()));
    }

    public <T> List<T> getPhotoUrls(Function<String, T> mapper) {
        return getPhotoUrls().stream().map(mapper).collect(Collectors.toList());
    }

    public PetDto addPhotoUrlsItem(String photoUrlsItem) {
        this.photoUrls.add(photoUrlsItem);
        return this;
    }

    /**
     * Get photoUrls
     * @return photoUrls
     */
    public List<String> getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(List<String> photoUrls) {
        this.photoUrls = photoUrls;
    }

    public PetDto photoUrls(List<String> photoUrls) {
        this.photoUrls = photoUrls;
        return this;
    }

    public <T> PetDto tags(Collection<T> items, Function<T, TagDto> mapper) {
        return tags(items.stream().map(mapper).collect(Collectors.toList()));
    }

    public <T> List<T> getTags(Function<TagDto, T> mapper) {
        return getTags().stream().map(mapper).collect(Collectors.toList());
    }

    public PetDto addTagsItem(TagDto tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * Get tags
     * @return tags
     */
    public List<TagDto> getTags() {
        return tags;
    }

    public void setTags(List<TagDto> tags) {
        this.tags = tags;
    }

    public PetDto tags(List<TagDto> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * pet status in the store
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public PetDto status(StatusEnum status) {
        this.status = status;
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
        PetDto pet = (PetDto) o;
        return Objects.equals(this.getId(), pet.getId()) &&
                Objects.equals(this.getCategory(), pet.getCategory()) &&
                Objects.equals(this.getName(), pet.getName()) &&
                Objects.equals(this.getPhotoUrls(), pet.getPhotoUrls()) &&
                Objects.equals(this.getTags(), pet.getTags()) &&
                Objects.equals(this.getStatus(), pet.getStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCategory(), getName(), getPhotoUrls(), getTags(), getStatus());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PetDto {\n");
        sb.append("    id: ").append(toIndentedString(getId())).append("\n");
        sb.append("    category: ").append(toIndentedString(getCategory())).append("\n");
        sb.append("    name: ").append(toIndentedString(getName())).append("\n");
        sb.append("    photoUrls: ").append(toIndentedString(getPhotoUrls())).append("\n");
        sb.append("    tags: ").append(toIndentedString(getTags())).append("\n");
        sb.append("    status: ").append(toIndentedString(getStatus())).append("\n");
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

