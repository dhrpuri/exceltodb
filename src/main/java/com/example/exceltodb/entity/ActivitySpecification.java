package com.example.exceltodb.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@ToString
@Table(name = "activity_specification")
public class ActivitySpecification {
    @Id
    private String activitySpecificationCode;
    private String activityCode;

    private String englishName;

    private String arabicName;

    private String statusId;
}
