package com.example.exceltodb.pojo;

import lombok.Data;

import java.util.List;

@Data
public class LegalContract {

    private String	companyIssueAuthorityID	;
    private String	issueAuthorityContractNumber	;
    private Integer	companyDuration	;
    private Integer	numberOfShares	;
    private String	shareValue	;
    private String	capital	;
    private Integer	directorTenure	;
    private String	issueDate	;
    private Integer	contractType	;
    private List<PersonAuthorities> personAuthorities	;
}
