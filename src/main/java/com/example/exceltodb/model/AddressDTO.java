package com.example.exceltodb.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddressDTO {
    private String issueAuthorityLicenceNumber;
    private String personIssueAuthorityID;
    private String companyIssueAuthorityID;
    private String areaCode;
    private int addressType;
    private String poBox;
    private String addressLine1;
    private String addressLine2;
    private String floor;
    private String street;
    private int unitType;
    private String unitNumber;
    private String parcelID;
    private String country;
    private int emirate;
    private String state;
    private int freezone;
    private double longitude;
    private double latitude;
}