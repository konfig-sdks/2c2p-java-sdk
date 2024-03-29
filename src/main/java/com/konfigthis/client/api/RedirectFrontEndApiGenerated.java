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


import com.konfigthis.client.model.RedirectFrontEndPostPaymentRedirectRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class RedirectFrontEndApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public RedirectFrontEndApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public RedirectFrontEndApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call postPaymentRedirectCall(String payResponse, String isLeaveApp, RedirectFrontEndPostPaymentRedirectRequest redirectFrontEndPostPaymentRedirectRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = redirectFrontEndPostPaymentRedirectRequest;

        // create path and map variables
        String localVarPath = "/payment/4.3/redirectfrontend";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (payResponse != null) {
            localVarFormParams.put("payResponse", payResponse);
        }

        if (isLeaveApp != null) {
            localVarFormParams.put("isLeaveApp", isLeaveApp);
        }

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call postPaymentRedirectValidateBeforeCall(String payResponse, String isLeaveApp, RedirectFrontEndPostPaymentRedirectRequest redirectFrontEndPostPaymentRedirectRequest, final ApiCallback _callback) throws ApiException {
        return postPaymentRedirectCall(payResponse, isLeaveApp, redirectFrontEndPostPaymentRedirectRequest, _callback);

    }


    private ApiResponse<Void> postPaymentRedirectWithHttpInfo(String payResponse, String isLeaveApp, RedirectFrontEndPostPaymentRedirectRequest redirectFrontEndPostPaymentRedirectRequest) throws ApiException {
        okhttp3.Call localVarCall = postPaymentRedirectValidateBeforeCall(payResponse, isLeaveApp, redirectFrontEndPostPaymentRedirectRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call postPaymentRedirectAsync(String payResponse, String isLeaveApp, RedirectFrontEndPostPaymentRedirectRequest redirectFrontEndPostPaymentRedirectRequest, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = postPaymentRedirectValidateBeforeCall(payResponse, isLeaveApp, redirectFrontEndPostPaymentRedirectRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class PostPaymentRedirectRequestBuilder {
        private String payResponse;
        private String isLeaveApp;

        private PostPaymentRedirectRequestBuilder() {
        }

        /**
         * Set payResponse
         * @param payResponse  (optional)
         * @return PostPaymentRedirectRequestBuilder
         */
        public PostPaymentRedirectRequestBuilder payResponse(String payResponse) {
            this.payResponse = payResponse;
            return this;
        }
        
        /**
         * Set isLeaveApp
         * @param isLeaveApp  (optional)
         * @return PostPaymentRedirectRequestBuilder
         */
        public PostPaymentRedirectRequestBuilder isLeaveApp(String isLeaveApp) {
            this.isLeaveApp = isLeaveApp;
            return this;
        }
        
        /**
         * Build call for postPaymentRedirect
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
            RedirectFrontEndPostPaymentRedirectRequest redirectFrontEndPostPaymentRedirectRequest = buildBodyParams();
            return postPaymentRedirectCall(payResponse, isLeaveApp, redirectFrontEndPostPaymentRedirectRequest, _callback);
        }

        private RedirectFrontEndPostPaymentRedirectRequest buildBodyParams() {
            RedirectFrontEndPostPaymentRedirectRequest redirectFrontEndPostPaymentRedirectRequest = new RedirectFrontEndPostPaymentRedirectRequest();
            redirectFrontEndPostPaymentRedirectRequest.payResponse(this.payResponse);
            redirectFrontEndPostPaymentRedirectRequest.isLeaveApp(this.isLeaveApp);
            return redirectFrontEndPostPaymentRedirectRequest;
        }

        /**
         * Execute postPaymentRedirect request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            RedirectFrontEndPostPaymentRedirectRequest redirectFrontEndPostPaymentRedirectRequest = buildBodyParams();
            postPaymentRedirectWithHttpInfo(payResponse, isLeaveApp, redirectFrontEndPostPaymentRedirectRequest);
        }

        /**
         * Execute postPaymentRedirect request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            RedirectFrontEndPostPaymentRedirectRequest redirectFrontEndPostPaymentRedirectRequest = buildBodyParams();
            return postPaymentRedirectWithHttpInfo(payResponse, isLeaveApp, redirectFrontEndPostPaymentRedirectRequest);
        }

        /**
         * Execute postPaymentRedirect request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            RedirectFrontEndPostPaymentRedirectRequest redirectFrontEndPostPaymentRedirectRequest = buildBodyParams();
            return postPaymentRedirectAsync(payResponse, isLeaveApp, redirectFrontEndPostPaymentRedirectRequest, _callback);
        }
    }

    /**
     * 
     * 
     * @return PostPaymentRedirectRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public PostPaymentRedirectRequestBuilder postPaymentRedirect() throws IllegalArgumentException {
        return new PostPaymentRedirectRequestBuilder();
    }
}
