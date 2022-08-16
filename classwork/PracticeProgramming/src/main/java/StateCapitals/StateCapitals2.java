/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package StateCapitals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 * @author: Jorge Villa 
 * email: villajorge41@gmail.com
 * Date: 
 * Purpose: 
 * 
 */
public class StateCapitals2 {
    public static void main(String[] args) throws FileNotFoundException {
        Map<String, String> capitals = new HashMap<>();
        
        Scanner read = new Scanner(new BufferedReader(new FileReader("D:\\1Repos\\java-intro-course\\classwork\\PracticeProgramming\\src\\main\\java\\StateCapitals\\stateCapitals.txt")));
        
        String line = "";
        String state, capital;
        String[] output = new String[2];
        while (read.hasNext()){
            line = read.nextLine();
            output = line.split("::");
            state = output[0];
            capital = output[1];
            //System.out.println("State: "+state+" Capital: "+capital);
            capitals.put(state, capital);
        }
        
        Set<String> states = capitals.keySet();
        
        System.out.println("Here are the states");
        for (String state1 :  states){
            System.out.println(state1);
        }
        
        System.out.println("Test your knowledge. How many capitals would you like to guess?");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.nextLine();
        int it = 0;
        String guess;
        int correct= 0, wrong = 0;
        for (String st : states){
            if (it == num){
                break;
            }
            System.out.println("What is the capital of: "+st);
            guess = scan.nextLine();
            if(guess.equals(capitals.get(st))){
                correct++;
            }else{
                wrong++;
            }
            it++;
        }
        
        System.out.println("After "+num+" tries, you got "+correct+" correct and "+wrong+" wrong.");

        
        
        
        
    }
}
