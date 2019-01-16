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
import io.kubernetes.client.models.V1APIResourceList;
import io.kubernetes.client.models.V1TokenReview;
import org.junit.Ignore;
import org.junit.Test;

/** API tests for AuthenticationV1Api */
@Ignore
public class AuthenticationV1ApiTest {

  private final AuthenticationV1Api api = new AuthenticationV1Api();

  /**
   * create a TokenReview
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void createTokenReviewTest() throws ApiException {
    V1TokenReview body = null;
    String dryRun = null;
    Boolean includeUninitialized = null;
    String pretty = null;
    V1TokenReview response = api.createTokenReview(body, dryRun, includeUninitialized, pretty);

    // TODO: test validations
  }

  /**
   * get available resources
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getAPIResourcesTest() throws ApiException {
    V1APIResourceList response = api.getAPIResources();

    // TODO: test validations
  }
}
