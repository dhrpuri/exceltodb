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
 * DIMLegalEntityAssociation
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-12-18T11:35:52.868958+04:00[Asia/Dubai]")

public class DIMLegalEntityAssociation {
  @JsonProperty("legalEntityAssociation")
  private LegalEntityAssociationType legalEntityAssociation = null;

  public DIMLegalEntityAssociation legalEntityAssociation(LegalEntityAssociationType legalEntityAssociation) {
    this.legalEntityAssociation = legalEntityAssociation;
    return this;
  }

   /**
   * Get legalEntityAssociation
   * @return legalEntityAssociation
  **/

  public LegalEntityAssociationType getLegalEntityAssociation() {
    return legalEntityAssociation;
  }

  public void setLegalEntityAssociation(LegalEntityAssociationType legalEntityAssociation) {
    this.legalEntityAssociation = legalEntityAssociation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DIMLegalEntityAssociation diMLegalEntityAssociation = (DIMLegalEntityAssociation) o;
    return Objects.equals(this.legalEntityAssociation, diMLegalEntityAssociation.legalEntityAssociation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(legalEntityAssociation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DIMLegalEntityAssociation {\n");
    
    sb.append("    legalEntityAssociation: ").append(toIndentedString(legalEntityAssociation)).append("\n");
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