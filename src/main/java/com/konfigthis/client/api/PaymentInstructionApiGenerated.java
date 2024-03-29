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


import com.konfigthis.client.model.PayloadRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class PaymentInstructionApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PaymentInstructionApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public PaymentInstructionApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call submitInstructionCall(PayloadRequest payloadRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = payloadRequest;

        // create path and map variables
        String localVarPath = "/payment/4.3/paymentinstruction";

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
    private okhttp3.Call submitInstructionValidateBeforeCall(PayloadRequest payloadRequest, final ApiCallback _callback) throws ApiException {
        return submitInstructionCall(payloadRequest, _callback);

    }


    private ApiResponse<PayloadRequest> submitInstructionWithHttpInfo(PayloadRequest payloadRequest) throws ApiException {
        okhttp3.Call localVarCall = submitInstructionValidateBeforeCall(payloadRequest, null);
        Type localVarReturnType = new TypeToken<PayloadRequest>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call submitInstructionAsync(PayloadRequest payloadRequest, final ApiCallback<PayloadRequest> _callback) throws ApiException {

        okhttp3.Call localVarCall = submitInstructionValidateBeforeCall(payloadRequest, _callback);
        Type localVarReturnType = new TypeToken<PayloadRequest>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class SubmitInstructionRequestBuilder {
        private String payload;

        private SubmitInstructionRequestBuilder() {
        }

        /**
         * Set payload
         * @param payload  (optional)
         * @return SubmitInstructionRequestBuilder
         */
        public SubmitInstructionRequestBuilder payload(String payload) {
            this.payload = payload;
            return this;
        }
        
        /**
         * Build call for submitInstruction
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
            PayloadRequest payloadRequest = buildBodyParams();
            return submitInstructionCall(payloadRequest, _callback);
        }

        private PayloadRequest buildBodyParams() {
            PayloadRequest payloadRequest = new PayloadRequest();
            payloadRequest.payload(this.payload);
            return payloadRequest;
        }

        /**
         * Execute submitInstruction request
         * @return PayloadRequest
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public PayloadRequest execute() throws ApiException {
            PayloadRequest payloadRequest = buildBodyParams();
            ApiResponse<PayloadRequest> localVarResp = submitInstructionWithHttpInfo(payloadRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute submitInstruction request with HTTP info returned
         * @return ApiResponse&lt;PayloadRequest&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<PayloadRequest> executeWithHttpInfo() throws ApiException {
            PayloadRequest payloadRequest = buildBodyParams();
            return submitInstructionWithHttpInfo(payloadRequest);
        }

        /**
         * Execute submitInstruction request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<PayloadRequest> _callback) throws ApiException {
            PayloadRequest payloadRequest = buildBodyParams();
            return submitInstructionAsync(payloadRequest, _callback);
        }
    }

    /**
     * 
     * 
     * @return SubmitInstructionRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public SubmitInstructionRequestBuilder submitInstruction() throws IllegalArgumentException {
        return new SubmitInstructionRequestBuilder();
    }
}
