package com.example.exceltodb.service;

import com.example.exceltodb.client.DulFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DulService {

    @Autowired
    DulFeignClient feignClient;

    public String getPersonDetails() {

        //feignClient.fetchPersonDetails();

        return null;
    }

    public String getLicenceDetails() {

        //feignClient.fetchPersonDetails();
        return null;
    }

    public String getCompanyDetails() {
        //feignClient.fetchCompanyDetails();
        return null;
    }

    public String getDocumentDetails() {
        //feignClient.fetchDocumentDetails();
        return null;
    }

    public String getLegalEntity() {
        //feignClient.fetchLegalEntity();
        return null;
    }
}
