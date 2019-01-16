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
import org.joda.time.DateTime;

/** LeaseSpec is a specification of a Lease. */
@ApiModel(description = "LeaseSpec is a specification of a Lease.")
public class V1beta1LeaseSpec {
  @SerializedName("acquireTime")
  private DateTime acquireTime = null;

  @SerializedName("holderIdentity")
  private String holderIdentity = null;

  @SerializedName("leaseDurationSeconds")
  private Integer leaseDurationSeconds = null;

  @SerializedName("leaseTransitions")
  private Integer leaseTransitions = null;

  @SerializedName("renewTime")
  private DateTime renewTime = null;

  public V1beta1LeaseSpec acquireTime(DateTime acquireTime) {
    this.acquireTime = acquireTime;
    return this;
  }

  /**
   * acquireTime is a time when the current lease was acquired.
   *
   * @return acquireTime
   */
  @ApiModelProperty(value = "acquireTime is a time when the current lease was acquired.")
  public DateTime getAcquireTime() {
    return acquireTime;
  }

  public void setAcquireTime(DateTime acquireTime) {
    this.acquireTime = acquireTime;
  }

  public V1beta1LeaseSpec holderIdentity(String holderIdentity) {
    this.holderIdentity = holderIdentity;
    return this;
  }

  /**
   * holderIdentity contains the identity of the holder of a current lease.
   *
   * @return holderIdentity
   */
  @ApiModelProperty(
      value = "holderIdentity contains the identity of the holder of a current lease.")
  public String getHolderIdentity() {
    return holderIdentity;
  }

  public void setHolderIdentity(String holderIdentity) {
    this.holderIdentity = holderIdentity;
  }

  public V1beta1LeaseSpec leaseDurationSeconds(Integer leaseDurationSeconds) {
    this.leaseDurationSeconds = leaseDurationSeconds;
    return this;
  }

  /**
   * leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire
   * it. This is measure against time of last observed RenewTime.
   *
   * @return leaseDurationSeconds
   */
  @ApiModelProperty(
      value =
          "leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it. This is measure against time of last observed RenewTime.")
  public Integer getLeaseDurationSeconds() {
    return leaseDurationSeconds;
  }

  public void setLeaseDurationSeconds(Integer leaseDurationSeconds) {
    this.leaseDurationSeconds = leaseDurationSeconds;
  }

  public V1beta1LeaseSpec leaseTransitions(Integer leaseTransitions) {
    this.leaseTransitions = leaseTransitions;
    return this;
  }

  /**
   * leaseTransitions is the number of transitions of a lease between holders.
   *
   * @return leaseTransitions
   */
  @ApiModelProperty(
      value = "leaseTransitions is the number of transitions of a lease between holders.")
  public Integer getLeaseTransitions() {
    return leaseTransitions;
  }

  public void setLeaseTransitions(Integer leaseTransitions) {
    this.leaseTransitions = leaseTransitions;
  }

  public V1beta1LeaseSpec renewTime(DateTime renewTime) {
    this.renewTime = renewTime;
    return this;
  }

  /**
   * renewTime is a time when the current holder of a lease has last updated the lease.
   *
   * @return renewTime
   */
  @ApiModelProperty(
      value = "renewTime is a time when the current holder of a lease has last updated the lease.")
  public DateTime getRenewTime() {
    return renewTime;
  }

  public void setRenewTime(DateTime renewTime) {
    this.renewTime = renewTime;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1LeaseSpec v1beta1LeaseSpec = (V1beta1LeaseSpec) o;
    return Objects.equals(this.acquireTime, v1beta1LeaseSpec.acquireTime)
        && Objects.equals(this.holderIdentity, v1beta1LeaseSpec.holderIdentity)
        && Objects.equals(this.leaseDurationSeconds, v1beta1LeaseSpec.leaseDurationSeconds)
        && Objects.equals(this.leaseTransitions, v1beta1LeaseSpec.leaseTransitions)
        && Objects.equals(this.renewTime, v1beta1LeaseSpec.renewTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        acquireTime, holderIdentity, leaseDurationSeconds, leaseTransitions, renewTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1LeaseSpec {\n");

    sb.append("    acquireTime: ").append(toIndentedString(acquireTime)).append("\n");
    sb.append("    holderIdentity: ").append(toIndentedString(holderIdentity)).append("\n");
    sb.append("    leaseDurationSeconds: ")
        .append(toIndentedString(leaseDurationSeconds))
        .append("\n");
    sb.append("    leaseTransitions: ").append(toIndentedString(leaseTransitions)).append("\n");
    sb.append("    renewTime: ").append(toIndentedString(renewTime)).append("\n");
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
