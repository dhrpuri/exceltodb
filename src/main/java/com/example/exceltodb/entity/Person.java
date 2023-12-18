package com.example.exceltodb.entity;



import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;


@Data
@NoArgsConstructor
@Entity
@ToString
@Table(name = "person")
public class Person {
    @Id
    private String id;
    private String issueAuthorityId1;
    private String issueAuthorityId;
    private String birthDate;
    private String genderId;
    private String unifiedId;
    private String emiratesId;
    private String emiratesIdIssueDate;
    private String emiratesIdExpiryDate;
    private String passportNumber;
    private String passportIssueDate;
    private String passportExpiryDate;
    private String passportIssuePlaceEnglish;
    private String passportIssuePlaceArabic;
    private String passportIssueCountryId;
    private String birthPlaceEnglish;
    private String birthPlaceArabic;
    private String birthCountryId;
    private String decreeNumber;
    private String arabicName;
    private String englishName;
    private String email;
    private String mobile;
    private String statusId;
    private String statusReasonId;
    private String activePersonId;
    private String nationalityId;
    private String addressId;
    private String languagePreferenceId;
    private String fileNumber;
    private String gccUid;
    private String familyBookNumber;
    private String isVerifiedContact;
    private String lastUpdatedById;
    private String isMobileVerified;
    private String mobileVerificationDate;
    private String mobileVerificationChannelId;
    private String isEmailVerified;
    private String emailVerificationDate;
    private String emailVerificationChannelId;
    private String isScreened;
    private String screeningDate;
    private String screeningChannelId;

}

