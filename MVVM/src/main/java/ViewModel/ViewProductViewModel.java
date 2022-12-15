/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

import Model.ProductItem;
import View.AddProductsScreen;
import View.ViewProductsScreen;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author youssef
 */
public class ViewProductViewModel {

    private ProductItem x;
    private ArrayList<ProductItem> data = new ArrayList<>();
    private ViewProductsScreen VPS;

    public ViewProductViewModel(ViewProductsScreen VPS) {
        this.VPS=VPS;

    }

    public void getDataSQL() {
        try ( Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvvmdb", "myuser", "xxxx");  Statement stmt = con.createStatement();) {
            String strSelect = "select * from products";
            ResultSet rset = stmt.executeQuery(strSelect);
            while (rset.next()) {
                int id = rset.getInt("id");
                String name = rset.getString("name");
                double price = rset.getDouble("price");
                x = new ProductItem(id, name, price);
                data.add(x);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addProduct(ProductItem x) {
        try ( Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvvmdb", "myuser", "xxxx");  Statement stmt = con.createStatement();) {
            String strInsert = "insert into products values('"+x.getName()+"', "+Integer.toString(x.getId())+", "+Double.toString(x.getPrice())+")";
            stmt.executeUpdate(strInsert);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        data.add(x);
        VPS.setData();
    }

    public String[][] toArray() {
        String[][] x = new String[data.size()][3];
        for (int i = 0; i < data.size(); i++) {
            x[i][0] = data.get(i).getName();
            x[i][1] = Integer.toString(data.get(i).getId());
            x[i][2] = Double.toString(data.get(i).getPrice());
        }
        return x;
    }
}
