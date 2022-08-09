/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.jv.classmodeling;

/**
 * @author: Jorge Villa 
 * email: villajorge41@gmail.com
 * Date: 
 * Purpose: 
 * 
 */
public class School1 {
    private String name;
    private String description;
    private int numberOfClassrooms;
    private double squareFootage;
    private int studentCapacity;
    private Cafeteria cafeteria;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getNumberOfClassrooms() {
        return numberOfClassrooms;
    }

    public double getSquareFootage() {
        return squareFootage;
    }

    public int getStudentCapacity() {
        return studentCapacity;
    }

    public Cafeteria getCafeteria() {
        return cafeteria;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNumberOfClassrooms(int numberOfClassrooms) {
        this.numberOfClassrooms = numberOfClassrooms;
    }

    public void setSquareFootage(double squareFootage) {
        this.squareFootage = squareFootage;
    }

    public void setStudentCapacity(int studentCapacity) {
        this.studentCapacity = studentCapacity;
    }

    public void setCafeteria(Cafeteria cafeteria) {
        this.cafeteria = cafeteria;
    }
    
    
}
