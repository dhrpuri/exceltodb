package com.example.exceltodb.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommerceRegistryDTO {
    private String companyIssueAuthorityID;
    private String issueAuthorityCommerceRegistryNumber;
    private int companyDuration;
    private int shareType;
    private int shareValue;
    private int numberOfShares;
    private int capitalNominatedAmount;
    private int capitalPaidAmount;
    private int capitalInvestedInDubai;
    private int attestationAuthority;
    private int currency;
    private String nationalRegistryNumber;
}
