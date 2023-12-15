package com.example.exceltodb.pojo;

import lombok.Data;

@Data
public class Ownership {

    private String	companyIssueAuthorityID	;
    private LegalEntity	legalEntity	;
    private String	ownershipShare	;
    private String	profitLossShare	;
    private Integer	status	;
    private String	addDate	;
    private String	cancelDate	;
    private Integer	investorRole	;
    private Integer	displaySequence	;

}
