package com.example.exceltodb.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;
import java.util.List;
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UBODeclarationDTO {
    private String companyIssueAuthorityID;
    private String mobile;
    private int channel;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    private Date notificationDate;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    private Date declarationDate;
    private boolean	isExemptIncomeSourceCheck;
    private boolean	isExemptPEPDeclaration;

    private List<UboDTO> UBOs;
}
