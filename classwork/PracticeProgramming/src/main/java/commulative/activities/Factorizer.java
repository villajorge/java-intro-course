/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package commulative.activities;
import java.util.Scanner;
/**
 * @author: Jorge Villa 
 * email: villajorge41@gmail.com
 * Date: 08/05/22
 * Purpose: 
 * 
 */
public class Factorizer {
    private int number;
    private int sumFactors = 0;
    private int counter = 0;
    private String factors = "";
    
   Factorizer(int number){
       this.number = number;
   }
    
        
    public void getFactors(){
        for (int i = 1; i <= number; i++){
            if(number%i == 0){
                factors += i+" ";
                sumFactors+=i;
                counter++;
            }
        }
    }
        
    public void printFactors(){
        System.out.println("Factors are "+factors);
        System.out.println(number+" has "+counter+" factors");
        if (sumFactors-number == number){
            System.out.println(number+" is a perfect number");
        }else {
            System.out.println(number+" is not a perfect number");
        }
        if (sumFactors == number+1){
            System.out.println(number+" is a prime number");
        }else{
            System.out.println(number+" is not a prime number");
            }
        }
    
}
