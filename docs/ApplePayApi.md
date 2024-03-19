# ApplePayApi

All URIs are relative to *https://sandbox-pgw.2c2p.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**validateMerchant**](ApplePayApi.md#validateMerchant) | **POST** /payment/4.3/applepay/merchantvalidation |  |


<a name="validateMerchant"></a>
# **validateMerchant**
> MerchantValidationApplePayResponse validateMerchant().merchantValidationApplePay(merchantValidationApplePay).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.2C2P;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplePayApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-pgw.2c2p.com";
    2C2P client = new 2C2P(configuration);
    String paymentToken = "paymentToken_example";
    String validationUrl = "validationUrl_example";
    String locale = "locale_example";
    UUID clientID = UUID.randomUUID();
    BrowserDetails browserDetails = new BrowserDetails();
    try {
      MerchantValidationApplePayResponse result = client
              .applePay
              .validateMerchant(paymentToken)
              .validationUrl(validationUrl)
              .locale(locale)
              .clientID(clientID)
              .browserDetails(browserDetails)
              .execute();
      System.out.println(result);
      System.out.println(result.getEpochTimestamp());
      System.out.println(result.getExpiresAt());
      System.out.println(result.getMerchantSessionIdentifier());
      System.out.println(result.getNonce());
      System.out.println(result.getMerchantIdentifier());
      System.out.println(result.getDomainName());
      System.out.println(result.getDisplayName());
      System.out.println(result.getSignature());
      System.out.println(result.getOperationalAnalyticsIdentifier());
      System.out.println(result.getRetries());
      System.out.println(result.getPspId());
      System.out.println(result.getRespCode());
      System.out.println(result.getRespDesc());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplePayApi#validateMerchant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MerchantValidationApplePayResponse> response = client
              .applePay
              .validateMerchant(paymentToken)
              .validationUrl(validationUrl)
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
      System.err.println("Exception when calling ApplePayApi#validateMerchant");
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
| **merchantValidationApplePay** | [**MerchantValidationApplePay**](MerchantValidationApplePay.md)|  | [optional] |

### Return type

[**MerchantValidationApplePayResponse**](MerchantValidationApplePayResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json, application/*+json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

