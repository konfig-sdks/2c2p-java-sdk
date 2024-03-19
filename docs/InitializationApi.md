# InitializationApi

All URIs are relative to *https://sandbox-pgw.2c2p.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**requestCreation**](InitializationApi.md#requestCreation) | **POST** /payment/4.3/initialization |  |


<a name="requestCreation"></a>
# **requestCreation**
> PaymentInitializationResponse requestCreation().execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.TwoCTwoP;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InitializationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-pgw.2c2p.com";
    TwoCTwoP client = new TwoCTwoP(configuration);
    try {
      PaymentInitializationResponse result = client
              .initialization
              .requestCreation()
              .execute();
      System.out.println(result);
      System.out.println(result.getInitialization());
      System.out.println(result.getRespCode());
      System.out.println(result.getRespDesc());
    } catch (ApiException e) {
      System.err.println("Exception when calling InitializationApi#requestCreation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentInitializationResponse> response = client
              .initialization
              .requestCreation()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InitializationApi#requestCreation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PaymentInitializationResponse**](PaymentInitializationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

