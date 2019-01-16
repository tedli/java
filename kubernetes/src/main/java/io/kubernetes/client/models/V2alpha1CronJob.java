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

/** CronJob represents the configuration of a single cron job. */
@ApiModel(description = "CronJob represents the configuration of a single cron job.")
public class V2alpha1CronJob {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private V1ObjectMeta metadata = null;

  @SerializedName("spec")
  private V2alpha1CronJobSpec spec = null;

  @SerializedName("status")
  private V2alpha1CronJobStatus status = null;

  public V2alpha1CronJob apiVersion(String apiVersion) {
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

  public V2alpha1CronJob kind(String kind) {
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

  public V2alpha1CronJob metadata(V1ObjectMeta metadata) {
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

  public V2alpha1CronJob spec(V2alpha1CronJobSpec spec) {
    this.spec = spec;
    return this;
  }

  /**
   * Specification of the desired behavior of a cron job, including the schedule. More info:
   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
   *
   * @return spec
   */
  @ApiModelProperty(
      value =
          "Specification of the desired behavior of a cron job, including the schedule. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status")
  public V2alpha1CronJobSpec getSpec() {
    return spec;
  }

  public void setSpec(V2alpha1CronJobSpec spec) {
    this.spec = spec;
  }

  public V2alpha1CronJob status(V2alpha1CronJobStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Current status of a cron job. More info:
   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
   *
   * @return status
   */
  @ApiModelProperty(
      value =
          "Current status of a cron job. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status")
  public V2alpha1CronJobStatus getStatus() {
    return status;
  }

  public void setStatus(V2alpha1CronJobStatus status) {
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
    V2alpha1CronJob v2alpha1CronJob = (V2alpha1CronJob) o;
    return Objects.equals(this.apiVersion, v2alpha1CronJob.apiVersion)
        && Objects.equals(this.kind, v2alpha1CronJob.kind)
        && Objects.equals(this.metadata, v2alpha1CronJob.metadata)
        && Objects.equals(this.spec, v2alpha1CronJob.spec)
        && Objects.equals(this.status, v2alpha1CronJob.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, spec, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2alpha1CronJob {\n");

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
