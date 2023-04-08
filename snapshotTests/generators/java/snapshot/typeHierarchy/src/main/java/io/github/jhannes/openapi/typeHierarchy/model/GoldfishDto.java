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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.github.jhannes.openapi.typeHierarchy.JSON;

/**
 * GoldfishDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GoldfishDto {
  /**
   * Gets or Sets petType
   */
  @JsonAdapter(PetTypeEnum.Adapter.class)
  public enum PetTypeEnum {
    GOLDFISH("Goldfish");

    private String value;

    PetTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PetTypeEnum fromValue(String value) {
      for (PetTypeEnum b : PetTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PetTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PetTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PetTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PetTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PET_TYPE = "pet_type";
  @SerializedName(SERIALIZED_NAME_PET_TYPE)
  private PetTypeEnum petType;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SPECIES = "species";
  @SerializedName(SERIALIZED_NAME_SPECIES)
  private String species;

  public GoldfishDto() {
  }

  public GoldfishDto petType(PetTypeEnum petType) {
    
    this.petType = petType;
    return this;
  }

   /**
   * Get petType
   * @return petType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PetTypeEnum getPetType() {
    return petType;
  }


  public void setPetType(PetTypeEnum petType) {
    this.petType = petType;
  }


  public GoldfishDto name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GoldfishDto species(String species) {
    
    this.species = species;
    return this;
  }

   /**
   * Get species
   * @return species
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSpecies() {
    return species;
  }


  public void setSpecies(String species) {
    this.species = species;
  }



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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("pet_type");
    openapiFields.add("name");
    openapiFields.add("species");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pet_type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GoldfishDto
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GoldfishDto.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoldfishDto is not found in the empty JSON string", GoldfishDto.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GoldfishDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoldfishDto` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GoldfishDto.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("pet_type") != null && !jsonObj.get("pet_type").isJsonNull()) && !jsonObj.get("pet_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pet_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pet_type").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("species") != null && !jsonObj.get("species").isJsonNull()) && !jsonObj.get("species").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `species` to be a primitive type in the JSON string but got `%s`", jsonObj.get("species").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoldfishDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoldfishDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoldfishDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoldfishDto.class));

       return (TypeAdapter<T>) new TypeAdapter<GoldfishDto>() {
           @Override
           public void write(JsonWriter out, GoldfishDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoldfishDto read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GoldfishDto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GoldfishDto
  * @throws IOException if the JSON string is invalid with respect to GoldfishDto
  */
  public static GoldfishDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoldfishDto.class);
  }

 /**
  * Convert an instance of GoldfishDto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

