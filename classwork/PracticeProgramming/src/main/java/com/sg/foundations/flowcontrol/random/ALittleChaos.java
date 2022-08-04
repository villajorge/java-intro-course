/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sg.foundations.flowcontrol.random;
import java.util.Random;
/**
 * @author: Jorge Villa 
 * email: villajorge41@gmail.com
 * Date: 
 * Purpose: 
 * 
 */
public class ALittleChaos {
    public static void main(String[] args){
        Random rand = new Random();
        System.out.println("Random Int: "+rand.nextInt());
        System.out.println("Random Double: "+rand.nextDouble());
        System.out.println("Random Boolean: "+rand.nextBoolean());
        
        int num = rand.nextInt(100);
        
        System.out.println("Storing random: "+num);
        System.out.println("Using multiple times: "+num+", "+num);
        System.out.println("Or generate many random values");
        
        System.out.print(rand.nextInt(101));
        System.out.print(", "+rand.nextInt(101));
        System.out.print(", "+rand.nextInt(101));
        System.out.print(", "+rand.nextInt(101));
        //Give number between 50-100
        System.out.println(rand.nextInt(51)+50);
        //Using random in math statements
        System.out.println((rand.nextInt(4)+12)/2);
        //random double between -2.0 and 100
        System.out.println(rand.nextDouble()*102-2);
        
        
        
    }
}
