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

/** EnvFromSource represents the source of a set of ConfigMaps */
@ApiModel(description = "EnvFromSource represents the source of a set of ConfigMaps")
public class V1EnvFromSource {
  @SerializedName("configMapRef")
  private V1ConfigMapEnvSource configMapRef = null;

  @SerializedName("prefix")
  private String prefix = null;

  @SerializedName("secretRef")
  private V1SecretEnvSource secretRef = null;

  public V1EnvFromSource configMapRef(V1ConfigMapEnvSource configMapRef) {
    this.configMapRef = configMapRef;
    return this;
  }

  /**
   * The ConfigMap to select from
   *
   * @return configMapRef
   */
  @ApiModelProperty(value = "The ConfigMap to select from")
  public V1ConfigMapEnvSource getConfigMapRef() {
    return configMapRef;
  }

  public void setConfigMapRef(V1ConfigMapEnvSource configMapRef) {
    this.configMapRef = configMapRef;
  }

  public V1EnvFromSource prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

  /**
   * An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
   *
   * @return prefix
   */
  @ApiModelProperty(
      value =
          "An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.")
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public V1EnvFromSource secretRef(V1SecretEnvSource secretRef) {
    this.secretRef = secretRef;
    return this;
  }

  /**
   * The Secret to select from
   *
   * @return secretRef
   */
  @ApiModelProperty(value = "The Secret to select from")
  public V1SecretEnvSource getSecretRef() {
    return secretRef;
  }

  public void setSecretRef(V1SecretEnvSource secretRef) {
    this.secretRef = secretRef;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1EnvFromSource v1EnvFromSource = (V1EnvFromSource) o;
    return Objects.equals(this.configMapRef, v1EnvFromSource.configMapRef)
        && Objects.equals(this.prefix, v1EnvFromSource.prefix)
        && Objects.equals(this.secretRef, v1EnvFromSource.secretRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configMapRef, prefix, secretRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1EnvFromSource {\n");

    sb.append("    configMapRef: ").append(toIndentedString(configMapRef)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
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
