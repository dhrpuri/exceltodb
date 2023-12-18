package com.example.exceltodb.model.request;

import com.example.exceltodb.model.IncomeCountryDTO;
import com.example.exceltodb.model.IncomeSourceDTO;
import com.example.exceltodb.model.LegalEntityDTO;
import com.example.exceltodb.model.UboPersonDTO;
import lombok.Data;

import java.util.List;
@Data
public class UboRequest {

    private String issueAuthorityID;
    private LegalEntityDTO legalEntity;
    private UboPersonDTO uboPerson;
    private String addDate;
    private boolean isPEP;
    private int PEPProfile;
    private String PEPDetails;
    private List<IncomeSourceDTO> incomeSources;
    private List<IncomeCountryDTO> incomeCountries;

}
