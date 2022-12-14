/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

import java.sql.*;

/**
 *
 * @author youssef
 */
public class ViewProductViewModel {

    
    public static void main(String[] args) {
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "myuser", "xxxx");
                Statement stmt = con.createStatement();
            ) {
            String strSelect = "select * from books";
            System.out.println("The SQL statement is "+strSelect+"\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            System.out.println("The records selected are:");
            int rowCount=0;
            
            while(rset.next()){
                String id=rset.getString("id");
                String title = rset.getString("title");
                String author = rset.getString("author");
                double price = rset.getDouble("price");
                int qty = rset.getInt("qty");
                
                System.out.println(id+","+title+","+author+","+price+","+qty);
                
                rowCount++;
            }
            System.out.println("Total number of records is = "+ rowCount);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
