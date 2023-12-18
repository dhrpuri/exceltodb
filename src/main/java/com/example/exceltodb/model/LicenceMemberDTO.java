package com.example.exceltodb.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LicenceMemberDTO {
    private LegalEntityDTO legalEntity;
    private String issueAuthorityLicenceNumber;
    private int status;
    private Date addDate;
    private Date cancelDate;
    private int memberRole;

    // getters and setters
}