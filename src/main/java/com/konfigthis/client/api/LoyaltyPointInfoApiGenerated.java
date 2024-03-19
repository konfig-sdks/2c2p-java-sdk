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
import com.konfigthis.client.model.PaymentLoyaltyPointInfoRequest;
import com.konfigthis.client.model.PaymentLoyaltyPointInfoResponse;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class LoyaltyPointInfoApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public LoyaltyPointInfoApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public LoyaltyPointInfoApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call postLoyaltyPointInfoCall(PaymentLoyaltyPointInfoRequest paymentLoyaltyPointInfoRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = paymentLoyaltyPointInfoRequest;

        // create path and map variables
        String localVarPath = "/payment/4.3/loyaltypointinfo";

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
    private okhttp3.Call postLoyaltyPointInfoValidateBeforeCall(PaymentLoyaltyPointInfoRequest paymentLoyaltyPointInfoRequest, final ApiCallback _callback) throws ApiException {
        return postLoyaltyPointInfoCall(paymentLoyaltyPointInfoRequest, _callback);

    }


    private ApiResponse<PaymentLoyaltyPointInfoResponse> postLoyaltyPointInfoWithHttpInfo(PaymentLoyaltyPointInfoRequest paymentLoyaltyPointInfoRequest) throws ApiException {
        okhttp3.Call localVarCall = postLoyaltyPointInfoValidateBeforeCall(paymentLoyaltyPointInfoRequest, null);
        Type localVarReturnType = new TypeToken<PaymentLoyaltyPointInfoResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call postLoyaltyPointInfoAsync(PaymentLoyaltyPointInfoRequest paymentLoyaltyPointInfoRequest, final ApiCallback<PaymentLoyaltyPointInfoResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = postLoyaltyPointInfoValidateBeforeCall(paymentLoyaltyPointInfoRequest, _callback);
        Type localVarReturnType = new TypeToken<PaymentLoyaltyPointInfoResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class PostLoyaltyPointInfoRequestBuilder {
        private final String paymentToken;
        private String providerID;
        private String profileID;
        private String referenceID;
        private String cardNo;
        private String expiryMonth;
        private String expiryYear;
        private String locale;
        private UUID clientID;
        private BrowserDetails browserDetails;

        private PostLoyaltyPointInfoRequestBuilder(String paymentToken) {
            this.paymentToken = paymentToken;
        }

        /**
         * Set providerID
         * @param providerID  (optional)
         * @return PostLoyaltyPointInfoRequestBuilder
         */
        public PostLoyaltyPointInfoRequestBuilder providerID(String providerID) {
            this.providerID = providerID;
            return this;
        }
        
        /**
         * Set profileID
         * @param profileID  (optional)
         * @return PostLoyaltyPointInfoRequestBuilder
         */
        public PostLoyaltyPointInfoRequestBuilder profileID(String profileID) {
            this.profileID = profileID;
            return this;
        }
        
        /**
         * Set referenceID
         * @param referenceID  (optional)
         * @return PostLoyaltyPointInfoRequestBuilder
         */
        public PostLoyaltyPointInfoRequestBuilder referenceID(String referenceID) {
            this.referenceID = referenceID;
            return this;
        }
        
        /**
         * Set cardNo
         * @param cardNo  (optional)
         * @return PostLoyaltyPointInfoRequestBuilder
         */
        public PostLoyaltyPointInfoRequestBuilder cardNo(String cardNo) {
            this.cardNo = cardNo;
            return this;
        }
        
        /**
         * Set expiryMonth
         * @param expiryMonth  (optional)
         * @return PostLoyaltyPointInfoRequestBuilder
         */
        public PostLoyaltyPointInfoRequestBuilder expiryMonth(String expiryMonth) {
            this.expiryMonth = expiryMonth;
            return this;
        }
        
        /**
         * Set expiryYear
         * @param expiryYear  (optional)
         * @return PostLoyaltyPointInfoRequestBuilder
         */
        public PostLoyaltyPointInfoRequestBuilder expiryYear(String expiryYear) {
            this.expiryYear = expiryYear;
            return this;
        }
        
        /**
         * Set locale
         * @param locale  (optional)
         * @return PostLoyaltyPointInfoRequestBuilder
         */
        public PostLoyaltyPointInfoRequestBuilder locale(String locale) {
            this.locale = locale;
            return this;
        }
        
        /**
         * Set clientID
         * @param clientID  (optional)
         * @return PostLoyaltyPointInfoRequestBuilder
         */
        public PostLoyaltyPointInfoRequestBuilder clientID(UUID clientID) {
            this.clientID = clientID;
            return this;
        }
        
        /**
         * Set browserDetails
         * @param browserDetails  (optional)
         * @return PostLoyaltyPointInfoRequestBuilder
         */
        public PostLoyaltyPointInfoRequestBuilder browserDetails(BrowserDetails browserDetails) {
            this.browserDetails = browserDetails;
            return this;
        }
        
        /**
         * Build call for postLoyaltyPointInfo
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
            PaymentLoyaltyPointInfoRequest paymentLoyaltyPointInfoRequest = buildBodyParams();
            return postLoyaltyPointInfoCall(paymentLoyaltyPointInfoRequest, _callback);
        }

        private PaymentLoyaltyPointInfoRequest buildBodyParams() {
            PaymentLoyaltyPointInfoRequest paymentLoyaltyPointInfoRequest = new PaymentLoyaltyPointInfoRequest();
            paymentLoyaltyPointInfoRequest.providerID(this.providerID);
            paymentLoyaltyPointInfoRequest.profileID(this.profileID);
            paymentLoyaltyPointInfoRequest.referenceID(this.referenceID);
            paymentLoyaltyPointInfoRequest.cardNo(this.cardNo);
            paymentLoyaltyPointInfoRequest.expiryMonth(this.expiryMonth);
            paymentLoyaltyPointInfoRequest.expiryYear(this.expiryYear);
            paymentLoyaltyPointInfoRequest.paymentToken(this.paymentToken);
            paymentLoyaltyPointInfoRequest.locale(this.locale);
            paymentLoyaltyPointInfoRequest.clientID(this.clientID);
            paymentLoyaltyPointInfoRequest.browserDetails(this.browserDetails);
            return paymentLoyaltyPointInfoRequest;
        }

        /**
         * Execute postLoyaltyPointInfo request
         * @return PaymentLoyaltyPointInfoResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public PaymentLoyaltyPointInfoResponse execute() throws ApiException {
            PaymentLoyaltyPointInfoRequest paymentLoyaltyPointInfoRequest = buildBodyParams();
            ApiResponse<PaymentLoyaltyPointInfoResponse> localVarResp = postLoyaltyPointInfoWithHttpInfo(paymentLoyaltyPointInfoRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute postLoyaltyPointInfo request with HTTP info returned
         * @return ApiResponse&lt;PaymentLoyaltyPointInfoResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<PaymentLoyaltyPointInfoResponse> executeWithHttpInfo() throws ApiException {
            PaymentLoyaltyPointInfoRequest paymentLoyaltyPointInfoRequest = buildBodyParams();
            return postLoyaltyPointInfoWithHttpInfo(paymentLoyaltyPointInfoRequest);
        }

        /**
         * Execute postLoyaltyPointInfo request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<PaymentLoyaltyPointInfoResponse> _callback) throws ApiException {
            PaymentLoyaltyPointInfoRequest paymentLoyaltyPointInfoRequest = buildBodyParams();
            return postLoyaltyPointInfoAsync(paymentLoyaltyPointInfoRequest, _callback);
        }
    }

    /**
     * 
     * 
     * @return PostLoyaltyPointInfoRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public PostLoyaltyPointInfoRequestBuilder postLoyaltyPointInfo(String paymentToken) throws IllegalArgumentException {
        if (paymentToken == null) throw new IllegalArgumentException("\"paymentToken\" is required but got null");
            

        return new PostLoyaltyPointInfoRequestBuilder(paymentToken);
    }
}
