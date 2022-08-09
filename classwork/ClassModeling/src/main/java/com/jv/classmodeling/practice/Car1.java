/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.jv.classmodeling.practice;

/**
 * @author: Jorge Villa 
 * email: villajorge41@gmail.com
 * Date: 
 * Purpose: 
 * 
 */
public class Car1 {
    private String model;
    private String color;
    private double price;
    private int year;
    private int cylinders;
    private boolean isManual;

    Car1 (String model, String color, double price, int year, int cylinders, boolean isManual){
        this.model = model;
        this.color = color;
        this.price = price;
        this.year = year;
        this.cylinders = cylinders;
        this.isManual = isManual;
    }
    
    public void printOut(){
        System.out.println("\n=======Car Dealership=======");
        System.out.println("Model: "+this.model);
        System.out.println("Color: "+this.color);
        System.out.println("Price: "+this.price);
        System.out.println("Year: "+this.year);
        System.out.println("Cylinders: "+this.cylinders);
        System.out.println("isManual"+this.isManual);
    }
    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public boolean isIsManual() {
        return isManual;
    }

    public void setIsManual(boolean isManual) {
        this.isManual = isManual;
    }
    
    
    
}
