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

import java.time.OffsetDateTime;
import java.util.Objects;
/**
 * OperatingActivities
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-12-18T11:35:52.868958+04:00[Asia/Dubai]")

public class OperatingActivities {
  @JsonProperty("issueAuthorityLicenceNumber")
  private String issueAuthorityLicenceNumber = null;

  @JsonProperty("activity")
  private String activity = null;

  @JsonProperty("addDate")
  private OffsetDateTime addDate = null;

  @JsonProperty("cancelDate")
  private OffsetDateTime cancelDate = null;

  @JsonProperty("status")
  private Integer status = null;

  @JsonProperty("activitySpecification")
  private String activitySpecification = null;

  public OperatingActivities issueAuthorityLicenceNumber(String issueAuthorityLicenceNumber) {
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

  public OperatingActivities activity(String activity) {
    this.activity = activity;
    return this;
  }

   /**
   * Get activity
   * @return activity
  **/

  public String getActivity() {
    return activity;
  }

  public void setActivity(String activity) {
    this.activity = activity;
  }

  public OperatingActivities addDate(OffsetDateTime addDate) {
    this.addDate = addDate;
    return this;
  }

   /**
   * Get addDate
   * @return addDate
  **/

  public OffsetDateTime getAddDate() {
    return addDate;
  }

  public void setAddDate(OffsetDateTime addDate) {
    this.addDate = addDate;
  }

  public OperatingActivities cancelDate(OffsetDateTime cancelDate) {
    this.cancelDate = cancelDate;
    return this;
  }

   /**
   * Get cancelDate
   * @return cancelDate
  **/

  public OffsetDateTime getCancelDate() {
    return cancelDate;
  }

  public void setCancelDate(OffsetDateTime cancelDate) {
    this.cancelDate = cancelDate;
  }

  public OperatingActivities status(Integer status) {
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

  public OperatingActivities activitySpecification(String activitySpecification) {
    this.activitySpecification = activitySpecification;
    return this;
  }

   /**
   * Get activitySpecification
   * @return activitySpecification
  **/

  public String getActivitySpecification() {
    return activitySpecification;
  }

  public void setActivitySpecification(String activitySpecification) {
    this.activitySpecification = activitySpecification;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperatingActivities operatingActivities = (OperatingActivities) o;
    return Objects.equals(this.issueAuthorityLicenceNumber, operatingActivities.issueAuthorityLicenceNumber) &&
        Objects.equals(this.activity, operatingActivities.activity) &&
        Objects.equals(this.addDate, operatingActivities.addDate) &&
        Objects.equals(this.cancelDate, operatingActivities.cancelDate) &&
        Objects.equals(this.status, operatingActivities.status) &&
        Objects.equals(this.activitySpecification, operatingActivities.activitySpecification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueAuthorityLicenceNumber, activity, addDate, cancelDate, status, activitySpecification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperatingActivities {\n");
    
    sb.append("    issueAuthorityLicenceNumber: ").append(toIndentedString(issueAuthorityLicenceNumber)).append("\n");
    sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
    sb.append("    addDate: ").append(toIndentedString(addDate)).append("\n");
    sb.append("    cancelDate: ").append(toIndentedString(cancelDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    activitySpecification: ").append(toIndentedString(activitySpecification)).append("\n");
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