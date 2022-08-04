/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sgfoundations.flowcontrol.fors;
import java.util.Scanner;
/**
 * @author: Jorge Villa 
 * email: villajorge41@gmail.com
 * Date: 08/04/22
 * Purpose: 
 * 
 */
public class TraditionalFizzBuzz {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many units of fizz buzz do you need?");
        int max = scan.nextInt();
        int stop = 0;
        for (int i = 0; i < 100;i++){
            if (stop == max){
                System.out.println("TRADITION!!");
                break;
            }
            if (i%3 == 0 && i%5 == 0 && i!=0){
                System.out.println("fizz buzz");
                stop++;
            } else if(i%3 == 0 && i!= 0){
                System.out.println("fizz");
                stop++;
            }else if (i%5 == 0 && i!= 0){
                System.out.println("buzz");
                stop++;
            }else{
                System.out.println(i);
            }
            
        }
        
    }
}
