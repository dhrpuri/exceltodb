package com.example.exceltodb.pojo;

import lombok.Data;

@Data
public class Company {
    private String	companyIssueAuthorityID;
    private String	arabicName;
    private String	englishName;
    private String	email;
    private String	mobile;
    private String	nationality;
    private Integer	status;
    private Integer legalType;
    private String	issueDate;
    private String	expiryDate;
    private String	cancellationDate;
    private String	originLicenceNumber;
    private boolean	isMobileVerified;
    private String	mobileVerificationDate;
    private Integer mobileVerificationChannel;
    private boolean	isEmailVerified;
    private String	emailVerificationDate;
    private Integer	emailVerificationChannel;
    private boolean	isScreened;
    private String	screeningDate;
    private Integer	screeningChannel;
    private boolean	hasDiscrepancy;
    private boolean	hasUBOExemption;
}
