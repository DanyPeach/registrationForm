package com.example.connection;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnector {
    //создаем поля! 1 - юрл, 2 - имя, 3 - пароль. Можно посмотреть в датабасе баночка с инстурментом
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/user_schema";
    private static final String USER = "root";
    private static final String PASSWORD = "11092002";
    private Connection connection;
    private String driver = "com.mysql.cj.jdbc.Driver"; //

    public JDBCConnector() {

    }

    //теперь надо написать метод котоырй возращает коннектион с учетом данных

    public Connection getConnection() throws ClassNotFoundException {
        Class.forName(driver);
        //если конекош = 0,
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
                System.out.println((connection==null) + "1");
                return connection;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        System.out.println(connection==null);
        return connection;
    }

}