/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sg.foundations.basics.flowcontrol.ifs;
import java.util.Scanner;
/**
 * @author: Jorge Villa 
 * email: villajorge41@gmail.com
 * Date: 
 * Purpose: 
 * 
 */
public class MiniZork {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.print("Go to the house, or open the mailbox? ");

        String action = userInput.nextLine();

        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.print("Look inside or stick your hand in? ");
            action = userInput.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.print("Run away or keep looking? ");
                action = userInput.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you alive. Possibly a wise choice.");
                }
            } else if (action.equals("stick your hand in")) { }
        } else if (action.equals("go to the house")) { 
            System.out.println("The door is locked and boarded but you see the an\nopen window");
            System.out.println("Do you climb in the window or knock");
            action = userInput.nextLine();
            if (action.equals("climb in the window")){
                System.out.println("You climb into the window to see a man");
                System.out.println("With his back turned to you watching TV.");
                System.out.println("Do you tell him hello or look around the house?");
                action = userInput.nextLine();
                if (action.equals("tell him hello")){
                    System.out.println("You say hello but the guys doesnt respond.");
                    System.out.println("Do you walk towards him or look around the house");
                    action = userInput.nextLine();
                    if (action.equals("walk towards him")){
                        System.out.println("As you walk towards him he turns around and");
                        System.out.println("shoots you. Game Over");
                    }
                }else if (action.equals("look around the house")){
                    System.out.println("As you're looking around you see a bookshelf with");
                    System.out.println("a book sticking out. Do you take the book or get out of the house?");
                    action = userInput.nextLine();
                    if (action.equals("take the book")){
                        System.out.println("When you open the book you find 1 million dollars.");
                        System.out.println("Congrats YOU WON!");
                    } else if (action.equals("get out of the house")){
                        System.out.println("Good idea shouldnt be in stragers houses.");
                        System.out.println("You make it out but did not fidn what you were looking");
                        System.out.println("for. Game Over");
                    }
                }
            }
            else if (action.equals("knock")){
                System.out.println("You knock on the door but hear no response");
                System.out.println("You cut your losses and go back to the field empty handed");
                System.out.println("Game Over");
        }
        }
    }
 }
