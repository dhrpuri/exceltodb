package com.example.exceltodb.model.request;

import com.example.exceltodb.model.DocumentDTO;
import lombok.Data;

import java.util.List;
@Data
public class DocumentRequest {
    List<DocumentDTO> documents;
}
