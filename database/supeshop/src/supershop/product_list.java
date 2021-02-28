/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supershop;

/**
 *
 * @author Shawon
 */
public class product_list {
    private String name;
    private String catagory;
 
    private double original_price;
   
    private String sup_com;
       private double vat;
    private String description;

    public product_list(String name, String catagory, double original_price,String sup_com, double vat) {
        this.name = name;
        this.catagory = catagory;
   
        this.original_price = original_price;
       
        this.sup_com = sup_com;
             this.vat = vat;
         this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }
    
    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    public double getOriginal_price() {
        return original_price;
    }

    public void setOriginal_price(double original_price) {
        this.original_price = original_price;
    }



    public String getSup_com() {
        return sup_com;
    }

    public void setSup_com(String sup_com) {
        this.sup_com = sup_com;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    } 

}
