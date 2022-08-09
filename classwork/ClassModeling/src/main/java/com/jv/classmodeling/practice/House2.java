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
public class House2 {
    private int numberOfRooms;
    private int numberOfFloors;
    private double squareFootage;
    private double numberOfBathrooms;
    
    House2(int rooms, int floors, double squareFootage, double baths){
        this.numberOfBathrooms = baths;
        this.numberOfFloors = floors;
        this.numberOfRooms = rooms;
        this.squareFootage = squareFootage;
    }
    
    public void printOut(){
        System.out.println("\n==========3D Design System============");
        System.out.println("Number of rooms: "+this.numberOfRooms);
        System.out.println("Number of bathrooms: "+this.numberOfBathrooms);
        System.out.println("Floors: "+this.numberOfFloors);
        System.out.println("Square Footage: "+this.squareFootage);
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public double getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(double squareFootage) {
        this.squareFootage = squareFootage;
    }

    public double getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(double numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }
    
    public void render(){
        //render the 3d house
        System.out.println("Displaying house...");
    } 
}
