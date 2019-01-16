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
 * DEPRECATED - This group version of ControllerRevision is deprecated by
 * apps/v1beta2/ControllerRevision. See the release notes for more information. ControllerRevision
 * implements an immutable snapshot of state data. Clients are responsible for serializing and
 * deserializing the objects that contain their internal state. Once a ControllerRevision has been
 * successfully created, it can not be updated. The API Server will fail validation of all requests
 * that attempt to mutate the Data field. ControllerRevisions may, however, be deleted. Note that,
 * due to its use by both the DaemonSet and StatefulSet controllers for update and rollback, this
 * object is beta. However, it may be subject to name and representation changes in future releases,
 * and clients should not depend on its stability. It is primarily for internal use by controllers.
 */
@ApiModel(
    description =
        "DEPRECATED - This group version of ControllerRevision is deprecated by apps/v1beta2/ControllerRevision. See the release notes for more information. ControllerRevision implements an immutable snapshot of state data. Clients are responsible for serializing and deserializing the objects that contain their internal state. Once a ControllerRevision has been successfully created, it can not be updated. The API Server will fail validation of all requests that attempt to mutate the Data field. ControllerRevisions may, however, be deleted. Note that, due to its use by both the DaemonSet and StatefulSet controllers for update and rollback, this object is beta. However, it may be subject to name and representation changes in future releases, and clients should not depend on its stability. It is primarily for internal use by controllers.")
public class V1beta1ControllerRevision {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("data")
  private RuntimeRawExtension data = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private V1ObjectMeta metadata = null;

  @SerializedName("revision")
  private Long revision = null;

  public V1beta1ControllerRevision apiVersion(String apiVersion) {
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

  public V1beta1ControllerRevision data(RuntimeRawExtension data) {
    this.data = data;
    return this;
  }

  /**
   * Data is the serialized representation of the state.
   *
   * @return data
   */
  @ApiModelProperty(value = "Data is the serialized representation of the state.")
  public RuntimeRawExtension getData() {
    return data;
  }

  public void setData(RuntimeRawExtension data) {
    this.data = data;
  }

  public V1beta1ControllerRevision kind(String kind) {
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

  public V1beta1ControllerRevision metadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Standard object&#39;s metadata. More info:
   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
   *
   * @return metadata
   */
  @ApiModelProperty(
      value =
          "Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata")
  public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public V1beta1ControllerRevision revision(Long revision) {
    this.revision = revision;
    return this;
  }

  /**
   * Revision indicates the revision of the state represented by Data.
   *
   * @return revision
   */
  @ApiModelProperty(
      required = true,
      value = "Revision indicates the revision of the state represented by Data.")
  public Long getRevision() {
    return revision;
  }

  public void setRevision(Long revision) {
    this.revision = revision;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1ControllerRevision v1beta1ControllerRevision = (V1beta1ControllerRevision) o;
    return Objects.equals(this.apiVersion, v1beta1ControllerRevision.apiVersion)
        && Objects.equals(this.data, v1beta1ControllerRevision.data)
        && Objects.equals(this.kind, v1beta1ControllerRevision.kind)
        && Objects.equals(this.metadata, v1beta1ControllerRevision.metadata)
        && Objects.equals(this.revision, v1beta1ControllerRevision.revision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, data, kind, metadata, revision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1ControllerRevision {\n");

    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
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
