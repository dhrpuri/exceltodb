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
        address.setId(cellValue.getIntValue(row.getCell(0)));
        address.setArea(cellValue.getIntValue(row.getCell(1)));
        address.setAddressTypeId(cellValue.getIntValue(row.getCell(2)));
        address.setPoBox(cellValue.getIntValue(row.getCell(3)));
        address.setAddressLine1(cellValue.getStringValue(row.getCell(4)));
        address.setAddressLine2(cellValue.getStringValue(row.getCell(5)));
        address.setFloor(cellValue.getIntValue(row.getCell(6)));
        address.setStreet(cellValue.getIntValue(row.getCell(7)));
        address.setUnitTypeId(cellValue.getIntValue(row.getCell(8)));
        address.setUnitNumber(cellValue.getStringValue(row.getCell(9)));
        address.setParcelId(cellValue.getStringValue(row.getCell(10)));
        address.setCountryId(cellValue.getIntValue(row.getCell(11)));
        address.setEmirateId(cellValue.getIntValue(row.getCell(12)));
        address.setState(cellValue.getStringValue(row.getCell(13)));
        address.setFreezoneId(cellValue.getIntValue(row.getCell(14)));
        address.setLongitude(cellValue.getDoubleCellValue(row.getCell(15)));
        address.setLatitude(cellValue.getDoubleCellValue(row.getCell(16)));
        address.setRelatedEntityCode(cellValue.getStringValue(row.getCell(17)));

        return address;
    }
}
