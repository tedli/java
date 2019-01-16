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

/** A StatefulSetSpec is the specification of a StatefulSet. */
@ApiModel(description = "A StatefulSetSpec is the specification of a StatefulSet.")
public class V1beta2StatefulSetSpec {
  @SerializedName("podManagementPolicy")
  private String podManagementPolicy = null;

  @SerializedName("replicas")
  private Integer replicas = null;

  @SerializedName("revisionHistoryLimit")
  private Integer revisionHistoryLimit = null;

  @SerializedName("selector")
  private V1LabelSelector selector = null;

  @SerializedName("serviceName")
  private String serviceName = null;

  @SerializedName("template")
  private V1PodTemplateSpec template = null;

  @SerializedName("updateStrategy")
  private V1beta2StatefulSetUpdateStrategy updateStrategy = null;

  @SerializedName("volumeClaimTemplates")
  private List<V1PersistentVolumeClaim> volumeClaimTemplates = null;

  public V1beta2StatefulSetSpec podManagementPolicy(String podManagementPolicy) {
    this.podManagementPolicy = podManagementPolicy;
    return this;
  }

  /**
   * podManagementPolicy controls how pods are created during initial scale up, when replacing pods
   * on nodes, or when scaling down. The default policy is &#x60;OrderedReady&#x60;, where pods are
   * created in increasing order (pod-0, then pod-1, etc) and the controller will wait until each
   * pod is ready before continuing. When scaling down, the pods are removed in the opposite order.
   * The alternative policy is &#x60;Parallel&#x60; which will create pods in parallel to match the
   * desired scale without waiting, and on scale down will delete all pods at once.
   *
   * @return podManagementPolicy
   */
  @ApiModelProperty(
      value =
          "podManagementPolicy controls how pods are created during initial scale up, when replacing pods on nodes, or when scaling down. The default policy is `OrderedReady`, where pods are created in increasing order (pod-0, then pod-1, etc) and the controller will wait until each pod is ready before continuing. When scaling down, the pods are removed in the opposite order. The alternative policy is `Parallel` which will create pods in parallel to match the desired scale without waiting, and on scale down will delete all pods at once.")
  public String getPodManagementPolicy() {
    return podManagementPolicy;
  }

  public void setPodManagementPolicy(String podManagementPolicy) {
    this.podManagementPolicy = podManagementPolicy;
  }

  public V1beta2StatefulSetSpec replicas(Integer replicas) {
    this.replicas = replicas;
    return this;
  }

