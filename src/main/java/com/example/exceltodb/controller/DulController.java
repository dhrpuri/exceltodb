package com.example.exceltodb.controller;

import com.example.exceltodb.service.DulService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DulController {

    @Autowired
    DulService dulService;

    public String getPersonDetails() {
        dulService.getPersonDetails();
        return null;
    }

    public String getLicenceDetails() {
        dulService.getLicenceDetails();
        return null;
    }

    public String getCompanyDetails() {
        dulService.getCompanyDetails();
        return null;
    }

    public String getDocumentDetails() {
        dulService.getDocumentDetails();
        return null;
    }

    public String getLegalEntity() {
        dulService.getLegalEntity();
        return null;
    }
}
