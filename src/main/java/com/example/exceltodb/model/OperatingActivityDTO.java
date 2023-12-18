package com.example.exceltodb.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OperatingActivityDTO {
    private String issueAuthorityLicenceNumber;
    private String activity;
    private Date addDate;
    private int status;

    // getters and setters
}