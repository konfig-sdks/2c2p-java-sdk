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
import com.konfigthis.client.model.PaymentOptionDetailsRequest;
import com.konfigthis.client.model.PaymentOptionDetailsResponse;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class PaymentOptionDetailsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PaymentOptionDetailsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public PaymentOptionDetailsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call postOptionDetailsCall(PaymentOptionDetailsRequest paymentOptionDetailsRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = paymentOptionDetailsRequest;

        // create path and map variables
        String localVarPath = "/payment/4.3/paymentoptiondetails";

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
    private okhttp3.Call postOptionDetailsValidateBeforeCall(PaymentOptionDetailsRequest paymentOptionDetailsRequest, final ApiCallback _callback) throws ApiException {
        return postOptionDetailsCall(paymentOptionDetailsRequest, _callback);

    }


    private ApiResponse<PaymentOptionDetailsResponse> postOptionDetailsWithHttpInfo(PaymentOptionDetailsRequest paymentOptionDetailsRequest) throws ApiException {
        okhttp3.Call localVarCall = postOptionDetailsValidateBeforeCall(paymentOptionDetailsRequest, null);
        Type localVarReturnType = new TypeToken<PaymentOptionDetailsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call postOptionDetailsAsync(PaymentOptionDetailsRequest paymentOptionDetailsRequest, final ApiCallback<PaymentOptionDetailsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = postOptionDetailsValidateBeforeCall(paymentOptionDetailsRequest, _callback);
        Type localVarReturnType = new TypeToken<PaymentOptionDetailsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class PostOptionDetailsRequestBuilder {
        private final String categoryCode;
        private final String groupCode;
        private final String paymentToken;
        private String locale;
        private UUID clientID;
        private BrowserDetails browserDetails;

        private PostOptionDetailsRequestBuilder(String categoryCode, String groupCode, String paymentToken) {
            this.categoryCode = categoryCode;
            this.groupCode = groupCode;
            this.paymentToken = paymentToken;
        }

        /**
         * Set locale
         * @param locale  (optional)
         * @return PostOptionDetailsRequestBuilder
         */
        public PostOptionDetailsRequestBuilder locale(String locale) {
            this.locale = locale;
            return this;
        }
        
        /**
         * Set clientID
         * @param clientID  (optional)
         * @return PostOptionDetailsRequestBuilder
         */
        public PostOptionDetailsRequestBuilder clientID(UUID clientID) {
            this.clientID = clientID;
            return this;
        }
        
        /**
         * Set browserDetails
         * @param browserDetails  (optional)
         * @return PostOptionDetailsRequestBuilder
         */
        public PostOptionDetailsRequestBuilder browserDetails(BrowserDetails browserDetails) {
            this.browserDetails = browserDetails;
            return this;
        }
        
        /**
         * Build call for postOptionDetails
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
            PaymentOptionDetailsRequest paymentOptionDetailsRequest = buildBodyParams();
            return postOptionDetailsCall(paymentOptionDetailsRequest, _callback);
        }

        private PaymentOptionDetailsRequest buildBodyParams() {
            PaymentOptionDetailsRequest paymentOptionDetailsRequest = new PaymentOptionDetailsRequest();
            paymentOptionDetailsRequest.categoryCode(this.categoryCode);
            paymentOptionDetailsRequest.groupCode(this.groupCode);
            paymentOptionDetailsRequest.paymentToken(this.paymentToken);
            paymentOptionDetailsRequest.locale(this.locale);
            paymentOptionDetailsRequest.clientID(this.clientID);
            paymentOptionDetailsRequest.browserDetails(this.browserDetails);
            return paymentOptionDetailsRequest;
        }

        /**
         * Execute postOptionDetails request
         * @return PaymentOptionDetailsResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public PaymentOptionDetailsResponse execute() throws ApiException {
            PaymentOptionDetailsRequest paymentOptionDetailsRequest = buildBodyParams();
            ApiResponse<PaymentOptionDetailsResponse> localVarResp = postOptionDetailsWithHttpInfo(paymentOptionDetailsRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute postOptionDetails request with HTTP info returned
         * @return ApiResponse&lt;PaymentOptionDetailsResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<PaymentOptionDetailsResponse> executeWithHttpInfo() throws ApiException {
            PaymentOptionDetailsRequest paymentOptionDetailsRequest = buildBodyParams();
            return postOptionDetailsWithHttpInfo(paymentOptionDetailsRequest);
        }

        /**
         * Execute postOptionDetails request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<PaymentOptionDetailsResponse> _callback) throws ApiException {
            PaymentOptionDetailsRequest paymentOptionDetailsRequest = buildBodyParams();
            return postOptionDetailsAsync(paymentOptionDetailsRequest, _callback);
        }
    }

    /**
     * 
     * 
     * @return PostOptionDetailsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public PostOptionDetailsRequestBuilder postOptionDetails(String categoryCode, String groupCode, String paymentToken) throws IllegalArgumentException {
        if (categoryCode == null) throw new IllegalArgumentException("\"categoryCode\" is required but got null");
            

        if (groupCode == null) throw new IllegalArgumentException("\"groupCode\" is required but got null");
            

        if (paymentToken == null) throw new IllegalArgumentException("\"paymentToken\" is required but got null");
            

        return new PostOptionDetailsRequestBuilder(categoryCode, groupCode, paymentToken);
    }
}
