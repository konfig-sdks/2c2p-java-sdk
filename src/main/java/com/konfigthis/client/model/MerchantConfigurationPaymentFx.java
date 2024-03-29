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
import com.konfigthis.client.model.MerchantConfigurationPaymentFxRate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * MerchantConfigurationPaymentFx
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class MerchantConfigurationPaymentFx {
  public static final String SERIALIZED_NAME_MCP = "mcp";
  @SerializedName(SERIALIZED_NAME_MCP)
  private MerchantConfigurationPaymentFxRate mcp;

  public static final String SERIALIZED_NAME_DCC = "dcc";
  @SerializedName(SERIALIZED_NAME_DCC)
  private MerchantConfigurationPaymentFxRate dcc;

  public static final String SERIALIZED_NAME_APM_MCC = "apmMcc";
  @SerializedName(SERIALIZED_NAME_APM_MCC)
  private MerchantConfigurationPaymentFxRate apmMcc;

  public MerchantConfigurationPaymentFx() {
  }

  public MerchantConfigurationPaymentFx mcp(MerchantConfigurationPaymentFxRate mcp) {
    
    
    
    
    this.mcp = mcp;
    return this;
  }

   /**
   * Get mcp
   * @return mcp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MerchantConfigurationPaymentFxRate getMcp() {
    return mcp;
  }


  public void setMcp(MerchantConfigurationPaymentFxRate mcp) {
    
    
    
    this.mcp = mcp;
  }


  public MerchantConfigurationPaymentFx dcc(MerchantConfigurationPaymentFxRate dcc) {
    
    
    
    
    this.dcc = dcc;
    return this;
  }

   /**
   * Get dcc
   * @return dcc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MerchantConfigurationPaymentFxRate getDcc() {
    return dcc;
  }


  public void setDcc(MerchantConfigurationPaymentFxRate dcc) {
    
    
    
    this.dcc = dcc;
  }


  public MerchantConfigurationPaymentFx apmMcc(MerchantConfigurationPaymentFxRate apmMcc) {
    
    
    
    
    this.apmMcc = apmMcc;
    return this;
  }

   /**
   * Get apmMcc
   * @return apmMcc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MerchantConfigurationPaymentFxRate getApmMcc() {
    return apmMcc;
  }


  public void setApmMcc(MerchantConfigurationPaymentFxRate apmMcc) {
    
    
    
    this.apmMcc = apmMcc;
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
   * @return the MerchantConfigurationPaymentFx instance itself
   */
  public MerchantConfigurationPaymentFx putAdditionalProperty(String key, Object value) {
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
    MerchantConfigurationPaymentFx merchantConfigurationPaymentFx = (MerchantConfigurationPaymentFx) o;
    return Objects.equals(this.mcp, merchantConfigurationPaymentFx.mcp) &&
        Objects.equals(this.dcc, merchantConfigurationPaymentFx.dcc) &&
        Objects.equals(this.apmMcc, merchantConfigurationPaymentFx.apmMcc)&&
        Objects.equals(this.additionalProperties, merchantConfigurationPaymentFx.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mcp, dcc, apmMcc, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantConfigurationPaymentFx {\n");
    sb.append("    mcp: ").append(toIndentedString(mcp)).append("\n");
    sb.append("    dcc: ").append(toIndentedString(dcc)).append("\n");
    sb.append("    apmMcc: ").append(toIndentedString(apmMcc)).append("\n");
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
    openapiFields.add("mcp");
    openapiFields.add("dcc");
    openapiFields.add("apmMcc");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MerchantConfigurationPaymentFx
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MerchantConfigurationPaymentFx.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MerchantConfigurationPaymentFx is not found in the empty JSON string", MerchantConfigurationPaymentFx.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `mcp`
      if (jsonObj.get("mcp") != null && !jsonObj.get("mcp").isJsonNull()) {
        MerchantConfigurationPaymentFxRate.validateJsonObject(jsonObj.getAsJsonObject("mcp"));
      }
      // validate the optional field `dcc`
      if (jsonObj.get("dcc") != null && !jsonObj.get("dcc").isJsonNull()) {
        MerchantConfigurationPaymentFxRate.validateJsonObject(jsonObj.getAsJsonObject("dcc"));
      }
      // validate the optional field `apmMcc`
      if (jsonObj.get("apmMcc") != null && !jsonObj.get("apmMcc").isJsonNull()) {
        MerchantConfigurationPaymentFxRate.validateJsonObject(jsonObj.getAsJsonObject("apmMcc"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MerchantConfigurationPaymentFx.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MerchantConfigurationPaymentFx' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MerchantConfigurationPaymentFx> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MerchantConfigurationPaymentFx.class));

       return (TypeAdapter<T>) new TypeAdapter<MerchantConfigurationPaymentFx>() {
           @Override
           public void write(JsonWriter out, MerchantConfigurationPaymentFx value) throws IOException {
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
           public MerchantConfigurationPaymentFx read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MerchantConfigurationPaymentFx instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MerchantConfigurationPaymentFx given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MerchantConfigurationPaymentFx
  * @throws IOException if the JSON string is invalid with respect to MerchantConfigurationPaymentFx
  */
  public static MerchantConfigurationPaymentFx fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MerchantConfigurationPaymentFx.class);
  }

 /**
  * Convert an instance of MerchantConfigurationPaymentFx to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

