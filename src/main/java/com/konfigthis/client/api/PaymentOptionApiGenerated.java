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

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.BrowserDetails;
import com.konfigthis.client.model.PaymentBaseRequest;
import com.konfigthis.client.model.PaymentOptionResponse;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class PaymentOptionApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PaymentOptionApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public PaymentOptionApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call createPaymentOptionCall(PaymentBaseRequest paymentBaseRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = paymentBaseRequest;

        // create path and map variables
        String localVarPath = "/payment/4.3/paymentoption";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json",
            "text/json",
            "text/plain"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json",
            "text/json",
            "application/json-patch+json",
            "application/*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createPaymentOptionValidateBeforeCall(PaymentBaseRequest paymentBaseRequest, final ApiCallback _callback) throws ApiException {
        return createPaymentOptionCall(paymentBaseRequest, _callback);

    }


    private ApiResponse<PaymentOptionResponse> createPaymentOptionWithHttpInfo(PaymentBaseRequest paymentBaseRequest) throws ApiException {
        okhttp3.Call localVarCall = createPaymentOptionValidateBeforeCall(paymentBaseRequest, null);
        Type localVarReturnType = new TypeToken<PaymentOptionResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createPaymentOptionAsync(PaymentBaseRequest paymentBaseRequest, final ApiCallback<PaymentOptionResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createPaymentOptionValidateBeforeCall(paymentBaseRequest, _callback);
        Type localVarReturnType = new TypeToken<PaymentOptionResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class CreatePaymentOptionRequestBuilder {
        private final String paymentToken;
        private String locale;
        private UUID clientID;
        private BrowserDetails browserDetails;

        private CreatePaymentOptionRequestBuilder(String paymentToken) {
            this.paymentToken = paymentToken;
        }

        /**
         * Set locale
         * @param locale  (optional)
         * @return CreatePaymentOptionRequestBuilder
         */
        public CreatePaymentOptionRequestBuilder locale(String locale) {
            this.locale = locale;
            return this;
        }
        
        /**
         * Set clientID
         * @param clientID  (optional)
         * @return CreatePaymentOptionRequestBuilder
         */
        public CreatePaymentOptionRequestBuilder clientID(UUID clientID) {
            this.clientID = clientID;
            return this;
        }
        
        /**
         * Set browserDetails
         * @param browserDetails  (optional)
         * @return CreatePaymentOptionRequestBuilder
         */
        public CreatePaymentOptionRequestBuilder browserDetails(BrowserDetails browserDetails) {
            this.browserDetails = browserDetails;
            return this;
        }
        
        /**
         * Build call for createPaymentOption
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            PaymentBaseRequest paymentBaseRequest = buildBodyParams();
            return createPaymentOptionCall(paymentBaseRequest, _callback);
        }

        private PaymentBaseRequest buildBodyParams() {
            PaymentBaseRequest paymentBaseRequest = new PaymentBaseRequest();
            paymentBaseRequest.paymentToken(this.paymentToken);
            paymentBaseRequest.locale(this.locale);
            paymentBaseRequest.clientID(this.clientID);
            paymentBaseRequest.browserDetails(this.browserDetails);
            return paymentBaseRequest;
        }

        /**
         * Execute createPaymentOption request
         * @return PaymentOptionResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public PaymentOptionResponse execute() throws ApiException {
            PaymentBaseRequest paymentBaseRequest = buildBodyParams();
            ApiResponse<PaymentOptionResponse> localVarResp = createPaymentOptionWithHttpInfo(paymentBaseRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute createPaymentOption request with HTTP info returned
         * @return ApiResponse&lt;PaymentOptionResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<PaymentOptionResponse> executeWithHttpInfo() throws ApiException {
            PaymentBaseRequest paymentBaseRequest = buildBodyParams();
            return createPaymentOptionWithHttpInfo(paymentBaseRequest);
        }

        /**
         * Execute createPaymentOption request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<PaymentOptionResponse> _callback) throws ApiException {
            PaymentBaseRequest paymentBaseRequest = buildBodyParams();
            return createPaymentOptionAsync(paymentBaseRequest, _callback);
        }
    }

    /**
     * 
     * 
     * @return CreatePaymentOptionRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public CreatePaymentOptionRequestBuilder createPaymentOption(String paymentToken) throws IllegalArgumentException {
        if (paymentToken == null) throw new IllegalArgumentException("\"paymentToken\" is required but got null");
            

        return new CreatePaymentOptionRequestBuilder(paymentToken);
    }
}