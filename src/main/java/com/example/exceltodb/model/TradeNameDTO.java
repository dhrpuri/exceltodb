package com.example.exceltodb.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TradeNameDTO {
    private String issueAuthorityTradeNameNumber;
    private String issueAuthorityLicenceNumber;
    private String arabicName;
    private String englishName;
    private Date issueDate;
    private Date expiryDate;
    private int status;
    private int activityGroup;

    // getters and setters
}