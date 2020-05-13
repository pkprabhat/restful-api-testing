/*
 * REST Api Documentation
 * REST Api Documentation
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * CommonPk
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-05-13T21:08:51.033009+05:30[Asia/Kolkata]")
public class CommonPk {
  @SerializedName("mtSkey")
  private Long mtSkey = null;

  @SerializedName("mtType")
  private String mtType = null;

  public CommonPk mtSkey(Long mtSkey) {
    this.mtSkey = mtSkey;
    return this;
  }

   /**
   * Get mtSkey
   * @return mtSkey
  **/
  @Schema(description = "")
  public Long getMtSkey() {
    return mtSkey;
  }

  public void setMtSkey(Long mtSkey) {
    this.mtSkey = mtSkey;
  }

  public CommonPk mtType(String mtType) {
    this.mtType = mtType;
    return this;
  }

   /**
   * Get mtType
   * @return mtType
  **/
  @Schema(description = "")
  public String getMtType() {
    return mtType;
  }

  public void setMtType(String mtType) {
    this.mtType = mtType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonPk commonPk = (CommonPk) o;
    return Objects.equals(this.mtSkey, commonPk.mtSkey) &&
        Objects.equals(this.mtType, commonPk.mtType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mtSkey, mtType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonPk {\n");
    
    sb.append("    mtSkey: ").append(toIndentedString(mtSkey)).append("\n");
    sb.append("    mtType: ").append(toIndentedString(mtType)).append("\n");
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
