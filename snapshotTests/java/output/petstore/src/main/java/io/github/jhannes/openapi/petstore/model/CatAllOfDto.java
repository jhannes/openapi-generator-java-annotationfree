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


package io.github.jhannes.openapi.petstore.model;

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

/**
 * CatAllOfDto
 */

public class CatAllOfDto {
  public static final String SERIALIZED_NAME_HUNTS = "hunts";
  @SerializedName(SERIALIZED_NAME_HUNTS)
  private Boolean hunts;

  public static final String SERIALIZED_NAME_AGE = "age";
  @SerializedName(SERIALIZED_NAME_AGE)
  private Integer age;


  public CatAllOfDto hunts(Boolean hunts) {
    
    this.hunts = hunts;
    return this;
  }

   /**
   * Get hunts
   * @return hunts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHunts() {
    return hunts;
  }


  public void setHunts(Boolean hunts) {
    this.hunts = hunts;
  }


  public CatAllOfDto age(Integer age) {
    
    this.age = age;
    return this;
  }

   /**
   * Get age
   * @return age
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAge() {
    return age;
  }


  public void setAge(Integer age) {
    this.age = age;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatAllOfDto catAllOf = (CatAllOfDto) o;
    return Objects.equals(this.hunts, catAllOf.hunts) &&
        Objects.equals(this.age, catAllOf.age);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hunts, age);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatAllOfDto {\n");
    sb.append("    hunts: ").append(toIndentedString(hunts)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
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

