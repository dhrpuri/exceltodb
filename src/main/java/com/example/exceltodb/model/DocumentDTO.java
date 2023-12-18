package com.example.exceltodb.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocumentDTO {
    private LegalEntityDTO legalEntity;
    private String issueAuthorityLicenceNumber;
    private int type;
    private Date uploadDate;
    private String issueAuthorityReference;
    private String issueAuthorityTransaction;
    private String issueAuthorityTradeNameNumber;
    private int MIMEType;

    // getters and setters
}