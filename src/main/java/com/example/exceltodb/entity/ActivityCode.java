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
@Table(name = "activity_code")
public class ActivityCode {

    @Id
    private String code;

    private String englishName;

    private String arabicName;

    private String englishDescription;

    private String arabicDescription;

    private String statusId;
}
