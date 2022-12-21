/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

import Model.ProductItem;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author youssef
 */
public class ViewProductViewModel {

    private ProductItem x;
    private ArrayList<ProductItem> data = new ArrayList<>();
    private final String[] columnNames = {"name", "id", "price"};
    private JTable jTable1;

    public ViewProductViewModel(JTable jTable1) {
        this.jTable1 = jTable1;
        getDataSQL();
    }
    public void setData() {
        jTable1.setModel(new DefaultTableModel(toArray(), columnNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
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

    public String[][] toArray() {
        String[][] x = new String[data.size()][3];
        for (int i = 0; i < data.size(); i++) {
            x[i][0] = data.get(i).getName();
            x[i][1] = Integer.toString(data.get(i).getId());
            x[i][2] = Double.toString(data.get(i).getPrice());
        }
        return x;
    }

    public ArrayList<ProductItem> getData() {
        return data;
    }
}
