package com.example.exceltodb.processor;

import com.example.exceltodb.entity.Address;
import com.example.exceltodb.mapper.AddressMapper;
import com.example.exceltodb.repositories.AddressRepository;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
@Service
public class AddressSheetProcessor {
    private static final Logger logger = LoggerFactory.getLogger(AddressSheetProcessor.class);
    @Autowired
    AddressRepository addressRepository;
    @Autowired
    AddressMapper addressMapper;
    public void processAddressSheet(Sheet sheet){
        Iterator<Row> rowIterator = sheet.iterator();

        // Skip header row
        if (rowIterator.hasNext()) {
            rowIterator.next();
        }

        logger.info("Number of Address records to insert: " + sheet.getLastRowNum());

        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            if(row.getLastCellNum() < 0){continue;}
            Address address = addressMapper.mapRowToAddress(row);
            addressRepository.save(address);
        }
    }
}
