package com.example.exceltodb.service;

import com.example.exceltodb.entity.Person;
import com.example.exceltodb.processor.AddressSheetProcessor;
import com.example.exceltodb.processor.DocumentSheetProcessor;
import com.example.exceltodb.processor.PersonSheetProcessor;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ExcelReader {
    private static final Logger logger = LoggerFactory.getLogger(ExcelReader.class);

    @Autowired
    PersonSheetProcessor personSheetProcessor;
    @Autowired
    AddressSheetProcessor addressSheetProcessor;
    @Autowired
    DocumentSheetProcessor documentSheetProcessor;

    public List<Person> readExcel(MultipartFile file) {
        List<Person> persons = new ArrayList<>();

        try (Workbook workbook = WorkbookFactory.create(file.getInputStream())){

            for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
                Sheet sheet = workbook.getSheetAt(i);
                excelSheetProcessor(sheet);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return persons;
    }

    private void excelSheetProcessor(Sheet sheet){
        String sheetName = sheet.getSheetName().toUpperCase();
        switch (sheetName) {
            case "PERSON":
                //personSheetProcessor.processor();
                logger.info("Processing Person Sheet");
                break;

//            case "ADDRESS":
//                addressSheetProcessor.processAddressSheet(sheet);
//                logger.info("Processing Address Sheet");
//                break;
//
//            case "DOCUMENT":
//                documentSheetProcessor.processDocumentSheet(sheet);
//                logger.info("Processing Document Sheet");
//                break;
            // Add more cases for other sheets as needed

            default:
                // Handle the default case or ignore unknown sheets
                logger.info("Skipping unknown sheet: " + sheetName);
                break;
        }
    }

}
