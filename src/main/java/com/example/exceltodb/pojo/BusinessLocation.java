package com.example.exceltodb.pojo;

import lombok.Data;

@Data
public class BusinessLocation {

    private String	issueAuthorityLicenceNumber;
    private String	issueAuthorityEjariLicenceNumber;
    private String	makaniNumber;
    private String	ejariNumber;
    private String	DEWAAccountNumber;
    private String	ejariStartDate;
    private String	ejariEndDate;
    private String	ownerName;
    private String	tenantName;
    private String	contractAmount;
    private String	area;
    private boolean	isPrimaryLocation;
    private Integer	areaZone;
    private String	zoneEnglish;
    private String	zoneArabic;
    private Integer	locationCode;
    private String	locationEnglish;
    private String	locationArabic;
}
