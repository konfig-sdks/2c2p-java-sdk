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
import com.konfigthis.client.model.MerchantConfiguration;
import com.konfigthis.client.model.PaymentOptionDetailsChannel;
import com.konfigthis.client.model.PaymentOptionDetailsValidation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * PaymentOptionDetailsResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PaymentOptionDetailsResponse {
  public static final String SERIALIZED_NAME_TOTAL_CHANNEL = "totalChannel";
  @SerializedName(SERIALIZED_NAME_TOTAL_CHANNEL)
  private Integer totalChannel;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CATEGORY_CODE = "categoryCode";
  @SerializedName(SERIALIZED_NAME_CATEGORY_CODE)
  private String categoryCode;

  public static final String SERIALIZED_NAME_GROUP_CODE = "groupCode";
  @SerializedName(SERIALIZED_NAME_GROUP_CODE)
  private String groupCode;

  public static final String SERIALIZED_NAME_ICON_URL = "iconUrl";
  @SerializedName(SERIALIZED_NAME_ICON_URL)
  private String iconUrl;

  public static final String SERIALIZED_NAME_CHANNELS = "channels";
  @SerializedName(SERIALIZED_NAME_CHANNELS)
  private List<PaymentOptionDetailsChannel> channels = null;

  public static final String SERIALIZED_NAME_VALIDATION = "validation";
  @SerializedName(SERIALIZED_NAME_VALIDATION)
  private PaymentOptionDetailsValidation validation;

  public static final String SERIALIZED_NAME_CONFIGURATION = "configuration";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION)
  private MerchantConfiguration _configuration;

  public static final String SERIALIZED_NAME_RESP_CODE = "respCode";
  @SerializedName(SERIALIZED_NAME_RESP_CODE)
  private String respCode;

  public static final String SERIALIZED_NAME_RESP_DESC = "respDesc";
  @SerializedName(SERIALIZED_NAME_RESP_DESC)
  private String respDesc;

  public PaymentOptionDetailsResponse() {
  }

  public PaymentOptionDetailsResponse totalChannel(Integer totalChannel) {
    
    
    
    
    this.totalChannel = totalChannel;
    return this;
  }

   /**
   * Get totalChannel
   * @return totalChannel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalChannel() {
    return totalChannel;
  }


  public void setTotalChannel(Integer totalChannel) {
    
    
    
    this.totalChannel = totalChannel;
  }


  public PaymentOptionDetailsResponse name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public PaymentOptionDetailsResponse categoryCode(String categoryCode) {
    
    
    
    
    this.categoryCode = categoryCode;
    return this;
  }

   /**
   * Get categoryCode
   * @return categoryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCategoryCode() {
    return categoryCode;
  }


  public void setCategoryCode(String categoryCode) {
    
    
    
    this.categoryCode = categoryCode;
  }


  public PaymentOptionDetailsResponse groupCode(String groupCode) {
    
    
    
    
    this.groupCode = groupCode;
    return this;
  }

   /**
   * Get groupCode
   * @return groupCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGroupCode() {
    return groupCode;
  }


  public void setGroupCode(String groupCode) {
    
    
    
    this.groupCode = groupCode;
  }


  public PaymentOptionDetailsResponse iconUrl(String iconUrl) {
    
    
    
    
    this.iconUrl = iconUrl;
    return this;
  }

   /**
   * Get iconUrl
   * @return iconUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIconUrl() {
    return iconUrl;
  }


  public void setIconUrl(String iconUrl) {
    
    
    
    this.iconUrl = iconUrl;
  }


  public PaymentOptionDetailsResponse channels(List<PaymentOptionDetailsChannel> channels) {
    
    
    
    
    this.channels = channels;
    return this;
  }

  public PaymentOptionDetailsResponse addChannelsItem(PaymentOptionDetailsChannel channelsItem) {
    if (this.channels == null) {
      this.channels = new ArrayList<>();
    }
    this.channels.add(channelsItem);
    return this;
  }

   /**
   * Get channels
   * @return channels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PaymentOptionDetailsChannel> getChannels() {
    return channels;
  }


  public void setChannels(List<PaymentOptionDetailsChannel> channels) {
    
    
    
    this.channels = channels;
  }


  public PaymentOptionDetailsResponse validation(PaymentOptionDetailsValidation validation) {
    
    
    
    
    this.validation = validation;
    return this;
  }

   /**
   * Get validation
   * @return validation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentOptionDetailsValidation getValidation() {
    return validation;
  }


  public void setValidation(PaymentOptionDetailsValidation validation) {
    
    
    
    this.validation = validation;
  }


  public PaymentOptionDetailsResponse _configuration(MerchantConfiguration _configuration) {
    
    
    
    
    this._configuration = _configuration;
    return this;
  }

   /**
   * Get _configuration
   * @return _configuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MerchantConfiguration getConfiguration() {
    return _configuration;
  }


  public void setConfiguration(MerchantConfiguration _configuration) {
    
    
    
    this._configuration = _configuration;
  }


  public PaymentOptionDetailsResponse respCode(String respCode) {
    
    
    
    
    this.respCode = respCode;
    return this;
  }

   /**
   * Get respCode
   * @return respCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRespCode() {
    return respCode;
  }


  public void setRespCode(String respCode) {
    
    
    
    this.respCode = respCode;
  }


  public PaymentOptionDetailsResponse respDesc(String respDesc) {
    
    
    
    
    this.respDesc = respDesc;
    return this;
  }

   /**
   * Get respDesc
   * @return respDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRespDesc() {
    return respDesc;
  }


  public void setRespDesc(String respDesc) {
    
    
    
    this.respDesc = respDesc;
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
   * @return the PaymentOptionDetailsResponse instance itself
   */
  public PaymentOptionDetailsResponse putAdditionalProperty(String key, Object value) {
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
    PaymentOptionDetailsResponse paymentOptionDetailsResponse = (PaymentOptionDetailsResponse) o;
    return Objects.equals(this.totalChannel, paymentOptionDetailsResponse.totalChannel) &&
        Objects.equals(this.name, paymentOptionDetailsResponse.name) &&
        Objects.equals(this.categoryCode, paymentOptionDetailsResponse.categoryCode) &&
        Objects.equals(this.groupCode, paymentOptionDetailsResponse.groupCode) &&
        Objects.equals(this.iconUrl, paymentOptionDetailsResponse.iconUrl) &&
        Objects.equals(this.channels, paymentOptionDetailsResponse.channels) &&
        Objects.equals(this.validation, paymentOptionDetailsResponse.validation) &&
        Objects.equals(this._configuration, paymentOptionDetailsResponse._configuration) &&
        Objects.equals(this.respCode, paymentOptionDetailsResponse.respCode) &&
        Objects.equals(this.respDesc, paymentOptionDetailsResponse.respDesc)&&
        Objects.equals(this.additionalProperties, paymentOptionDetailsResponse.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalChannel, name, categoryCode, groupCode, iconUrl, channels, validation, _configuration, respCode, respDesc, additionalProperties);
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
    sb.append("class PaymentOptionDetailsResponse {\n");
    sb.append("    totalChannel: ").append(toIndentedString(totalChannel)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    categoryCode: ").append(toIndentedString(categoryCode)).append("\n");
    sb.append("    groupCode: ").append(toIndentedString(groupCode)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    respCode: ").append(toIndentedString(respCode)).append("\n");
    sb.append("    respDesc: ").append(toIndentedString(respDesc)).append("\n");
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
    openapiFields.add("totalChannel");
    openapiFields.add("name");
    openapiFields.add("categoryCode");
    openapiFields.add("groupCode");
    openapiFields.add("iconUrl");
    openapiFields.add("channels");
    openapiFields.add("validation");
    openapiFields.add("configuration");
    openapiFields.add("respCode");
    openapiFields.add("respDesc");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentOptionDetailsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PaymentOptionDetailsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentOptionDetailsResponse is not found in the empty JSON string", PaymentOptionDetailsResponse.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonNull() && (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("categoryCode").isJsonNull() && (jsonObj.get("categoryCode") != null && !jsonObj.get("categoryCode").isJsonNull()) && !jsonObj.get("categoryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `categoryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("categoryCode").toString()));
      }
      if (!jsonObj.get("groupCode").isJsonNull() && (jsonObj.get("groupCode") != null && !jsonObj.get("groupCode").isJsonNull()) && !jsonObj.get("groupCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("groupCode").toString()));
      }
      if (!jsonObj.get("iconUrl").isJsonNull() && (jsonObj.get("iconUrl") != null && !jsonObj.get("iconUrl").isJsonNull()) && !jsonObj.get("iconUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iconUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iconUrl").toString()));
      }
      if (jsonObj.get("channels") != null && !jsonObj.get("channels").isJsonNull()) {
        JsonArray jsonArraychannels = jsonObj.getAsJsonArray("channels");
        if (jsonArraychannels != null) {
          // ensure the json data is an array
          if (!jsonObj.get("channels").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `channels` to be an array in the JSON string but got `%s`", jsonObj.get("channels").toString()));
          }

          // validate the optional field `channels` (array)
          for (int i = 0; i < jsonArraychannels.size(); i++) {
            PaymentOptionDetailsChannel.validateJsonObject(jsonArraychannels.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `validation`
      if (jsonObj.get("validation") != null && !jsonObj.get("validation").isJsonNull()) {
        PaymentOptionDetailsValidation.validateJsonObject(jsonObj.getAsJsonObject("validation"));
      }
      // validate the optional field `configuration`
      if (jsonObj.get("configuration") != null && !jsonObj.get("configuration").isJsonNull()) {
        MerchantConfiguration.validateJsonObject(jsonObj.getAsJsonObject("configuration"));
      }
      if (!jsonObj.get("respCode").isJsonNull() && (jsonObj.get("respCode") != null && !jsonObj.get("respCode").isJsonNull()) && !jsonObj.get("respCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `respCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("respCode").toString()));
      }
      if (!jsonObj.get("respDesc").isJsonNull() && (jsonObj.get("respDesc") != null && !jsonObj.get("respDesc").isJsonNull()) && !jsonObj.get("respDesc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `respDesc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("respDesc").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentOptionDetailsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentOptionDetailsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentOptionDetailsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentOptionDetailsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentOptionDetailsResponse>() {
           @Override
           public void write(JsonWriter out, PaymentOptionDetailsResponse value) throws IOException {
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
           public PaymentOptionDetailsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PaymentOptionDetailsResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PaymentOptionDetailsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentOptionDetailsResponse
  * @throws IOException if the JSON string is invalid with respect to PaymentOptionDetailsResponse
  */
  public static PaymentOptionDetailsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentOptionDetailsResponse.class);
  }

 /**
  * Convert an instance of PaymentOptionDetailsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

