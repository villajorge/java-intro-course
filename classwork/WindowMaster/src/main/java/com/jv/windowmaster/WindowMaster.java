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
        
        //Get window Price
        System.out.println("Enter the price of window per square foot: ");
        float windowPrice = getFloat(scan); 
        
        //Get trim price
        System.out.println("Enter the price of trim per linear foot: ");
        float trimPrice = getFloat(scan);
        
        //Get height of window
        System.out.println("Enter the height of the window:");
        float height = getFloat(scan);
        
        //Get width of window
        System.out.println("Enter the width of the window: ");
        float width = getFloat(scan);
        
        //Get number of windows
        boolean valid = false;
        String strNumWindows = "";
        int numWindows = 0;
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
    
    public static float getFloat(Scanner scan){
        boolean valid;
        String str = "";
        float num = 0f;
        
        valid = false;
        while (!valid){
            try{
                System.out.println("Enter valid float number");
                str = scan.nextLine();
                num = Float.parseFloat(str);
            }catch(NumberFormatException e){
                System.out.println("Invalid Value");
                continue;
            }
            valid = true;
        }
        return num;
    }
}
