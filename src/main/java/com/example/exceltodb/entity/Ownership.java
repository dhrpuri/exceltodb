package com.example.exceltodb.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@ToString
@Table(name = "ownership")
public class Ownership {

    @Id
    private String id;

    private String legalEntityId;

    private String companyId;

    private String profitLossShare;

    private String statusId;

    private String ownershipShare;

    private String addDate;

    private String cancelDate;

    private String investorRoleId;

    private String displaySequence;
}
