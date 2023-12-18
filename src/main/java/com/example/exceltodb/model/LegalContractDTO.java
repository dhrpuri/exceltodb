package com.example.exceltodb.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;
import java.util.List;
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LegalContractDTO {
    private String companyIssueAuthorityID;
    private String issueAuthorityContractNumber;
    private int companyDuration;
    private int numberOfShares;
    private int shareValue;
    private int capital;
    private int directorTenure;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date issueDate;

    private int contractType;
    private List<PersonAuthorityDTO> personAuthorities;
}
