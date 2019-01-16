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
 * RoleBinding references a role, but does not contain it. It can reference a Role in the same
 * namespace or a ClusterRole in the global namespace. It adds who information via Subjects and
 * namespace information by which namespace it exists in. RoleBindings in a given namespace only
 * have effect in that namespace.
 */
@ApiModel(
    description =
        "RoleBinding references a role, but does not contain it.  It can reference a Role in the same namespace or a ClusterRole in the global namespace. It adds who information via Subjects and namespace information by which namespace it exists in.  RoleBindings in a given namespace only have effect in that namespace.")
public class V1alpha1RoleBinding {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private V1ObjectMeta metadata = null;

  @SerializedName("roleRef")
  private V1alpha1RoleRef roleRef = null;

  @SerializedName("subjects")
  private List<V1alpha1Subject> subjects = null;

  public V1alpha1RoleBinding apiVersion(String apiVersion) {
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

  public V1alpha1RoleBinding kind(String kind) {
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

  public V1alpha1RoleBinding metadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Standard object&#39;s metadata.
   *
   * @return metadata
   */
  @ApiModelProperty(value = "Standard object's metadata.")
  public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public V1alpha1RoleBinding roleRef(V1alpha1RoleRef roleRef) {
    this.roleRef = roleRef;
    return this;
  }

  /**
   * RoleRef can reference a Role in the current namespace or a ClusterRole in the global namespace.
   * If the RoleRef cannot be resolved, the Authorizer must return an error.
   *
   * @return roleRef
   */
  @ApiModelProperty(
      required = true,
      value =
          "RoleRef can reference a Role in the current namespace or a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.")
  public V1alpha1RoleRef getRoleRef() {
    return roleRef;
  }

  public void setRoleRef(V1alpha1RoleRef roleRef) {
    this.roleRef = roleRef;
  }

  public V1alpha1RoleBinding subjects(List<V1alpha1Subject> subjects) {
    this.subjects = subjects;
    return this;
  }

  public V1alpha1RoleBinding addSubjectsItem(V1alpha1Subject subjectsItem) {
    if (this.subjects == null) {
      this.subjects = new ArrayList<V1alpha1Subject>();
    }
    this.subjects.add(subjectsItem);
    return this;
  }

  /**
   * Subjects holds references to the objects the role applies to.
   *
   * @return subjects
   */
  @ApiModelProperty(value = "Subjects holds references to the objects the role applies to.")
  public List<V1alpha1Subject> getSubjects() {
    return subjects;
  }

  public void setSubjects(List<V1alpha1Subject> subjects) {
    this.subjects = subjects;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1RoleBinding v1alpha1RoleBinding = (V1alpha1RoleBinding) o;
    return Objects.equals(this.apiVersion, v1alpha1RoleBinding.apiVersion)
        && Objects.equals(this.kind, v1alpha1RoleBinding.kind)
        && Objects.equals(this.metadata, v1alpha1RoleBinding.metadata)
        && Objects.equals(this.roleRef, v1alpha1RoleBinding.roleRef)
        && Objects.equals(this.subjects, v1alpha1RoleBinding.subjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, roleRef, subjects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1RoleBinding {\n");

    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    roleRef: ").append(toIndentedString(roleRef)).append("\n");
    sb.append("    subjects: ").append(toIndentedString(subjects)).append("\n");
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
