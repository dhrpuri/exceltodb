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
@Table(name = "businesslocation")
public class BuisnessLocation {

    @Id
    private String unifiedLicenceNumber;

    private String ejariUnifiedLicenceNumber;

    private String makaniNumber;

    private String ejariNumber;

    private String dewaAccountNumber;

    private String ejariStartDate;

    private String ejariEndDate;

    private String ownerName;

    private String tenantName;

    private String contractAmount;

    private String area;

    private String isPrimaryLocation;

    private String areaZone;

    private String zoneEnglish;

    private String zoneArabic;

    private String locationCode;

    private String locationEnglish;

    private String locationArabic;


    
}
