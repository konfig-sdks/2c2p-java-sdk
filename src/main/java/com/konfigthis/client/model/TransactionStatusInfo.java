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
import com.konfigthis.client.model.TransactionStatusLoyaltyInfo;
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
 * TransactionStatusInfo
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TransactionStatusInfo {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DATE_TIME = "dateTime";
  @SerializedName(SERIALIZED_NAME_DATE_TIME)
  private String dateTime;

  public static final String SERIALIZED_NAME_AGENT_CODE = "agentCode";
  @SerializedName(SERIALIZED_NAME_AGENT_CODE)
  private String agentCode;

  public static final String SERIALIZED_NAME_CHANNEL_CODE = "channelCode";
  @SerializedName(SERIALIZED_NAME_CHANNEL_CODE)
  private String channelCode;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private String data;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_INVOICE_NO = "invoiceNo";
  @SerializedName(SERIALIZED_NAME_INVOICE_NO)
  private String invoiceNo;

  public static final String SERIALIZED_NAME_INSTALLMENT_PERIOD = "installmentPeriod";
  @SerializedName(SERIALIZED_NAME_INSTALLMENT_PERIOD)
  private Integer installmentPeriod;

  public static final String SERIALIZED_NAME_PAY_LATER_PERIOD = "payLaterPeriod";
  @SerializedName(SERIALIZED_NAME_PAY_LATER_PERIOD)
  private Integer payLaterPeriod;

  public static final String SERIALIZED_NAME_INTEREST_TYPE = "interestType";
  @SerializedName(SERIALIZED_NAME_INTEREST_TYPE)
  private String interestType;

  public static final String SERIALIZED_NAME_INTEREST_RATE = "interestRate";
  @SerializedName(SERIALIZED_NAME_INTEREST_RATE)
  private Double interestRate;

  public static final String SERIALIZED_NAME_MONTHLY_PAYMENT = "monthlyPayment";
  @SerializedName(SERIALIZED_NAME_MONTHLY_PAYMENT)
  private String monthlyPayment;

  public static final String SERIALIZED_NAME_IPP_ADDITIONAL_INFO = "ippAdditionalInfo";
  @SerializedName(SERIALIZED_NAME_IPP_ADDITIONAL_INFO)
  private String ippAdditionalInfo;

  public static final String SERIALIZED_NAME_REMAINDER_CHARGE_MODE = "remainderChargeMode";
  @SerializedName(SERIALIZED_NAME_REMAINDER_CHARGE_MODE)
  private String remainderChargeMode;

  public static final String SERIALIZED_NAME_REMAINDER_CHARGE_AMOUNT = "remainderChargeAmount";
  @SerializedName(SERIALIZED_NAME_REMAINDER_CHARGE_AMOUNT)
  private Double remainderChargeAmount;

  public static final String SERIALIZED_NAME_LOYALTY_POINTS = "loyaltyPoints";
  @SerializedName(SERIALIZED_NAME_LOYALTY_POINTS)
  private List<TransactionStatusLoyaltyInfo> loyaltyPoints = null;

  public TransactionStatusInfo() {
  }

  public TransactionStatusInfo description(String description) {
    
    
    
    
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


  public TransactionStatusInfo dateTime(String dateTime) {
    
    
    
    
    this.dateTime = dateTime;
    return this;
  }

   /**
   * Get dateTime
   * @return dateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDateTime() {
    return dateTime;
  }


  public void setDateTime(String dateTime) {
    
    
    
    this.dateTime = dateTime;
  }


  public TransactionStatusInfo agentCode(String agentCode) {
    
    
    
    
    this.agentCode = agentCode;
    return this;
  }

   /**
   * Get agentCode
   * @return agentCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAgentCode() {
    return agentCode;
  }


  public void setAgentCode(String agentCode) {
    
    
    
    this.agentCode = agentCode;
  }


  public TransactionStatusInfo channelCode(String channelCode) {
    
    
    
    
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


  public TransactionStatusInfo data(String data) {
    
    
    
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getData() {
    return data;
  }


  public void setData(String data) {
    
    
    
    this.data = data;
  }


  public TransactionStatusInfo amount(String amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    
    
    
    this.amount = amount;
  }


  public TransactionStatusInfo currencyCode(String currencyCode) {
    
    
    
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(String currencyCode) {
    
    
    
    this.currencyCode = currencyCode;
  }


  public TransactionStatusInfo invoiceNo(String invoiceNo) {
    
    
    
    
    this.invoiceNo = invoiceNo;
    return this;
  }

   /**
   * Get invoiceNo
   * @return invoiceNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInvoiceNo() {
    return invoiceNo;
  }


  public void setInvoiceNo(String invoiceNo) {
    
    
    
    this.invoiceNo = invoiceNo;
  }


  public TransactionStatusInfo installmentPeriod(Integer installmentPeriod) {
    
    
    
    
    this.installmentPeriod = installmentPeriod;
    return this;
  }

   /**
   * Get installmentPeriod
   * @return installmentPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getInstallmentPeriod() {
    return installmentPeriod;
  }


  public void setInstallmentPeriod(Integer installmentPeriod) {
    
    
    
    this.installmentPeriod = installmentPeriod;
  }


  public TransactionStatusInfo payLaterPeriod(Integer payLaterPeriod) {
    
    
    
    
    this.payLaterPeriod = payLaterPeriod;
    return this;
  }

   /**
   * Get payLaterPeriod
   * @return payLaterPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPayLaterPeriod() {
    return payLaterPeriod;
  }


  public void setPayLaterPeriod(Integer payLaterPeriod) {
    
    
    
    this.payLaterPeriod = payLaterPeriod;
  }


  public TransactionStatusInfo interestType(String interestType) {
    
    
    
    
    this.interestType = interestType;
    return this;
  }

   /**
   * Get interestType
   * @return interestType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInterestType() {
    return interestType;
  }


  public void setInterestType(String interestType) {
    
    
    
    this.interestType = interestType;
  }


  public TransactionStatusInfo interestRate(Double interestRate) {
    
    
    
    
    this.interestRate = interestRate;
    return this;
  }

   /**
   * Get interestRate
   * @return interestRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getInterestRate() {
    return interestRate;
  }


  public void setInterestRate(Double interestRate) {
    
    
    
    this.interestRate = interestRate;
  }


  public TransactionStatusInfo monthlyPayment(String monthlyPayment) {
    
    
    
    
    this.monthlyPayment = monthlyPayment;
    return this;
  }

   /**
   * Get monthlyPayment
   * @return monthlyPayment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMonthlyPayment() {
    return monthlyPayment;
  }


  public void setMonthlyPayment(String monthlyPayment) {
    
    
    
    this.monthlyPayment = monthlyPayment;
  }


  public TransactionStatusInfo ippAdditionalInfo(String ippAdditionalInfo) {
    
    
    
    
    this.ippAdditionalInfo = ippAdditionalInfo;
    return this;
  }

   /**
   * Get ippAdditionalInfo
   * @return ippAdditionalInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIppAdditionalInfo() {
    return ippAdditionalInfo;
  }


  public void setIppAdditionalInfo(String ippAdditionalInfo) {
    
    
    
    this.ippAdditionalInfo = ippAdditionalInfo;
  }


  public TransactionStatusInfo remainderChargeMode(String remainderChargeMode) {
    
    
    
    
    this.remainderChargeMode = remainderChargeMode;
    return this;
  }

   /**
   * Get remainderChargeMode
   * @return remainderChargeMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRemainderChargeMode() {
    return remainderChargeMode;
  }


  public void setRemainderChargeMode(String remainderChargeMode) {
    
    
    
    this.remainderChargeMode = remainderChargeMode;
  }


  public TransactionStatusInfo remainderChargeAmount(Double remainderChargeAmount) {
    
    
    
    
    this.remainderChargeAmount = remainderChargeAmount;
    return this;
  }

   /**
   * Get remainderChargeAmount
   * @return remainderChargeAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getRemainderChargeAmount() {
    return remainderChargeAmount;
  }


  public void setRemainderChargeAmount(Double remainderChargeAmount) {
    
    
    
    this.remainderChargeAmount = remainderChargeAmount;
  }


  public TransactionStatusInfo loyaltyPoints(List<TransactionStatusLoyaltyInfo> loyaltyPoints) {
    
    
    
    
    this.loyaltyPoints = loyaltyPoints;
    return this;
  }

  public TransactionStatusInfo addLoyaltyPointsItem(TransactionStatusLoyaltyInfo loyaltyPointsItem) {
    if (this.loyaltyPoints == null) {
      this.loyaltyPoints = new ArrayList<>();
    }
    this.loyaltyPoints.add(loyaltyPointsItem);
    return this;
  }

   /**
   * Get loyaltyPoints
   * @return loyaltyPoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TransactionStatusLoyaltyInfo> getLoyaltyPoints() {
    return loyaltyPoints;
  }


  public void setLoyaltyPoints(List<TransactionStatusLoyaltyInfo> loyaltyPoints) {
    
    
    
    this.loyaltyPoints = loyaltyPoints;
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
   * @return the TransactionStatusInfo instance itself
   */
  public TransactionStatusInfo putAdditionalProperty(String key, Object value) {
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
    TransactionStatusInfo transactionStatusInfo = (TransactionStatusInfo) o;
    return Objects.equals(this.description, transactionStatusInfo.description) &&
        Objects.equals(this.dateTime, transactionStatusInfo.dateTime) &&
        Objects.equals(this.agentCode, transactionStatusInfo.agentCode) &&
        Objects.equals(this.channelCode, transactionStatusInfo.channelCode) &&
        Objects.equals(this.data, transactionStatusInfo.data) &&
        Objects.equals(this.amount, transactionStatusInfo.amount) &&
        Objects.equals(this.currencyCode, transactionStatusInfo.currencyCode) &&
        Objects.equals(this.invoiceNo, transactionStatusInfo.invoiceNo) &&
        Objects.equals(this.installmentPeriod, transactionStatusInfo.installmentPeriod) &&
        Objects.equals(this.payLaterPeriod, transactionStatusInfo.payLaterPeriod) &&
        Objects.equals(this.interestType, transactionStatusInfo.interestType) &&
        Objects.equals(this.interestRate, transactionStatusInfo.interestRate) &&
        Objects.equals(this.monthlyPayment, transactionStatusInfo.monthlyPayment) &&
        Objects.equals(this.ippAdditionalInfo, transactionStatusInfo.ippAdditionalInfo) &&
        Objects.equals(this.remainderChargeMode, transactionStatusInfo.remainderChargeMode) &&
        Objects.equals(this.remainderChargeAmount, transactionStatusInfo.remainderChargeAmount) &&
        Objects.equals(this.loyaltyPoints, transactionStatusInfo.loyaltyPoints)&&
        Objects.equals(this.additionalProperties, transactionStatusInfo.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, dateTime, agentCode, channelCode, data, amount, currencyCode, invoiceNo, installmentPeriod, payLaterPeriod, interestType, interestRate, monthlyPayment, ippAdditionalInfo, remainderChargeMode, remainderChargeAmount, loyaltyPoints, additionalProperties);
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
    sb.append("class TransactionStatusInfo {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    agentCode: ").append(toIndentedString(agentCode)).append("\n");
    sb.append("    channelCode: ").append(toIndentedString(channelCode)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    invoiceNo: ").append(toIndentedString(invoiceNo)).append("\n");
    sb.append("    installmentPeriod: ").append(toIndentedString(installmentPeriod)).append("\n");
    sb.append("    payLaterPeriod: ").append(toIndentedString(payLaterPeriod)).append("\n");
    sb.append("    interestType: ").append(toIndentedString(interestType)).append("\n");
    sb.append("    interestRate: ").append(toIndentedString(interestRate)).append("\n");
    sb.append("    monthlyPayment: ").append(toIndentedString(monthlyPayment)).append("\n");
    sb.append("    ippAdditionalInfo: ").append(toIndentedString(ippAdditionalInfo)).append("\n");
    sb.append("    remainderChargeMode: ").append(toIndentedString(remainderChargeMode)).append("\n");
    sb.append("    remainderChargeAmount: ").append(toIndentedString(remainderChargeAmount)).append("\n");
    sb.append("    loyaltyPoints: ").append(toIndentedString(loyaltyPoints)).append("\n");
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
    openapiFields.add("dateTime");
    openapiFields.add("agentCode");
    openapiFields.add("channelCode");
    openapiFields.add("data");
    openapiFields.add("amount");
    openapiFields.add("currencyCode");
    openapiFields.add("invoiceNo");
    openapiFields.add("installmentPeriod");
    openapiFields.add("payLaterPeriod");
    openapiFields.add("interestType");
    openapiFields.add("interestRate");
    openapiFields.add("monthlyPayment");
    openapiFields.add("ippAdditionalInfo");
    openapiFields.add("remainderChargeMode");
    openapiFields.add("remainderChargeAmount");
    openapiFields.add("loyaltyPoints");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TransactionStatusInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TransactionStatusInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionStatusInfo is not found in the empty JSON string", TransactionStatusInfo.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("description").isJsonNull() && (jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("dateTime").isJsonNull() && (jsonObj.get("dateTime") != null && !jsonObj.get("dateTime").isJsonNull()) && !jsonObj.get("dateTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dateTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dateTime").toString()));
      }
      if (!jsonObj.get("agentCode").isJsonNull() && (jsonObj.get("agentCode") != null && !jsonObj.get("agentCode").isJsonNull()) && !jsonObj.get("agentCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agentCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agentCode").toString()));
      }
      if (!jsonObj.get("channelCode").isJsonNull() && (jsonObj.get("channelCode") != null && !jsonObj.get("channelCode").isJsonNull()) && !jsonObj.get("channelCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channelCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channelCode").toString()));
      }
      if (!jsonObj.get("data").isJsonNull() && (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) && !jsonObj.get("data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data").toString()));
      }
      if (!jsonObj.get("amount").isJsonNull() && (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonNull()) && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (!jsonObj.get("currencyCode").isJsonNull() && (jsonObj.get("currencyCode") != null && !jsonObj.get("currencyCode").isJsonNull()) && !jsonObj.get("currencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyCode").toString()));
      }
      if (!jsonObj.get("invoiceNo").isJsonNull() && (jsonObj.get("invoiceNo") != null && !jsonObj.get("invoiceNo").isJsonNull()) && !jsonObj.get("invoiceNo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoiceNo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoiceNo").toString()));
      }
      if (!jsonObj.get("interestType").isJsonNull() && (jsonObj.get("interestType") != null && !jsonObj.get("interestType").isJsonNull()) && !jsonObj.get("interestType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `interestType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("interestType").toString()));
      }
      if (!jsonObj.get("monthlyPayment").isJsonNull() && (jsonObj.get("monthlyPayment") != null && !jsonObj.get("monthlyPayment").isJsonNull()) && !jsonObj.get("monthlyPayment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `monthlyPayment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("monthlyPayment").toString()));
      }
      if (!jsonObj.get("ippAdditionalInfo").isJsonNull() && (jsonObj.get("ippAdditionalInfo") != null && !jsonObj.get("ippAdditionalInfo").isJsonNull()) && !jsonObj.get("ippAdditionalInfo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ippAdditionalInfo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ippAdditionalInfo").toString()));
      }
      if (!jsonObj.get("remainderChargeMode").isJsonNull() && (jsonObj.get("remainderChargeMode") != null && !jsonObj.get("remainderChargeMode").isJsonNull()) && !jsonObj.get("remainderChargeMode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remainderChargeMode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remainderChargeMode").toString()));
      }
      if (jsonObj.get("loyaltyPoints") != null && !jsonObj.get("loyaltyPoints").isJsonNull()) {
        JsonArray jsonArrayloyaltyPoints = jsonObj.getAsJsonArray("loyaltyPoints");
        if (jsonArrayloyaltyPoints != null) {
          // ensure the json data is an array
          if (!jsonObj.get("loyaltyPoints").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `loyaltyPoints` to be an array in the JSON string but got `%s`", jsonObj.get("loyaltyPoints").toString()));
          }

          // validate the optional field `loyaltyPoints` (array)
          for (int i = 0; i < jsonArrayloyaltyPoints.size(); i++) {
            TransactionStatusLoyaltyInfo.validateJsonObject(jsonArrayloyaltyPoints.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionStatusInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionStatusInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionStatusInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionStatusInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionStatusInfo>() {
           @Override
           public void write(JsonWriter out, TransactionStatusInfo value) throws IOException {
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
           public TransactionStatusInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TransactionStatusInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TransactionStatusInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionStatusInfo
  * @throws IOException if the JSON string is invalid with respect to TransactionStatusInfo
  */
  public static TransactionStatusInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionStatusInfo.class);
  }

 /**
  * Convert an instance of TransactionStatusInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

