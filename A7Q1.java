/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author godie2014
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   //make scanner
        Scanner input = new Scanner(System.in);
        //ask user to enter number of people
        System.out.println("Please enter the number of students");
        
        int i = input.nextInt();
        
        double[] marks = new double[i];
        for (int e = 0; e < marks.length; e++){
            //ask user to enter grade
        
            System.out.println("Enter the grade");
        marks[e]= input.nextInt();
            
           
        }
   // total grades
        double total = 0;
        for (int e = 0; e < marks.length; e++){
    total= total + marks[e];
    
  

        } 

        //average
double average = total / i;
        average = Math.round(average*100)/100.0;
        
//tell user average
        System.out.println("The average grade for this class is " + average + "%");
}}