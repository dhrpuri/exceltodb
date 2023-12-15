package com.example.exceltodb.pojo;

import lombok.Data;

@Data
public class TradeName {

    private String	issueAuthorityTradeNameNumber;
    private String	issueAuthorityLicenceNumber;
    private String	arabicName;
    private String	englishName;
    private String	issueDate;
    private String	expiryDate;
    private Integer	status;
    private Integer	activityGroup;
}
