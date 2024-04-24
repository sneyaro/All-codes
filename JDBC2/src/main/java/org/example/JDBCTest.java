package org.example;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class JDBCTest{
    public static void main(String[] args) throws Exception{

        String url="jdbc:mysql://localhost:3306/p10";
        String uname="root";
        String pass ="student";
        String query = "select name from student1 where age=3 ";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url,uname,pass);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        resultSet.next();
        String name = resultSet.getString("name");
        System.out.println(name);
        statement.close();
        connection.close();


    }
}




