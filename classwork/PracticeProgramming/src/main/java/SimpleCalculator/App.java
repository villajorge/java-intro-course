/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package SimpleCalculator;
import java.util.Scanner;
/**
 * @author: Jorge Villa 
 * email: villajorge41@gmail.com
 * Date: 
 * Purpose: 
 * 
 */
public class App {
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        int choice = 0;
        SimpleCalculator calc = new SimpleCalculator(a,b);
        Scanner scan = new Scanner(System.in);
        do{
        System.out.println("Would you like to"
                + "\n1. Add"
                + "\n2. Subtract"
                + "\n3. Divide"
                + "\n4. Multiply"
                + "\n5. Quit");
        choice = scan.nextInt();
        if (choice == 5){
            break;
        }
        System.out.println("Enter first operand: ");
        a = scan.nextDouble();
        System.out.println("Enter second operand: ");
        b = scan.nextDouble();
        switch(choice){
            case 1:
                System.out.println(calc.add(a,b));
                break;
            case 2:
                System.out.println(calc.divide(a, b));
                break;
            case 3:
                System.out.println(calc.divide(a, b));
                break;
            case 4:
                System.out.println(calc.divide(a, b));
                break;
            case 5:
                break;
        }
        }while(choice!=5);
        System.out.println("Thanks for using Simple Calculator!");
    }
}
