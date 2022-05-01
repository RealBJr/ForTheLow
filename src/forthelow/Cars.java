
package forthelow;

import java.util.ArrayList;

abstract public class  Cars {
    
    private double price;
    private String brand;
    private Dealership dealer;
    private String color;
    private int lifestyle, salary, colorPreference = 0; 
    private String model;
    private String mileage;
    private ArrayList<String> keywords;
    private String setOfNbrs;
    
    
    public Cars(double price, String brand, String model, String addressOfDealer, String color, int mileage) {
        this.price = price;
        this.model = model;
        this.mileage = mileage;
        this.brand = brand;
        this.dealer = dealer;
        this.color = color;
        this.keywords = new ArrayList<>();
        this.keywords.add(color);
        this.keywords.add(brand);
        this.keywords.add(addressOfDealer);
        this.keywords.add(String.valueOf(mileage));
        
        
           
          
       
    }

    public String getSetOfNbrs() {
        return setOfNbrs;
    }

    public void setSetOfNbrs(String setOfNbrs) {
        this.setOfNbrs = setOfNbrs;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Dealership getDealer() {
        return dealer;
    }

    public void setDealer(Dealership dealer) {
        this.dealer = dealer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLifestyle() {
        return lifestyle;
    }

    public void setLifestyle(int lifestyle) {
        this.lifestyle = lifestyle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getColorPreference() {
        return colorPreference;
    }

    public void setColorPreference(int colorPreference) {
        this.colorPreference = colorPreference;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public ArrayList<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(ArrayList<String> keywords) {
        this.keywords = keywords;
    }
    
    @Override
    public String toString() {
        return "Cars{" + "price=" + price + ", brand=" + brand + ", color=" + color + ", model=" + model + ", mileage=" + mileage + '}';
    }
}

