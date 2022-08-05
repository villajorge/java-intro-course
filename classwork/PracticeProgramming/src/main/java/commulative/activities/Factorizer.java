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
    public static void main(String[] args){
        String factors = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to find its factors");
        int num = scan.nextInt();
        int sumFactors = 0;
        int counter = 0;
        for (int i = 1; i <= num; i++){
            if(num%i == 0){
                factors += i+" ";
                sumFactors+=i;
                counter++;
            }
        }
        System.out.println("Factors are "+factors);
        System.out.println(num+" has "+counter+" factors");
        if (sumFactors-num == num){
            System.out.println(num+" is a perfect number");
        }else {
            System.out.println(num+" is not a perfect number");
        }
        if (sumFactors == num+1){
            System.out.println(num+" is a prime number");
        }else{
            System.out.println(num+" is not a prime number");
        }
        
    }
}
