

import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snowc4636
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input a scanner
        Scanner input = new Scanner(System.in);
        // number of students
        System.out.println(" How many students are in the class? ");
        int number = input.nextInt();
        int [] grade = new int [number];
        for(int pos = 0; pos < number; pos++){
          System.out.println(" Enter the marks. "); 
          // the arrays input word
          int mark = input.nextInt();
          grade [pos] = mark;
        
          
          }
          // int to give best a number
          int best = 0;
          for(int i = 0; i < number; i++){
              best = best + grade[i];
              
          
        }
          // median
          int median = best/number; 
              System.out.println(" The class average is " + median + "%");
        }
        
        
        
        
  

                
               
            }
        
        

        
            
   
