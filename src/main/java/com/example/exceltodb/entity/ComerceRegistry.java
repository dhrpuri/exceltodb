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
@Table(name = "comerce_registry")
public class ComerceRegistry {
    @Id
    private String commerceRegistryNumber;

    private String issueAuthorityId1;

    private String issueAuthorityCommerceRegistryNumber;

    private String companyId;

    private String companyDuration;

    private String shareTypeId;

    private String shareValue;

    private String numberOfShares;

    private String capitalNominatedAmount;

    private String capitalPaidAmount;

    private String capitalInvestedInDubai;

    private String attestationAuthorityId;

    private String currencyId;

    private String nationalRegistryNumber;
}
