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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PodSecurityContext holds pod-level security attributes and common container settings. Some fields
 * are also present in container.securityContext. Field values of container.securityContext take
 * precedence over field values of PodSecurityContext.
 */
@ApiModel(
    description =
        "PodSecurityContext holds pod-level security attributes and common container settings. Some fields are also present in container.securityContext.  Field values of container.securityContext take precedence over field values of PodSecurityContext.")
public class V1PodSecurityContext {
  @SerializedName("fsGroup")
  private Long fsGroup = null;

  @SerializedName("runAsGroup")
  private Long runAsGroup = null;

  @SerializedName("runAsNonRoot")
  private Boolean runAsNonRoot = null;

  @SerializedName("runAsUser")
  private Long runAsUser = null;

  @SerializedName("seLinuxOptions")
  private V1SELinuxOptions seLinuxOptions = null;

  @SerializedName("supplementalGroups")
  private List<Long> supplementalGroups = null;

  @SerializedName("sysctls")
  private List<V1Sysctl> sysctls = null;

  public V1PodSecurityContext fsGroup(Long fsGroup) {
    this.fsGroup = fsGroup;
    return this;
  }

  /**
   * A special supplemental group that applies to all containers in a pod. Some volume types allow
   * the Kubelet to change the ownership of that volume to be owned by the pod: 1. The owning GID
   * will be the FSGroup 2. The setgid bit is set (new files created in the volume will be owned by
   * FSGroup) 3. The permission bits are OR&#39;d with rw-rw---- If unset, the Kubelet will not
   * modify the ownership and permissions of any volume.
   *
   * @return fsGroup
   */
  @ApiModelProperty(
      value =
          "A special supplemental group that applies to all containers in a pod. Some volume types allow the Kubelet to change the ownership of that volume to be owned by the pod:  1. The owning GID will be the FSGroup 2. The setgid bit is set (new files created in the volume will be owned by FSGroup) 3. The permission bits are OR'd with rw-rw----  If unset, the Kubelet will not modify the ownership and permissions of any volume.")
  public Long getFsGroup() {
    return fsGroup;
  }

  public void setFsGroup(Long fsGroup) {
    this.fsGroup = fsGroup;
  }

  public V1PodSecurityContext runAsGroup(Long runAsGroup) {
    this.runAsGroup = runAsGroup;
    return this;
  }

  /**
   * The GID to run the entrypoint of the container process. Uses runtime default if unset. May also
   * be set in SecurityContext. If set in both SecurityContext and PodSecurityContext, the value
   * specified in SecurityContext takes precedence for that container.
   *
   * @return runAsGroup
   */
  @ApiModelProperty(
      value =
          "The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.")
  public Long getRunAsGroup() {
    return runAsGroup;
  }

  public void setRunAsGroup(Long runAsGroup) {
    this.runAsGroup = runAsGroup;
  }

  public V1PodSecurityContext runAsNonRoot(Boolean runAsNonRoot) {
    this.runAsNonRoot = runAsNonRoot;
    return this;
  }

  /**
   * Indicates that the container must run as a non-root user. If true, the Kubelet will validate
   * the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the
   * container if it does. If unset or false, no such validation will be performed. May also be set
   * in SecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified
   * in SecurityContext takes precedence.
   *
   * @return runAsNonRoot
   */
  @ApiModelProperty(
      value =
          "Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.")
  public Boolean isRunAsNonRoot() {
    return runAsNonRoot;
  }

  public void setRunAsNonRoot(Boolean runAsNonRoot) {
    this.runAsNonRoot = runAsNonRoot;
  }

  public V1PodSecurityContext runAsUser(Long runAsUser) {
    this.runAsUser = runAsUser;
    return this;
  }

  /**
   * The UID to run the entrypoint of the container process. Defaults to user specified in image
   * metadata if unspecified. May also be set in SecurityContext. If set in both SecurityContext and
   * PodSecurityContext, the value specified in SecurityContext takes precedence for that container.
   *
   * @return runAsUser
   */
  @ApiModelProperty(
      value =
          "The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.")
  public Long getRunAsUser() {
    return runAsUser;
  }

  public void setRunAsUser(Long runAsUser) {
    this.runAsUser = runAsUser;
  }

