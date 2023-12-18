package com.example.exceltodb.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComapnyActivitiesDTO {
    private String	companyIssueAuthorityID;
    private Integer	status;
    private String	addDate;
    private String	cancelDate;
    private String	activity;
    private String	activitySpecification;
}
