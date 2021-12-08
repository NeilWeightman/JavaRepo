package com.sparta.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class JDBCDriver {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = ConnectionFactory.getConnection();
        } catch (IOException|SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Connection object: " + conn);
    }
}
