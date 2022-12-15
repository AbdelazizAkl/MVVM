/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;


import java.sql.*;
import com.sun.jdi.IntegerValue;

/**
 *
 * @author youssef
 */
public class AddProductViewModel{

    public boolean validateThenAdd(String productName, String productId, String productPrice) {
        try {
            Integer.valueOf(productId);
            Double.valueOf(productPrice);
            String.valueOf(productName);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
