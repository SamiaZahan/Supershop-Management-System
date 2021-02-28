/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supershop;

/**
 *
 * @author Samia
 */
public class groc_list {
  
    private String name;
   
    private double original_price;
   
    private String sup_com;
       private double vat;


    public groc_list(String name,  double original_price,String sup_com, double vat) {
        this.name = name;
        
   
        this.original_price = original_price;
       
        this.sup_com = sup_com;
             this.vat = vat;
      
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    


}

