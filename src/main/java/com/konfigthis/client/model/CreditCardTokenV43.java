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
 * CreditCardTokenV43
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CreditCardTokenV43 {
  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_ACCOUNT_NO = "accountNo";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NO)
  private String accountNo;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_EXPIRY = "expiry";
  @SerializedName(SERIALIZED_NAME_EXPIRY)
  private String expiry;

  public static final String SERIALIZED_NAME_CHANNEL_CODE = "channelCode";
  @SerializedName(SERIALIZED_NAME_CHANNEL_CODE)
  private String channelCode;

  public static final String SERIALIZED_NAME_SUB_CHANNEL_CODE = "subChannelCode";
  @SerializedName(SERIALIZED_NAME_SUB_CHANNEL_CODE)
  private String subChannelCode;

  public static final String SERIALIZED_NAME_CARD_BRAND = "cardBrand";
  @SerializedName(SERIALIZED_NAME_CARD_BRAND)
  private String cardBrand;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_ICON_URL = "iconUrl";
  @SerializedName(SERIALIZED_NAME_ICON_URL)
  private String iconUrl;

  public static final String SERIALIZED_NAME_LOGO_URL = "logoUrl";
  @SerializedName(SERIALIZED_NAME_LOGO_URL)
  private String logoUrl;

  public CreditCardTokenV43() {
  }

  public CreditCardTokenV43 token(String token) {
    
    
    
    
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    
    
    
    this.token = token;
  }


  public CreditCardTokenV43 accountNo(String accountNo) {
    
    
    
    
    this.accountNo = accountNo;
    return this;
  }

   /**
   * Get accountNo
   * @return accountNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccountNo() {
    return accountNo;
  }


  public void setAccountNo(String accountNo) {
    
    
    
    this.accountNo = accountNo;
  }


  public CreditCardTokenV43 name(String name) {
    
    
    
    
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


  public CreditCardTokenV43 email(String email) {
    
    
    
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    
    
    
    this.email = email;
  }


  public CreditCardTokenV43 expiry(String expiry) {
    
    
    
    
    this.expiry = expiry;
    return this;
  }

   /**
   * Get expiry
   * @return expiry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExpiry() {
    return expiry;
  }


  public void setExpiry(String expiry) {
    
    
    
    this.expiry = expiry;
  }


  public CreditCardTokenV43 channelCode(String channelCode) {
    
    
    
    
    this.channelCode = channelCode;
    return this;
  }

   /**
   * Get channelCode
   * @return channelCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChannelCode() {
    return channelCode;
  }


  public void setChannelCode(String channelCode) {
    
    
    
    this.channelCode = channelCode;
  }


  public CreditCardTokenV43 subChannelCode(String subChannelCode) {
    
    
    
    
    this.subChannelCode = subChannelCode;
    return this;
  }

   /**
   * Get subChannelCode
   * @return subChannelCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubChannelCode() {
    return subChannelCode;
  }


  public void setSubChannelCode(String subChannelCode) {
    
    
    
    this.subChannelCode = subChannelCode;
  }


  public CreditCardTokenV43 cardBrand(String cardBrand) {
    
    
    
    
    this.cardBrand = cardBrand;
    return this;
  }

   /**
   * Get cardBrand
   * @return cardBrand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCardBrand() {
    return cardBrand;
  }


  public void setCardBrand(String cardBrand) {
    
    
    
    this.cardBrand = cardBrand;
  }


  public CreditCardTokenV43 status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
  }


  public CreditCardTokenV43 iconUrl(String iconUrl) {
    
    
    
    
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


  public CreditCardTokenV43 logoUrl(String logoUrl) {
    
    
    
    
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * Get logoUrl
   * @return logoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLogoUrl() {
    return logoUrl;
  }


  public void setLogoUrl(String logoUrl) {
    
    
    
    this.logoUrl = logoUrl;
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
   * @return the CreditCardTokenV43 instance itself
   */
  public CreditCardTokenV43 putAdditionalProperty(String key, Object value) {
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
    CreditCardTokenV43 creditCardTokenV43 = (CreditCardTokenV43) o;
    return Objects.equals(this.token, creditCardTokenV43.token) &&
        Objects.equals(this.accountNo, creditCardTokenV43.accountNo) &&
        Objects.equals(this.name, creditCardTokenV43.name) &&
        Objects.equals(this.email, creditCardTokenV43.email) &&
        Objects.equals(this.expiry, creditCardTokenV43.expiry) &&
        Objects.equals(this.channelCode, creditCardTokenV43.channelCode) &&
        Objects.equals(this.subChannelCode, creditCardTokenV43.subChannelCode) &&
        Objects.equals(this.cardBrand, creditCardTokenV43.cardBrand) &&
        Objects.equals(this.status, creditCardTokenV43.status) &&
        Objects.equals(this.iconUrl, creditCardTokenV43.iconUrl) &&
        Objects.equals(this.logoUrl, creditCardTokenV43.logoUrl)&&
        Objects.equals(this.additionalProperties, creditCardTokenV43.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, accountNo, name, email, expiry, channelCode, subChannelCode, cardBrand, status, iconUrl, logoUrl, additionalProperties);
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
    sb.append("class CreditCardTokenV43 {\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
    sb.append("    channelCode: ").append(toIndentedString(channelCode)).append("\n");
    sb.append("    subChannelCode: ").append(toIndentedString(subChannelCode)).append("\n");
    sb.append("    cardBrand: ").append(toIndentedString(cardBrand)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
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
    openapiFields.add("token");
    openapiFields.add("accountNo");
    openapiFields.add("name");
    openapiFields.add("email");
    openapiFields.add("expiry");
    openapiFields.add("channelCode");
    openapiFields.add("subChannelCode");
    openapiFields.add("cardBrand");
    openapiFields.add("status");
    openapiFields.add("iconUrl");
    openapiFields.add("logoUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreditCardTokenV43
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreditCardTokenV43.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreditCardTokenV43 is not found in the empty JSON string", CreditCardTokenV43.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("token").isJsonNull() && (jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if (!jsonObj.get("accountNo").isJsonNull() && (jsonObj.get("accountNo") != null && !jsonObj.get("accountNo").isJsonNull()) && !jsonObj.get("accountNo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountNo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountNo").toString()));
      }
      if (!jsonObj.get("name").isJsonNull() && (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("email").isJsonNull() && (jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (!jsonObj.get("expiry").isJsonNull() && (jsonObj.get("expiry") != null && !jsonObj.get("expiry").isJsonNull()) && !jsonObj.get("expiry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expiry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expiry").toString()));
      }
      if (!jsonObj.get("channelCode").isJsonNull() && (jsonObj.get("channelCode") != null && !jsonObj.get("channelCode").isJsonNull()) && !jsonObj.get("channelCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channelCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channelCode").toString()));
      }
      if (!jsonObj.get("subChannelCode").isJsonNull() && (jsonObj.get("subChannelCode") != null && !jsonObj.get("subChannelCode").isJsonNull()) && !jsonObj.get("subChannelCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subChannelCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subChannelCode").toString()));
      }
      if (!jsonObj.get("cardBrand").isJsonNull() && (jsonObj.get("cardBrand") != null && !jsonObj.get("cardBrand").isJsonNull()) && !jsonObj.get("cardBrand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardBrand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardBrand").toString()));
      }
      if (!jsonObj.get("status").isJsonNull() && (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (!jsonObj.get("iconUrl").isJsonNull() && (jsonObj.get("iconUrl") != null && !jsonObj.get("iconUrl").isJsonNull()) && !jsonObj.get("iconUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iconUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iconUrl").toString()));
      }
      if (!jsonObj.get("logoUrl").isJsonNull() && (jsonObj.get("logoUrl") != null && !jsonObj.get("logoUrl").isJsonNull()) && !jsonObj.get("logoUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logoUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logoUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreditCardTokenV43.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreditCardTokenV43' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreditCardTokenV43> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreditCardTokenV43.class));

       return (TypeAdapter<T>) new TypeAdapter<CreditCardTokenV43>() {
           @Override
           public void write(JsonWriter out, CreditCardTokenV43 value) throws IOException {
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
           public CreditCardTokenV43 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CreditCardTokenV43 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CreditCardTokenV43 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreditCardTokenV43
  * @throws IOException if the JSON string is invalid with respect to CreditCardTokenV43
  */
  public static CreditCardTokenV43 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreditCardTokenV43.class);
  }

 /**
  * Convert an instance of CreditCardTokenV43 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

