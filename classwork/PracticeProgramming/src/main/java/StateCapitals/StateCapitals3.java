/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package StateCapitals;




/**
 * @author: Jorge Villa 
 * email: villajorge41@gmail.com
 * Date: 
 * Purpose: 
 * 
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StateCapitals3 {

        public static void main(String[] args) throws FileNotFoundException {
        int population;
        double squareFeet;
        int count = 0;
        Scanner scan = new Scanner(System.in);
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
            count++;
        }
            System.out.println(count+" State/Capital Pairs Loaded");
            System.out.println("=====================");
            
            Set<String> states = capitals.keySet();
            for (String str : states){
                System.out.println(str+" - "+capitals.get(str).toString());
            }
            
            System.out.println("\n=====\nPlease enter lower limit for capital city population: ");
            int lowPop = scan.nextInt();
            System.out.println("Printing capitals with population greater than "+lowPop);
            for (String str : states){
                if(lowPop <= capitals.get(str).getPopulation()){
                    System.out.println(str+" - "+capitals.get(str).toString());
                }
            }
            
            System.out.println("\n=========\nPlease enter upper limit for capital city sq mileage: ");
            double maxSq = scan.nextDouble();
            System.out.println("Printing capitals with square mileage less than "+maxSq);
            for (String str : states){
                if(maxSq >= capitals.get(str).getSquareFeet()){
                    System.out.println(str+" - "+capitals.get(str).toString());
                }
            }
         
        
        }
    
  
    public static class Capital{
        private String name;
        private int population;
        private double squareFeet;
        
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPopulation() {
            return population;
        }

        public void setPopulation(int population) {
            this.population = population;
        }

        public double getSquareFeet() {
            return squareFeet;
        }

        public void setSquareFeet(double squareFeet) {
            this.squareFeet = squareFeet;
        }
        
        @Override
        public String toString(){
            return (this.name+" | Pop: "+this.population+" | Area:"+this.squareFeet+" sq mi");
        }
        
        Capital(String name, int population, double square){
        this.name = name;
        this.population = population;
        this.squareFeet = square;
        }
    }
    
    

    
    
    
}
