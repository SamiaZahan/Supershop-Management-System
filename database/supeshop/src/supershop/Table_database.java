/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supershop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shawon
 */
public class Table_database {
    
      public static ArrayList<product_list> homePageContent(){
        ArrayList<product_list> list = new ArrayList<>();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=supershop;integratedSecurity=true");

       //     Statement statement = connection.createStatement();
       //     Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/electronicsDB.db");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT P_name, catagory,original_price,sup_com,vat FROM product where catagory in('Grocery','Fruit','Fish' )");
            
            product_list pl;
            
            while(rs.next()){
                pl = new product_list(rs.getString("P_name"),rs.getString("catagory"),
                        rs.getDouble("original_price"),rs.getString("Sup_com"),rs.getDouble("vat"));
                
                list.add(pl);

            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
   }
      
           public static ArrayList<groc_list> grocContent(){
        ArrayList<groc_list> list = new ArrayList<>();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=supershop;integratedSecurity=true");

       //     Statement statement = connection.createStatement();
       //     Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/electronicsDB.db");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT p_name, original_price, sup_com, vat FROM product where catagory='Grocery' ");
            
            groc_list p2;
            
            while(rs.next()){
                p2 = new groc_list(rs.getString("p_name"),
                        rs.getDouble("original_price"),rs.getString("sup_com"), rs.getDouble("vat"));
                
                list.add(p2);

            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
   }
  
}
