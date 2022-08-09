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
public class Car2 {
    private String model;
    private int speed;
    private String color;
    
    Car2(String model, int speed, String color){
        this.color = color;
        this.model = model;
        this.speed = speed;
    }
    
    public void printOut(){
        System.out.println("\n========Car Game==========");
        System.out.println("Color: "+this.color);
        System.out.println("Model: "+this.model);
        System.out.println("Speed: "+this.speed);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
}
