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
 * RawExtension is used to hold extensions in external versions. To use this, make a field which has
 * RawExtension as its type in your external, versioned struct, and Object in your internal struct.
 * You also need to register your various plugin types. // Internal package: type MyAPIObject struct
 * { runtime.TypeMeta &#x60;json:\&quot;,inline\&quot;&#x60; MyPlugin runtime.Object
 * &#x60;json:\&quot;myPlugin\&quot;&#x60; } type PluginA struct { AOption string
 * &#x60;json:\&quot;aOption\&quot;&#x60; } // External package: type MyAPIObject struct {
 * runtime.TypeMeta &#x60;json:\&quot;,inline\&quot;&#x60; MyPlugin runtime.RawExtension
 * &#x60;json:\&quot;myPlugin\&quot;&#x60; } type PluginA struct { AOption string
 * &#x60;json:\&quot;aOption\&quot;&#x60; } // On the wire, the JSON will look something like this:
 * { \&quot;kind\&quot;:\&quot;MyAPIObject\&quot;, \&quot;apiVersion\&quot;:\&quot;v1\&quot;,
 * \&quot;myPlugin\&quot;: { \&quot;kind\&quot;:\&quot;PluginA\&quot;,
 * \&quot;aOption\&quot;:\&quot;foo\&quot;, }, } So what happens? Decode first uses json or yaml to
 * unmarshal the serialized data into your external MyAPIObject. That causes the raw JSON to be
 * stored, but not unpacked. The next step is to copy (using pkg/conversion) into the internal
 * struct. The runtime package&#39;s DefaultScheme has conversion functions installed which will
 * unpack the JSON stored in RawExtension, turning it into the correct object type, and storing it
 * in the Object. (TODO: In the case where the object is of an unknown type, a runtime.Unknown
 * object will be created and stored.)
 */
@ApiModel(
    description =
        "RawExtension is used to hold extensions in external versions.  To use this, make a field which has RawExtension as its type in your external, versioned struct, and Object in your internal struct. You also need to register your various plugin types.  // Internal package: type MyAPIObject struct {  runtime.TypeMeta `json:\",inline\"`  MyPlugin runtime.Object `json:\"myPlugin\"` } type PluginA struct {  AOption string `json:\"aOption\"` }  // External package: type MyAPIObject struct {  runtime.TypeMeta `json:\",inline\"`  MyPlugin runtime.RawExtension `json:\"myPlugin\"` } type PluginA struct {  AOption string `json:\"aOption\"` }  // On the wire, the JSON will look something like this: {  \"kind\":\"MyAPIObject\",  \"apiVersion\":\"v1\",  \"myPlugin\": {   \"kind\":\"PluginA\",   \"aOption\":\"foo\",  }, }  So what happens? Decode first uses json or yaml to unmarshal the serialized data into your external MyAPIObject. That causes the raw JSON to be stored, but not unpacked. The next step is to copy (using pkg/conversion) into the internal struct. The runtime package's DefaultScheme has conversion functions installed which will unpack the JSON stored in RawExtension, turning it into the correct object type, and storing it in the Object. (TODO: In the case where the object is of an unknown type, a runtime.Unknown object will be created and stored.)")
public class RuntimeRawExtension {
  @SerializedName("Raw")
  private byte[] raw = null;

  public RuntimeRawExtension raw(byte[] raw) {
    this.raw = raw;
    return this;
  }

  /**
   * Raw is the underlying serialization of this object.
   *
   * @return raw
   */
  @ApiModelProperty(required = true, value = "Raw is the underlying serialization of this object.")
  public byte[] getRaw() {
    return raw;
  }

  public void setRaw(byte[] raw) {
    this.raw = raw;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuntimeRawExtension runtimeRawExtension = (RuntimeRawExtension) o;
    return Objects.equals(this.raw, runtimeRawExtension.raw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(raw);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuntimeRawExtension {\n");

    sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
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
