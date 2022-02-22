package com.archeruss.superherocaller.repository;

import java.sql.*;

public class MysqlConn {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/superhero","root","root");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from heros");

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
