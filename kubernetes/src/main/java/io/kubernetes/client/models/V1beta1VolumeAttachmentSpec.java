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

/** VolumeAttachmentSpec is the specification of a VolumeAttachment request. */
@ApiModel(description = "VolumeAttachmentSpec is the specification of a VolumeAttachment request.")
public class V1beta1VolumeAttachmentSpec {
  @SerializedName("attacher")
  private String attacher = null;

  @SerializedName("nodeName")
  private String nodeName = null;

  @SerializedName("source")
  private V1beta1VolumeAttachmentSource source = null;

  public V1beta1VolumeAttachmentSpec attacher(String attacher) {
    this.attacher = attacher;
    return this;
  }

  /**
   * Attacher indicates the name of the volume driver that MUST handle this request. This is the
   * name returned by GetPluginName().
   *
   * @return attacher
   */
  @ApiModelProperty(
      required = true,
      value =
          "Attacher indicates the name of the volume driver that MUST handle this request. This is the name returned by GetPluginName().")
  public String getAttacher() {
    return attacher;
  }

  public void setAttacher(String attacher) {
    this.attacher = attacher;
  }

  public V1beta1VolumeAttachmentSpec nodeName(String nodeName) {
    this.nodeName = nodeName;
    return this;
  }

  /**
   * The node that the volume should be attached to.
   *
   * @return nodeName
   */
  @ApiModelProperty(required = true, value = "The node that the volume should be attached to.")
  public String getNodeName() {
    return nodeName;
  }

  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }

  public V1beta1VolumeAttachmentSpec source(V1beta1VolumeAttachmentSource source) {
    this.source = source;
    return this;
  }

  /**
   * Source represents the volume that should be attached.
   *
   * @return source
   */
  @ApiModelProperty(
      required = true,
      value = "Source represents the volume that should be attached.")
  public V1beta1VolumeAttachmentSource getSource() {
    return source;
  }

  public void setSource(V1beta1VolumeAttachmentSource source) {
    this.source = source;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1VolumeAttachmentSpec v1beta1VolumeAttachmentSpec = (V1beta1VolumeAttachmentSpec) o;
    return Objects.equals(this.attacher, v1beta1VolumeAttachmentSpec.attacher)
        && Objects.equals(this.nodeName, v1beta1VolumeAttachmentSpec.nodeName)
        && Objects.equals(this.source, v1beta1VolumeAttachmentSpec.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attacher, nodeName, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1VolumeAttachmentSpec {\n");

    sb.append("    attacher: ").append(toIndentedString(attacher)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
