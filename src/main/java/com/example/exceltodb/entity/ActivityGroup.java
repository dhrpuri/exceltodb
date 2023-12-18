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
@Table(name = "activity_group")
public class ActivityGroup {

    @Id
    private String activityGroupCode;

    private String englishName;

    private String arabicName;

}
