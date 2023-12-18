package com.example.exceltodb.model.request;

import lombok.Data;

@Data
public class LegalEntityAssociationRequest {
    private LegalEntityDTO legalEntity;
    private LegalEntityDTO associatedLegalEntity;
    private int associationType;
    private String startDate;
    private String expiryDate;
    private int status;
}
