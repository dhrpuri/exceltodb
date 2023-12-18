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
@Table(name = "legal_contract")
public class LegalContract {
    @Id
    private String id;

    private String unifiedLicenceNumber;

    private String companyId;

    private String issueAuthorityId;

    private String issueAuthorityContractNumber;

    private String companyDuration;

    private String numberOfShares;

    private String shareValue;

    private String capital;

    private String directorTenure;

    private String issueDate;

    private String contractTypeId;
}
