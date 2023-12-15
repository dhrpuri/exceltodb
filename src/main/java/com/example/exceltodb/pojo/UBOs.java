package com.example.exceltodb.pojo;

import lombok.Data;

import java.util.List;

@Data
public class UBOs {
    private String	issueAuthorityID;
    private LegalEntity	legalEntity;
    private String	addDate;
    private boolean	isPEP;
    private Integer	PEPProfile;
    private String	PEPDetails;
    private List<IncomeSources>	incomeSources;
    private List<IncomeCountries> incomeCountries;
}
