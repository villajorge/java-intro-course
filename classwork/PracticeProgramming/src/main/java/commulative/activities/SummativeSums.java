/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package commulative.activities;

/**
 * @author: Jorge Villa 
 * email: villajorge41@gmail.com
 * Date: 
 * Purpose: 
 * 
 */
public class SummativeSums {
    public static void main(String[] args){
        int[] arr1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] arr2 = { 999, -60, -77, 14, 160, 301 };
        int[] arr3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
                      140, 150, 160, 170, 180, 190, 200, -99 };
        System.out.println("#1 Array Sum: "+getSum(arr1));
        System.out.println("#2 Array Sum: "+getSum(arr2));
        System.out.println("#3 Array Sum: "+getSum(arr3));
        
    }
    public static int getSum(int[] arr){
        int sum = 0;
        for(int num : arr){
            sum+=num;
        }
        return sum;
    }
}