  /**
   * replicas is the desired number of replicas of the given Template. These are replicas in the
   * sense that they are instantiations of the same Template, but individual replicas also have a
   * consistent identity. If unspecified, defaults to 1.
   *
   * @return replicas
   */
  @ApiModelProperty(
      value =
          "replicas is the desired number of replicas of the given Template. These are replicas in the sense that they are instantiations of the same Template, but individual replicas also have a consistent identity. If unspecified, defaults to 1.")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }

  public V1beta2StatefulSetSpec revisionHistoryLimit(Integer revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
    return this;
  }

  /**
   * revisionHistoryLimit is the maximum number of revisions that will be maintained in the
   * StatefulSet&#39;s revision history. The revision history consists of all revisions not
   * represented by a currently applied StatefulSetSpec version. The default value is 10.
   *
   * @return revisionHistoryLimit
   */
  @ApiModelProperty(
      value =
          "revisionHistoryLimit is the maximum number of revisions that will be maintained in the StatefulSet's revision history. The revision history consists of all revisions not represented by a currently applied StatefulSetSpec version. The default value is 10.")
  public Integer getRevisionHistoryLimit() {
    return revisionHistoryLimit;
  }

  public void setRevisionHistoryLimit(Integer revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
  }

  public V1beta2StatefulSetSpec selector(V1LabelSelector selector) {
    this.selector = selector;
    return this;
  }

  /**
   * selector is a label query over pods that should match the replica count. It must match the pod
   * template&#39;s labels. More info:
   * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
   *
   * @return selector
   */
  @ApiModelProperty(
      required = true,
      value =
          "selector is a label query over pods that should match the replica count. It must match the pod template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors")
  public V1LabelSelector getSelector() {
    return selector;
  }

  public void setSelector(V1LabelSelector selector) {
    this.selector = selector;
  }

  public V1beta2StatefulSetSpec serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * serviceName is the name of the service that governs this StatefulSet. This service must exist
   * before the StatefulSet, and is responsible for the network identity of the set. Pods get
   * DNS/hostnames that follow the pattern:
   * pod-specific-string.serviceName.default.svc.cluster.local where
   * \&quot;pod-specific-string\&quot; is managed by the StatefulSet controller.
   *
   * @return serviceName
   */
  @ApiModelProperty(
      required = true,
      value =
          "serviceName is the name of the service that governs this StatefulSet. This service must exist before the StatefulSet, and is responsible for the network identity of the set. Pods get DNS/hostnames that follow the pattern: pod-specific-string.serviceName.default.svc.cluster.local where \"pod-specific-string\" is managed by the StatefulSet controller.")
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public V1beta2StatefulSetSpec template(V1PodTemplateSpec template) {
    this.template = template;
    return this;
  }

  /**
   * template is the object that describes the pod that will be created if insufficient replicas are
   * detected. Each pod stamped out by the StatefulSet will fulfill this Template, but have a unique
   * identity from the rest of the StatefulSet.
   *
   * @return template
   */
  @ApiModelProperty(
      required = true,
      value =
          "template is the object that describes the pod that will be created if insufficient replicas are detected. Each pod stamped out by the StatefulSet will fulfill this Template, but have a unique identity from the rest of the StatefulSet.")
  public V1PodTemplateSpec getTemplate() {
    return template;
  }

  public void setTemplate(V1PodTemplateSpec template) {
    this.template = template;
  }

  public V1beta2StatefulSetSpec updateStrategy(V1beta2StatefulSetUpdateStrategy updateStrategy) {
    this.updateStrategy = updateStrategy;
    return this;
  }

  /**
   * updateStrategy indicates the StatefulSetUpdateStrategy that will be employed to update Pods in
   * the StatefulSet when a revision is made to Template.
   *
   * @return updateStrategy
   */
  @ApiModelProperty(
      value =
          "updateStrategy indicates the StatefulSetUpdateStrategy that will be employed to update Pods in the StatefulSet when a revision is made to Template.")
  public V1beta2StatefulSetUpdateStrategy getUpdateStrategy() {
    return updateStrategy;
  }

  public void setUpdateStrategy(V1beta2StatefulSetUpdateStrategy updateStrategy) {
    this.updateStrategy = updateStrategy;
  }

  public V1beta2StatefulSetSpec volumeClaimTemplates(
      List<V1PersistentVolumeClaim> volumeClaimTemplates) {
    this.volumeClaimTemplates = volumeClaimTemplates;
    return this;
  }

  public V1beta2StatefulSetSpec addVolumeClaimTemplatesItem(
      V1PersistentVolumeClaim volumeClaimTemplatesItem) {
    if (this.volumeClaimTemplates == null) {
      this.volumeClaimTemplates = new ArrayList<V1PersistentVolumeClaim>();
    }
    this.volumeClaimTemplates.add(volumeClaimTemplatesItem);
    return this;
  }

  /**
   * volumeClaimTemplates is a list of claims that pods are allowed to reference. The StatefulSet
   * controller is responsible for mapping network identities to claims in a way that maintains the
   * identity of a pod. Every claim in this list must have at least one matching (by name)
   * volumeMount in one container in the template. A claim in this list takes precedence over any
   * volumes in the template, with the same name.
   *
   * @return volumeClaimTemplates
   */
  @ApiModelProperty(
      value =
          "volumeClaimTemplates is a list of claims that pods are allowed to reference. The StatefulSet controller is responsible for mapping network identities to claims in a way that maintains the identity of a pod. Every claim in this list must have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence over any volumes in the template, with the same name.")
  public List<V1PersistentVolumeClaim> getVolumeClaimTemplates() {
    return volumeClaimTemplates;
  }

  public void setVolumeClaimTemplates(List<V1PersistentVolumeClaim> volumeClaimTemplates) {
    this.volumeClaimTemplates = volumeClaimTemplates;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta2StatefulSetSpec v1beta2StatefulSetSpec = (V1beta2StatefulSetSpec) o;
    return Objects.equals(this.podManagementPolicy, v1beta2StatefulSetSpec.podManagementPolicy)
        && Objects.equals(this.replicas, v1beta2StatefulSetSpec.replicas)
        && Objects.equals(this.revisionHistoryLimit, v1beta2StatefulSetSpec.revisionHistoryLimit)
        && Objects.equals(this.selector, v1beta2StatefulSetSpec.selector)
        && Objects.equals(this.serviceName, v1beta2StatefulSetSpec.serviceName)
        && Objects.equals(this.template, v1beta2StatefulSetSpec.template)
        && Objects.equals(this.updateStrategy, v1beta2StatefulSetSpec.updateStrategy)
        && Objects.equals(this.volumeClaimTemplates, v1beta2StatefulSetSpec.volumeClaimTemplates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        podManagementPolicy,
        replicas,
        revisionHistoryLimit,
        selector,
        serviceName,
        template,
        updateStrategy,
        volumeClaimTemplates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2StatefulSetSpec {\n");

    sb.append("    podManagementPolicy: ")
        .append(toIndentedString(podManagementPolicy))
        .append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    revisionHistoryLimit: ")
        .append(toIndentedString(revisionHistoryLimit))
        .append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    updateStrategy: ").append(toIndentedString(updateStrategy)).append("\n");
    sb.append("    volumeClaimTemplates: ")
        .append(toIndentedString(volumeClaimTemplates))
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
