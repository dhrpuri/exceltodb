package com.example.exceltodb.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LicenceDTO {
    private String issueAuthorityLicenceNumber;
    private Date issueDate;
    private Date expiryDate;
    private int category;
    private int activityType;
    private int status;
    private String companyIssueAuthorityID;
    private String dubaiCoCNumber;
    private String initialApproval;
    private int lastUpdatedBy;
    private boolean isMobileVerified;
    private Date mobileVerificationDate;
    private int mobileVerificationChannel;
    private boolean isEmailVerified;
    private Date emailVerificationDate;
    private int emailVerificationChannel;
    private String email;
    private String mobile;
    private String phone;
    private boolean isMainLicence;
}