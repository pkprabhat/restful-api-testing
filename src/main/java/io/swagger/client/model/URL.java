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
import io.swagger.client.model.URLStreamHandler;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * URL
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-05-13T21:08:51.033009+05:30[Asia/Kolkata]")
public class URL {
  @SerializedName("authority")
  private String authority = null;

  @SerializedName("content")
  private Object content = null;

  @SerializedName("defaultPort")
  private Integer defaultPort = null;

  @SerializedName("deserializedFields")
  private URLStreamHandler deserializedFields = null;

  @SerializedName("file")
  private String file = null;

  @SerializedName("host")
  private String host = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("port")
  private Integer port = null;

  @SerializedName("protocol")
  private String protocol = null;

  @SerializedName("query")
  private String query = null;

  @SerializedName("ref")
  private String ref = null;

  @SerializedName("serializedHashCode")
  private Integer serializedHashCode = null;

  @SerializedName("userInfo")
  private String userInfo = null;

  public URL authority(String authority) {
    this.authority = authority;
    return this;
  }

   /**
   * Get authority
   * @return authority
  **/
  @Schema(description = "")
  public String getAuthority() {
    return authority;
  }

  public void setAuthority(String authority) {
    this.authority = authority;
  }

  public URL content(Object content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @Schema(description = "")
  public Object getContent() {
    return content;
  }

  public void setContent(Object content) {
    this.content = content;
  }

  public URL defaultPort(Integer defaultPort) {
    this.defaultPort = defaultPort;
    return this;
  }

   /**
   * Get defaultPort
   * @return defaultPort
  **/
  @Schema(description = "")
  public Integer getDefaultPort() {
    return defaultPort;
  }

  public void setDefaultPort(Integer defaultPort) {
    this.defaultPort = defaultPort;
  }

  public URL deserializedFields(URLStreamHandler deserializedFields) {
    this.deserializedFields = deserializedFields;
    return this;
  }

   /**
   * Get deserializedFields
   * @return deserializedFields
  **/
  @Schema(description = "")
  public URLStreamHandler getDeserializedFields() {
    return deserializedFields;
  }

  public void setDeserializedFields(URLStreamHandler deserializedFields) {
    this.deserializedFields = deserializedFields;
  }

  public URL file(String file) {
    this.file = file;
    return this;
  }

   /**
   * Get file
   * @return file
  **/
  @Schema(description = "")
  public String getFile() {
    return file;
  }

  public void setFile(String file) {
    this.file = file;
  }

  public URL host(String host) {
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @Schema(description = "")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public URL path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @Schema(description = "")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public URL port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @Schema(description = "")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public URL protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @Schema(description = "")
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  public URL query(String query) {
    this.query = query;
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  @Schema(description = "")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public URL ref(String ref) {
    this.ref = ref;
    return this;
  }

   /**
   * Get ref
   * @return ref
  **/
  @Schema(description = "")
  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }

  public URL serializedHashCode(Integer serializedHashCode) {
    this.serializedHashCode = serializedHashCode;
    return this;
  }

   /**
   * Get serializedHashCode
   * @return serializedHashCode
  **/
  @Schema(description = "")
  public Integer getSerializedHashCode() {
    return serializedHashCode;
  }

  public void setSerializedHashCode(Integer serializedHashCode) {
    this.serializedHashCode = serializedHashCode;
  }

  public URL userInfo(String userInfo) {
    this.userInfo = userInfo;
    return this;
  }

   /**
   * Get userInfo
   * @return userInfo
  **/
  @Schema(description = "")
  public String getUserInfo() {
    return userInfo;
  }

  public void setUserInfo(String userInfo) {
    this.userInfo = userInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    URL URL = (URL) o;
    return Objects.equals(this.authority, URL.authority) &&
        Objects.equals(this.content, URL.content) &&
        Objects.equals(this.defaultPort, URL.defaultPort) &&
        Objects.equals(this.deserializedFields, URL.deserializedFields) &&
        Objects.equals(this.file, URL.file) &&
        Objects.equals(this.host, URL.host) &&
        Objects.equals(this.path, URL.path) &&
        Objects.equals(this.port, URL.port) &&
        Objects.equals(this.protocol, URL.protocol) &&
        Objects.equals(this.query, URL.query) &&
        Objects.equals(this.ref, URL.ref) &&
        Objects.equals(this.serializedHashCode, URL.serializedHashCode) &&
        Objects.equals(this.userInfo, URL.userInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authority, content, defaultPort, deserializedFields, file, host, path, port, protocol, query, ref, serializedHashCode, userInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class URL {\n");
    
    sb.append("    authority: ").append(toIndentedString(authority)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    defaultPort: ").append(toIndentedString(defaultPort)).append("\n");
    sb.append("    deserializedFields: ").append(toIndentedString(deserializedFields)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    serializedHashCode: ").append(toIndentedString(serializedHashCode)).append("\n");
    sb.append("    userInfo: ").append(toIndentedString(userInfo)).append("\n");
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
