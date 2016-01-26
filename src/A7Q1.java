
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malcr1272
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //create scanner
        Scanner in = new Scanner(System.in); 
        
       //ask how mant students are in the calss
        System.out.println("How many students are in your class");
        int students = in.nextInt();
        int[] nums =new int[students];
        //Ask for the marks and put them into an array
        System.out.println("Enter the marks");
       for(int i = 0; i < nums.length; i++){
        nums[i] = in.nextInt();
       }
       //calculate total of marks
       int total = 0;
       for(int i = 0; i < nums.length; i++){
          total = total + nums[i];
       }
       total = total/students;
       //print out total
        System.out.println("The average is " + total);
    }
    }

 