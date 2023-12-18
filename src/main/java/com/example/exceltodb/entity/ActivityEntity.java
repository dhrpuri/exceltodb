package com.example.exceltodb.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.Type;

import javax.persistence.*;

import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@ToString
@Table(name = "activity")
public class ActivityEntity {

    @Id
    private String activityCode;

    private String issueAuthorityId;

    private String englishName;

    @Column(name = "arabic_name")
    @Type(type="org.hibernate.type.StringNVarcharType")
    private String arabicName;

    @Column(name = "english_description")
    @Type(type="org.hibernate.type.StringNVarcharType")
    private String englishDescription;

    @Column(name = "arabic_description")
    @Type(type="org.hibernate.type.StringNVarcharType")
    private String arabicDescription;

    private String activityTypeId;

    private String statusId;

    private String section;

    private String division;

    private String groupId;

    private String activityClass;


}
