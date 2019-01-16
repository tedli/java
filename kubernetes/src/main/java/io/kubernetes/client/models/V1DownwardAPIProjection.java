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
 * Represents downward API info for projecting into a projected volume. Note that this is identical
 * to a downwardAPI volume source without the default mode.
 */
@ApiModel(
    description =
        "Represents downward API info for projecting into a projected volume. Note that this is identical to a downwardAPI volume source without the default mode.")
public class V1DownwardAPIProjection {
  @SerializedName("items")
  private List<V1DownwardAPIVolumeFile> items = null;

  public V1DownwardAPIProjection items(List<V1DownwardAPIVolumeFile> items) {
    this.items = items;
    return this;
  }

  public V1DownwardAPIProjection addItemsItem(V1DownwardAPIVolumeFile itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<V1DownwardAPIVolumeFile>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Items is a list of DownwardAPIVolume file
   *
   * @return items
   */
  @ApiModelProperty(value = "Items is a list of DownwardAPIVolume file")
  public List<V1DownwardAPIVolumeFile> getItems() {
    return items;
  }

  public void setItems(List<V1DownwardAPIVolumeFile> items) {
    this.items = items;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1DownwardAPIProjection v1DownwardAPIProjection = (V1DownwardAPIProjection) o;
    return Objects.equals(this.items, v1DownwardAPIProjection.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1DownwardAPIProjection {\n");

    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
