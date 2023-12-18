/*
 * DBNDataInMotionAPI
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.example.exceltodb.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.Objects;
/**
 * TradeNameType
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-12-18T11:35:52.868958+04:00[Asia/Dubai]")

public class TradeNameType {
  @JsonProperty("issueAuthorityTradeNameNumber")
  private String issueAuthorityTradeNameNumber = null;

  @JsonProperty("issueAuthorityLicenceNumber")
  private String issueAuthorityLicenceNumber = null;

  @JsonProperty("arabicName")
  private String arabicName = null;

  @JsonProperty("englishName")
  private String englishName = null;

  @JsonProperty("issueDate")
  private LocalDate issueDate = null;

  @JsonProperty("expiryDate")
  private LocalDate expiryDate = null;

  @JsonProperty("status")
  private Integer status = null;

  @JsonProperty("activityGroup")
  private Integer activityGroup = null;

  public TradeNameType issueAuthorityTradeNameNumber(String issueAuthorityTradeNameNumber) {
    this.issueAuthorityTradeNameNumber = issueAuthorityTradeNameNumber;
    return this;
  }

   /**
   * Get issueAuthorityTradeNameNumber
   * @return issueAuthorityTradeNameNumber
  **/

  public String getIssueAuthorityTradeNameNumber() {
    return issueAuthorityTradeNameNumber;
  }

  public void setIssueAuthorityTradeNameNumber(String issueAuthorityTradeNameNumber) {
    this.issueAuthorityTradeNameNumber = issueAuthorityTradeNameNumber;
  }

  public TradeNameType issueAuthorityLicenceNumber(String issueAuthorityLicenceNumber) {
    this.issueAuthorityLicenceNumber = issueAuthorityLicenceNumber;
    return this;
  }

   /**
   * Get issueAuthorityLicenceNumber
   * @return issueAuthorityLicenceNumber
  **/

  public String getIssueAuthorityLicenceNumber() {
    return issueAuthorityLicenceNumber;
  }

  public void setIssueAuthorityLicenceNumber(String issueAuthorityLicenceNumber) {
    this.issueAuthorityLicenceNumber = issueAuthorityLicenceNumber;
  }

  public TradeNameType arabicName(String arabicName) {
    this.arabicName = arabicName;
    return this;
  }

   /**
   * Get arabicName
   * @return arabicName
  **/

  public String getArabicName() {
    return arabicName;
  }

  public void setArabicName(String arabicName) {
    this.arabicName = arabicName;
  }

  public TradeNameType englishName(String englishName) {
    this.englishName = englishName;
    return this;
  }

   /**
   * Get englishName
   * @return englishName
  **/

  public String getEnglishName() {
    return englishName;
  }

  public void setEnglishName(String englishName) {
    this.englishName = englishName;
  }

  public TradeNameType issueDate(LocalDate issueDate) {
    this.issueDate = issueDate;
    return this;
  }

   /**
   * Get issueDate
   * @return issueDate
  **/

  public LocalDate getIssueDate() {
    return issueDate;
  }

  public void setIssueDate(LocalDate issueDate) {
    this.issueDate = issueDate;
  }

  public TradeNameType expiryDate(LocalDate expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Get expiryDate
   * @return expiryDate
  **/

  public LocalDate getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(LocalDate expiryDate) {
    this.expiryDate = expiryDate;
  }

  public TradeNameType status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public TradeNameType activityGroup(Integer activityGroup) {
    this.activityGroup = activityGroup;
    return this;
  }

   /**
   * Get activityGroup
   * @return activityGroup
  **/

  public Integer getActivityGroup() {
    return activityGroup;
  }

  public void setActivityGroup(Integer activityGroup) {
    this.activityGroup = activityGroup;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TradeNameType tradeNameType = (TradeNameType) o;
    return Objects.equals(this.issueAuthorityTradeNameNumber, tradeNameType.issueAuthorityTradeNameNumber) &&
        Objects.equals(this.issueAuthorityLicenceNumber, tradeNameType.issueAuthorityLicenceNumber) &&
        Objects.equals(this.arabicName, tradeNameType.arabicName) &&
        Objects.equals(this.englishName, tradeNameType.englishName) &&
        Objects.equals(this.issueDate, tradeNameType.issueDate) &&
        Objects.equals(this.expiryDate, tradeNameType.expiryDate) &&
        Objects.equals(this.status, tradeNameType.status) &&
        Objects.equals(this.activityGroup, tradeNameType.activityGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueAuthorityTradeNameNumber, issueAuthorityLicenceNumber, arabicName, englishName, issueDate, expiryDate, status, activityGroup);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradeNameType {\n");
    
    sb.append("    issueAuthorityTradeNameNumber: ").append(toIndentedString(issueAuthorityTradeNameNumber)).append("\n");
    sb.append("    issueAuthorityLicenceNumber: ").append(toIndentedString(issueAuthorityLicenceNumber)).append("\n");
    sb.append("    arabicName: ").append(toIndentedString(arabicName)).append("\n");
    sb.append("    englishName: ").append(toIndentedString(englishName)).append("\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    activityGroup: ").append(toIndentedString(activityGroup)).append("\n");
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

}