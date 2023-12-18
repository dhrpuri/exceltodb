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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/**
 * DIMDocument
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-12-18T11:35:52.868958+04:00[Asia/Dubai]")

public class DIMDocument {
  @JsonProperty("documents")
  private List<Documents> documents = null;

  public DIMDocument documents(List<Documents> documents) {
    this.documents = documents;
    return this;
  }

  public DIMDocument addDocumentsItem(Documents documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<>();
    }
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * Get documents
   * @return documents
  **/

  public List<Documents> getDocuments() {
    return documents;
  }

  public void setDocuments(List<Documents> documents) {
    this.documents = documents;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DIMDocument diMDocument = (DIMDocument) o;
    return Objects.equals(this.documents, diMDocument.documents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DIMDocument {\n");
    
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
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
