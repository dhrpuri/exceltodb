package com.example.exceltodb.pojo;

import lombok.Data;

import java.util.List;

@Data
public class DIMCompany {

    private Company company;
    private List<Ownership> ownerships;
    private List<CompanyMembers> companyMembers;
    private List<CompanyActivities> companyActivities;
    private UBODeclaration uboDeclaration;
    private LegalContract legalContract;
    private CommerceRegistry commerceRegistry;
}
