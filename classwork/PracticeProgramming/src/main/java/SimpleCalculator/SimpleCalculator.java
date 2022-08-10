/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package SimpleCalculator;

/**
 * @author: Jorge Villa 
 * email: villajorge41@gmail.com
 * Date: 
 * Purpose: 
 * 
 */
public class SimpleCalculator {
    private double a;
    private double b;
    
    SimpleCalculator(double a, double b){
        this.a=a;
        this.b=b;
    }

    SimpleCalculator() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public double add(double a, double b){
        return a+b;
    }
    
    public double subtract(double a, double b){
        return a-b;
    }
    
    public double divide (double a, double b){
        return a/b;
    }
    
    public double multiply(double a, double b){
        return a*b;
    }
}
