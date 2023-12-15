package com.example.exceltodb.pojo;

import lombok.Data;

@Data
public class CompanyMembers {
    private LegalEntity legalEntity;
    private String	companyIssueAuthorityID;
    private Integer	status;
    private String	addDate;
    private String	cancelDate;
    private Integer	memberRole;

}
