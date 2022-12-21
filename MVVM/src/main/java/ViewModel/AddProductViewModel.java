/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;


import Model.ProductItem;
import View.AddProductsScreen;
import java.sql.*;
import com.sun.jdi.IntegerValue;

/**
 *
 * @author youssef
 */
public class AddProductViewModel{

    private AddProductsScreen APS;
    private ViewProductViewModel VPVM;
    
    public AddProductViewModel(AddProductsScreen APS,ViewProductViewModel VPVM){
        this.APS=APS;
        this.VPVM=VPVM;
    }
    
    public boolean validateThenAdd(String productName, String productId, String productPrice) {
        try {
            Integer.valueOf(productId);
            Double.valueOf(productPrice);
            String.valueOf(productName);
            APS.setVisualState(false);
            APS.notifyAllObservers();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public void addProduct(ProductItem x) {
        try ( Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvvmdb", "myuser", "xxxx");  Statement stmt = con.createStatement();) {
            String strInsert = "insert into products values('"+x.getName()+"', "+Integer.toString(x.getId())+", "+Double.toString(x.getPrice())+")";
            stmt.executeUpdate(strInsert);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        VPVM.getData().add(x);
        VPVM.setData();
    }

}
