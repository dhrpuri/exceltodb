package com.example.exceltodb.pojo;

import lombok.Data;

@Data
public class ComapnyActivities {
    private String	companyIssueAuthorityID;
    private Integer	status;
    private String	addDate;
    private String	cancelDate;
    private String	activity;
    private String	activitySpecification;
}
