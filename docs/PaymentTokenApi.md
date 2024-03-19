# PaymentTokenApi

All URIs are relative to *https://sandbox-pgw.2c2p.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateToken**](PaymentTokenApi.md#generateToken) | **POST** /payment/4.3/paymenttoken |  |


<a name="generateToken"></a>
# **generateToken**
> PayloadRequest generateToken().payloadRequest(payloadRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.TwoCTwoP;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentTokenApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-pgw.2c2p.com";
    TwoCTwoP client = new TwoCTwoP(configuration);
    String payload = "payload_example";
    try {
      PayloadRequest result = client
              .paymentToken
              .generateToken()
              .payload(payload)
              .execute();
      System.out.println(result);
      System.out.println(result.getPayload());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentTokenApi#generateToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayloadRequest> response = client
              .paymentToken
              .generateToken()
              .payload(payload)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentTokenApi#generateToken");
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
| **payloadRequest** | [**PayloadRequest**](PayloadRequest.md)|  | [optional] |

### Return type

[**PayloadRequest**](PayloadRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json, application/*+json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

