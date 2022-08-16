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
        UserIO io = new UserIO();
        SimpleCalculator calc = new SimpleCalculator(a,b);
        int test = io.readInt("Give me an int", 1,10);
        do{
        
        choice = io.readInt("Would you like to"
                + "\n1. Add"
                + "\n2. Subtract"
                + "\n3. Divide"
                + "\n4. Multiply"
                + "\n5. Quit", 1, 5);
        if (choice == 5){
            break;
        }
        a = io.readDouble("Enter first double operand");
        b = io.readDouble("enter second double operator");
        switch(choice){
            case 1:
                io.print(a+" + "+b+" = "+calc.add(a,b));
                break;
            case 2:
                io.print(a+" - "+b+" = "+calc.subtract(a, b));
                break;
            case 3:
                io.print(a+" / "+b+" = "+calc.divide(a, b));
                break;
            case 4:
                io.print(a+" * "+b+" = "+calc.multiply(a, b));
                break;
            case 5:
                break;
        }
        }while(choice!=5);
        io.print("Thanks for using Simple Calculator!");
    }
}
