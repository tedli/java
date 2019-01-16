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
 * SubjectAccessReviewSpec is a description of the access request. Exactly one of
 * ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
 */
@ApiModel(
    description =
        "SubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set")
public class V1beta1SubjectAccessReviewSpec {
  @SerializedName("extra")
  private Map<String, List<String>> extra = null;

  @SerializedName("group")
  private List<String> group = null;

  @SerializedName("nonResourceAttributes")
  private V1beta1NonResourceAttributes nonResourceAttributes = null;

  @SerializedName("resourceAttributes")
  private V1beta1ResourceAttributes resourceAttributes = null;

  @SerializedName("uid")
  private String uid = null;

  @SerializedName("user")
  private String user = null;

  public V1beta1SubjectAccessReviewSpec extra(Map<String, List<String>> extra) {
    this.extra = extra;
    return this;
  }

  public V1beta1SubjectAccessReviewSpec putExtraItem(String key, List<String> extraItem) {
    if (this.extra == null) {
      this.extra = new HashMap<String, List<String>>();
    }
    this.extra.put(key, extraItem);
    return this;
  }

  /**
   * Extra corresponds to the user.Info.GetExtra() method from the authenticator. Since that is
   * input to the authorizer it needs a reflection here.
   *
   * @return extra
   */
  @ApiModelProperty(
      value =
          "Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer it needs a reflection here.")
  public Map<String, List<String>> getExtra() {
    return extra;
  }

  public void setExtra(Map<String, List<String>> extra) {
    this.extra = extra;
  }

  public V1beta1SubjectAccessReviewSpec group(List<String> group) {
    this.group = group;
    return this;
  }

  public V1beta1SubjectAccessReviewSpec addGroupItem(String groupItem) {
    if (this.group == null) {
      this.group = new ArrayList<String>();
    }
    this.group.add(groupItem);
    return this;
  }

  /**
   * Groups is the groups you&#39;re testing for.
   *
   * @return group
   */
  @ApiModelProperty(value = "Groups is the groups you're testing for.")
  public List<String> getGroup() {
    return group;
  }

  public void setGroup(List<String> group) {
    this.group = group;
  }

  public V1beta1SubjectAccessReviewSpec nonResourceAttributes(
      V1beta1NonResourceAttributes nonResourceAttributes) {
    this.nonResourceAttributes = nonResourceAttributes;
    return this;
  }

  /**
   * NonResourceAttributes describes information for a non-resource access request
   *
   * @return nonResourceAttributes
   */
  @ApiModelProperty(
      value = "NonResourceAttributes describes information for a non-resource access request")
  public V1beta1NonResourceAttributes getNonResourceAttributes() {
    return nonResourceAttributes;
  }

  public void setNonResourceAttributes(V1beta1NonResourceAttributes nonResourceAttributes) {
    this.nonResourceAttributes = nonResourceAttributes;
  }

  public V1beta1SubjectAccessReviewSpec resourceAttributes(
      V1beta1ResourceAttributes resourceAttributes) {
    this.resourceAttributes = resourceAttributes;
    return this;
  }

  /**
   * ResourceAuthorizationAttributes describes information for a resource access request
   *
   * @return resourceAttributes
   */
  @ApiModelProperty(
      value = "ResourceAuthorizationAttributes describes information for a resource access request")
  public V1beta1ResourceAttributes getResourceAttributes() {
    return resourceAttributes;
  }

  public void setResourceAttributes(V1beta1ResourceAttributes resourceAttributes) {
    this.resourceAttributes = resourceAttributes;
  }

  public V1beta1SubjectAccessReviewSpec uid(String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * UID information about the requesting user.
   *
   * @return uid
   */
  @ApiModelProperty(value = "UID information about the requesting user.")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public V1beta1SubjectAccessReviewSpec user(String user) {
    this.user = user;
    return this;
  }

  /**
   * User is the user you&#39;re testing for. If you specify \&quot;User\&quot; but not
   * \&quot;Group\&quot;, then is it interpreted as \&quot;What if User were not a member of any
   * groups
   *
   * @return user
   */
  @ApiModelProperty(
      value =
          "User is the user you're testing for. If you specify \"User\" but not \"Group\", then is it interpreted as \"What if User were not a member of any groups")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1SubjectAccessReviewSpec v1beta1SubjectAccessReviewSpec =
        (V1beta1SubjectAccessReviewSpec) o;
    return Objects.equals(this.extra, v1beta1SubjectAccessReviewSpec.extra)
        && Objects.equals(this.group, v1beta1SubjectAccessReviewSpec.group)
        && Objects.equals(
            this.nonResourceAttributes, v1beta1SubjectAccessReviewSpec.nonResourceAttributes)
        && Objects.equals(
            this.resourceAttributes, v1beta1SubjectAccessReviewSpec.resourceAttributes)
        && Objects.equals(this.uid, v1beta1SubjectAccessReviewSpec.uid)
        && Objects.equals(this.user, v1beta1SubjectAccessReviewSpec.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extra, group, nonResourceAttributes, resourceAttributes, uid, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1SubjectAccessReviewSpec {\n");

    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    nonResourceAttributes: ")
        .append(toIndentedString(nonResourceAttributes))
        .append("\n");
    sb.append("    resourceAttributes: ").append(toIndentedString(resourceAttributes)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
