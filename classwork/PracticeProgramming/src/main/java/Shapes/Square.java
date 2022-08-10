/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Shapes;

/**
 * @author: Jorge Villa 
 * email: villajorge41@gmail.com
 * Date: 
 * Purpose: 
 * 
 */
public class Square extends Shape {
    
    Square(double a, double b){
        this.length = a;
        this.height = b;
    }
    
    @Override
    public void getArea(){
        double area = this.height*this.length;
        System.out.println("Area for square is: "+area);
    }
    
    @Override
    public void getPerimeter(){
        double perim = 2*(this.length+this.height);
        System.out.println("Perimeter for square is: "+perim);
    }
}
