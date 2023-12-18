package com.example.exceltodb.model.request;

import lombok.Data;

import java.util.List;
@Data
public class DocumentRequest {
    List<DocumentDTO> documents;
}
