/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sg.foundations.flowcontrol.whiles;
import java.util.Random;
/**
 * @author: Jorge Villa 
 * email: villajorge41@gmail.com
 * Date: 
 * Purpose: 
 * 
 */
public class LazyTeenager {
    public static void main(String[] args){
        Random rand = new Random();
        int chances = 0;
        int counter = 0;
        boolean clean = false;
        int probability = 0;
        int willClean = 0;
        do{
            chances++;
            counter++;
            probability+=10;
            
            System.out.println("Clean your room! (X"+counter+")");
            //genrate random number from 0-100
            willClean = rand.nextInt(101);
            //System.out.println(willClean+" <= "+probability);
            if (willClean <= probability){
                System.out.println("Fine Ill clean");
                clean = true;
                break;
            }
            //System.out.println("Chances = "+chances);
        }while(chances < 7);
        if (!clean){
             System.out.println("Grounded and taking XBOX");
        }
    }
}
