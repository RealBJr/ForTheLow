
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author 2177095
 */
public class Posts extends Cars implements Comparable<Posts> {

     private Cars carToSell;

    private int inventoryPosition;
    private int position = 0;
    String type = "Posts";

    public String getType() {
        return type;
    }

    public int getInventoryPosition() {
        return inventoryPosition;
    }

    public void setInventoryPosition(int inventoryPosition) {
        this.inventoryPosition = inventoryPosition;
    }

    private String author;

    public Posts(double price, String brand, String model, String addressOfDealer, String phoneNumber, String color, int mileage) {
        super(price, brand, model, addressOfDealer, phoneNumber, color, mileage);
        this.carToSell = carToSell;
        this.author = author;

    }

    public void buy() {
    }

    public void bookAnAppointment() {
    }

    @Override
    public int compareTo(Posts o) {

        int value = this.getBrand().compareTo(o.getBrand());

        return value;

    }
}
