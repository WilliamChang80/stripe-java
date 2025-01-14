// File generated from our OpenAPI spec
package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.net.RequestOptions;
import java.util.Map;

public interface ExternalAccount extends StripeObjectInterface, HasId {
  ExternalAccount delete(Map<String, Object> params, RequestOptions options) throws StripeException;

  ExternalAccount delete() throws StripeException;

  ExternalAccount delete(RequestOptions options) throws StripeException;

  ExternalAccount delete(Map<String, Object> params) throws StripeException;

  ExternalAccount update(Map<String, Object> params, RequestOptions options) throws StripeException;

  ExternalAccount update(Map<String, Object> params) throws StripeException;
}
