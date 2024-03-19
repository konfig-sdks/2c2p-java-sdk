<div align="center">

[![Visit 2c2p](./header.png)](https://2c2p.com&#x2F;)

# [2c2p](https://2c2p.com&#x2F;)

Rest API for PGW payment purpose - LATEST

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=2C2P&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>2c2p-java-sdk</artifactId>
  <version>4.3</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:2c2p-java-sdk:4.3"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/2c2p-java-sdk-4.3.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://sandbox-pgw.2c2p.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApplePayApi* | [**validateMerchant**](docs/ApplePayApi.md#validateMerchant) | **POST** /payment/4.3/applepay/merchantvalidation | 
*CacheApi* | [**cleanCache**](docs/CacheApi.md#cleanCache) | **POST** /payment/4.3/cache/cleancache | 
*CancelTransactionApi* | [**post**](docs/CancelTransactionApi.md#post) | **POST** /payment/4.3/canceltransaction | 
*CardInstallmentPlanInfoApi* | [**create**](docs/CardInstallmentPlanInfoApi.md#create) | **POST** /payment/4.3/cardinstallmentplaninfo | 
*CardTokenInfoApi* | [**getCardTokenInfo**](docs/CardTokenInfoApi.md#getCardTokenInfo) | **POST** /payment/4.3/cardtokeninfo | 
*ExchangeRateApi* | [**apmMcc**](docs/ExchangeRateApi.md#apmMcc) | **POST** /payment/4.3/exchangerate/apmmccexchangerate | APM MCC Exchange Rate
*ExchangeRateApi* | [**getRate**](docs/ExchangeRateApi.md#getRate) | **POST** /payment/4.3/exchangerate | 
*ExchangeRateApi* | [**requestEndpoint**](docs/ExchangeRateApi.md#requestEndpoint) | **POST** /payment/4.3/exchangerate/secure | JWT Request Endpoint
*InitializationApi* | [**requestCreation**](docs/InitializationApi.md#requestCreation) | **POST** /payment/4.3/initialization | 
*LoyaltyPointInfoApi* | [**postLoyaltyPointInfo**](docs/LoyaltyPointInfoApi.md#postLoyaltyPointInfo) | **POST** /payment/4.3/loyaltypointinfo | 
*PaymentApi* | [**createPayment**](docs/PaymentApi.md#createPayment) | **POST** /payment/4.3/payment | 
*PaymentInquiryApi* | [**postPaymentDetails**](docs/PaymentInquiryApi.md#postPaymentDetails) | **POST** /payment/4.3/paymentinquiry | 
*PaymentInstructionApi* | [**submitInstruction**](docs/PaymentInstructionApi.md#submitInstruction) | **POST** /payment/4.3/paymentinstruction | 
*PaymentNotificationApi* | [**processNotification**](docs/PaymentNotificationApi.md#processNotification) | **POST** /payment/4.3/paymentnotification | 
*PaymentOptionApi* | [**createPaymentOption**](docs/PaymentOptionApi.md#createPaymentOption) | **POST** /payment/4.3/paymentoption | 
*PaymentOptionDetailsApi* | [**postOptionDetails**](docs/PaymentOptionDetailsApi.md#postOptionDetails) | **POST** /payment/4.3/paymentoptiondetails | 
*PaymentSimulateApi* | [**executePaymentSimulation**](docs/PaymentSimulateApi.md#executePaymentSimulation) | **POST** /payment/4.3/paymentsimulate | 
*PaymentTokenApi* | [**generateToken**](docs/PaymentTokenApi.md#generateToken) | **POST** /payment/4.3/paymenttoken | 
*RedirectBackEndApi* | [**postPaymentRedirect**](docs/RedirectBackEndApi.md#postPaymentRedirect) | **POST** /payment/4.3/redirectbackend | 
*RedirectFrontEndApi* | [**postPaymentRedirect**](docs/RedirectFrontEndApi.md#postPaymentRedirect) | **POST** /payment/4.3/redirectfrontend | 
*TransactionStatusApi* | [**updateTransactionStatus**](docs/TransactionStatusApi.md#updateTransactionStatus) | **POST** /payment/4.3/transactionstatus | 
*UserPreferenceApi* | [**saveUserPreference**](docs/UserPreferenceApi.md#saveUserPreference) | **POST** /payment/4.3/userpreference | 


## Documentation for Models

 - [Address](docs/Address.md)
 - [BrowserDetails](docs/BrowserDetails.md)
 - [CardInstallmentPlanInfoRequest](docs/CardInstallmentPlanInfoRequest.md)
 - [CreditCardTokenV43](docs/CreditCardTokenV43.md)
 - [CurrencyAPMMCCFxRate](docs/CurrencyAPMMCCFxRate.md)
 - [CurrencyFxRate](docs/CurrencyFxRate.md)
 - [CustomerAddress](docs/CustomerAddress.md)
 - [IppPlan](docs/IppPlan.md)
 - [Locale](docs/Locale.md)
 - [LoyaltyDetails](docs/LoyaltyDetails.md)
 - [LoyaltyRewards](docs/LoyaltyRewards.md)
 - [MerchantConfiguration](docs/MerchantConfiguration.md)
 - [MerchantConfigurationNotification](docs/MerchantConfigurationNotification.md)
 - [MerchantConfigurationPayment](docs/MerchantConfigurationPayment.md)
 - [MerchantConfigurationPaymentFx](docs/MerchantConfigurationPaymentFx.md)
 - [MerchantConfigurationPaymentFxRate](docs/MerchantConfigurationPaymentFxRate.md)
 - [MerchantDetails](docs/MerchantDetails.md)
 - [MerchantValidationApplePay](docs/MerchantValidationApplePay.md)
 - [MerchantValidationApplePayResponse](docs/MerchantValidationApplePayResponse.md)
 - [PayloadRequest](docs/PayloadRequest.md)
 - [PaymentApmMccExchangeRateResponse](docs/PaymentApmMccExchangeRateResponse.md)
 - [PaymentBaseRequest](docs/PaymentBaseRequest.md)
 - [PaymentCardTokenResponseV43](docs/PaymentCardTokenResponseV43.md)
 - [PaymentChannelCategory](docs/PaymentChannelCategory.md)
 - [PaymentChannelPreference](docs/PaymentChannelPreference.md)
 - [PaymentExchangeRateConverterRequest](docs/PaymentExchangeRateConverterRequest.md)
 - [PaymentExchangeRateConverterResponse](docs/PaymentExchangeRateConverterResponse.md)
 - [PaymentInitialization](docs/PaymentInitialization.md)
 - [PaymentInitializationResponse](docs/PaymentInitializationResponse.md)
 - [PaymentItem](docs/PaymentItem.md)
 - [PaymentLoyaltyPointInfoRequest](docs/PaymentLoyaltyPointInfoRequest.md)
 - [PaymentLoyaltyPointInfoResponse](docs/PaymentLoyaltyPointInfoResponse.md)
 - [PaymentLoyaltyReward](docs/PaymentLoyaltyReward.md)
 - [PaymentNonRedirectResponse](docs/PaymentNonRedirectResponse.md)
 - [PaymentNotificationRequest](docs/PaymentNotificationRequest.md)
 - [PaymentOptionDetailsChannel](docs/PaymentOptionDetailsChannel.md)
 - [PaymentOptionDetailsCustomData](docs/PaymentOptionDetailsCustomData.md)
 - [PaymentOptionDetailsInfo](docs/PaymentOptionDetailsInfo.md)
 - [PaymentOptionDetailsInfoProvider](docs/PaymentOptionDetailsInfoProvider.md)
 - [PaymentOptionDetailsPayment](docs/PaymentOptionDetailsPayment.md)
 - [PaymentOptionDetailsPaymentCode](docs/PaymentOptionDetailsPaymentCode.md)
 - [PaymentOptionDetailsRequest](docs/PaymentOptionDetailsRequest.md)
 - [PaymentOptionDetailsResponse](docs/PaymentOptionDetailsResponse.md)
 - [PaymentOptionDetailsValidation](docs/PaymentOptionDetailsValidation.md)
 - [PaymentOptionDetailsValidationCard](docs/PaymentOptionDetailsValidationCard.md)
 - [PaymentOptionDetailsValidationCardType](docs/PaymentOptionDetailsValidationCardType.md)
 - [PaymentOptionResponse](docs/PaymentOptionResponse.md)
 - [PaymentParamsDataRequestV43](docs/PaymentParamsDataRequestV43.md)
 - [PaymentParamsRequestV43](docs/PaymentParamsRequestV43.md)
 - [PaymentRequestV43](docs/PaymentRequestV43.md)
 - [PaymentResponse](docs/PaymentResponse.md)
 - [PaymentResponseBase](docs/PaymentResponseBase.md)
 - [PaymentUserPreference](docs/PaymentUserPreference.md)
 - [PaymentUserPreferenceResponse](docs/PaymentUserPreferenceResponse.md)
 - [PodInfoProviderMerchantDetails](docs/PodInfoProviderMerchantDetails.md)
 - [PodInfoProviderTransactionDetails](docs/PodInfoProviderTransactionDetails.md)
 - [Recurring](docs/Recurring.md)
 - [RedirectBackEndPostPaymentRedirectRequest](docs/RedirectBackEndPostPaymentRedirectRequest.md)
 - [RedirectFrontEndPostPaymentRedirectRequest](docs/RedirectFrontEndPostPaymentRedirectRequest.md)
 - [ResponsePaymentChannel](docs/ResponsePaymentChannel.md)
 - [TransactionDetails](docs/TransactionDetails.md)
 - [TransactionStatusAdditionalInfo](docs/TransactionStatusAdditionalInfo.md)
 - [TransactionStatusInfo](docs/TransactionStatusInfo.md)
 - [TransactionStatusLoyaltyInfo](docs/TransactionStatusLoyaltyInfo.md)
 - [TransactionStatusMerchant](docs/TransactionStatusMerchant.md)
 - [TransactionStatusPayment](docs/TransactionStatusPayment.md)
 - [TransactionStatusRequest](docs/TransactionStatusRequest.md)
 - [TransactionStatusResponse](docs/TransactionStatusResponse.md)
 - [TransactionStatusRewards](docs/TransactionStatusRewards.md)
 - [UserDetails](docs/UserDetails.md)
 - [UserPreference](docs/UserPreference.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
