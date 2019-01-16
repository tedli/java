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

/** ServiceReference holds a reference to Service.legacy.k8s.io */
@ApiModel(description = "ServiceReference holds a reference to Service.legacy.k8s.io")
public class AdmissionregistrationV1beta1ServiceReference {
  @SerializedName("name")
  private String name = null;

  @SerializedName("namespace")
  private String namespace = null;

  @SerializedName("path")
  private String path = null;

  public AdmissionregistrationV1beta1ServiceReference name(String name) {
    this.name = name;
    return this;
  }

  /**
   * &#x60;name&#x60; is the name of the service. Required
   *
   * @return name
   */
  @ApiModelProperty(required = true, value = "`name` is the name of the service. Required")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AdmissionregistrationV1beta1ServiceReference namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * &#x60;namespace&#x60; is the namespace of the service. Required
   *
   * @return namespace
   */
  @ApiModelProperty(
      required = true,
      value = "`namespace` is the namespace of the service. Required")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public AdmissionregistrationV1beta1ServiceReference path(String path) {
    this.path = path;
    return this;
  }

  /**
   * &#x60;path&#x60; is an optional URL path which will be sent in any request to this service.
   *
   * @return path
   */
  @ApiModelProperty(
      value = "`path` is an optional URL path which will be sent in any request to this service.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdmissionregistrationV1beta1ServiceReference admissionregistrationV1beta1ServiceReference =
        (AdmissionregistrationV1beta1ServiceReference) o;
    return Objects.equals(this.name, admissionregistrationV1beta1ServiceReference.name)
        && Objects.equals(this.namespace, admissionregistrationV1beta1ServiceReference.namespace)
        && Objects.equals(this.path, admissionregistrationV1beta1ServiceReference.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, namespace, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdmissionregistrationV1beta1ServiceReference {\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
