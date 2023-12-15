package com.example.exceltodb.entity;



import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@ToString
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "person_issue_authority_id")
    private String personIssueAuthorityID;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "gender")
    private int gender;

    @Column(name = "unified_id")
    private String unifiedID;

    @Column(name = "emirates_id")
    private String emiratesID;

    @Column(name = "emirates_id_issue_date")
    private Date emiratesIDIssueDate;

    @Column(name = "emirates_id_expiry_date")
    private Date emiratesIDExpiryDate;

    @Column(name = "passport_number")
    private String passportNumber;

    @Column(name = "passport_issue_date")
    private Date passportIssueDate;

    @Column(name = "passport_expiry_date")
    private Date passportExpiryDate;

    @Column(name = "passport_issue_place_english")
    private String passportIssuePlaceEnglish;

    @Column(name = "passport_issue_place_arabic")
    private String passportIssuePlaceArabic;

    @Column(name = "passport_issue_country")
    private String passportIssueCountry;

    @Column(name = "birth_place_english")
    private String birthPlaceEnglish;

    @Column(name = "birth_place_arabic")
    private String birthPlaceArabic;

    @Column(name = "birth_country")
    private String birthCountry;

    @Column(name = "decree_number")
    private String decreeNumber;

    @Column(name = "arabic_name")
    private String arabicName;

    @Column(name = "english_name")
    private String englishName;

    @Column(name = "email")
    private String email;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "status")
    private int status;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "language_preference")
    private int languagePreference;

    @Column(name = "file_number")
    private String fileNumber;

    @Column(name = "gcc_uid")
    private String gCCuid;

    @Column(name = "is_verified_contact")
    private boolean isVerifiedContact;

    @Column(name = "last_updated_by")
    private int lastUpdatedBy;

    @Column(name = "is_mobile_verified")
    private boolean isMobileVerified;

    @Column(name = "mobile_verification_date")
    private LocalDateTime mobileVerificationDate;

    @Column(name = "mobile_verification_channel")
    private int mobileVerificationChannel;

    @Column(name = "is_email_verified")
    private boolean isEmailVerified;

    @Column(name = "email_verification_date")
    private Date emailVerificationDate;

    @Column(name = "email_verification_channel")
    private int emailVerificationChannel;

    @Column(name = "is_screened")
    private boolean isScreened;

    @Column(name = "screening_date")
    private LocalDateTime screeningDate;

    @Column(name = "screening_channel")
    private int screeningChannel;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "person_id")
    private List<Document> documents = new ArrayList<>();

}

