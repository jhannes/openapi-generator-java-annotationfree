/*
 * Sample API
 * Optional multiline or single-line description in [CommonMark](http://commonmark.org/help/) or HTML.
 *
 * The version of the OpenAPI document: 0.1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.jhannes.openapi.typeHierarchy.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import io.github.jhannes.openapi.typeHierarchy.ApiClient;
/**
 * GoldfishDto
 */
@JsonPropertyOrder({
  GoldfishDto.JSON_PROPERTY_PET_TYPE,
  GoldfishDto.JSON_PROPERTY_NAME,
  GoldfishDto.JSON_PROPERTY_SPECIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class GoldfishDto {
  /**
   * Gets or Sets petType
   */
  public enum PetTypeEnum {
    GOLDFISH(String.valueOf("Goldfish"));

    private String value;

    PetTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PetTypeEnum fromValue(String value) {
      for (PetTypeEnum b : PetTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PET_TYPE = "pet_type";
  @javax.annotation.Nonnull
  private PetTypeEnum petType;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_SPECIES = "species";
  @javax.annotation.Nullable
  private String species;

  public GoldfishDto() { 
  }

  public GoldfishDto petType(@javax.annotation.Nonnull PetTypeEnum petType) {
    this.petType = petType;
    return this;
  }

  /**
   * Get petType
   * @return petType
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PET_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public PetTypeEnum getPetType() {
    return petType;
  }


  @JsonProperty(JSON_PROPERTY_PET_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPetType(@javax.annotation.Nonnull PetTypeEnum petType) {
    this.petType = petType;
  }


  public GoldfishDto name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public GoldfishDto species(@javax.annotation.Nullable String species) {
    this.species = species;
    return this;
  }

  /**
   * Get species
   * @return species
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPECIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSpecies() {
    return species;
  }


  @JsonProperty(JSON_PROPERTY_SPECIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpecies(@javax.annotation.Nullable String species) {
    this.species = species;
  }


  /**
   * Return true if this Goldfish object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoldfishDto goldfish = (GoldfishDto) o;
    return Objects.equals(this.petType, goldfish.petType) &&
        Objects.equals(this.name, goldfish.name) &&
        Objects.equals(this.species, goldfish.species);
  }

  @Override
  public int hashCode() {
    return Objects.hash(petType, name, species);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoldfishDto {\n");
    sb.append("    petType: ").append(toIndentedString(petType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    species: ").append(toIndentedString(species)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `pet_type` to the URL query string
    if (getPetType() != null) {
      joiner.add(String.format("%spet_type%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPetType()))));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `species` to the URL query string
    if (getSpecies() != null) {
      joiner.add(String.format("%sspecies%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSpecies()))));
    }

    return joiner.toString();
  }
}

