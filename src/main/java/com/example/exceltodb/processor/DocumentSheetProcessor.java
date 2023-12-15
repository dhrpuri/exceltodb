package com.example.exceltodb.processor;

import com.example.exceltodb.entity.Document;
import com.example.exceltodb.mapper.DocumentMapper;
import com.example.exceltodb.repositories.DocumentRepository;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
@Service
public class DocumentSheetProcessor {
    private static final Logger logger = LoggerFactory.getLogger(DocumentSheetProcessor.class);

    @Autowired
    DocumentRepository documentRepository;
    @Autowired
    DocumentMapper documentMapper;

    public void processDocumentSheet(Sheet sheet){
        Iterator<Row> rowIterator = sheet.iterator();

        // Skip header row
        if (rowIterator.hasNext()) {
            rowIterator.next();
        }

        logger.info("Number of Document records to insert: " + sheet.getLastRowNum());

        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            if(row.getLastCellNum() < 0){continue;}
            Document document = documentMapper.mapRowToDocument(row);
            documentRepository.save(document);
        }
    }
}
