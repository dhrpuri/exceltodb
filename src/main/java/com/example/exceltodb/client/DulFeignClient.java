package com.example.exceltodb.client;

import com.example.exceltodb.model.*;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "Dul-client",
        url = "${dul_base_url}")
public interface DulFeignClient {

    @Headers({"Content-Type: application/json"})
    @PostMapping(value = "/person?api_key={api_key}")
    ResponseEntity<String> fetchPersonDetails(@RequestBody AddressDTO address);

    @Headers({"Content-Type: application/json"})
    @PostMapping(value = "/company?api_key={{api_key}")
    ResponseEntity<String> fetchCompanyDetails(@RequestBody CompanyDTO company);

    @Headers({"Content-Type: application/json"})
    @PostMapping(value = "/licence?api_key={{api_key}}")
    ResponseEntity<String> fetchLicenceDetails(@RequestBody LicenceDTO license);

    @Headers({"Content-Type: application/json"})
    @PostMapping(value = "/legalentity?api_key={{api_key}}")
    ResponseEntity<String> fetchLegalEntity(@RequestBody LegalEntityDTO legalEntity);

    @Headers({"Content-Type: application/json"})
    @PostMapping(value = "/document?api_key={{api_key}}")
    ResponseEntity<String> fetchDocumentDetails(@RequestBody DocumentDTO document);

}
