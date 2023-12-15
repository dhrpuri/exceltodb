package com.example.exceltodb.mapper;

import com.example.exceltodb.entity.Person;
import com.example.exceltodb.excelutility.CellValue;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper {

    @Autowired
    CellValue cellValue;

    public Person mapRowToPerson(Row row) {
        Person person = new Person();
        person.setPersonIssueAuthorityID(cellValue.getStringValue(row.getCell(0)));
        person.setBirthDate(cellValue.getDateValue(row.getCell(1)));
        person.setGender(cellValue.getIntValue(row.getCell(2)));
        person.setUnifiedID(cellValue.getStringValue(row.getCell(3)));
        person.setEmiratesID(cellValue.getStringValue(row.getCell(4)));
        person.setEmiratesIDIssueDate(cellValue.getDateValue(row.getCell(5)));
        person.setEmiratesIDExpiryDate(cellValue.getDateValue(row.getCell(6)));
        person.setPassportNumber(cellValue.getStringValue(row.getCell(7)));
        person.setPassportIssueDate(cellValue.getDateValue(row.getCell(8)));
        person.setPassportExpiryDate(cellValue.getDateValue(row.getCell(9)));
        person.setPassportIssuePlaceEnglish(cellValue.getStringValue(row.getCell(10)));
        person.setPassportIssuePlaceArabic(cellValue.getStringValue(row.getCell(11)));
        person.setPassportIssueCountry(cellValue.getStringValue(row.getCell(12)));
        person.setBirthPlaceEnglish(cellValue.getStringValue(row.getCell(13)));
        person.setBirthPlaceArabic(cellValue.getStringValue(row.getCell(14)));
        person.setBirthCountry(cellValue.getStringValue(row.getCell(15)));
        person.setDecreeNumber(cellValue.getStringValue(row.getCell(16)));
        person.setArabicName(cellValue.getStringValue(row.getCell(17)));
        person.setEnglishName(cellValue.getStringValue(row.getCell(18)));
        person.setEmail(cellValue.getStringValue(row.getCell(19)));
        person.setMobile(cellValue.getStringValue(row.getCell(20)));
        person.setStatus(cellValue.getIntValue(row.getCell(21)));
        person.setNationality(cellValue.getStringValue(row.getCell(22)));
        person.setLanguagePreference(cellValue.getIntValue(row.getCell(23)));
        person.setFileNumber(cellValue.getStringValue(row.getCell(24)));
        person.setGCCuid(cellValue.getStringValue(row.getCell(25)));
        person.setVerifiedContact(cellValue.getBooleanValue(row.getCell(26)));
        person.setLastUpdatedBy(cellValue.getIntValue(row.getCell(27)));
        person.setMobileVerified(cellValue.getBooleanValue(row.getCell(28)));
        person.setMobileVerificationDate(cellValue.getDatetimeValue(row.getCell(29)));
        person.setMobileVerificationChannel(cellValue.getIntValue(row.getCell(30)));
        person.setEmailVerified(cellValue.getBooleanValue(row.getCell(31)));
        person.setEmailVerificationDate(cellValue.getDateValue(row.getCell(32)));
        person.setEmailVerificationChannel(cellValue.getIntValue(row.getCell(33)));
        person.setScreened(cellValue.getBooleanValue(row.getCell(34)));
        person.setScreeningDate(cellValue.getDatetimeValue(row.getCell(35)));
        person.setScreeningChannel(cellValue.getIntValue(row.getCell(36)));
        return person;
    }
}
