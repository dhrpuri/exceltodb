package com.example.exceltodb.pojo;

import lombok.Data;

import javax.persistence.criteria.CriteriaBuilder;

@Data
public class CommerceRegistry {
    private String	companyIssueAuthorityID;
    private String	issueAuthorityCommerceRegistryNumber;
    private Integer	companyDuration;
    private Integer	shareType;
    private String	shareValue;
    private String	numberOfShares;
    private String	capitalNominatedAmount;
    private String	capitalPaidAmount;
    private String	capitalInvestedInDubai;
    private Integer	attestationAuthority;
    private Integer currency;
    private String	nationalRegistryNumber;
}
