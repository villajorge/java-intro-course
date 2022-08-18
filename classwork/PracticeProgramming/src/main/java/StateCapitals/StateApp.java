/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package StateCapitals;

import StateCapitals.StateCapitals3.Capital;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author: Jorge Villa 
 * email: villajorge41@gmail.com
 * Date: 
 * Purpose: 
 * 
 */
public class StateApp {
    public static void main(String[] args) throws FileNotFoundException {
        int population;
        double squareFeet;
        Map<String, Capital> capitals = new HashMap<>();
        Scanner read = new Scanner(new BufferedReader(new FileReader("D:\\1Repos\\java-intro-course\\classwork\\PracticeProgramming\\src\\main\\java\\StateCapitals\\input.txt")));
        String[] input = new String[4];
        String inSplit ="";
        while (read.hasNext()){
            inSplit = read.nextLine();
            input = inSplit.split("::");
            population = Integer.parseInt(input[2]);
            squareFeet = Double.parseDouble(input[3]);
            Capital temp = new Capital(input[1],population,squareFeet);
            capitals.put(input[0], temp);
        }
        
    }
    
}
