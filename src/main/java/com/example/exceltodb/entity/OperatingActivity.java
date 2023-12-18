package com.example.exceltodb.entity;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@ToString
@Table(name = "operating_activity")
public class OperatingActivity {
    @Id
    private String id;

    private String unifiedLicenceNumber;

    @Column(name="activity_issue_authority_activity_code")
    private String activityCode;

    @Column(name="activity_issue_authority_issue_authority_code")
    private String issueAuthorityId;

    private String addDate;

    private String cancelDate;

    private String statusId;

    private String activitySpecificationCode;
}
