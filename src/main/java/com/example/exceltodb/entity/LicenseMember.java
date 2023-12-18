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
@Table(name = "license_member")
public class LicenseMember {
    @Id
    private String id;

    private String legalEntityId;

    private String unifiedLicenceNumber;

    private String statusId;

    private String addDate;

    private String cancelDate;

    private String memberRoleId;
}
