package com.example.exceltodb.model.request;

import lombok.Data;

import java.util.List;
@Data
public class CompanyRequest{
    private CompanyDTO company;
    private List<OwnershipDTO> ownerships;
    private List<ComapnyActivitiesDTO> companyActivities;
    private UBODeclarationDTO UBODeclaration;
    private List<LegalContractDTO> legalContract;
    private CommerceRegistryDTO commerceRegistry;
    private AddressDTO address;
    private List<DocumentDTO> documents;

    // getters and setters
}