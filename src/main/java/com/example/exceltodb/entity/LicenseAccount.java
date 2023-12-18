package com.example.exceltodb.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@ToString
@Table(name = "license_account")
public class LicenseAccount {
    @Id
    private String unifiedLicenceNumber;

    private String typeId;

    private String account;

}
