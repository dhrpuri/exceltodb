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
@Table(name = "legal_entity_association")
public class LegalEntityAssociation {

    @Id
    private String legalEntityId;

    private String associatedLegalEntityId;

    private String associationTypeId;

    private String startDate;

    private String cancellationDate;

    private String expiryDate;

    private String statusId;


}

