# RedirectFrontEndApi

All URIs are relative to *https://sandbox-pgw.2c2p.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postPaymentRedirect**](RedirectFrontEndApi.md#postPaymentRedirect) | **POST** /payment/4.3/redirectfrontend |  |


<a name="postPaymentRedirect"></a>
# **postPaymentRedirect**
> postPaymentRedirect().payResponse(payResponse).isLeaveApp(isLeaveApp).redirectFrontEndPostPaymentRedirectRequest(redirectFrontEndPostPaymentRedirectRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.2C2P;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RedirectFrontEndApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-pgw.2c2p.com";
    2C2P client = new 2C2P(configuration);
    String payResponse = "payResponse_example";
    String isLeaveApp = "isLeaveApp_example";
    try {
      client
              .redirectFrontEnd
              .postPaymentRedirect()
              .payResponse(payResponse)
              .isLeaveApp(isLeaveApp)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling RedirectFrontEndApi#postPaymentRedirect");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .redirectFrontEnd
              .postPaymentRedirect()
              .payResponse(payResponse)
              .isLeaveApp(isLeaveApp)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling RedirectFrontEndApi#postPaymentRedirect");
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
| **payResponse** | **String**|  | [optional] |
| **isLeaveApp** | **String**|  | [optional] |
| **redirectFrontEndPostPaymentRedirectRequest** | [**RedirectFrontEndPostPaymentRedirectRequest**](RedirectFrontEndPostPaymentRedirectRequest.md)|  | [optional] |

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

