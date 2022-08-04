/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sg.foundations.flowcontrol.whiles;

/**
 * @author: Jorge Villa 
 * email: villajorge41@gmail.com
 * Date: 08/04/22
 * Purpose: using while loops
 * 
 */
public class WaitAWhile {
    public static void main(String[] args){
        //changing timeNow to be greater than bedTime wouldnt enter the loop 
        int timeNow = 5;
         //changing bedtime to 11 would increase the loop by 1
         int bedTime = 10;
         
         while (timeNow < bedTime){
             System.out.println("Its only "+timeNow+" o'clock");
             System.out.println("I think I'll stay up longer...");
             //commenting this out would result in an infinite loop b/c not changig condition
             timeNow++;
         }
         
         System.out.println("Oh. It's "+timeNow+" o'clock");
         System.out.println("Guess I should go to bed.");
    }
}
