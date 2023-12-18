package com.example.exceltodb.model.request;

import com.example.exceltodb.model.AddressDTO;
import com.example.exceltodb.model.DocumentDTO;
import com.example.exceltodb.model.PersonDTO;
import lombok.Data;

import java.util.List;
@Data
public class PersonRequest {
    private PersonDTO person;
    private AddressDTO address;
    private List<DocumentDTO> documents;
}
