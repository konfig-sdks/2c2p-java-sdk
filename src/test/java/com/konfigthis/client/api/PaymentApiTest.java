/*
 * PGW Payment API 4.3
 * Rest API for PGW payment purpose - LATEST
 *
 * The version of the OpenAPI document: 4.3
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.BrowserDetails;
import com.konfigthis.client.model.PaymentParamsRequestV43;
import com.konfigthis.client.model.PaymentRequestV43;
import com.konfigthis.client.model.PaymentResponse;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentApi
 */
@Disabled
public class PaymentApiTest {

    private static PaymentApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new PaymentApi(apiClient);
    }

    /**
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createPaymentTest() throws ApiException {
        String paymentToken = null;
        PaymentParamsRequestV43 payment = null;
        String responseReturnUrl = null;
        String clientIP = null;
        String locale = null;
        UUID clientID = null;
        BrowserDetails browserDetails = null;
        PaymentResponse response = api.createPayment(paymentToken)
                .payment(payment)
                .responseReturnUrl(responseReturnUrl)
                .clientIP(clientIP)
                .locale(locale)
                .clientID(clientID)
                .browserDetails(browserDetails)
                .execute();
        // TODO: test validations
    }

}
