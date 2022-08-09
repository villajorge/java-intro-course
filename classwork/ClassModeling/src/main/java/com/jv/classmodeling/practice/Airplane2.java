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
public class Airplane2 {
    private String model;
    private String destination;
    private String goal;
    private double speed;
    private double altitude;

    Airplane2(String model, String dest, String goal, double speed, double altitude){
        this.model = model;
        this.destination = dest;
        this.goal = goal;
        this.speed = speed;
        this.altitude = altitude;
    }
    
    public void printOut(){
        System.out.println("\n=========Flight Sim Plane========");
        System.out.println("Model: "+this.model);
        System.out.println("Destination: "+this.destination);
        System.out.println("Goal: "+this.goal);
        System.out.println("Speed: "+this.speed);
        System.out.println("Altitude: "+this.altitude);
    }
    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }
    
   
    public void steer(){
        //steer the plane in any direction
    }
}
