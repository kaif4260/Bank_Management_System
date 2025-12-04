package BankManagementSystem;

import java.sql.*; // remove all the package and add java.sql.*;


public class Con {

    Connection connection;
    Statement statement;

    public Con(){

        try {
            // carefully enter the url user & pass of the database(mySQL)
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/signin","root","Kaif@mysql22-26");
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//Thank You
