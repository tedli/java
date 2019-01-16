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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * A label selector is a label query over a set of resources. The result of matchLabels and
 * matchExpressions are ANDed. An empty label selector matches all objects. A null label selector
 * matches no objects.
 */
@ApiModel(
    description =
        "A label selector is a label query over a set of resources. The result of matchLabels and matchExpressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.")
public class V1LabelSelector {
  @SerializedName("matchExpressions")
  private List<V1LabelSelectorRequirement> matchExpressions = null;

  @SerializedName("matchLabels")
  private Map<String, String> matchLabels = null;

  public V1LabelSelector matchExpressions(List<V1LabelSelectorRequirement> matchExpressions) {
    this.matchExpressions = matchExpressions;
    return this;
  }

  public V1LabelSelector addMatchExpressionsItem(V1LabelSelectorRequirement matchExpressionsItem) {
    if (this.matchExpressions == null) {
      this.matchExpressions = new ArrayList<V1LabelSelectorRequirement>();
    }
    this.matchExpressions.add(matchExpressionsItem);
    return this;
  }

  /**
   * matchExpressions is a list of label selector requirements. The requirements are ANDed.
   *
   * @return matchExpressions
   */
  @ApiModelProperty(
      value =
          "matchExpressions is a list of label selector requirements. The requirements are ANDed.")
  public List<V1LabelSelectorRequirement> getMatchExpressions() {
    return matchExpressions;
  }

  public void setMatchExpressions(List<V1LabelSelectorRequirement> matchExpressions) {
    this.matchExpressions = matchExpressions;
  }

  public V1LabelSelector matchLabels(Map<String, String> matchLabels) {
    this.matchLabels = matchLabels;
    return this;
  }

  public V1LabelSelector putMatchLabelsItem(String key, String matchLabelsItem) {
    if (this.matchLabels == null) {
      this.matchLabels = new HashMap<String, String>();
    }
    this.matchLabels.put(key, matchLabelsItem);
    return this;
  }

  /**
   * matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is
   * equivalent to an element of matchExpressions, whose key field is \&quot;key\&quot;, the
   * operator is \&quot;In\&quot;, and the values array contains only \&quot;value\&quot;. The
   * requirements are ANDed.
   *
   * @return matchLabels
   */
  @ApiModelProperty(
      value =
          "matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is \"key\", the operator is \"In\", and the values array contains only \"value\". The requirements are ANDed.")
  public Map<String, String> getMatchLabels() {
    return matchLabels;
  }

  public void setMatchLabels(Map<String, String> matchLabels) {
    this.matchLabels = matchLabels;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1LabelSelector v1LabelSelector = (V1LabelSelector) o;
    return Objects.equals(this.matchExpressions, v1LabelSelector.matchExpressions)
        && Objects.equals(this.matchLabels, v1LabelSelector.matchLabels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchExpressions, matchLabels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1LabelSelector {\n");

    sb.append("    matchExpressions: ").append(toIndentedString(matchExpressions)).append("\n");
    sb.append("    matchLabels: ").append(toIndentedString(matchLabels)).append("\n");
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
