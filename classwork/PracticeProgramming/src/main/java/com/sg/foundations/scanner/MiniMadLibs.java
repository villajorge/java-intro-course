/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sg.foundations.scanner;
import java.util.Scanner;
/**
 * @author: Jorge Villa 
 * email: villajorge41@gmail.com
 * Date: 08/02
 * Purpose: 
 * 
 */
public class MiniMadLibs {
    public static void main(String[] args){
        String noun1, adj1, noun2, adj2, pluralNoun1, pluralNoun2, pluralNoun3, verbPresent, verbPast;  
        int num;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Lets play MAD LIBS!");
        System.out.println("I need a noun: ");
        noun1 = scan.nextLine();
        System.out.println("Now an adjective: ");
        adj1 = scan.nextLine();
        System.out.println("Another noun: ");
        noun2 = scan.nextLine();
        System.out.println("And a number: ");
        num = Integer.parseInt(scan.nextLine());
        System.out.println("Another adjective: ");
        adj2 = scan.nextLine();
        System.out.println("A plural noun: ");
        pluralNoun1 = scan.nextLine();
        System.out.println("Another one: ");
        pluralNoun2 = scan.nextLine();
        System.out.println("One more: ");
        pluralNoun3 = scan.nextLine();
        System.out.println("A verb (present tense): ");
        verbPresent = scan.nextLine();
        System.out.println("Same verb (past tense): ");
        verbPast = scan.nextLine();
        
        System.out.println("*****MAD LIB*****");
        System.out.println(noun1+": the "+adj1+" fronteir. These are the voyages of the starship "+noun2+".");
        System.out.println("Its "+num+"-year mission: to explore strange "+adj2+" "+pluralNoun1+",");
        System.out.println("to seek out "+adj2+" "+pluralNoun2+" and "+adj2+" "+pluralNoun3+",");
        System.out.println("to boldly "+verbPresent+" where no one has "+verbPast+" before.");
    }
}
