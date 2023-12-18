package com.example.exceltodb.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@ToString
@NoArgsConstructor
@Table(name = "trade_name")
public class TradeName {

    @Id
    private String unifiedTradeNameNumber;

    private String issueAuthorityId1;

    private String issueAuthorityTradeNameNumber;

    private String arabicName;

    private String englishName;

    private String issueDate;

    private String expiryDate;

    private String statusId;

    private String activityGroupCode;
}

