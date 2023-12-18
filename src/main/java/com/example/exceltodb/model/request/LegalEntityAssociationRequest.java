package com.example.exceltodb.model.request;

import com.example.exceltodb.model.LegalEntityDTO;
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
