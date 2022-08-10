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
public class Circle extends Shape {
    private double radius;
    private final double PI = 3.14;
    
    Circle(double a){
        this.radius = a;
    }
    
    @Override
    public void getArea(){
        double area = (this.radius*this.radius)*PI*2;
        System.out.println("Area for square is: "+area);
    }
    
    @Override
    public void getPerimeter(){
        double perim = 2*(PI*this.radius);
        System.out.println("Perimeter for square is: "+perim);
    }
}
