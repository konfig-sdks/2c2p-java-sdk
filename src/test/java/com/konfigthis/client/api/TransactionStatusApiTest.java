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
import com.konfigthis.client.model.TransactionStatusRequest;
import com.konfigthis.client.model.TransactionStatusResponse;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TransactionStatusApi
 */
@Disabled
public class TransactionStatusApiTest {

    private static TransactionStatusApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new TransactionStatusApi(apiClient);
    }

    /**
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTransactionStatusTest() throws ApiException {
        String paymentToken = null;
        Boolean additionalInfo = null;
        String locale = null;
        UUID clientID = null;
        BrowserDetails browserDetails = null;
        TransactionStatusResponse response = api.updateTransactionStatus(paymentToken)
                .additionalInfo(additionalInfo)
                .locale(locale)
                .clientID(clientID)
                .browserDetails(browserDetails)
                .execute();
        // TODO: test validations
    }

}