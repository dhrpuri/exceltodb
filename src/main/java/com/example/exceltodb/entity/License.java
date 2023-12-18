package com.example.exceltodb.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@ToString
@Table(name = "license")
public class License {
    @Id
    private String unifiedLicenceNumber;

    private String dbn;

    private String issueAuthorityId1;

    private String issueAuthorityLicenceNumber;

    private String issueDate;

    private String expiryDate;

    private String cancellationDate;

    private String freezeStartDate;

    private String freezeEndDate;

    private String categoryId;

    private String activityTypeId;

    private String statusId;

    private String tradeNameUnifiedTradeNameNumber;

    private String companyId;

    private String isMainLicence;

    private String dubaiCoCNumber;

    private String liquidationDate;

    private String icpEstablishmentCard;

    private String mohreEstablishmentCard;

    private String dunsNumber;

    private String tin;

    private String initialApproval;

    private String initialApprovalIssueDate;

    private String initialApprovalExpiryDate;

    private String email;

    private String mobile;

    private String phone;

    private String addressId;

    private String logo;

    private String isFreehold;

    private String lastUpdatedById;

    private String isMobileVerified;

    private String mobileVerificationDate;

    private String mobileVerificationChannelId;

    private String isEmailVerified;

    private String emailVerificationDate;

    private String emailVerificationChannelId;

    private String isScreened;

    private String screeningDate;

    private String screeningChannelId;

    private String isExemptDulCriteriaCheck;

    private String version;
}
