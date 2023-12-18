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

import java.util.Objects;
/**
 * IncomeCountries
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-12-18T11:35:52.868958+04:00[Asia/Dubai]")

public class IncomeCountries {
  @JsonProperty("country")
  private String country = null;

  @JsonProperty("details")
  private String details = null;

  public IncomeCountries country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public IncomeCountries details(String details) {
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/

  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeCountries incomeCountries = (IncomeCountries) o;
    return Objects.equals(this.country, incomeCountries.country) &&
        Objects.equals(this.details, incomeCountries.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, details);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeCountries {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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