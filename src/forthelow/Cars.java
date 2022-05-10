
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;

/**
 *
 * @author 2177095
 */
public class Cars {

    private double price;
    private String brand;
    private Dealership dealer;
    private String color;
    private int lifestyle, salary, colorPreference = 0;
    private String model;
    private int mileage;
    private ArrayList<String> keywords;
    private String setOfNbrs;
    private String addressOfDealer;
    private String phoneNumber;

    public Cars(double price, String brand, String model, String addressOfDealer, String phoneNumber, String color, int mileage) {
        this.price = price;
        this.model = model;
        this.mileage = mileage;
        this.brand = brand;
        this.phoneNumber = phoneNumber;
        this.addressOfDealer = addressOfDealer;
        this.dealer = dealer;
        this.color = color;
        this.keywords = new ArrayList<String>();
        this.keywords.addAll(toKeywords(color));
        this.keywords.addAll(toKeywords(brand));
        this.keywords.addAll(toKeywords(model));
        this.keywords.addAll(toKeywords(addressOfDealer));
        this.keywords.addAll(toKeywords(String.valueOf(mileage)));

    }

    private static ArrayList<String> toKeywords(String word) {

        ArrayList<String> toKeywords = new ArrayList<>();
        int i = 0;

        for (i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ') {
                toKeywords.add(word.substring(0, i).toLowerCase());
                word = word.substring(i + 1);
                i = -1;
            } else if (i == word.length() - 1) {
                toKeywords.add(word);
            }

        }

        return toKeywords;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddressOfDealer() {
        return addressOfDealer;
    }

    public void setAddressOfDealer(String addressOfDealer) {
        this.addressOfDealer = addressOfDealer;
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

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
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
        return "price: " + price + ", brand:" + brand + ", color:" + color + ", model:" + model + ", mileage:" + mileage + "km" + "}";
    }

}
