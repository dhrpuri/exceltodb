package com.example.exceltodb.excelutility.excelmapper;

import com.example.exceltodb.entity.Document;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
@Component
public class DocumentMapper {

    public Document mapRowToDocument(Row row) {
        Document document = new Document();

        // Assuming the cell indexes match the order of fields in the Document class
        document.setPersonIssueAuthorityID(getStringCellValue(row.getCell(0)));
        document.setCompanyIssueAuthorityID(getStringCellValue(row.getCell(1)));
        document.setIssueAuthorityLicenceNumber(getNumericCellValue(row.getCell(2)));
        document.setIssueAuthorityTradeNameNumber(getNumericCellValue(row.getCell(3)));
        document.setType(getNumericCellValue(row.getCell(4)));
        document.setUploadDate(getDatetimeValue(row.getCell(5)));
        document.setIssueAuthorityReference(getStringCellValue(row.getCell(6)));
        document.setIssueAuthorityTransaction(getStringCellValue(row.getCell(7)));

        return document;
    }

    // Helper methods to handle different cell types
    private String getStringCellValue(Cell cell) {
        return cell == null ? null : cell.getStringCellValue();
    }

    private int getNumericCellValue(Cell cell) {
        return cell == null ? 0 : (int) cell.getNumericCellValue();
    }

    private Date getDateCellValue(Cell cell) {
        return cell == null ? null : cell.getDateCellValue();
    }
    private LocalDateTime getDatetimeValue(Cell cell) {
        if (cell != null) {
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSX");
                LocalDateTime localDateTime = LocalDateTime.parse(cell.getStringCellValue(), formatter);
                return localDateTime;
            } catch (Exception e) {
                // Handle date parsing exception
                e.printStackTrace();
            }
        }
        return null;
    }
}
