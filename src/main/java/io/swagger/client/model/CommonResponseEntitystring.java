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
 * CommonResponseEntitystring
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-05-13T21:08:51.033009+05:30[Asia/Kolkata]")
public class CommonResponseEntitystring {
  @SerializedName("serviceName")
  private String serviceName = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("t")
  private String t = null;

  @SerializedName("timeSpendsInSeconds")
  private Long timeSpendsInSeconds = null;

  public CommonResponseEntitystring serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

   /**
   * Get serviceName
   * @return serviceName
  **/
  @Schema(description = "")
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public CommonResponseEntitystring status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public CommonResponseEntitystring t(String t) {
    this.t = t;
    return this;
  }

   /**
   * Get t
   * @return t
  **/
  @Schema(description = "")
  public String getT() {
    return t;
  }

  public void setT(String t) {
    this.t = t;
  }

  public CommonResponseEntitystring timeSpendsInSeconds(Long timeSpendsInSeconds) {
    this.timeSpendsInSeconds = timeSpendsInSeconds;
    return this;
  }

   /**
   * Get timeSpendsInSeconds
   * @return timeSpendsInSeconds
  **/
  @Schema(description = "")
  public Long getTimeSpendsInSeconds() {
    return timeSpendsInSeconds;
  }

  public void setTimeSpendsInSeconds(Long timeSpendsInSeconds) {
    this.timeSpendsInSeconds = timeSpendsInSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonResponseEntitystring commonResponseEntitystring = (CommonResponseEntitystring) o;
    return Objects.equals(this.serviceName, commonResponseEntitystring.serviceName) &&
        Objects.equals(this.status, commonResponseEntitystring.status) &&
        Objects.equals(this.t, commonResponseEntitystring.t) &&
        Objects.equals(this.timeSpendsInSeconds, commonResponseEntitystring.timeSpendsInSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceName, status, t, timeSpendsInSeconds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonResponseEntitystring {\n");
    
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    t: ").append(toIndentedString(t)).append("\n");
    sb.append("    timeSpendsInSeconds: ").append(toIndentedString(timeSpendsInSeconds)).append("\n");
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
