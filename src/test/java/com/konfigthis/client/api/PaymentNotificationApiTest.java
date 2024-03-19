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
import com.konfigthis.client.model.PaymentNotificationRequest;
import com.konfigthis.client.model.PaymentResponseBase;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentNotificationApi
 */
@Disabled
public class PaymentNotificationApiTest {

    private static PaymentNotificationApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new PaymentNotificationApi(apiClient);
    }

    /**
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void processNotificationTest() throws ApiException {
        String paymentToken = null;
        String plateform = null;
        String recipientID = null;
        String recipientName = null;
        String locale = null;
        UUID clientID = null;
        BrowserDetails browserDetails = null;
        PaymentResponseBase response = api.processNotification(paymentToken)
                .plateform(plateform)
                .recipientID(recipientID)
                .recipientName(recipientName)
                .locale(locale)
                .clientID(clientID)
                .browserDetails(browserDetails)
                .execute();
        // TODO: test validations
    }

}