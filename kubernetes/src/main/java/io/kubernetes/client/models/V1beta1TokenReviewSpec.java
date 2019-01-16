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

/** TokenReviewSpec is a description of the token authentication request. */
@ApiModel(description = "TokenReviewSpec is a description of the token authentication request.")
public class V1beta1TokenReviewSpec {
  @SerializedName("token")
  private String token = null;

  public V1beta1TokenReviewSpec token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Token is the opaque bearer token.
   *
   * @return token
   */
  @ApiModelProperty(value = "Token is the opaque bearer token.")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1TokenReviewSpec v1beta1TokenReviewSpec = (V1beta1TokenReviewSpec) o;
    return Objects.equals(this.token, v1beta1TokenReviewSpec.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1TokenReviewSpec {\n");

    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
