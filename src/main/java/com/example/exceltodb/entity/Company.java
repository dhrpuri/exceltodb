package com.example.exceltodb.entity;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@ToString
@Table(name = "company")
public class Company {
    @Id
    private String id;

    private String issueAuthorityId1;

    private String issueAuthorityId;

    private String arabicName;

    private String englishName;

    private String email;

    private String mobile;

    private String nationalityId;

    private String statusId;

    private String addressId;

    private String legalTypeId;

    private String issueDate;

    private String expiryDate;

    private String cancellationDate;

    private String originLicenceNumber;

    private String isMobileVerified;

    private String mobileVerificationDate;

    private String mobileVerificationChannelId;

    private String isEmailVerified;

    private String emailVerificationDate;

    private String emailVerificationChannelId;

    private String isScreened;

    private String screeningDate;

    private String screeningChannelId;

    private String totalOwnershipShare;

    private String hasDiscrepancy;

    private String hasUboExemption;
}
