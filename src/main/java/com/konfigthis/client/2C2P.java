package com.konfigthis.client;

import com.konfigthis.client.api.ApplePayApi;
import com.konfigthis.client.api.CacheApi;
import com.konfigthis.client.api.CancelTransactionApi;
import com.konfigthis.client.api.CardInstallmentPlanInfoApi;
import com.konfigthis.client.api.CardTokenInfoApi;
import com.konfigthis.client.api.ExchangeRateApi;
import com.konfigthis.client.api.InitializationApi;
import com.konfigthis.client.api.LoyaltyPointInfoApi;
import com.konfigthis.client.api.PaymentApi;
import com.konfigthis.client.api.PaymentInquiryApi;
import com.konfigthis.client.api.PaymentInstructionApi;
import com.konfigthis.client.api.PaymentNotificationApi;
import com.konfigthis.client.api.PaymentOptionApi;
import com.konfigthis.client.api.PaymentOptionDetailsApi;
import com.konfigthis.client.api.PaymentSimulateApi;
import com.konfigthis.client.api.PaymentTokenApi;
import com.konfigthis.client.api.RedirectBackEndApi;
import com.konfigthis.client.api.RedirectFrontEndApi;
import com.konfigthis.client.api.TransactionStatusApi;
import com.konfigthis.client.api.UserPreferenceApi;

public class 2C2P {
    private ApiClient apiClient;
    public final ApplePayApi applePay;
    public final CacheApi cache;
    public final CancelTransactionApi cancelTransaction;
    public final CardInstallmentPlanInfoApi cardInstallmentPlanInfo;
    public final CardTokenInfoApi cardTokenInfo;
    public final ExchangeRateApi exchangeRate;
    public final InitializationApi initialization;
    public final LoyaltyPointInfoApi loyaltyPointInfo;
    public final PaymentApi payment;
    public final PaymentInquiryApi paymentInquiry;
    public final PaymentInstructionApi paymentInstruction;
    public final PaymentNotificationApi paymentNotification;
    public final PaymentOptionApi paymentOption;
    public final PaymentOptionDetailsApi paymentOptionDetails;
    public final PaymentSimulateApi paymentSimulate;
    public final PaymentTokenApi paymentToken;
    public final RedirectBackEndApi redirectBackEnd;
    public final RedirectFrontEndApi redirectFrontEnd;
    public final TransactionStatusApi transactionStatus;
    public final UserPreferenceApi userPreference;

    public 2C2P() {
        this(null);
    }

    public 2C2P(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.applePay = new ApplePayApi(this.apiClient);
        this.cache = new CacheApi(this.apiClient);
        this.cancelTransaction = new CancelTransactionApi(this.apiClient);
        this.cardInstallmentPlanInfo = new CardInstallmentPlanInfoApi(this.apiClient);
        this.cardTokenInfo = new CardTokenInfoApi(this.apiClient);
        this.exchangeRate = new ExchangeRateApi(this.apiClient);
        this.initialization = new InitializationApi(this.apiClient);
        this.loyaltyPointInfo = new LoyaltyPointInfoApi(this.apiClient);
        this.payment = new PaymentApi(this.apiClient);
        this.paymentInquiry = new PaymentInquiryApi(this.apiClient);
        this.paymentInstruction = new PaymentInstructionApi(this.apiClient);
        this.paymentNotification = new PaymentNotificationApi(this.apiClient);
        this.paymentOption = new PaymentOptionApi(this.apiClient);
        this.paymentOptionDetails = new PaymentOptionDetailsApi(this.apiClient);
        this.paymentSimulate = new PaymentSimulateApi(this.apiClient);
        this.paymentToken = new PaymentTokenApi(this.apiClient);
        this.redirectBackEnd = new RedirectBackEndApi(this.apiClient);
        this.redirectFrontEnd = new RedirectFrontEndApi(this.apiClient);
        this.transactionStatus = new TransactionStatusApi(this.apiClient);
        this.userPreference = new UserPreferenceApi(this.apiClient);
    }

}
