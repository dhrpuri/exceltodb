package com.example.exceltodb.processor;

import com.example.exceltodb.ExceltodbApplication;
import com.example.exceltodb.entity.Person;
import com.example.exceltodb.mapper.PersonMapper;
import com.example.exceltodb.repositories.PersonRepository;
import org.apache.logging.log4j.util.Strings;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.regex.Matcher;

@Service
public class PersonSheetProcessor {
    private static final Logger logger = LoggerFactory.getLogger(PersonSheetProcessor.class);
    @Autowired
    PersonMapper personMapper;
    @Autowired
    PersonRepository personRepository;
    @Autowired
    DataSource dataSource;
    public void processPersonSheet(Sheet sheet){
        Iterator<Row> rowIterator = sheet.iterator();
        // Skip header row
        if (rowIterator.hasNext()) {
            rowIterator.next();
        }

        logger.info("Number of person records to insert: " + sheet.getLastRowNum());
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            if(row.getLastCellNum() < 0){continue;}
            Person person = personMapper.mapRowToPerson(row);
            personRepository.save(person);
        }
    }

    public void processor(){
        String excelFilePath = "/Users/dhruv.puri/Downloads/person.xlsx";
//        String jdbcUrl = "jdbc:sqlserver://localhost:1433;databaseName=masterencrypt=true;trustServerCertificate=true";
//        String username = "sa";
//        String password = "Sa@12345678";
        JdbcTemplate template = new JdbcTemplate(dataSource);
        try (Connection connection = template.getDataSource().getConnection();
             FileInputStream fileInputStream = new FileInputStream(excelFilePath);
             Workbook workbook = WorkbookFactory.create(fileInputStream)) {
            // Assuming your sheet is the first one, adjust accordingly
            Sheet sheet = workbook.getSheetAt(0);
            logger.info("Inside sheet: " + sheet.getSheetName());

            // Assuming the first row contains column names
            Row headerRow = sheet.getRow(0);

            for (Row currentRow : sheet) {
                if (currentRow.getRowNum() == 0) continue; // Skip header row
                Cell cell = currentRow.getCell(0);
                if (cell == null || (Strings.isBlank(cell.toString()))){
                    break;
                }
                PreparedStatement preparedStatement = prepareStatement(connection, headerRow, currentRow);
                preparedStatement.executeUpdate();
                preparedStatement.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static PreparedStatement prepareStatement(Connection connection, Row headerRow, Row currentRow)
            throws SQLException {
        String sql = "INSERT INTO person (" +
                getColumns(headerRow) +
                ") VALUES (" +
                getValues(currentRow) +
                ")";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        // Set parameter values based on your data types and order
        for (int i = 0; i < headerRow.getLastCellNum(); i++) {
            preparedStatement.setString(i + 1, currentRow.getCell(i).toString());
        }

        return preparedStatement;
    }

    private static String getColumns(Row headerRow) {
        StringBuilder columns = new StringBuilder();
        for (int i = 0; i < headerRow.getLastCellNum(); i++) {
            String columnName = camelCaseToLowerCaseWithUnderscore(headerRow.getCell(i).toString());
            System.out.println(columnName);
            columns.append(columnName);
            if (i < headerRow.getLastCellNum() - 1) {
                columns.append(", ");
            }
        }
        return columns.toString();
    }

    private static String getValues(Row currentRow) {
        StringBuilder values = new StringBuilder();
        for (int i = 0; i < currentRow.getLastCellNum(); i++) {
            values.append("?");
            if (i < currentRow.getLastCellNum() - 1) {
                values.append(", ");
            }
        }
        return values.toString();
    }
    public static String camelCaseToLowerCaseWithUnderscore(String input) {
        // Remove special characters and replace with space
        String cleanedString = input.replaceAll("[^a-zA-Z0-9]", " ");

        // Split by space and join with underscores
        String[] words = cleanedString.split("\\s+");
        StringBuilder snakeCaseBuilder = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            snakeCaseBuilder.append(words[i].toLowerCase());
            if (i < words.length - 1) {
                snakeCaseBuilder.append("_");
            }
        }

        return snakeCaseBuilder.toString();
    }
}
