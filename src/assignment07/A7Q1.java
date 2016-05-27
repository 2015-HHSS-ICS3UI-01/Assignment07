/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment07;

import java.util.Scanner;

/**
 *
 * @author Fostp4040
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("How many students are in the class?");
        int students=input.nextInt();
        int[] marks=new int[students];
        System.out.println("enter the marks");
        for(int i=0; i<students; i++){
            marks[i]=input.nextInt();
        }
        int total = marks[0]+marks[1]+marks[2];
        double average = total/students;
        System.out.println("The class average is " +average+ "%");
        
    }
}
