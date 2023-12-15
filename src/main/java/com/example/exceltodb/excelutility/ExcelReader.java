package com.example.exceltodb.excelutility;

import com.example.exceltodb.entity.Address;
import com.example.exceltodb.entity.Document;
import com.example.exceltodb.entity.Person;
import com.example.exceltodb.excelutility.excelmapper.AddressMapper;
import com.example.exceltodb.excelutility.excelmapper.DocumentMapper;
import com.example.exceltodb.excelutility.excelmapper.PersonMapper;
import com.example.exceltodb.repositories.AddressRepository;
import com.example.exceltodb.repositories.DocumentRepository;
import com.example.exceltodb.repositories.PersonRepository;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class ExcelReader {
    private static final Logger logger = LoggerFactory.getLogger(ExcelReader.class);

    @Autowired
    PersonRepository personRepository;
    @Autowired
    DocumentRepository documentRepository;
    @Autowired
    AddressRepository addressRepository;
    @Autowired
    PersonMapper excelPersonMapper;
    @Autowired
    AddressMapper addressMapper;
    @Autowired
    DocumentMapper documentMapper;


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
                processPersonSheet(sheet);
                logger.info("Processing Person Sheet");
                break;

            case "ADDRESS":
                processAddressSheet(sheet);
                logger.info("Processing Address Sheet");
                break;

            case "DOCUMENT":
                processDocumentSheet(sheet);
                logger.info("Processing Document Sheet");
                break;
            // Add more cases for other sheets as needed

            default:
                // Handle the default case or ignore unknown sheets
                logger.info("Skipping unknown sheet: " + sheetName);
                break;
        }


    }
    private void processPersonSheet(Sheet sheet){
        Iterator<Row> rowIterator = sheet.iterator();
        // Skip header row
        if (rowIterator.hasNext()) {
            rowIterator.next();
        }

        logger.info("Number of person records to insert: " + sheet.getLastRowNum());
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            Person person = excelPersonMapper.mapRowToPerson(row);
            personRepository.save(person);
        }
    }
    private void processAddressSheet(Sheet sheet){
        Iterator<Row> rowIterator = sheet.iterator();

        // Skip header row
        if (rowIterator.hasNext()) {
            rowIterator.next();
        }

        logger.info("Number of Address records to insert: " + sheet.getLastRowNum());

        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            Address address = addressMapper.mapRowToAddress(row);
            addressRepository.save(address);
        }
    }
    private void processDocumentSheet(Sheet sheet){
        Iterator<Row> rowIterator = sheet.iterator();

        // Skip header row
        if (rowIterator.hasNext()) {
            rowIterator.next();
        }

        logger.info("Number of Document records to insert: " + sheet.getLastRowNum());

        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            Document document = documentMapper.mapRowToDocument(row);
            documentRepository.save(document);
        }
    }

}
