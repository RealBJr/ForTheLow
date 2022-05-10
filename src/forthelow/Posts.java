
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author keethen
 */
public class Posted extends Posts{
    
    public Posted(double price, String brand, String model, String addressOfDealer, String phoneNumber, String color, int mileage) {
        super(price, brand, model, addressOfDealer, phoneNumber, color, mileage);
    }
    
    String type  = "Posted";

    public String getType() {
        return this.type;
    }
    
    
    
    
}

