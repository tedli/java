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

/**
 * The node this Taint is attached to has the \&quot;effect\&quot; on any pod that does not tolerate
 * the Taint.
 */
@ApiModel(
    description =
        "The node this Taint is attached to has the \"effect\" on any pod that does not tolerate the Taint.")
public class V1Taint {
  @SerializedName("effect")
  private String effect = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("timeAdded")
  private DateTime timeAdded = null;

  @SerializedName("value")
  private String value = null;

  public V1Taint effect(String effect) {
    this.effect = effect;
    return this;
  }

  /**
   * Required. The effect of the taint on pods that do not tolerate the taint. Valid effects are
   * NoSchedule, PreferNoSchedule and NoExecute.
   *
   * @return effect
   */
  @ApiModelProperty(
      required = true,
      value =
          "Required. The effect of the taint on pods that do not tolerate the taint. Valid effects are NoSchedule, PreferNoSchedule and NoExecute.")
  public String getEffect() {
    return effect;
  }

  public void setEffect(String effect) {
    this.effect = effect;
  }

  public V1Taint key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Required. The taint key to be applied to a node.
   *
   * @return key
   */
  @ApiModelProperty(required = true, value = "Required. The taint key to be applied to a node.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public V1Taint timeAdded(DateTime timeAdded) {
    this.timeAdded = timeAdded;
    return this;
  }

  /**
   * TimeAdded represents the time at which the taint was added. It is only written for NoExecute
   * taints.
   *
   * @return timeAdded
   */
  @ApiModelProperty(
      value =
          "TimeAdded represents the time at which the taint was added. It is only written for NoExecute taints.")
  public DateTime getTimeAdded() {
    return timeAdded;
  }

  public void setTimeAdded(DateTime timeAdded) {
    this.timeAdded = timeAdded;
  }

  public V1Taint value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Required. The taint value corresponding to the taint key.
   *
   * @return value
   */
  @ApiModelProperty(value = "Required. The taint value corresponding to the taint key.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Taint v1Taint = (V1Taint) o;
    return Objects.equals(this.effect, v1Taint.effect)
        && Objects.equals(this.key, v1Taint.key)
        && Objects.equals(this.timeAdded, v1Taint.timeAdded)
        && Objects.equals(this.value, v1Taint.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effect, key, timeAdded, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Taint {\n");

    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    timeAdded: ").append(toIndentedString(timeAdded)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
