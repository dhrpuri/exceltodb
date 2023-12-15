package com.example.exceltodb.controller;

import com.example.exceltodb.service.ExcelReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/excel")
public class ExcelToDbController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExcelReader.class);

    @Autowired
    ExcelReader excelReader;
    @PostMapping("/upload")
    public ResponseEntity<Object> uploadFile(@RequestParam("file") MultipartFile file) {
        LOGGER.info("Request received to upload file", file.getName());
        return new ResponseEntity<>(excelReader.readExcel(file), HttpStatus.OK);
    }

}
