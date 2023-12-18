package com.example.exceltodb.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OwnershipDTO {

    private String	companyIssueAuthorityID;
    private LegalEntityDTO legalEntity;
    private String	ownershipShare;
    private String	profitLossShare;
    private Integer	status;
    private String	addDate;
    private String	cancelDate;
    private Integer	investorRole;
    private Integer	displaySequence;

}
