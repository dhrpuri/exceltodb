package com.example.exceltodb.excelutility.excelmapper;

import com.example.exceltodb.entity.Person;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
@Component
public class PersonMapper {

    public Person mapRowToPerson(Row row) {
        Person person = new Person();
        person.setPersonIssueAuthorityID(getStringValue(row.getCell(0)));
        person.setBirthDate(getDateValue(row.getCell(1)));
        person.setGender(getIntValue(row.getCell(2)));
        person.setUnifiedID(getStringValue(row.getCell(3)));
        person.setEmiratesID(getStringValue(row.getCell(4)));
        person.setEmiratesIDIssueDate(getDateValue(row.getCell(5)));
        person.setEmiratesIDExpiryDate(getDateValue(row.getCell(6)));
        person.setPassportNumber(getStringValue(row.getCell(7)));
        person.setPassportIssueDate(getDateValue(row.getCell(8)));
        person.setPassportExpiryDate(getDateValue(row.getCell(9)));
        person.setPassportIssuePlaceEnglish(getStringValue(row.getCell(10)));
        person.setPassportIssuePlaceArabic(getStringValue(row.getCell(11)));
        person.setPassportIssueCountry(getStringValue(row.getCell(12)));
        person.setBirthPlaceEnglish(getStringValue(row.getCell(13)));
        person.setBirthPlaceArabic(getStringValue(row.getCell(14)));
        person.setBirthCountry(getStringValue(row.getCell(15)));
        person.setDecreeNumber(getStringValue(row.getCell(16)));
        person.setArabicName(getStringValue(row.getCell(17)));
        person.setEnglishName(getStringValue(row.getCell(18)));
        person.setEmail(getStringValue(row.getCell(19)));
        person.setMobile(getStringValue(row.getCell(20)));
        person.setStatus(getIntValue(row.getCell(21)));
        person.setNationality(getStringValue(row.getCell(22)));
        person.setLanguagePreference(getIntValue(row.getCell(23)));
        person.setFileNumber(getStringValue(row.getCell(24)));
        person.setGCCuid(getStringValue(row.getCell(25)));
        person.setVerifiedContact(getBooleanValue(row.getCell(26)));
        person.setLastUpdatedBy(getIntValue(row.getCell(27)));
        person.setMobileVerified(getBooleanValue(row.getCell(28)));
        person.setMobileVerificationDate(getDatetimeValue(row.getCell(29)));
        person.setMobileVerificationChannel(getIntValue(row.getCell(30)));
        person.setEmailVerified(getBooleanValue(row.getCell(31)));
        person.setEmailVerificationDate(getDateValue(row.getCell(32)));
        person.setEmailVerificationChannel(getIntValue(row.getCell(33)));
        person.setScreened(getBooleanValue(row.getCell(34)));
        person.setScreeningDate(getDatetimeValue(row.getCell(35)));
        person.setScreeningChannel(getIntValue(row.getCell(36)));
        return person;
    }

    private String getStringValue(Cell cell) {
        return cell != null ? cell.getStringCellValue() : null;
    }

    private int getIntValue(Cell cell) {
        return cell != null ? (int) cell.getNumericCellValue() : 0;
    }

    private boolean getBooleanValue(Cell cell) {
        return cell != null && cell.getBooleanCellValue();
    }

    private Date getDateValue(Cell cell) {
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
