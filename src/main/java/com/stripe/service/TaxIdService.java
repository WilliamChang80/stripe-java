// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.TaxId;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.TaxIdCreateParams;
import com.stripe.param.TaxIdListParams;
import com.stripe.param.TaxIdRetrieveParams;

public final class TaxIdService extends ApiService {
  public TaxIdService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Deletes an existing {@code tax_id} object. */
  public TaxId delete(String customer, String id) throws StripeException {
    return delete(customer, id, (RequestOptions) null);
  }
  /** Deletes an existing {@code tax_id} object. */
  public TaxId delete(String customer, String id, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v1/customers/%s/tax_ids/%s",
            ApiResource.urlEncodeId(customer), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.DELETE, path, null, options, ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, TaxId.class);
  }
  /** Retrieves the {@code tax_id} object with the given identifier. */
  public TaxId retrieve(String customer, String id, TaxIdRetrieveParams params)
      throws StripeException {
    return retrieve(customer, id, params, (RequestOptions) null);
  }
  /** Retrieves the {@code tax_id} object with the given identifier. */
  public TaxId retrieve(String customer, String id, RequestOptions options) throws StripeException {
    return retrieve(customer, id, (TaxIdRetrieveParams) null, options);
  }
  /** Retrieves the {@code tax_id} object with the given identifier. */
  public TaxId retrieve(String customer, String id) throws StripeException {
    return retrieve(customer, id, (TaxIdRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the {@code tax_id} object with the given identifier. */
  public TaxId retrieve(
      String customer, String id, TaxIdRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/customers/%s/tax_ids/%s",
            ApiResource.urlEncodeId(customer), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, TaxId.class);
  }
  /** Returns a list of tax IDs for a customer. */
  public StripeCollection<TaxId> list(String customer, TaxIdListParams params)
      throws StripeException {
    return list(customer, params, (RequestOptions) null);
  }
  /** Returns a list of tax IDs for a customer. */
  public StripeCollection<TaxId> list(String customer, RequestOptions options)
      throws StripeException {
    return list(customer, (TaxIdListParams) null, options);
  }
  /** Returns a list of tax IDs for a customer. */
  public StripeCollection<TaxId> list(String customer) throws StripeException {
    return list(customer, (TaxIdListParams) null, (RequestOptions) null);
  }
  /** Returns a list of tax IDs for a customer. */
  public StripeCollection<TaxId> list(
      String customer, TaxIdListParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/customers/%s/tax_ids", ApiResource.urlEncodeId(customer));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<TaxId>>() {}.getType());
  }
  /** Creates a new {@code tax_id} object for a customer. */
  public TaxId create(String customer, TaxIdCreateParams params) throws StripeException {
    return create(customer, params, (RequestOptions) null);
  }
  /** Creates a new {@code tax_id} object for a customer. */
  public TaxId create(String customer, TaxIdCreateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/customers/%s/tax_ids", ApiResource.urlEncodeId(customer));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, TaxId.class);
  }
}
