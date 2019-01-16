/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.12.2
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.kubernetes.client.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ObjectFieldSelector selects an APIVersioned field of an object. */
@ApiModel(description = "ObjectFieldSelector selects an APIVersioned field of an object.")
public class V1ObjectFieldSelector {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("fieldPath")
  private String fieldPath = null;

  public V1ObjectFieldSelector apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Version of the schema the FieldPath is written in terms of, defaults to \&quot;v1\&quot;.
   *
   * @return apiVersion
   */
  @ApiModelProperty(
      value = "Version of the schema the FieldPath is written in terms of, defaults to \"v1\".")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public V1ObjectFieldSelector fieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
    return this;
  }

  /**
   * Path of the field to select in the specified API version.
   *
   * @return fieldPath
   */
  @ApiModelProperty(
      required = true,
      value = "Path of the field to select in the specified API version.")
  public String getFieldPath() {
    return fieldPath;
  }

  public void setFieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ObjectFieldSelector v1ObjectFieldSelector = (V1ObjectFieldSelector) o;
    return Objects.equals(this.apiVersion, v1ObjectFieldSelector.apiVersion)
        && Objects.equals(this.fieldPath, v1ObjectFieldSelector.fieldPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, fieldPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ObjectFieldSelector {\n");

    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    fieldPath: ").append(toIndentedString(fieldPath)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
