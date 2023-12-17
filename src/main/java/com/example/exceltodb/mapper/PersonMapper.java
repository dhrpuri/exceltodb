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
//        person.setId(cellValue.getIntValue(row.getCell(0)));
//        person.setIssueAuthorityId(cellValue.getIntValue(row.getCell(1)));
//        person.setBirthDate(cellValue.getStringValue(row.getCell(2)));
//        person.setGenderId(cellValue.getIntValue(row.getCell(3)));
//        person.setUnifiedId(cellValue.getIntValue(row.getCell(4)));
//        person.setEmiratesId(cellValue.getIntValue(row.getCell(5)));
//        person.setEmiratesIdIssueDate(cellValue.getStringValue(row.getCell(6)));
//        person.setEmiratesIdExpiryDate(cellValue.getStringValue(row.getCell(7)));
//        person.setPassportNumber(cellValue.getStringValue(row.getCell(8)));
//        person.setPassportIssueDate(cellValue.getStringValue(row.getCell(9)));
//        person.setPassportExpiryDate(cellValue.getStringValue(row.getCell(10)));
//        person.setPassportIssuePlaceEnglish(cellValue.getStringValue(row.getCell(11)));
//        person.setPassportIssuePlaceArabic(cellValue.getStringValue(row.getCell(12)));
//        person.setPassportIssueCountryId(cellValue.getIntValue(row.getCell(13)));
//        person.setBirthPlaceEnglish(cellValue.getStringValue(row.getCell(14)));
//        person.setBirthPlaceArabic(cellValue.getStringValue(row.getCell(15)));
//        person.setBirthCountryId(cellValue.getIntValue(row.getCell(16)));
//        person.setDecreeNumber(cellValue.getStringValue(row.getCell(17)));
//        person.setArabicName(cellValue.getStringValue(row.getCell(18)));
//        person.setEnglishName(cellValue.getStringValue(row.getCell(19)));
//        person.setEmail(cellValue.getStringValue(row.getCell(20)));
//        person.setMobile(cellValue.getStringValue(row.getCell(21)));
//        person.setStatusId(cellValue.getIntValue(row.getCell(22)));
//        person.setStatusReasonId(cellValue.getIntValue(row.getCell(23)));
//        person.setActivePersonId(cellValue.getIntValue(row.getCell(24)));
//        person.setNationalityId(cellValue.getIntValue(row.getCell(25)));
//        person.setAddressId(cellValue.getIntValue(row.getCell(26)));
//        person.setLanguagePreferenceId(cellValue.getIntValue(row.getCell(27)));
//        person.setFileNumber(cellValue.getStringValue(row.getCell(28)));
//        person.setGccUid(cellValue.getStringValue(row.getCell(29)));
//        person.setFamilyBookNumber(cellValue.getStringValue(row.getCell(30)));
//        person.setVerifiedContact(cellValue.getBooleanValue(row.getCell(31)));
//        person.setLastUpdatedById(cellValue.getIntValue(row.getCell(32)));
//        person.setMobileVerified(cellValue.getBooleanValue(row.getCell(33)));
//        person.setMobileVerificationDate(cellValue.getStringValue(row.getCell(34)));
//        person.setMobileVerificationChannelId(cellValue.getIntValue(row.getCell(35)));
//        person.setEmailVerified(cellValue.getBooleanValue(row.getCell(36)));
//        person.setEmailVerificationDate(cellValue.getStringValue(row.getCell(37)));
//        person.setEmailVerificationChannelId(cellValue.getIntValue(row.getCell(38)));
//        person.setScreened(cellValue.getBooleanValue(row.getCell(39)));
//        person.setScreeningDate(cellValue.getStringValue(row.getCell(40)));
//        person.setScreeningChannelId(cellValue.getIntValue(row.getCell(41)));

        return person;
    }
}
