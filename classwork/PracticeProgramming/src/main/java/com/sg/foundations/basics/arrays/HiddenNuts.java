/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sg.foundations.basics.arrays;
import java.security.SecureRandom;
import java.util.Random;/**
 * @author: Jorge Villa 
 * email: villajorge41@gmail.com
 * Date: 08/05/22
 * Purpose: Using arrays
 * 
 */

public class HiddenNuts {
    public static void main(String[] args){
        String[] hidingSpots = new String[100];
        Random rand = new SecureRandom();
        hidingSpots[rand.nextInt(hidingSpots.length)] = "Nut";
        
        System.out.println("Nut has been hidden...");
        
        for (int i = 0; i < hidingSpots.length; i++){
            if(hidingSpots[i] == "Nut"){
                System.out.println("Found it! Its in spot #"+i);
                break;
            }
        }
        
    }
}
