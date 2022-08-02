/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sg.foundations.variables;

/**
 * @author: Jorge Villa 
 * email: villajorge41@gmail.com
 * Date: 08/02/22
 * * Purpose: More variable declaration 
 * 
 */
public class MoreBucketsMoreFun {
    public static void main(String[] args){
        //Declairing the variables 
        int butterflies, beetles, bugs;
        
        butterflies = 5;
        beetles = 9;
        
        bugs = butterflies + beetles;
        System.out.println("There are only "+butterflies+ " butterflies,");
        System.out.println("but there are "+ bugs+ " bugs in all.");
        
        System.out.println("Uh oh, my dog ate one.");
        butterflies--; //this unary operator shows that the dog ate one
        System.out.println("Now there are only "+butterflies+" butterflies left.");
        //Number of bugs is still the same because we did not update the bugs value
        System.out.println("But there are still "+ bugs+" bugs left..");
        System.out.println("Wait a minute!");
        System.out.println("... maybe my computer cant do math!");
    }
}
