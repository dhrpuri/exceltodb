package com.example.exceltodb.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@ToString
@NoArgsConstructor
@Table(name = "area")
public class Area {
    @Id
    private String areaCode;

    private String mainAreaCode;



    private String englishName;

    private String arabicName;

}

