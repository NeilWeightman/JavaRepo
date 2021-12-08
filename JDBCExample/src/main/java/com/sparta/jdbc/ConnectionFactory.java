package com.sparta.jdbc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
    public static Connection getConnection() throws IOException, SQLException {
        Properties props = new Properties();
        props.load(new FileReader("connection.properties"));
        String url = props.getProperty("dburl");
        String userid = props.getProperty("dbuser");
        String password = props.getProperty("dbpassword");
        return DriverManager.getConnection(url, userid, password);
    }
}
