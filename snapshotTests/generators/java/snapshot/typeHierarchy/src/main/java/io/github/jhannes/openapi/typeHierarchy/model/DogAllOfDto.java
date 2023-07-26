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
 * DogAllOfDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DogAllOfDto {
  /**
   * Gets or Sets petType
   */
  @JsonAdapter(PetTypeEnum.Adapter.class)
  public enum PetTypeEnum {
    DOG("Dog");

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

  public static final String SERIALIZED_NAME_BARK = "bark";
  @SerializedName(SERIALIZED_NAME_BARK)
  private Boolean bark;

  /**
   * Gets or Sets breed
   */
  @JsonAdapter(BreedEnum.Adapter.class)
  public enum BreedEnum {
    DINGO("Dingo"),
    
    HUSKY("Husky"),
    
    RETRIEVER("Retriever"),
    
    SHEPHERD("Shepherd");

    private String value;

    BreedEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BreedEnum fromValue(String value) {
      for (BreedEnum b : BreedEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BreedEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BreedEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BreedEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BreedEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BREED = "breed";
  @SerializedName(SERIALIZED_NAME_BREED)
  private BreedEnum breed;

  public DogAllOfDto() {
  }

  public DogAllOfDto petType(PetTypeEnum petType) {
    
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


  public DogAllOfDto bark(Boolean bark) {
    
    this.bark = bark;
    return this;
  }

   /**
   * Get bark
   * @return bark
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getBark() {
    return bark;
  }


  public void setBark(Boolean bark) {
    this.bark = bark;
  }


  public DogAllOfDto breed(BreedEnum breed) {
    
    this.breed = breed;
    return this;
  }

   /**
   * Get breed
   * @return breed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BreedEnum getBreed() {
    return breed;
  }


  public void setBreed(BreedEnum breed) {
    this.breed = breed;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DogAllOfDto dogAllOf = (DogAllOfDto) o;
    return Objects.equals(this.petType, dogAllOf.petType) &&
        Objects.equals(this.bark, dogAllOf.bark) &&
        Objects.equals(this.breed, dogAllOf.breed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(petType, bark, breed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DogAllOfDto {\n");
    sb.append("    petType: ").append(toIndentedString(petType)).append("\n");
    sb.append("    bark: ").append(toIndentedString(bark)).append("\n");
    sb.append("    breed: ").append(toIndentedString(breed)).append("\n");
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
    openapiFields.add("bark");
    openapiFields.add("breed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pet_type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DogAllOfDto
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DogAllOfDto.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DogAllOfDto is not found in the empty JSON string", DogAllOfDto.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DogAllOfDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DogAllOfDto` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DogAllOfDto.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("pet_type") != null && !jsonObj.get("pet_type").isJsonNull()) && !jsonObj.get("pet_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pet_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pet_type").toString()));
      }
      if ((jsonObj.get("breed") != null && !jsonObj.get("breed").isJsonNull()) && !jsonObj.get("breed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `breed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("breed").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DogAllOfDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DogAllOfDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DogAllOfDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DogAllOfDto.class));

       return (TypeAdapter<T>) new TypeAdapter<DogAllOfDto>() {
           @Override
           public void write(JsonWriter out, DogAllOfDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DogAllOfDto read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DogAllOfDto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DogAllOfDto
  * @throws IOException if the JSON string is invalid with respect to DogAllOfDto
  */
  public static DogAllOfDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DogAllOfDto.class);
  }

 /**
  * Convert an instance of DogAllOfDto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
