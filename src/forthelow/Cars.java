
package forthelow;

abstract public class  Cars {
    private double price;
    private String brand;
    private Dealership dealer;
    private String color;
    private int lifestyle, salary, colorPreference = 0; 
    ptivate String model;
    private String buyOrLease;
    
    
    public Cars(double price, String brand, String model, String addressOfDealer, String color, String buyOrLease) {
        this.price = price;
        this.brand = brand;
        this.dealer = dealer;
        this.color = color;
    }
    
}
