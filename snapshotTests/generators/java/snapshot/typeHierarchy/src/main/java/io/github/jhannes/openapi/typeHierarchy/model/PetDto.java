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
import io.github.jhannes.openapi.typeHierarchy.model.AddressDto;
import io.github.jhannes.openapi.typeHierarchy.model.CatDto;
import io.github.jhannes.openapi.typeHierarchy.model.DogDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import io.github.jhannes.openapi.typeHierarchy.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PetDto extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(PetDto.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!PetDto.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'PetDto' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CatDto> adapterCatDto = gson.getDelegateAdapter(this, TypeToken.get(CatDto.class));
            final TypeAdapter<DogDto> adapterDogDto = gson.getDelegateAdapter(this, TypeToken.get(DogDto.class));

            return (TypeAdapter<T>) new TypeAdapter<PetDto>() {
                @Override
                public void write(JsonWriter out, PetDto value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `CatDto`
                    if (value.getActualInstance() instanceof CatDto) {
                        JsonObject obj = adapterCatDto.toJsonTree((CatDto)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `DogDto`
                    if (value.getActualInstance() instanceof DogDto) {
                        JsonObject obj = adapterDogDto.toJsonTree((DogDto)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: CatDto, DogDto");
                }

                @Override
                public PetDto read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize CatDto
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CatDto.validateJsonObject(jsonObject);
                        actualAdapter = adapterCatDto;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CatDto'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CatDto failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CatDto'", e);
                    }

                    // deserialize DogDto
                    try {
                        // validate the JSON object to see if any exception is thrown
                        DogDto.validateJsonObject(jsonObject);
                        actualAdapter = adapterDogDto;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'DogDto'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for DogDto failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'DogDto'", e);
                    }

                    if (match == 1) {
                        PetDto ret = new PetDto();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for PetDto: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public PetDto() {
        super("oneOf", Boolean.FALSE);
    }

    public PetDto(CatDto o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PetDto(DogDto o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CatDto", new GenericType<CatDto>() {
        });
        schemas.put("DogDto", new GenericType<DogDto>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return PetDto.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CatDto, DogDto
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CatDto) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof DogDto) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CatDto, DogDto");
    }

    /**
     * Get the actual instance, which can be the following:
     * CatDto, DogDto
     *
     * @return The actual instance (CatDto, DogDto)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CatDto`. If the actual instance is not `CatDto`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CatDto`
     * @throws ClassCastException if the instance is not `CatDto`
     */
    public CatDto getCatDto() throws ClassCastException {
        return (CatDto)super.getActualInstance();
    }

    /**
     * Get the actual instance of `DogDto`. If the actual instance is not `DogDto`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `DogDto`
     * @throws ClassCastException if the instance is not `DogDto`
     */
    public DogDto getDogDto() throws ClassCastException {
        return (DogDto)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PetDto
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with CatDto
    try {
      CatDto.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CatDto failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with DogDto
    try {
      DogDto.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for DogDto failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for PetDto with oneOf schemas: CatDto, DogDto. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of PetDto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PetDto
  * @throws IOException if the JSON string is invalid with respect to PetDto
  */
  public static PetDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PetDto.class);
  }

 /**
  * Convert an instance of PetDto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

