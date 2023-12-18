package com.example.exceltodb.model;

import lombok.Data;

@Data
public class CompanyMembersDTO {
    private LegalEntityDTO legalEntity;
    private String	companyIssueAuthorityID;
    private Integer	status;
    private String	addDate;
    private String	cancelDate;
    private Integer	memberRole;

}
