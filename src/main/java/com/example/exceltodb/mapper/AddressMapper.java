package com.example.exceltodb.mapper;

import com.example.exceltodb.entity.Address;
import com.example.exceltodb.excelutility.CellValue;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AddressMapper {
    @Autowired
    CellValue cellValue;

    public Address mapRowToAddress(Row row) {
        Address address = new Address();

        // Assuming the cell indexes correspond to the order of fields in the Address class
        address.setPersonIssueAuthorityID(cellValue.getStringValue(row.getCell(0)));
        address.setCompanyIssueAuthorityID(cellValue.getStringValue(row.getCell(1)));
        address.setIssueAuthorityLicenceNumber(cellValue.getStringValue(row.getCell(2)));
        address.setAreaCode(cellValue.getIntValue(row.getCell(3)));
        address.setAddressType(cellValue.getIntValue(row.getCell(4)));
        address.setPoBox(cellValue.getIntValue(row.getCell(5)));
        address.setAddressLine1(cellValue.getStringValue(row.getCell(6)));
        address.setFloor(cellValue.getIntValue(row.getCell(7)));
        address.setStreet(cellValue.getStringValue(row.getCell(8)));
        address.setUnitType(cellValue.getIntValue(row.getCell(9)));
        address.setUnitNumber(cellValue.getStringValue(row.getCell(10)));
        address.setParcelID(cellValue.getStringValue(row.getCell(11)));
        address.setCountry(cellValue.getStringValue(row.getCell(12)));
        address.setEmirate(cellValue.getIntValue(row.getCell(13)));
        address.setState(cellValue.getStringValue(row.getCell(14)));
        address.setFreezone(cellValue.getIntValue(row.getCell(15)));
        address.setLongitude(cellValue.getDoubleCellValue(row.getCell(16)));
        address.setLatitude(cellValue.getDoubleCellValue(row.getCell(17)));

        return address;
    }
}
