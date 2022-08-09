/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package commulative.activities;
import java.util.Scanner;
import java.util.Random;
/**
 * @author: Jorge Villa 
 * email: villajorge41@gmail.com
 * Date: 
 * Purpose: 
 * 
 */
public class LuckySevens {
    private int maxRoll = 0;
    private int max = 0;
    
    public void startPlay(){
        Random dice = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("How many dollars do you have? ");
        int money = scan.nextInt();
        int counter = 0;
        do{
            if(money > max){
                max = money;
                maxRoll = counter;
            }
            if ((dice.nextInt(6)+1)+(dice.nextInt(6)+1)==7){
                money+=4;
            }else{
                money-=1;
            }
            counter++;
        }while (money!= 0);
        System.out.println("You are broke after "+counter+" rolls.");
        System.out.println("You shoulkd have quit after "+maxRoll+ " when you had $"+max);
        
        
    }
}
