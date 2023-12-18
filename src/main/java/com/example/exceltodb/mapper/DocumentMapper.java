package com.example.exceltodb.mapper;

import com.example.exceltodb.entity.Document;
import com.example.exceltodb.excelutility.CellValue;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DocumentMapper {
    @Autowired
    CellValue cellValue;

    public Document mapRowToDocument(Row row) {
        Document document = new Document();

        // Assuming the cell indexes match the order of fields in the Document class
//        document.setId(cellValue.getIntValue(row.getCell(0)));
//        document.setLegalEntityId(cellValue.getIntValue(row.getCell(1)));
//        document.setUnifiedLicenceNumber(cellValue.getIntValue(row.getCell(2)));
//        document.setUnifiedTradeNameNumber(cellValue.getIntValue(row.getCell(3)));
//        document.setTypeId(cellValue.getIntValue(row.getCell(4)));
//        document.setUploadDate(cellValue.getDatetimeValue(row.getCell(5)));
//        document.setIssueAuthorityId(cellValue.getIntValue(row.getCell(6)));
//        document.setIssueAuthorityReference(cellValue.getStringValue(row.getCell(7)));
//        document.setIssueAuthorityTransaction(cellValue.getIntValue(row.getCell(8)));
//        document.setMimeTypeId(cellValue.getIntValue(row.getCell(9)));

        return document;
    }
}
