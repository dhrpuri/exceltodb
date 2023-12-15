package com.example.exceltodb.excelutility.excelmapper;

import com.example.exceltodb.entity.Address;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.stereotype.Component;

@Component
public class AddressMapper {

    public Address mapRowToAddress(Row row) {
        Address address = new Address();

        // Assuming the cell indexes correspond to the order of fields in the Address class
        address.setPersonIssueAuthorityID(getStringCellValue(row.getCell(0)));
        address.setCompanyIssueAuthorityID(getStringCellValue(row.getCell(1)));
        address.setIssueAuthorityLicenceNumber(getStringCellValue(row.getCell(2)));
        address.setAreaCode(getIntCellValue(row.getCell(3)));
        address.setAddressType(getIntCellValue(row.getCell(4)));
        address.setPoBox(getIntCellValue(row.getCell(5)));
        address.setAddressLine1(getStringCellValue(row.getCell(6)));
        address.setFloor(getIntCellValue(row.getCell(7)));
        address.setStreet(getStringCellValue(row.getCell(8)));
        address.setUnitType(getIntCellValue(row.getCell(9)));
        address.setUnitNumber(getStringCellValue(row.getCell(10)));
        address.setParcelID(getStringCellValue(row.getCell(11)));
        address.setCountry(getStringCellValue(row.getCell(12)));
        address.setEmirate(getIntCellValue(row.getCell(13)));
        address.setState(getStringCellValue(row.getCell(14)));
        address.setFreezone(getIntCellValue(row.getCell(15)));
        address.setLongitude(getDoubleCellValue(row.getCell(16)));
        address.setLatitude(getDoubleCellValue(row.getCell(17)));

        return address;
    }

    private String getStringCellValue(Cell cell) {
        return cell != null ? cell.getStringCellValue() : null;
    }

    private int getIntCellValue(Cell cell) {
        return cell != null ? (int) cell.getNumericCellValue() : 0;
    }

    private double getDoubleCellValue(Cell cell) {
        return cell != null ? cell.getNumericCellValue() : 0.0;
    }
}
