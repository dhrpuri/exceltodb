package com.example.exceltodb.entity;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@ToString
@NoArgsConstructor
@Table(name = "address")
public class Address {

    @Id
    private String id;

    private String areaCode;

    private String addressTypeId;

    private String poBox;

    private String addressLine1;

    private String addressLine2;

    private String floor;

    private String street;

    private String unitTypeId;

    private String unitNumber;

    private String parcelId;

    private String countryId;

    private String emirateId;

    private String state;

    private String freezoneId;

    private String longitude;

    private String latitude;

    private String relatedEntityCode;
}

