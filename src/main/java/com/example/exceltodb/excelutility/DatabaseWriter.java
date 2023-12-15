package com.example.exceltodb.excelutility;

import com.example.exceltodb.entity.Person;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Service
public class DatabaseWriter {
    private static final String JDBC_URL = "jdbc:sqlserver://;serverName=localhost;databaseName=master";
    private static final String USERNAME = "sa";
    private static final String PASSWORD = "Sa@12345678";

    public void insertPersons(List<Person> persons) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            String query = prepareQuery();
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                for (Person person : persons) {
                    //preparedStatement.setInt(1, person.getId());
                    //preparedStatement.setString(2, person.getName());
                    //preparedStatement.setInt(3, person.getAge());

                    preparedStatement.executeUpdate();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private String prepareQuery(){
        String query = "INSERT INTO person (id, name, age) VALUES (?, ?, ?)";
        return query;
    }

    private PreparedStatement mapQueryValues(String query, Person person){
        return null;
    }
}
