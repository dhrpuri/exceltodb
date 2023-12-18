package com.example.exceltodb.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonDTO {
    private String personIssueAuthorityID;
    private String birthDate;
    private int gender;
    private String unifiedID;
    private String emiratesID;
    private String emiratesIDIssueDate;
    private String emiratesIDExpiryDate;
    private String passportNumber;
    private String passportIssueDate;
    private String passportExpiryDate;
    private String passportIssuePlaceEnglish;
    private String passportIssuePlaceArabic;
    private String passportIssueCountry;
    private String birthPlaceEnglish;
    private String birthPlaceArabic;
    private String birthCountry;
    private String decreeNumber;
    private String arabicName;
    private String englishName;
    private String email;
    private String mobile;
    private int status;
    private String nationality;
    private int languagePreference;
    private String fileNumber;
    private String GCCuid;
    private boolean isVerifiedContact;
    private int lastUpdatedBy;
    private boolean isMobileVerified;
    private Date mobileVerificationDate;
    private int mobileVerificationChannel;
    private boolean isEmailVerified;
    private Date emailVerificationDate;
    private int emailVerificationChannel;
    private boolean isScreened;
    private Date screeningDate;
    private int screeningChannel;
}
