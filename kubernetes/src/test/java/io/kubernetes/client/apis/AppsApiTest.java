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

package io.kubernetes.client.apis;

import io.kubernetes.client.ApiException;
import io.kubernetes.client.models.V1APIGroup;
import org.junit.Ignore;
import org.junit.Test;

/** API tests for AppsApi */
@Ignore
public class AppsApiTest {

  private final AppsApi api = new AppsApi();

  /**
   * get information of a group
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getAPIGroupTest() throws ApiException {
    V1APIGroup response = api.getAPIGroup();

    // TODO: test validations
  }
}
