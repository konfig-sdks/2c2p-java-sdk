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


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * TransactionStatusPayment
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TransactionStatusPayment {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_AUTO_REDIRECT = "autoRedirect";
  @SerializedName(SERIALIZED_NAME_AUTO_REDIRECT)
  private Boolean autoRedirect;

  public static final String SERIALIZED_NAME_REDIRECT_IMMEDIATELY = "redirectImmediately";
  @SerializedName(SERIALIZED_NAME_REDIRECT_IMMEDIATELY)
  private Boolean redirectImmediately;

  public static final String SERIALIZED_NAME_AUTO_REDIRECTION_TIMER = "autoRedirectionTimer";
  @SerializedName(SERIALIZED_NAME_AUTO_REDIRECTION_TIMER)
  private Integer autoRedirectionTimer;

  public static final String SERIALIZED_NAME_FRONTEND_RETURN_URL = "frontendReturnUrl";
  @SerializedName(SERIALIZED_NAME_FRONTEND_RETURN_URL)
  private String frontendReturnUrl;

  public static final String SERIALIZED_NAME_FRONTEND_RETURN_DATA = "frontendReturnData";
  @SerializedName(SERIALIZED_NAME_FRONTEND_RETURN_DATA)
  private String frontendReturnData;

  public TransactionStatusPayment() {
  }

  public TransactionStatusPayment description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public TransactionStatusPayment code(String code) {
    
    
    
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    
    
    
    this.code = code;
  }


  public TransactionStatusPayment autoRedirect(Boolean autoRedirect) {
    
    
    
    
    this.autoRedirect = autoRedirect;
    return this;
  }

   /**
   * Get autoRedirect
   * @return autoRedirect
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAutoRedirect() {
    return autoRedirect;
  }


  public void setAutoRedirect(Boolean autoRedirect) {
    
    
    
    this.autoRedirect = autoRedirect;
  }


  public TransactionStatusPayment redirectImmediately(Boolean redirectImmediately) {
    
    
    
    
    this.redirectImmediately = redirectImmediately;
    return this;
  }

   /**
   * Get redirectImmediately
   * @return redirectImmediately
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRedirectImmediately() {
    return redirectImmediately;
  }


  public void setRedirectImmediately(Boolean redirectImmediately) {
    
    
    
    this.redirectImmediately = redirectImmediately;
  }


  public TransactionStatusPayment autoRedirectionTimer(Integer autoRedirectionTimer) {
    
    
    
    
    this.autoRedirectionTimer = autoRedirectionTimer;
    return this;
  }

   /**
   * Get autoRedirectionTimer
   * @return autoRedirectionTimer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAutoRedirectionTimer() {
    return autoRedirectionTimer;
  }


  public void setAutoRedirectionTimer(Integer autoRedirectionTimer) {
    
    
    
    this.autoRedirectionTimer = autoRedirectionTimer;
  }


  public TransactionStatusPayment frontendReturnUrl(String frontendReturnUrl) {
    
    
    
    
    this.frontendReturnUrl = frontendReturnUrl;
    return this;
  }

   /**
   * Get frontendReturnUrl
   * @return frontendReturnUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFrontendReturnUrl() {
    return frontendReturnUrl;
  }


  public void setFrontendReturnUrl(String frontendReturnUrl) {
    
    
    
    this.frontendReturnUrl = frontendReturnUrl;
  }


  public TransactionStatusPayment frontendReturnData(String frontendReturnData) {
    
    
    
    
    this.frontendReturnData = frontendReturnData;
    return this;
  }

   /**
   * Get frontendReturnData
   * @return frontendReturnData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFrontendReturnData() {
    return frontendReturnData;
  }


  public void setFrontendReturnData(String frontendReturnData) {
    
    
    
    this.frontendReturnData = frontendReturnData;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the TransactionStatusPayment instance itself
   */
  public TransactionStatusPayment putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionStatusPayment transactionStatusPayment = (TransactionStatusPayment) o;
    return Objects.equals(this.description, transactionStatusPayment.description) &&
        Objects.equals(this.code, transactionStatusPayment.code) &&
        Objects.equals(this.autoRedirect, transactionStatusPayment.autoRedirect) &&
        Objects.equals(this.redirectImmediately, transactionStatusPayment.redirectImmediately) &&
        Objects.equals(this.autoRedirectionTimer, transactionStatusPayment.autoRedirectionTimer) &&
        Objects.equals(this.frontendReturnUrl, transactionStatusPayment.frontendReturnUrl) &&
        Objects.equals(this.frontendReturnData, transactionStatusPayment.frontendReturnData)&&
        Objects.equals(this.additionalProperties, transactionStatusPayment.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, code, autoRedirect, redirectImmediately, autoRedirectionTimer, frontendReturnUrl, frontendReturnData, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionStatusPayment {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    autoRedirect: ").append(toIndentedString(autoRedirect)).append("\n");
    sb.append("    redirectImmediately: ").append(toIndentedString(redirectImmediately)).append("\n");
    sb.append("    autoRedirectionTimer: ").append(toIndentedString(autoRedirectionTimer)).append("\n");
    sb.append("    frontendReturnUrl: ").append(toIndentedString(frontendReturnUrl)).append("\n");
    sb.append("    frontendReturnData: ").append(toIndentedString(frontendReturnData)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("description");
    openapiFields.add("code");
    openapiFields.add("autoRedirect");
    openapiFields.add("redirectImmediately");
    openapiFields.add("autoRedirectionTimer");
    openapiFields.add("frontendReturnUrl");
    openapiFields.add("frontendReturnData");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TransactionStatusPayment
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TransactionStatusPayment.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionStatusPayment is not found in the empty JSON string", TransactionStatusPayment.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("description").isJsonNull() && (jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("code").isJsonNull() && (jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if (!jsonObj.get("frontendReturnUrl").isJsonNull() && (jsonObj.get("frontendReturnUrl") != null && !jsonObj.get("frontendReturnUrl").isJsonNull()) && !jsonObj.get("frontendReturnUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `frontendReturnUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("frontendReturnUrl").toString()));
      }
      if (!jsonObj.get("frontendReturnData").isJsonNull() && (jsonObj.get("frontendReturnData") != null && !jsonObj.get("frontendReturnData").isJsonNull()) && !jsonObj.get("frontendReturnData").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `frontendReturnData` to be a primitive type in the JSON string but got `%s`", jsonObj.get("frontendReturnData").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionStatusPayment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionStatusPayment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionStatusPayment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionStatusPayment.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionStatusPayment>() {
           @Override
           public void write(JsonWriter out, TransactionStatusPayment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public TransactionStatusPayment read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TransactionStatusPayment instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TransactionStatusPayment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionStatusPayment
  * @throws IOException if the JSON string is invalid with respect to TransactionStatusPayment
  */
  public static TransactionStatusPayment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionStatusPayment.class);
  }

 /**
  * Convert an instance of TransactionStatusPayment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

