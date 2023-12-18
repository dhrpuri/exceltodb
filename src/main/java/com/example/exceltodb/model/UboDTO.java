package com.example.exceltodb.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;
import java.util.List;
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UboDTO {
    private String issueAuthorityID;
    private LegalEntityDTO legalEntity;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date addDate;

    private boolean isPEP;
    private int PEPProfile;
    private String PEPDetails;
    private List<IncomeSourceDTO> incomeSources;
    private List<IncomeCountryDTO> incomeCountries;
}
