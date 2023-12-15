package com.example.exceltodb.pojo;

import lombok.Data;

@Data
public class Licence {
    private String	DUL;
    private String	issueAuthorityLicenceNumber;
    private String	issueDate;
    private String	expiryDate;
    private String	cancellationDate;
    private String	freezeStartDate;
    private String	freezeEndDate;
    private Integer	category;
    private Integer	activityType;
    private Integer	status;
    private String	companyIssueAuthorityID;
    private boolean	isMainLicence;
    private String	dubaiCoCNumber;
    private String	liquidationDate;
    private String	ICPEstablishmentCard;
    private String	MOHREEstablishmentCard;
    private String	DUNSNumber;
    private String	TIN;
    private String	initialApproval;
    private String	initialApprovalIssueDate;
    private String	initialApprovalExpiryDate;
    private String	email;
    private String	mobile;
    private String	phone;
    private String	logo;
    private Integer	lastUpdatedBy;
    private boolean	isMobileVerified;
    private String	mobileVerificationDate;
    private Integer	mobileVerificationChannel;
    private boolean	isEmailVerified;
    private String	emailVerificationDate;
    private Integer	emailVerificationChannel;
    private boolean	isScreened;
    private String	screeningDate;
    private Integer	screeningChannel;
    private boolean	isExemptDULCriteriaCheck;
}
