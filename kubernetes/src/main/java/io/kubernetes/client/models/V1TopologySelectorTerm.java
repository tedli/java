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
 * A topology selector term represents the result of label queries. A null or empty topology
 * selector term matches no objects. The requirements of them are ANDed. It provides a subset of
 * functionality as NodeSelectorTerm. This is an alpha feature and may change in the future.
 */
@ApiModel(
    description =
        "A topology selector term represents the result of label queries. A null or empty topology selector term matches no objects. The requirements of them are ANDed. It provides a subset of functionality as NodeSelectorTerm. This is an alpha feature and may change in the future.")
public class V1TopologySelectorTerm {
  @SerializedName("matchLabelExpressions")
  private List<V1TopologySelectorLabelRequirement> matchLabelExpressions = null;

  public V1TopologySelectorTerm matchLabelExpressions(
      List<V1TopologySelectorLabelRequirement> matchLabelExpressions) {
    this.matchLabelExpressions = matchLabelExpressions;
    return this;
  }

  public V1TopologySelectorTerm addMatchLabelExpressionsItem(
      V1TopologySelectorLabelRequirement matchLabelExpressionsItem) {
    if (this.matchLabelExpressions == null) {
      this.matchLabelExpressions = new ArrayList<V1TopologySelectorLabelRequirement>();
    }
    this.matchLabelExpressions.add(matchLabelExpressionsItem);
    return this;
  }

  /**
   * A list of topology selector requirements by labels.
   *
   * @return matchLabelExpressions
   */
  @ApiModelProperty(value = "A list of topology selector requirements by labels.")
  public List<V1TopologySelectorLabelRequirement> getMatchLabelExpressions() {
    return matchLabelExpressions;
  }

  public void setMatchLabelExpressions(
      List<V1TopologySelectorLabelRequirement> matchLabelExpressions) {
    this.matchLabelExpressions = matchLabelExpressions;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1TopologySelectorTerm v1TopologySelectorTerm = (V1TopologySelectorTerm) o;
    return Objects.equals(this.matchLabelExpressions, v1TopologySelectorTerm.matchLabelExpressions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchLabelExpressions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1TopologySelectorTerm {\n");

    sb.append("    matchLabelExpressions: ")
        .append(toIndentedString(matchLabelExpressions))
        .append("\n");
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
