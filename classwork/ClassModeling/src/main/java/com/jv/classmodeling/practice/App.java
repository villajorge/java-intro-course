/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.jv.classmodeling.practice;

/**
 * @author: Jorge Villa 
 * email: villajorge41@gmail.com
 * Date: 
 * Purpose: 
 * 
 */
public class App {
    public static void main(String[] args){
        //Houses
        House1 GPSHouse = new House1(1.23,14.56,"Tarrytown","New York");
        GPSHouse.printOut();
        House2 Design3D = new House2(5, 2, 1000.25, 3.5);
        Design3D.printOut();
        
        //Planes
        Airplane1 plane1 = new Airplane1("Delta1","New York","Texas",27.8);
        plane1.printOut();
        Airplane2 plane2 = new Airplane2("Boeing-72","Texas","Make it in under 10 minutes",120,1000);
        plane2.printOut();
        
        //Cars
        Car1 car1 = new Car1("Toyota","blue",15000,2018,4,false);
        car1.printOut();
        Car2 car2 = new Car2("Toyota",60,"White");
        car2.printOut();
        
        //IceCreams
        IceCream1 iceCream1 = new IceCream1("Vanilla",150.7,"White","Creamy vanilla");
        iceCream1.printOut();
        IceCream2 iceCream2 = new IceCream2(1000, 20, "11/20/22");
        iceCream2.printOut();
        
        //Books
        Book1 book1 = new Book1("The book","The longest book","Publisher Spent",20000);
        book1.printOut();
        Book2 book2 = new Book2("Special Title","Robert Guard", "Fiction","23.5BA",1500);
        book2.printOut();
        
    }
}
