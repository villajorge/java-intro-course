/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sg.foundations.scanner;
import java.util.Scanner;
/**
 * @author: Jorge Villa 
 * email: villajorge41@gmail.com
 * Date: 08/02/22
 * Purpose: 
 * 
 */
public class QuestForTheUserInput {
    public static void main(String[] args){
        
        String name;
        String quest;
        double velocityOfSwallow;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What is your name?");
        name = scan.nextLine();
        
        System.out.println("What is your quest");
        quest = scan.nextLine();
        
        System.out.println("What is the airspeed velocity of an unladen swallow?");
        velocityOfSwallow = Double.parseDouble(scan.nextLine());
        System.out.println("How do you know " + velocityOfSwallow + " is correct, " + name + "?");
        System.out.println("You didn't even know if the swallow was African or European!");
        System.out.println("Maybe skip answering things about birds and instead go " + quest + ".");
        
        scan.close();
    }
}
