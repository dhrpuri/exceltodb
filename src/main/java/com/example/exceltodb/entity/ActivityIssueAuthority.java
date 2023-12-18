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
@Table(name = "activity_issue_authority")
public class ActivityIssueAuthority {
    @Id
    private String activityCode;

    private String issueAuthorityId1;

    private String englishName;

    private String arabicName;

    private String englishDescription;

    private String arabicDescription;

    private String activityTypeId;

    private String statusId;

    private String section;

    private String division;

    private String groupId;

    private String classField;
}
