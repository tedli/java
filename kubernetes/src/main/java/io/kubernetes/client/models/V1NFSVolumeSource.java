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
 * Represents an NFS mount that lasts the lifetime of a pod. NFS volumes do not support ownership
 * management or SELinux relabeling.
 */
@ApiModel(
    description =
        "Represents an NFS mount that lasts the lifetime of a pod. NFS volumes do not support ownership management or SELinux relabeling.")
public class V1NFSVolumeSource {
  @SerializedName("path")
  private String path = null;

  @SerializedName("readOnly")
  private Boolean readOnly = null;

  @SerializedName("server")
  private String server = null;

  public V1NFSVolumeSource path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Path that is exported by the NFS server. More info:
   * https://kubernetes.io/docs/concepts/storage/volumes#nfs
   *
   * @return path
   */
  @ApiModelProperty(
      required = true,
      value =
          "Path that is exported by the NFS server. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public V1NFSVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * ReadOnly here will force the NFS export to be mounted with read-only permissions. Defaults to
   * false. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
   *
   * @return readOnly
   */
  @ApiModelProperty(
      value =
          "ReadOnly here will force the NFS export to be mounted with read-only permissions. Defaults to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs")
  public Boolean isReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public V1NFSVolumeSource server(String server) {
    this.server = server;
    return this;
  }

  /**
   * Server is the hostname or IP address of the NFS server. More info:
   * https://kubernetes.io/docs/concepts/storage/volumes#nfs
   *
   * @return server
   */
  @ApiModelProperty(
      required = true,
      value =
          "Server is the hostname or IP address of the NFS server. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs")
  public String getServer() {
    return server;
  }

  public void setServer(String server) {
    this.server = server;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NFSVolumeSource v1NFSVolumeSource = (V1NFSVolumeSource) o;
    return Objects.equals(this.path, v1NFSVolumeSource.path)
        && Objects.equals(this.readOnly, v1NFSVolumeSource.readOnly)
        && Objects.equals(this.server, v1NFSVolumeSource.server);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, readOnly, server);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NFSVolumeSource {\n");

    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
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
