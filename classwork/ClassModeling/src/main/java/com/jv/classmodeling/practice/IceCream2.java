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
public class IceCream2 {
    private int capacity;
    private int flavors;
    private String deliveryDate;
    
    IceCream2(int cap, int flavors, String date){
        this.capacity = cap;
        this.flavors= flavors;
        this.deliveryDate = date;
    }
    
    public void printOut(){
        System.out.println("\n==========Ice Cream stocking system =======");
        System.out.println("Capacity: "+this.capacity);
        System.out.println("Flavors: "+this.flavors);
        System.out.println("Delivery Date: "+this.deliveryDate);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getFlavors() {
        return flavors;
    }

    public void setFlavors(int flavors) {
        this.flavors = flavors;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
    
    
    
}
