package com.example.exceltodb.model.request;

import com.example.exceltodb.model.*;

import java.util.List;

public class LicenceRequest {
    private LicenceDTO license;
    private TradeNameDTO tradeName;
    private List<BusinessLocationDTO> businessLocation;
    private List<DigitalPlatformDTO> digitalPlatform;
    private AddressDTO address;
    private List<LicenceMemberDTO> licenseMembers;
    private List<OperatingActivityDTO> operatingActivities;
    private List<DocumentDTO> documents;
}
