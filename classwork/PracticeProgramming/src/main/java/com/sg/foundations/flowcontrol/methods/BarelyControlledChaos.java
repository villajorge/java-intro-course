/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sg.foundations.flowcontrol.methods;
import java.util.Random;
/**
 * @author: Jorge Villa 
 * email: villajorge41@gmail.com
 * Date: 
 * Purpose: 
 * 
 */
public class BarelyControlledChaos {
public static void main(String[] args) {
        Random rand = new Random();
        String color = getColor(rand); // call color method here
        String animal = getAnimal(rand); // call animal method again here
        String colorAgain = getColor(rand); // call color method again here
        int weight = getNumber(5,200,rand); // call number method,
            // with a range between 5 - 200
        int distance = getNumber(10, 20, rand); // call number method,
            // with a range between 10 - 20
        int number = getNumber(10000, 20000, rand); // call number method,
            // with a range between 10000 - 20000
        int time = getNumber(2, 6, rand); // call number method,
            // with a range between 2 - 6            

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + colorAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");
    }

    public static String getColor(Random rand){
        
        int num = rand.nextInt(5);
        switch(num){
            case 0:
                return "blue";
            case 1:
                return "red";
            case 2:
                return "magenta";
            case 3:
                return "orange";
            case 4:
                return "pink";
        }
        return "";
        
    }
    public static String getAnimal(Random rand){
         int num = rand.nextInt(5);
         switch(num){
            case 0:
                return "dog";
            case 1:
                return "cat";
            case 2:
                return "fish";
            case 3:
                return "mammoth";
            case 4:
                return "elephant";
        }
         return "";
    }
    public static int getNumber(int min, int max, Random rand){
        return rand.nextInt((max - min))+min;
    }
}
