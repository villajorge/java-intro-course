/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package commulative.activities;
import java.util.Scanner;
/**
 * @author: Jorge Villa 
 * email: villajorge41@gmail.com
 * Date: 
 * Purpose: 
 * 
 */
public class InterestCalulator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How much are you investing ");
        double principle = scan.nextDouble();
        scan.nextLine();
        System.out.println("How many years are you investing");
        int years = scan.nextInt();
        scan.nextLine();
        System.out.println("What is the annual interest rate % growth");
        float interest = scan.nextFloat();
        double interestMoney = 0;
        for (int i = 1; i <= years; i++){
            System.out.println("Year: "+i);
            System.out.println("Began with $"+principle);
            interestMoney = principle*(interest/100);
            System.out.println("Earned $"+interestMoney);
            principle+=interestMoney;
            System.out.println("Ended with $"+principle);
        }
        
    }
}
