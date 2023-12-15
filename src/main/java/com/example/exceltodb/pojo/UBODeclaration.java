package com.example.exceltodb.pojo;

import lombok.Data;

import java.util.List;
@Data
public class UBODeclaration {

    private String	companyIssueAuthorityID;
    private String	mobile;
    private Integer	channel;
    private String	notificationDate;
    private String	declarationDate;
    private boolean	isExemptIncomeSourceCheck;
    private boolean	isExemptPEPDeclaration;
    private List<UBOs> ubOsList;
}
