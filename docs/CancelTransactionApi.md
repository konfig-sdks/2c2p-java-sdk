# CancelTransactionApi

All URIs are relative to *https://sandbox-pgw.2c2p.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**post**](CancelTransactionApi.md#post) | **POST** /payment/4.3/canceltransaction |  |


<a name="post"></a>
# **post**
> PaymentNonRedirectResponse post().paymentBaseRequest(paymentBaseRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.TwoCTwoP;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CancelTransactionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-pgw.2c2p.com";
    TwoCTwoP client = new TwoCTwoP(configuration);
    String paymentToken = "paymentToken_example";
    String locale = "locale_example";
    UUID clientID = UUID.randomUUID();
    BrowserDetails browserDetails = new BrowserDetails();
    try {
      PaymentNonRedirectResponse result = client
              .cancelTransaction
              .post(paymentToken)
              .locale(locale)
              .clientID(clientID)
              .browserDetails(browserDetails)
              .execute();
      System.out.println(result);
      System.out.println(result.getInvoiceNo());
      System.out.println(result.getChannelCode());
      System.out.println(result.getRespCode());
      System.out.println(result.getRespDesc());
    } catch (ApiException e) {
      System.err.println("Exception when calling CancelTransactionApi#post");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentNonRedirectResponse> response = client
              .cancelTransaction
              .post(paymentToken)
              .locale(locale)
              .clientID(clientID)
              .browserDetails(browserDetails)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CancelTransactionApi#post");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **paymentBaseRequest** | [**PaymentBaseRequest**](PaymentBaseRequest.md)|  | [optional] |

### Return type

[**PaymentNonRedirectResponse**](PaymentNonRedirectResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json, application/*+json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

