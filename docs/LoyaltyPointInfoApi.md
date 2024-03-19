# LoyaltyPointInfoApi

All URIs are relative to *https://sandbox-pgw.2c2p.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postLoyaltyPointInfo**](LoyaltyPointInfoApi.md#postLoyaltyPointInfo) | **POST** /payment/4.3/loyaltypointinfo |  |


<a name="postLoyaltyPointInfo"></a>
# **postLoyaltyPointInfo**
> PaymentLoyaltyPointInfoResponse postLoyaltyPointInfo().paymentLoyaltyPointInfoRequest(paymentLoyaltyPointInfoRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.2C2P;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LoyaltyPointInfoApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-pgw.2c2p.com";
    2C2P client = new 2C2P(configuration);
    String paymentToken = "paymentToken_example";
    String providerID = "providerID_example";
    String profileID = "profileID_example";
    String referenceID = "referenceID_example";
    String cardNo = "cardNo_example";
    String expiryMonth = "expiryMonth_example";
    String expiryYear = "expiryYear_example";
    String locale = "locale_example";
    UUID clientID = UUID.randomUUID();
    BrowserDetails browserDetails = new BrowserDetails();
    try {
      PaymentLoyaltyPointInfoResponse result = client
              .loyaltyPointInfo
              .postLoyaltyPointInfo(paymentToken)
              .providerID(providerID)
              .profileID(profileID)
              .referenceID(referenceID)
              .cardNo(cardNo)
              .expiryMonth(expiryMonth)
              .expiryYear(expiryYear)
              .locale(locale)
              .clientID(clientID)
              .browserDetails(browserDetails)
              .execute();
      System.out.println(result);
      System.out.println(result.getPaymentToken());
      System.out.println(result.getProviderID());
      System.out.println(result.getProviderName());
      System.out.println(result.getReferenceID());
      System.out.println(result.getProviderType());
      System.out.println(result.getTerms());
      System.out.println(result.getRewards());
      System.out.println(result.getRespCode());
      System.out.println(result.getRespDesc());
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltyPointInfoApi#postLoyaltyPointInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentLoyaltyPointInfoResponse> response = client
              .loyaltyPointInfo
              .postLoyaltyPointInfo(paymentToken)
              .providerID(providerID)
              .profileID(profileID)
              .referenceID(referenceID)
              .cardNo(cardNo)
              .expiryMonth(expiryMonth)
              .expiryYear(expiryYear)
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
      System.err.println("Exception when calling LoyaltyPointInfoApi#postLoyaltyPointInfo");
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
| **paymentLoyaltyPointInfoRequest** | [**PaymentLoyaltyPointInfoRequest**](PaymentLoyaltyPointInfoRequest.md)|  | [optional] |

### Return type

[**PaymentLoyaltyPointInfoResponse**](PaymentLoyaltyPointInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json, application/*+json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

