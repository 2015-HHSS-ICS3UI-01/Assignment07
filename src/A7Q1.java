
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author singk4158
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // create new scanner
        Scanner input = new Scanner(System.in); 
       double total = 0;
      //Ask user how many students there are in class
    
       System.out.println("How many students are in the class?"); 
     int numberofstudents = input.nextInt();
     
      //create new array invloving 'studentnum'
      int[] marks = new int[numberofstudents];
    
     // Ask user to enter in the marks
     System.out.println("Enter the marks");
     
     for(int i = 0; i < marks.length; i++){
      marks[1] = input.nextInt();
      total = total + marks[1]; 
     }
       for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextInt();
            total = total + marks[i];
        }
     // calculate total average
       double avg = Math.round(total/marks.length)*100d/100d;
     //Output test results to the screen
        System.out.println("the class avg is:" + avg +" %");
    
    }
}