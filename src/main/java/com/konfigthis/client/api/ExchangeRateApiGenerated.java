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
import com.konfigthis.client.model.PayloadRequest;
import com.konfigthis.client.model.PaymentApmMccExchangeRateResponse;
import com.konfigthis.client.model.PaymentBaseRequest;
import com.konfigthis.client.model.PaymentExchangeRateConverterRequest;
import com.konfigthis.client.model.PaymentExchangeRateConverterResponse;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ExchangeRateApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ExchangeRateApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public ExchangeRateApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call apmMccCall(PaymentBaseRequest paymentBaseRequest, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/payment/4.3/exchangerate/apmmccexchangerate";

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
    private okhttp3.Call apmMccValidateBeforeCall(PaymentBaseRequest paymentBaseRequest, final ApiCallback _callback) throws ApiException {
        return apmMccCall(paymentBaseRequest, _callback);

    }


    private ApiResponse<PaymentApmMccExchangeRateResponse> apmMccWithHttpInfo(PaymentBaseRequest paymentBaseRequest) throws ApiException {
        okhttp3.Call localVarCall = apmMccValidateBeforeCall(paymentBaseRequest, null);
        Type localVarReturnType = new TypeToken<PaymentApmMccExchangeRateResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call apmMccAsync(PaymentBaseRequest paymentBaseRequest, final ApiCallback<PaymentApmMccExchangeRateResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = apmMccValidateBeforeCall(paymentBaseRequest, _callback);
        Type localVarReturnType = new TypeToken<PaymentApmMccExchangeRateResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ApmMccRequestBuilder {
        private final String paymentToken;
        private String locale;
        private UUID clientID;
        private BrowserDetails browserDetails;

        private ApmMccRequestBuilder(String paymentToken) {
            this.paymentToken = paymentToken;
        }

        /**
         * Set locale
         * @param locale  (optional)
         * @return ApmMccRequestBuilder
         */
        public ApmMccRequestBuilder locale(String locale) {
            this.locale = locale;
            return this;
        }
        
        /**
         * Set clientID
         * @param clientID  (optional)
         * @return ApmMccRequestBuilder
         */
        public ApmMccRequestBuilder clientID(UUID clientID) {
            this.clientID = clientID;
            return this;
        }
        
        /**
         * Set browserDetails
         * @param browserDetails  (optional)
         * @return ApmMccRequestBuilder
         */
        public ApmMccRequestBuilder browserDetails(BrowserDetails browserDetails) {
            this.browserDetails = browserDetails;
            return this;
        }
        
        /**
         * Build call for apmMcc
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
            return apmMccCall(paymentBaseRequest, _callback);
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
         * Execute apmMcc request
         * @return PaymentApmMccExchangeRateResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public PaymentApmMccExchangeRateResponse execute() throws ApiException {
            PaymentBaseRequest paymentBaseRequest = buildBodyParams();
            ApiResponse<PaymentApmMccExchangeRateResponse> localVarResp = apmMccWithHttpInfo(paymentBaseRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute apmMcc request with HTTP info returned
         * @return ApiResponse&lt;PaymentApmMccExchangeRateResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<PaymentApmMccExchangeRateResponse> executeWithHttpInfo() throws ApiException {
            PaymentBaseRequest paymentBaseRequest = buildBodyParams();
            return apmMccWithHttpInfo(paymentBaseRequest);
        }

        /**
         * Execute apmMcc request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<PaymentApmMccExchangeRateResponse> _callback) throws ApiException {
            PaymentBaseRequest paymentBaseRequest = buildBodyParams();
            return apmMccAsync(paymentBaseRequest, _callback);
        }
    }

    /**
     * APM MCC Exchange Rate
     * 
     * @return ApmMccRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApmMccRequestBuilder apmMcc(String paymentToken) throws IllegalArgumentException {
        if (paymentToken == null) throw new IllegalArgumentException("\"paymentToken\" is required but got null");
            

        return new ApmMccRequestBuilder(paymentToken);
    }
    private okhttp3.Call getRateCall(PaymentExchangeRateConverterRequest paymentExchangeRateConverterRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = paymentExchangeRateConverterRequest;

        // create path and map variables
        String localVarPath = "/payment/4.3/exchangerate";

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
    private okhttp3.Call getRateValidateBeforeCall(PaymentExchangeRateConverterRequest paymentExchangeRateConverterRequest, final ApiCallback _callback) throws ApiException {
        return getRateCall(paymentExchangeRateConverterRequest, _callback);

    }


    private ApiResponse<PaymentExchangeRateConverterResponse> getRateWithHttpInfo(PaymentExchangeRateConverterRequest paymentExchangeRateConverterRequest) throws ApiException {
        okhttp3.Call localVarCall = getRateValidateBeforeCall(paymentExchangeRateConverterRequest, null);
        Type localVarReturnType = new TypeToken<PaymentExchangeRateConverterResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getRateAsync(PaymentExchangeRateConverterRequest paymentExchangeRateConverterRequest, final ApiCallback<PaymentExchangeRateConverterResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getRateValidateBeforeCall(paymentExchangeRateConverterRequest, _callback);
        Type localVarReturnType = new TypeToken<PaymentExchangeRateConverterResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetRateRequestBuilder {
        private final String paymentToken;
        private String bin;
        private String locale;
        private UUID clientID;
        private BrowserDetails browserDetails;

        private GetRateRequestBuilder(String paymentToken) {
            this.paymentToken = paymentToken;
        }

        /**
         * Set bin
         * @param bin  (optional)
         * @return GetRateRequestBuilder
         */
        public GetRateRequestBuilder bin(String bin) {
            this.bin = bin;
            return this;
        }
        
        /**
         * Set locale
         * @param locale  (optional)
         * @return GetRateRequestBuilder
         */
        public GetRateRequestBuilder locale(String locale) {
            this.locale = locale;
            return this;
        }
        
        /**
         * Set clientID
         * @param clientID  (optional)
         * @return GetRateRequestBuilder
         */
        public GetRateRequestBuilder clientID(UUID clientID) {
            this.clientID = clientID;
            return this;
        }
        
        /**
         * Set browserDetails
         * @param browserDetails  (optional)
         * @return GetRateRequestBuilder
         */
        public GetRateRequestBuilder browserDetails(BrowserDetails browserDetails) {
            this.browserDetails = browserDetails;
            return this;
        }
        
        /**
         * Build call for getRate
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
            PaymentExchangeRateConverterRequest paymentExchangeRateConverterRequest = buildBodyParams();
            return getRateCall(paymentExchangeRateConverterRequest, _callback);
        }

        private PaymentExchangeRateConverterRequest buildBodyParams() {
            PaymentExchangeRateConverterRequest paymentExchangeRateConverterRequest = new PaymentExchangeRateConverterRequest();
            paymentExchangeRateConverterRequest.bin(this.bin);
            paymentExchangeRateConverterRequest.paymentToken(this.paymentToken);
            paymentExchangeRateConverterRequest.locale(this.locale);
            paymentExchangeRateConverterRequest.clientID(this.clientID);
            paymentExchangeRateConverterRequest.browserDetails(this.browserDetails);
            return paymentExchangeRateConverterRequest;
        }

        /**
         * Execute getRate request
         * @return PaymentExchangeRateConverterResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public PaymentExchangeRateConverterResponse execute() throws ApiException {
            PaymentExchangeRateConverterRequest paymentExchangeRateConverterRequest = buildBodyParams();
            ApiResponse<PaymentExchangeRateConverterResponse> localVarResp = getRateWithHttpInfo(paymentExchangeRateConverterRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getRate request with HTTP info returned
         * @return ApiResponse&lt;PaymentExchangeRateConverterResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<PaymentExchangeRateConverterResponse> executeWithHttpInfo() throws ApiException {
            PaymentExchangeRateConverterRequest paymentExchangeRateConverterRequest = buildBodyParams();
            return getRateWithHttpInfo(paymentExchangeRateConverterRequest);
        }

        /**
         * Execute getRate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<PaymentExchangeRateConverterResponse> _callback) throws ApiException {
            PaymentExchangeRateConverterRequest paymentExchangeRateConverterRequest = buildBodyParams();
            return getRateAsync(paymentExchangeRateConverterRequest, _callback);
        }
    }

    /**
     * 
     * 
     * @return GetRateRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public GetRateRequestBuilder getRate(String paymentToken) throws IllegalArgumentException {
        if (paymentToken == null) throw new IllegalArgumentException("\"paymentToken\" is required but got null");
            

        return new GetRateRequestBuilder(paymentToken);
    }
    private okhttp3.Call requestEndpointCall(PayloadRequest payloadRequest, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/payment/4.3/exchangerate/secure";

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
    private okhttp3.Call requestEndpointValidateBeforeCall(PayloadRequest payloadRequest, final ApiCallback _callback) throws ApiException {
        return requestEndpointCall(payloadRequest, _callback);

    }


    private ApiResponse<PayloadRequest> requestEndpointWithHttpInfo(PayloadRequest payloadRequest) throws ApiException {
        okhttp3.Call localVarCall = requestEndpointValidateBeforeCall(payloadRequest, null);
        Type localVarReturnType = new TypeToken<PayloadRequest>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call requestEndpointAsync(PayloadRequest payloadRequest, final ApiCallback<PayloadRequest> _callback) throws ApiException {

        okhttp3.Call localVarCall = requestEndpointValidateBeforeCall(payloadRequest, _callback);
        Type localVarReturnType = new TypeToken<PayloadRequest>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class RequestEndpointRequestBuilder {
        private String payload;

        private RequestEndpointRequestBuilder() {
        }

        /**
         * Set payload
         * @param payload  (optional)
         * @return RequestEndpointRequestBuilder
         */
        public RequestEndpointRequestBuilder payload(String payload) {
            this.payload = payload;
            return this;
        }
        
        /**
         * Build call for requestEndpoint
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
            return requestEndpointCall(payloadRequest, _callback);
        }

        private PayloadRequest buildBodyParams() {
            PayloadRequest payloadRequest = new PayloadRequest();
            payloadRequest.payload(this.payload);
            return payloadRequest;
        }

        /**
         * Execute requestEndpoint request
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
            ApiResponse<PayloadRequest> localVarResp = requestEndpointWithHttpInfo(payloadRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute requestEndpoint request with HTTP info returned
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
            return requestEndpointWithHttpInfo(payloadRequest);
        }

        /**
         * Execute requestEndpoint request (asynchronously)
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
            return requestEndpointAsync(payloadRequest, _callback);
        }
    }

    /**
     * JWT Request Endpoint
     * 
     * @return RequestEndpointRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public RequestEndpointRequestBuilder requestEndpoint() throws IllegalArgumentException {
        return new RequestEndpointRequestBuilder();
    }
}