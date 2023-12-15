package com.example.exceltodb.entity;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "address")
@Data
@ToString
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "person_issue_authority_id")
    private String personIssueAuthorityID;

    @Column(name = "company_issue_authority_id")
    private String companyIssueAuthorityID;

    @Column(name = "issue_authority_licence_number")
    private String issueAuthorityLicenceNumber;

    @Column(name = "area_code")
    private Integer areaCode;

    @Column(name = "address_type")
    private Integer addressType;

    @Column(name = "po_box")
    private Integer poBox;

    @Column(name = "address_line_1")
    private String addressLine1;

    @Column(name = "floor")
    private Integer floor;

    @Column(name = "street")
    private String street;

    @Column(name = "unit_type")
    private int unitType;

    @Column(name = "unit_number")
    private String unitNumber;

    @Column(name = "parcel_id")
    private String parcelID;

    @Column(name = "country")
    private String country;

    @Column(name = "emirate")
    private Integer emirate;

    @Column(name = "state")
    private String state;

    @Column(name = "freezone")
    private Integer freezone;

    @Column(name = "longitude")
    private double longitude;

    @Column(name = "latitude")
    private double latitude;
}

