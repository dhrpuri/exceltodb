package com.example.exceltodb.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DigitalPlatformDTO {
    private String issueAuthorityLicenceNumber;
    private int type;
    private String account;
}
