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

/** ValidatingWebhookConfigurationList is a list of ValidatingWebhookConfiguration. */
@ApiModel(
    description = "ValidatingWebhookConfigurationList is a list of ValidatingWebhookConfiguration.")
public class V1beta1ValidatingWebhookConfigurationList {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("items")
  private List<V1beta1ValidatingWebhookConfiguration> items =
      new ArrayList<V1beta1ValidatingWebhookConfiguration>();

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private V1ListMeta metadata = null;

  public V1beta1ValidatingWebhookConfigurationList apiVersion(String apiVersion) {
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

  public V1beta1ValidatingWebhookConfigurationList items(
      List<V1beta1ValidatingWebhookConfiguration> items) {
    this.items = items;
    return this;
  }

  public V1beta1ValidatingWebhookConfigurationList addItemsItem(
      V1beta1ValidatingWebhookConfiguration itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

  /**
   * List of ValidatingWebhookConfiguration.
   *
   * @return items
   */
  @ApiModelProperty(required = true, value = "List of ValidatingWebhookConfiguration.")
  public List<V1beta1ValidatingWebhookConfiguration> getItems() {
    return items;
  }

  public void setItems(List<V1beta1ValidatingWebhookConfiguration> items) {
    this.items = items;
  }

  public V1beta1ValidatingWebhookConfigurationList kind(String kind) {
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

  public V1beta1ValidatingWebhookConfigurationList metadata(V1ListMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Standard list metadata. More info:
   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
   *
   * @return metadata
   */
  @ApiModelProperty(
      value =
          "Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds")
  public V1ListMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ListMeta metadata) {
    this.metadata = metadata;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1ValidatingWebhookConfigurationList v1beta1ValidatingWebhookConfigurationList =
        (V1beta1ValidatingWebhookConfigurationList) o;
    return Objects.equals(this.apiVersion, v1beta1ValidatingWebhookConfigurationList.apiVersion)
        && Objects.equals(this.items, v1beta1ValidatingWebhookConfigurationList.items)
        && Objects.equals(this.kind, v1beta1ValidatingWebhookConfigurationList.kind)
        && Objects.equals(this.metadata, v1beta1ValidatingWebhookConfigurationList.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, items, kind, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1ValidatingWebhookConfigurationList {\n");

    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
