package com.example.exceltodb.model.request;

import lombok.Data;

import java.util.List;
@Data
public class PersonRequest {
    private PersonDTO person;
    private AddressDTO address;
    private List<DocumentDTO> documents;
}
