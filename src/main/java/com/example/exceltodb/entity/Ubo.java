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
@Table(name = "ubo")
public class Ubo {

    @Id
    private String id;

    private String issueAuthorityId1;

    private String issueAuthorityId;

    private String legalEntityId;

    private String uboDeclarationId;

    private String addDate;

    private String isPep;

    private String pepProfileId;

    private String pepDetails;
}

