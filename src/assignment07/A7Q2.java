/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment07;

import java.util.Scanner;

/**
 *
 * @author fostp4040
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("How many people are you wanting to measure?");
        int people=input.nextInt();
        int[] height=new int[people];
        System.out.println("enter the heights");
        for(int i=0; i<people; i++){
            height[i]=input.nextInt();
        }
        int total = height[0]+height[1]+height[2]+height[3];
        double average = total/people;
        
        System.out.println("The height average is " +average+ " meters tall");
        if(height[0]>average){
            System.out.println("person 1 is taller than the average");
        }
        if(height[1]>average){
            System.out.println("person 2 is taller than the average");
        }
        if(height[2]>average){
            System.out.println("person 3 is taller than the average");
        }
        if(height[3]>average){
            System.out.println("person 4 is taller than the average");
        } 
    }
}
