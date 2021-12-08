package com.sparta.jdbc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
    private static Connection theConnection = null;
    public static Connection getConnection() throws IOException, SQLException {
        if(theConnection == null) {
            Properties props = new Properties();
            props.load(new FileReader("connection.properties"));
            String url = props.getProperty("dburl");
            String userid = props.getProperty("dbuser");
            String password = props.getProperty("dbpassword");
            theConnection = DriverManager.getConnection(url, userid, password);
        }
        return theConnection;
    }
    public static void closeConnection() throws SQLException {
        if(theConnection != null) theConnection.close();
    }
}
