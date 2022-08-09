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
    private double principle;
    private int years;
    private float interest;
    private double interestMoney = 0;
    
    InterestCalulator (double principle, int years, float interest){
        this.principle = principle;
        this.years = years;
        this.interest = interest;
    }
    
    public void getInterest(){
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
