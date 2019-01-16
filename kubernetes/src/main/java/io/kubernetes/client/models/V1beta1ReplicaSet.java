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
 * DEPRECATED - This group version of ReplicaSet is deprecated by apps/v1beta2/ReplicaSet. See the
 * release notes for more information. ReplicaSet ensures that a specified number of pod replicas
 * are running at any given time.
 */
@ApiModel(
    description =
        "DEPRECATED - This group version of ReplicaSet is deprecated by apps/v1beta2/ReplicaSet. See the release notes for more information. ReplicaSet ensures that a specified number of pod replicas are running at any given time.")
public class V1beta1ReplicaSet {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private V1ObjectMeta metadata = null;

  @SerializedName("spec")
  private V1beta1ReplicaSetSpec spec = null;

  @SerializedName("status")
  private V1beta1ReplicaSetStatus status = null;

  public V1beta1ReplicaSet apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should
   * convert recognized schemas to the latest internal value, and may reject unrecognized values.
   * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
   *
   * @return apiVersion
   */
  @ApiModelProperty(
      value =
          "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public V1beta1ReplicaSet kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer
   * this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More
   * info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
   *
   * @return kind
   */
  @ApiModelProperty(
      value =
          "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1beta1ReplicaSet metadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * If the Labels of a ReplicaSet are empty, they are defaulted to be the same as the Pod(s) that
   * the ReplicaSet manages. Standard object&#39;s metadata. More info:
   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
   *
   * @return metadata
   */
  @ApiModelProperty(
      value =
          "If the Labels of a ReplicaSet are empty, they are defaulted to be the same as the Pod(s) that the ReplicaSet manages. Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata")
  public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public V1beta1ReplicaSet spec(V1beta1ReplicaSetSpec spec) {
    this.spec = spec;
    return this;
  }

  /**
   * Spec defines the specification of the desired behavior of the ReplicaSet. More info:
   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
   *
   * @return spec
   */
  @ApiModelProperty(
      value =
          "Spec defines the specification of the desired behavior of the ReplicaSet. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status")
  public V1beta1ReplicaSetSpec getSpec() {
    return spec;
  }

  public void setSpec(V1beta1ReplicaSetSpec spec) {
    this.spec = spec;
  }

  public V1beta1ReplicaSet status(V1beta1ReplicaSetStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Status is the most recently observed status of the ReplicaSet. This data may be out of date by
   * some window of time. Populated by the system. Read-only. More info:
   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
   *
   * @return status
   */
  @ApiModelProperty(
      value =
          "Status is the most recently observed status of the ReplicaSet. This data may be out of date by some window of time. Populated by the system. Read-only. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status")
  public V1beta1ReplicaSetStatus getStatus() {
    return status;
  }

  public void setStatus(V1beta1ReplicaSetStatus status) {
    this.status = status;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1ReplicaSet v1beta1ReplicaSet = (V1beta1ReplicaSet) o;
    return Objects.equals(this.apiVersion, v1beta1ReplicaSet.apiVersion)
        && Objects.equals(this.kind, v1beta1ReplicaSet.kind)
        && Objects.equals(this.metadata, v1beta1ReplicaSet.metadata)
        && Objects.equals(this.spec, v1beta1ReplicaSet.spec)
        && Objects.equals(this.status, v1beta1ReplicaSet.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, spec, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1ReplicaSet {\n");

    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
