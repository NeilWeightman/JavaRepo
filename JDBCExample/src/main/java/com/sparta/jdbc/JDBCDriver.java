package com.sparta.jdbc;

import java.io.IOException;
import java.sql.*;

public class JDBCDriver {
    public static void main(String[] args) {
        printActors();
        try {
            createNewActor("Neil", "Weightman");
            createNewActor("Nish", "Mandal");
            deleteActor(201);
        } catch (SQLException|IOException e) {
            e.printStackTrace();
        } finally {
            try {
                StatementFactory.closeStatements();
                ConnectionFactory.closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private static void deleteActor(int actor_id) throws SQLException, IOException {
        PreparedStatement statement = StatementFactory.getDeleteStatement();
        statement.setInt(1, actor_id);
        int rowsAffected = statement.executeUpdate();
        System.out.println("Rows affected: " + rowsAffected);
    }

    private static void createNewActor(String fname, String lname) throws SQLException, IOException {
        PreparedStatement statement = StatementFactory.getInsertStatement();
        System.out.println(statement);
        statement.setString(1, fname);
        statement.setString(2, lname);
        int rowsAffected = statement.executeUpdate();
    }

    private static void printActors() {
        try {
            Connection conn = ConnectionFactory.getConnection();
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM actor");
            while (result.next()) {
                System.out.println("Name: " + result.getString("first_name") + " " +
                        result.getString(3));
            }
            result.close();
        } catch (SQLException|IOException e){
            e.printStackTrace();
        }
    }
}
