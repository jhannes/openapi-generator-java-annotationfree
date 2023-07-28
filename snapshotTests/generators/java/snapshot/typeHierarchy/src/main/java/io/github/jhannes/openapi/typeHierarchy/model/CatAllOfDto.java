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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.github.jhannes.openapi.typeHierarchy.JSON;

/**
 * CatAllOfDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CatAllOfDto {
  /**
   * Gets or Sets petType
   */
  @JsonAdapter(PetTypeEnum.Adapter.class)
  public enum PetTypeEnum {
    CAT("Cat");

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

  public static final String SERIALIZED_NAME_HUNTS = "hunts";
  @SerializedName(SERIALIZED_NAME_HUNTS)
  private Boolean hunts;

  public static final String SERIALIZED_NAME_AGE = "age";
  @SerializedName(SERIALIZED_NAME_AGE)
  private Integer age;

  public CatAllOfDto() {
  }

  
  public CatAllOfDto(
     Integer age
  ) {
    this();
    this.age = age;
  }

  public CatAllOfDto petType(PetTypeEnum petType) {
    
    this.petType = petType;
    return this;
  }

   /**
   * Get petType
   * @return petType
  **/
  @javax.annotation.Nonnull
  public PetTypeEnum getPetType() {
    return petType;
  }


  public void setPetType(PetTypeEnum petType) {
    this.petType = petType;
  }


  public CatAllOfDto hunts(Boolean hunts) {
    
    this.hunts = hunts;
    return this;
  }

   /**
   * Get hunts
   * @return hunts
  **/
  @javax.annotation.Nullable
  public Boolean getHunts() {
    return hunts;
  }


  public void setHunts(Boolean hunts) {
    this.hunts = hunts;
  }


   /**
   * Get age
   * @return age
  **/
  @javax.annotation.Nullable
  public Integer getAge() {
    return age;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatAllOfDto catAllOf = (CatAllOfDto) o;
    return Objects.equals(this.petType, catAllOf.petType) &&
        Objects.equals(this.hunts, catAllOf.hunts) &&
        Objects.equals(this.age, catAllOf.age);
  }

  @Override
  public int hashCode() {
    return Objects.hash(petType, hunts, age);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatAllOfDto {\n");
    sb.append("    petType: ").append(toIndentedString(petType)).append("\n");
    sb.append("    hunts: ").append(toIndentedString(hunts)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
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
    openapiFields.add("hunts");
    openapiFields.add("age");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pet_type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CatAllOfDto
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CatAllOfDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CatAllOfDto is not found in the empty JSON string", CatAllOfDto.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CatAllOfDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CatAllOfDto` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CatAllOfDto.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("pet_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pet_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pet_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CatAllOfDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CatAllOfDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CatAllOfDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CatAllOfDto.class));

       return (TypeAdapter<T>) new TypeAdapter<CatAllOfDto>() {
           @Override
           public void write(JsonWriter out, CatAllOfDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CatAllOfDto read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CatAllOfDto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CatAllOfDto
  * @throws IOException if the JSON string is invalid with respect to CatAllOfDto
  */
  public static CatAllOfDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CatAllOfDto.class);
  }

 /**
  * Convert an instance of CatAllOfDto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

