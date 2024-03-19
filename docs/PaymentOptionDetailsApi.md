# PaymentOptionDetailsApi

All URIs are relative to *https://sandbox-pgw.2c2p.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postOptionDetails**](PaymentOptionDetailsApi.md#postOptionDetails) | **POST** /payment/4.3/paymentoptiondetails |  |


<a name="postOptionDetails"></a>
# **postOptionDetails**
> PaymentOptionDetailsResponse postOptionDetails().paymentOptionDetailsRequest(paymentOptionDetailsRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.2C2P;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentOptionDetailsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-pgw.2c2p.com";
    2C2P client = new 2C2P(configuration);
    String categoryCode = "categoryCode_example";
    String groupCode = "groupCode_example";
    String paymentToken = "paymentToken_example";
    String locale = "locale_example";
    UUID clientID = UUID.randomUUID();
    BrowserDetails browserDetails = new BrowserDetails();
    try {
      PaymentOptionDetailsResponse result = client
              .paymentOptionDetails
              .postOptionDetails(categoryCode, groupCode, paymentToken)
              .locale(locale)
              .clientID(clientID)
              .browserDetails(browserDetails)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotalChannel());
      System.out.println(result.getName());
      System.out.println(result.getCategoryCode());
      System.out.println(result.getGroupCode());
      System.out.println(result.getIconUrl());
      System.out.println(result.getChannels());
      System.out.println(result.getValidation());
      System.out.println(result.getConfiguration());
      System.out.println(result.getRespCode());
      System.out.println(result.getRespDesc());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentOptionDetailsApi#postOptionDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentOptionDetailsResponse> response = client
              .paymentOptionDetails
              .postOptionDetails(categoryCode, groupCode, paymentToken)
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
      System.err.println("Exception when calling PaymentOptionDetailsApi#postOptionDetails");
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
| **paymentOptionDetailsRequest** | [**PaymentOptionDetailsRequest**](PaymentOptionDetailsRequest.md)|  | [optional] |

### Return type

[**PaymentOptionDetailsResponse**](PaymentOptionDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json, application/*+json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

