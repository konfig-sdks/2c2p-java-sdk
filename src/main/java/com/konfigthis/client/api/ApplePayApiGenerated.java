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
import com.konfigthis.client.model.MerchantValidationApplePay;
import com.konfigthis.client.model.MerchantValidationApplePayResponse;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ApplePayApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ApplePayApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public ApplePayApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call validateMerchantCall(MerchantValidationApplePay merchantValidationApplePay, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = merchantValidationApplePay;

        // create path and map variables
        String localVarPath = "/payment/4.3/applepay/merchantvalidation";

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
    private okhttp3.Call validateMerchantValidateBeforeCall(MerchantValidationApplePay merchantValidationApplePay, final ApiCallback _callback) throws ApiException {
        return validateMerchantCall(merchantValidationApplePay, _callback);

    }


    private ApiResponse<MerchantValidationApplePayResponse> validateMerchantWithHttpInfo(MerchantValidationApplePay merchantValidationApplePay) throws ApiException {
        okhttp3.Call localVarCall = validateMerchantValidateBeforeCall(merchantValidationApplePay, null);
        Type localVarReturnType = new TypeToken<MerchantValidationApplePayResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call validateMerchantAsync(MerchantValidationApplePay merchantValidationApplePay, final ApiCallback<MerchantValidationApplePayResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = validateMerchantValidateBeforeCall(merchantValidationApplePay, _callback);
        Type localVarReturnType = new TypeToken<MerchantValidationApplePayResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ValidateMerchantRequestBuilder {
        private final String paymentToken;
        private String validationUrl;
        private String locale;
        private UUID clientID;
        private BrowserDetails browserDetails;

        private ValidateMerchantRequestBuilder(String paymentToken) {
            this.paymentToken = paymentToken;
        }

        /**
         * Set validationUrl
         * @param validationUrl  (optional)
         * @return ValidateMerchantRequestBuilder
         */
        public ValidateMerchantRequestBuilder validationUrl(String validationUrl) {
            this.validationUrl = validationUrl;
            return this;
        }
        
        /**
         * Set locale
         * @param locale  (optional)
         * @return ValidateMerchantRequestBuilder
         */
        public ValidateMerchantRequestBuilder locale(String locale) {
            this.locale = locale;
            return this;
        }
        
        /**
         * Set clientID
         * @param clientID  (optional)
         * @return ValidateMerchantRequestBuilder
         */
        public ValidateMerchantRequestBuilder clientID(UUID clientID) {
            this.clientID = clientID;
            return this;
        }
        
        /**
         * Set browserDetails
         * @param browserDetails  (optional)
         * @return ValidateMerchantRequestBuilder
         */
        public ValidateMerchantRequestBuilder browserDetails(BrowserDetails browserDetails) {
            this.browserDetails = browserDetails;
            return this;
        }
        
        /**
         * Build call for validateMerchant
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
            MerchantValidationApplePay merchantValidationApplePay = buildBodyParams();
            return validateMerchantCall(merchantValidationApplePay, _callback);
        }

        private MerchantValidationApplePay buildBodyParams() {
            MerchantValidationApplePay merchantValidationApplePay = new MerchantValidationApplePay();
            merchantValidationApplePay.validationUrl(this.validationUrl);
            merchantValidationApplePay.paymentToken(this.paymentToken);
            merchantValidationApplePay.locale(this.locale);
            merchantValidationApplePay.clientID(this.clientID);
            merchantValidationApplePay.browserDetails(this.browserDetails);
            return merchantValidationApplePay;
        }

        /**
         * Execute validateMerchant request
         * @return MerchantValidationApplePayResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public MerchantValidationApplePayResponse execute() throws ApiException {
            MerchantValidationApplePay merchantValidationApplePay = buildBodyParams();
            ApiResponse<MerchantValidationApplePayResponse> localVarResp = validateMerchantWithHttpInfo(merchantValidationApplePay);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute validateMerchant request with HTTP info returned
         * @return ApiResponse&lt;MerchantValidationApplePayResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<MerchantValidationApplePayResponse> executeWithHttpInfo() throws ApiException {
            MerchantValidationApplePay merchantValidationApplePay = buildBodyParams();
            return validateMerchantWithHttpInfo(merchantValidationApplePay);
        }

        /**
         * Execute validateMerchant request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<MerchantValidationApplePayResponse> _callback) throws ApiException {
            MerchantValidationApplePay merchantValidationApplePay = buildBodyParams();
            return validateMerchantAsync(merchantValidationApplePay, _callback);
        }
    }

    /**
     * 
     * 
     * @return ValidateMerchantRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ValidateMerchantRequestBuilder validateMerchant(String paymentToken) throws IllegalArgumentException {
        if (paymentToken == null) throw new IllegalArgumentException("\"paymentToken\" is required but got null");
            

        return new ValidateMerchantRequestBuilder(paymentToken);
    }
}
