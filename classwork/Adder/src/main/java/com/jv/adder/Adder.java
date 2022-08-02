package com.jv.adder;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 * @autthor: Jorge
 * 
 * 
 */
public class Adder {

    public static void main(String[] args) {
        String num1;
        String num2;
        int intNum1;
        int intNum2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        //int num1 = scan.nextInt();
        num1 = scan.nextLine();
        System.out.println("Enter second number: ");
        //int num2 = scan.nextInt();
        num2 = scan.nextLine();
        //System.out.println(num1+" + "+num2+" = "+(num1+num2));
        intNum1 = Integer.parseInt(num1);
        intNum2 = Integer.parseInt(num2);
        System.out.println(intNum1+" + "+intNum2+" = "+(intNum1+intNum2));
        scan.close();
    }
}
