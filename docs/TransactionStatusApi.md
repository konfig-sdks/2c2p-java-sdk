# TransactionStatusApi

All URIs are relative to *https://sandbox-pgw.2c2p.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**updateTransactionStatus**](TransactionStatusApi.md#updateTransactionStatus) | **POST** /payment/4.3/transactionstatus |  |


<a name="updateTransactionStatus"></a>
# **updateTransactionStatus**
> TransactionStatusResponse updateTransactionStatus().transactionStatusRequest(transactionStatusRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.TwoCTwoP;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransactionStatusApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-pgw.2c2p.com";
    TwoCTwoP client = new TwoCTwoP(configuration);
    String paymentToken = "paymentToken_example";
    Boolean additionalInfo = true;
    String locale = "locale_example";
    UUID clientID = UUID.randomUUID();
    BrowserDetails browserDetails = new BrowserDetails();
    try {
      TransactionStatusResponse result = client
              .transactionStatus
              .updateTransactionStatus(paymentToken)
              .additionalInfo(additionalInfo)
              .locale(locale)
              .clientID(clientID)
              .browserDetails(browserDetails)
              .execute();
      System.out.println(result);
      System.out.println(result.getLocale());
      System.out.println(result.getAdditionalInfo());
      System.out.println(result.getInvoiceNo());
      System.out.println(result.getChannelCode());
      System.out.println(result.getRespCode());
      System.out.println(result.getRespDesc());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionStatusApi#updateTransactionStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TransactionStatusResponse> response = client
              .transactionStatus
              .updateTransactionStatus(paymentToken)
              .additionalInfo(additionalInfo)
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
      System.err.println("Exception when calling TransactionStatusApi#updateTransactionStatus");
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
| **transactionStatusRequest** | [**TransactionStatusRequest**](TransactionStatusRequest.md)|  | [optional] |

### Return type

[**TransactionStatusResponse**](TransactionStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json, application/*+json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

