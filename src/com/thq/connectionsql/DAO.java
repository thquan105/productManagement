/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thq.connectionsql;

import com.thq.product.Product;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
        
        
/**
 *
 * @author PC
 */
public class DAO {
    public List<Product> getAllProduct(){
        List<Product> list = new ArrayList<>();
        
        Connection conn = ConnectionSQL.getConnecttionSQL();
        
        String sql = "SELECT * FROM dbo.[Product], dbo.[Category] WHERE dbo.[Product].idCategory = dbo.[Category].idCategory";
        try {

            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Product product = new Product();
                
                product.setIdProduct(rs.getString("idProduct"));
                product.setIdCategory(rs.getString("idCategory"));
                product.setNameProduct(rs.getString("nameProduct"));
                product.setNameCategory(rs.getString("nameCategory"));
                product.setPrice(rs.getInt("price"));
                product.setAmount(rs.getInt("amount"));

                list.add(product);

            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }
}
