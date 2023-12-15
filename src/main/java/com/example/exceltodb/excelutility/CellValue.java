package com.example.exceltodb.excelutility;

import org.apache.poi.ss.usermodel.Cell;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
@Service
public class CellValue {

    public String getStringValue(Cell cell) {
        return cell != null ? cell.getStringCellValue() : null;
    }

    public int getIntValue(Cell cell) {
        return cell != null ? (int) cell.getNumericCellValue() : 0;
    }
    public double getDoubleCellValue(Cell cell) {
        return cell != null ? cell.getNumericCellValue() : 0.0;
    }

    public boolean getBooleanValue(Cell cell) {
        return cell != null && cell.getBooleanCellValue();
    }

    public Date getDateValue(Cell cell) {
        if (cell != null) {
            try {
                return cell.getDateCellValue();
            } catch (Exception e) {
                // Handle date parsing exception
                e.printStackTrace();
            }
        }
        return null;
    }
    public LocalDateTime getDatetimeValue(Cell cell) {
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
