package com.sparta.jdbc;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class WithResourcesExample {
    public static void main(String[] args) {
        Properties props;
        String url = null;
        String userid = null;
        String password = null;
        try (FileReader props_file = new FileReader("connection.properties")) {
            props = new Properties();
            props.load(props_file);
            url = props.getProperty("dburl");
            userid = props.getProperty("dbuser");
            password = props.getProperty("dbpassword");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(Connection theConnection = DriverManager.getConnection(url, userid, password)){
            Statement stmt = theConnection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM actor WHERE actor_id=200");
            while (res.next()) {
                System.out.println(res.getString("first_name"));
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}
