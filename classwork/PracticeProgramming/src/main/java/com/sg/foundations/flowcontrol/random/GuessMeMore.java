/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sg.foundations.flowcontrol.random;
import java.util.Random;
import java.util.Scanner;
/**
 * @author: Jorge Villa 
 * email: villajorge41@gmail.com
 * Date: 
 * Purpose: 
 * 
 */
public class GuessMeMore {
    public static void main(String[] args){ 
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        //generate random num -100 to 100
        int num = (rand.nextInt(200)-100);
        System.out.println("I have a number between -100 and 100");
        System.out.println("Try and guess");
        System.out.print("Your guess: ");
        int guess;
        do{
            guess = scan.nextInt();
            if (guess > num){
                System.out.println("Guess is too high");
                System.out.println("Try again");
                System.out.print("Your guess: ");
            }
            else if (guess < num){
                System.out.println("Guess is too low");
                System.out.println("Try again");
                System.out.print("Your guess: ");
            }
        }while (guess!=num);
        System.out.println("You got it! Number was: "+num);
    
    }
       
    
}
