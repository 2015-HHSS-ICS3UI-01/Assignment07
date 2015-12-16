
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snowc4636
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         //input a scanner
        Scanner input = new Scanner(System.in);
        // number of students
        System.out.println(" How many people are there? ");
        int number = input.nextInt();   
        int [] below = new int [number];
        for(int spot = 0; spot < number; spot++){
          System.out.println(" Enter the height. "); 
          
          int height = input.nextInt();
          below [spot] = height;
        
          
          }
        // give best a number
          int best = 0;
          for(int i = 0; i < number; i++){
              best = best + below[i];
              
          
        }
          //median formula
          int median = best/number; 
          // what is the average height
              System.out.println(" The average height is " + median);
              
              for(int spot = 0; spot < number; spot++){
                  if(below[spot] > median){
                      // what characters are above average height
                      System.out.println("Character " + spot + " is more then the average height ");
                  }
              }
    }
}
