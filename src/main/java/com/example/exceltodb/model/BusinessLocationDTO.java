package com.example.exceltodb.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BusinessLocationDTO {
    private String issueAuthorityLicenceNumber;
    private String issueAuthorityEjariLicenceNumber;
    private String makaniNumber;
    private String ejariNumber;
    private String DEWAAccountNumber;
    private Date ejariStartDate;
    private Date ejariEndDate;
    private String ownerName;
    private String tenantName;
    private double contractAmount;
    private double area;
    private int areaZone;
    private int locationCode;

    // getters and setters
}