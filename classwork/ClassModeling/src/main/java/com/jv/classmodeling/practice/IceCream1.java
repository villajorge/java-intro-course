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
public class IceCream1 {
    private String flavor;
    private double sugar;
    private String color;
    private String description;
    
    IceCream1(String flavor, double sugar,String color, String desc){
        this.flavor = flavor;
        this.description = desc;
        this.sugar = sugar;
        this.color = color;
    }
    
    public void printOut(){
        System.out.println("\n=====Ice Cream @ Maker=====");
        System.out.println("Flavor: "+this.flavor);
        System.out.println("Description: "+this.description);
        System.out.println("Sugars:  "+this.sugar);
        System.out.println("Color: "+this.color);
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
