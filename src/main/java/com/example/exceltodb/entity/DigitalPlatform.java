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
@Table(name = "digital_platform")
public class DigitalPlatform {

    @Id
    private String unifiedLicenceNumber;

    private String typeId;

    private String account;

}
