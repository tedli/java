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

/**
 * AllowedHostPath defines the host volume conditions that will be enabled by a policy for pods to
 * use. It requires the path prefix to be defined.
 */
@ApiModel(
    description =
        "AllowedHostPath defines the host volume conditions that will be enabled by a policy for pods to use. It requires the path prefix to be defined.")
public class PolicyV1beta1AllowedHostPath {
  @SerializedName("pathPrefix")
  private String pathPrefix = null;

  @SerializedName("readOnly")
  private Boolean readOnly = null;

  public PolicyV1beta1AllowedHostPath pathPrefix(String pathPrefix) {
    this.pathPrefix = pathPrefix;
    return this;
  }

  /**
   * pathPrefix is the path prefix that the host volume must match. It does not support
   * &#x60;*&#x60;. Trailing slashes are trimmed when validating the path prefix with a host path.
   * Examples: &#x60;/foo&#x60; would allow &#x60;/foo&#x60;, &#x60;/foo/&#x60; and
   * &#x60;/foo/bar&#x60; &#x60;/foo&#x60; would not allow &#x60;/food&#x60; or &#x60;/etc/foo&#x60;
   *
   * @return pathPrefix
   */
  @ApiModelProperty(
      value =
          "pathPrefix is the path prefix that the host volume must match. It does not support `*`. Trailing slashes are trimmed when validating the path prefix with a host path.  Examples: `/foo` would allow `/foo`, `/foo/` and `/foo/bar` `/foo` would not allow `/food` or `/etc/foo`")
  public String getPathPrefix() {
    return pathPrefix;
  }

  public void setPathPrefix(String pathPrefix) {
    this.pathPrefix = pathPrefix;
  }

  public PolicyV1beta1AllowedHostPath readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * when set to true, will allow host volumes matching the pathPrefix only if all volume mounts are
   * readOnly.
   *
   * @return readOnly
   */
  @ApiModelProperty(
      value =
          "when set to true, will allow host volumes matching the pathPrefix only if all volume mounts are readOnly.")
  public Boolean isReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyV1beta1AllowedHostPath policyV1beta1AllowedHostPath = (PolicyV1beta1AllowedHostPath) o;
    return Objects.equals(this.pathPrefix, policyV1beta1AllowedHostPath.pathPrefix)
        && Objects.equals(this.readOnly, policyV1beta1AllowedHostPath.readOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pathPrefix, readOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyV1beta1AllowedHostPath {\n");

    sb.append("    pathPrefix: ").append(toIndentedString(pathPrefix)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
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
