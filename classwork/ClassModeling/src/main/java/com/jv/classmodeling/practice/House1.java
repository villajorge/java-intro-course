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
public class House1 {
    private double longitude;
    private double latitude;
    private String town;
    private String state;
    
    
    House1 (double longitude, double latitude, String town, String state){
        this.latitude = latitude;
        this.longitude = longitude;
        this.town = town;
        this.state = state;
    }
    
    public void printOut(){
        System.out.println("\n================GPS Mapping House==========");
        System.out.println("Longitude: "+this.longitude);
        System.out.println("Latitude: "+this.latitude);
        System.out.println("Town: "+this.town);
        System.out.println("State: "+this.state);
        
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    public void getDirections(){
        //prints the direcitions to the house
        System.out.println("Getting directions...");
    }
    
    
}
