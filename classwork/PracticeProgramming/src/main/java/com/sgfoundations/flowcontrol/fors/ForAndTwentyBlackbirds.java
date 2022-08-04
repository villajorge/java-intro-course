/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sgfoundations.flowcontrol.fors;

/**
 * @author: Jorge Villa 
 * email: villajorge41@gmail.com
 * Date: 08/04/22
 * Purpose: using for loops
 * 
 */
public class ForAndTwentyBlackbirds {
    public static void main(String[] args){
        int birdsInPie = 0;
        //traditional counting starting loop at 1, condtion +1
        for (int i = 1; i < 25; i++){
            System.out.println("Blackbird #"+i+" goes into the pie!");
            birdsInPie++;
        }
        System.out.println("There are "+birdsInPie+" in there!");
    }
}
