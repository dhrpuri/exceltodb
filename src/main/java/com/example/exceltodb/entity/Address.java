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
    private Integer id;
    private Integer area;
    private Integer addressTypeId;
    private Integer poBox;
    private String addressLine1;
    private String addressLine2;
    private Integer floor;
    private Integer street;
    private Integer unitTypeId;
    private String unitNumber;
    private String parcelId;
    private Integer countryId;
    private Integer emirateId;
    private String state;
    private Integer freezoneId;
    private Double longitude;
    private Double latitude;
    private String relatedEntityCode;
}

