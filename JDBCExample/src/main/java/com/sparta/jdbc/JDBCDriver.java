package com.sparta.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDriver {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = ConnectionFactory.getConnection();
        } catch (IOException|SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Connection object: " + conn);
        try {
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM actor");
            while (result.next()) {
                System.out.println("Name: " + result.getString("first_name") + " " +
                        result.getString(3));
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
