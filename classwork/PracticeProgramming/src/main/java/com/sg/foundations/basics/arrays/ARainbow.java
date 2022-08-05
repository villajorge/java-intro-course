/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sg.foundations.basics.arrays;

/**
 * @author: Jorge Villa 
 * email: villajorge41@gmail.com
 * Date: 08/05/22
 * Purpose: Using arrays
 * 
 */
public class ARainbow {
    public static void main(String[] args){
        String[] colors = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};
        
        for (int i = 0; i < colors.length; i++){
            System.out.println(colors[i]);
        }
        System.out.println("\nFor each loop");
        for (String color : colors){
            System.out.println(color);
        }
        
    }
}
