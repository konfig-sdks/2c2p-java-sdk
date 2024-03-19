# RedirectBackEndApi

All URIs are relative to *https://sandbox-pgw.2c2p.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postPaymentRedirect**](RedirectBackEndApi.md#postPaymentRedirect) | **POST** /payment/4.3/redirectbackend |  |


<a name="postPaymentRedirect"></a>
# **postPaymentRedirect**
> postPaymentRedirect().paymentResponse(paymentResponse).isLeaveApp(isLeaveApp).redirectBackEndPostPaymentRedirectRequest(redirectBackEndPostPaymentRedirectRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.TwoCTwoP;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RedirectBackEndApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-pgw.2c2p.com";
    TwoCTwoP client = new TwoCTwoP(configuration);
    String paymentResponse = "paymentResponse_example";
    String isLeaveApp = "isLeaveApp_example";
    try {
      client
              .redirectBackEnd
              .postPaymentRedirect()
              .paymentResponse(paymentResponse)
              .isLeaveApp(isLeaveApp)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling RedirectBackEndApi#postPaymentRedirect");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .redirectBackEnd
              .postPaymentRedirect()
              .paymentResponse(paymentResponse)
              .isLeaveApp(isLeaveApp)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling RedirectBackEndApi#postPaymentRedirect");
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
| **paymentResponse** | **String**|  | [optional] |
| **isLeaveApp** | **String**|  | [optional] |
| **redirectBackEndPostPaymentRedirectRequest** | [**RedirectBackEndPostPaymentRedirectRequest**](RedirectBackEndPostPaymentRedirectRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

