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
public class Airplane1 {
    private String name;
    private String takeOffLocation;
    private String landLocation;
    private double gas;
    
    Airplane1(String name, String takeOff, String land, double gas){
        this.name = name;
        this.takeOffLocation = takeOff;
        this.landLocation = land;
        this.gas = gas;
    }
    
    public void printOut(){
        System.out.println("\n============Air Traffic Plane=======");
        System.out.println("Name: "+this.name);
        System.out.println("Takeoff Location: "+this.takeOffLocation);
        System.out.println("landing location: "+this.landLocation);
        System.out.println("Liters of gas: "+this.gas);
    }
    
    public void takeOff(Airplane1 plane){
        System.out.println("Plane taking off");
        
    }
    
    public void land(Airplane1 plane){
        System.out.println("Plane landing");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTakeOffLocation() {
        return takeOffLocation;
    }

    public void setTakeOffLocation(String takeOffLocation) {
        this.takeOffLocation = takeOffLocation;
    }

    public String getLandLocation() {
        return landLocation;
    }

    public void setLandLocation(String landLocation) {
        this.landLocation = landLocation;
    }

    public double getGas() {
        return gas;
    }

    public void setGas(double gas) {
        this.gas = gas;
    }
    
    
    
}