  public V1PodSecurityContext seLinuxOptions(V1SELinuxOptions seLinuxOptions) {
    this.seLinuxOptions = seLinuxOptions;
    return this;
  }

  /**
   * The SELinux context to be applied to all containers. If unspecified, the container runtime will
   * allocate a random SELinux context for each container. May also be set in SecurityContext. If
   * set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext
   * takes precedence for that container.
   *
   * @return seLinuxOptions
   */
  @ApiModelProperty(
      value =
          "The SELinux context to be applied to all containers. If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.")
  public V1SELinuxOptions getSeLinuxOptions() {
    return seLinuxOptions;
  }

  public void setSeLinuxOptions(V1SELinuxOptions seLinuxOptions) {
    this.seLinuxOptions = seLinuxOptions;
  }

  public V1PodSecurityContext supplementalGroups(List<Long> supplementalGroups) {
    this.supplementalGroups = supplementalGroups;
    return this;
  }

  public V1PodSecurityContext addSupplementalGroupsItem(Long supplementalGroupsItem) {
    if (this.supplementalGroups == null) {
      this.supplementalGroups = new ArrayList<Long>();
    }
    this.supplementalGroups.add(supplementalGroupsItem);
    return this;
  }

  /**
   * A list of groups applied to the first process run in each container, in addition to the
   * container&#39;s primary GID. If unspecified, no groups will be added to any container.
   *
   * @return supplementalGroups
   */
  @ApiModelProperty(
      value =
          "A list of groups applied to the first process run in each container, in addition to the container's primary GID.  If unspecified, no groups will be added to any container.")
  public List<Long> getSupplementalGroups() {
    return supplementalGroups;
  }

  public void setSupplementalGroups(List<Long> supplementalGroups) {
    this.supplementalGroups = supplementalGroups;
  }

  public V1PodSecurityContext sysctls(List<V1Sysctl> sysctls) {
    this.sysctls = sysctls;
    return this;
  }

  public V1PodSecurityContext addSysctlsItem(V1Sysctl sysctlsItem) {
    if (this.sysctls == null) {
      this.sysctls = new ArrayList<V1Sysctl>();
    }
    this.sysctls.add(sysctlsItem);
    return this;
  }

  /**
   * Sysctls hold a list of namespaced sysctls used for the pod. Pods with unsupported sysctls (by
   * the container runtime) might fail to launch.
   *
   * @return sysctls
   */
  @ApiModelProperty(
      value =
          "Sysctls hold a list of namespaced sysctls used for the pod. Pods with unsupported sysctls (by the container runtime) might fail to launch.")
  public List<V1Sysctl> getSysctls() {
    return sysctls;
  }

  public void setSysctls(List<V1Sysctl> sysctls) {
    this.sysctls = sysctls;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PodSecurityContext v1PodSecurityContext = (V1PodSecurityContext) o;
    return Objects.equals(this.fsGroup, v1PodSecurityContext.fsGroup)
        && Objects.equals(this.runAsGroup, v1PodSecurityContext.runAsGroup)
        && Objects.equals(this.runAsNonRoot, v1PodSecurityContext.runAsNonRoot)
        && Objects.equals(this.runAsUser, v1PodSecurityContext.runAsUser)
        && Objects.equals(this.seLinuxOptions, v1PodSecurityContext.seLinuxOptions)
        && Objects.equals(this.supplementalGroups, v1PodSecurityContext.supplementalGroups)
        && Objects.equals(this.sysctls, v1PodSecurityContext.sysctls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        fsGroup, runAsGroup, runAsNonRoot, runAsUser, seLinuxOptions, supplementalGroups, sysctls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PodSecurityContext {\n");

    sb.append("    fsGroup: ").append(toIndentedString(fsGroup)).append("\n");
    sb.append("    runAsGroup: ").append(toIndentedString(runAsGroup)).append("\n");
    sb.append("    runAsNonRoot: ").append(toIndentedString(runAsNonRoot)).append("\n");
    sb.append("    runAsUser: ").append(toIndentedString(runAsUser)).append("\n");
    sb.append("    seLinuxOptions: ").append(toIndentedString(seLinuxOptions)).append("\n");
    sb.append("    supplementalGroups: ").append(toIndentedString(supplementalGroups)).append("\n");
    sb.append("    sysctls: ").append(toIndentedString(sysctls)).append("\n");
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
