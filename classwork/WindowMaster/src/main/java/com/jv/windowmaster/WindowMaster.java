/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.jv.windowmaster;
import java.util.Scanner;
/**
 *@author Jorge
 * 
 */
public class WindowMaster {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean valid = false;
        
        //Get window Price
        float windowPrice = 0;
        String strWindowPrice ="";
        while (!valid){
        try{
            System.out.println("Enter the price of window per square foot: ");
            strWindowPrice = scan.nextLine();
            windowPrice = Float.parseFloat(strWindowPrice);
            
        }catch (NumberFormatException E){
            System.out.println("Invalid Value");
            continue;
        }
            valid = true;
        }
        
        //Get trim price
        String strTrimPrice;
        float trimPrice = 0;
        valid = false;
        while (!valid){
            try{
            System.out.println("Enter the price of trim per linear foot: ");
            strTrimPrice = scan.nextLine();
            trimPrice = Float.parseFloat(strTrimPrice);
            }catch(NumberFormatException e){
                System.out.println("Invalid Value");
                continue;
            }
            valid = true;
        }
        
        //Get height of window
        String strHeight = "";
        float height = 0;
        valid = false;
        while (!valid){
            try{
                System.out.println("Enter the height of the window:");
                strHeight = scan.nextLine();
                height = Float.parseFloat(strHeight);
            }catch (NumberFormatException e){
                System.out.println("Invalid Value");
                continue;
            }
            valid = true;
        }
        
        //Get width of window
        String strWidth = "";
        float width = 0;
        valid = false;
        while (!valid){
            try{
                System.out.println("Enter the width of the window: ");
                strWidth = scan.nextLine();
                width = Float.parseFloat(strWidth);
            }catch(NumberFormatException e){
                System.out.println("Invalid Value");
                continue;
            }
            valid = true;
        }
        
        //Get number of windows
        String strNumWindows = "";
        int numWindows = 0;
        valid = false;
        while (!valid){
            try{
                System.out.println("Enter number of windows: ");
                strNumWindows = scan.nextLine();
                numWindows = Integer.parseInt(strNumWindows);
            }catch(NumberFormatException e){
                System.out.println("Invalid Value");
                continue;
            }
            valid = true;
        }
        float area = height*width;
                
        float perimeter = (height*2) + (width*2);
        
        float windowCost = area * windowPrice * numWindows;
        float trimCost = perimeter * trimPrice * numWindows;
        
        System.out.println("Total cost of window is: "+(windowCost+trimCost));
        scan.close();      
    }
}
