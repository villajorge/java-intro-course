/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sg.foundations.variables;
import java.util.Scanner;
/**
 * @author: Jorge Villa 
 * email: villajorge41@gmail.com
 * Date: 08/02/22
 * Purpose: 
 * 
 */
public class BestAdderEver {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String strVal1 = "";
        double val1 = 0;
        boolean valid = false;
        //Get first value
        while(!valid){
            try {
                System.out.println("Enter value 1: ");
                strVal1 = scan.nextLine();
                val1 = Double.parseDouble(strVal1);
            }catch (NumberFormatException e){
                System.out.println("Invalid input");
                continue;
            }
            valid = true;
        }
        
        String strVal2 = "";
        double val2 = 0;
        valid = false;
        //get second value
        while(!valid){
            try {
                System.out.println("Enter value 2: ");
                strVal2 = scan.nextLine();
                val2 = Double.parseDouble(strVal1);
            }catch (NumberFormatException e){
                System.out.println("Invalid input");
                continue;
            }
            valid = true;
        }
        
        String strVal3 = "";
        double val3 = 0;
        valid = false;
        //get third value
        while(!valid){
            try {
                System.out.println("Enter value 2: ");
                strVal3 = scan.nextLine();
                val3 = Double.parseDouble(strVal1);
            }catch (NumberFormatException e){
                System.out.println("Invalid input");
                continue;
            }
            valid = true;
        }
        
        System.out.println(val1+" + "+val2+" + "+val3+" = "+ (val1+val2+val3));
  
        scan.close();
    }
}
