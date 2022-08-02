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
        System.out.println("Enter the height of the window:");
        int height = scan.nextInt();
        System.out.println("Enter the width of the window: ");
        int width = scan.nextInt();
        
        int area = height*width;
        int perimeter = (height*2) + (width*2);
        
        double windowCost = area * 3.5;
        double trimCost = perimeter * 2.25;
        
        System.out.println("Total cost of window is: "+(windowCost+trimCost));
                 
    }
}
