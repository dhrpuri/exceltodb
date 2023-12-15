package com.example.exceltodb.processor;

import com.example.exceltodb.entity.Person;
import com.example.exceltodb.mapper.PersonMapper;
import com.example.exceltodb.repositories.PersonRepository;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;

@Service
public class PersonSheetProcessor {
    private static final Logger logger = LoggerFactory.getLogger(PersonSheetProcessor.class);
    @Autowired
    PersonMapper personMapper;
    @Autowired
    PersonRepository personRepository;
    public void processPersonSheet(Sheet sheet){
        Iterator<Row> rowIterator = sheet.iterator();
        // Skip header row
        if (rowIterator.hasNext()) {
            rowIterator.next();
        }

        logger.info("Number of person records to insert: " + sheet.getLastRowNum());
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            if(row.getLastCellNum() < 0){continue;}
            Person person = personMapper.mapRowToPerson(row);
            personRepository.save(person);
        }
    }
}
