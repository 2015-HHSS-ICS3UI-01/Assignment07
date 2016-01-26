
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malcr1272
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            //create scanner
        Scanner in = new Scanner(System.in); 
        
       //ask how mant students are in the calss
        System.out.println("How many people's heights are u collecting");
        int people = in.nextInt();
        int nums[] =new int[people];
        //Ask for the marks and put them into an array
        System.out.println("Enter the heights");
       for(int i = 0; i < nums.length; i++){
        nums[i] = in.nextInt();
       }
       //calculate total of marks
       int total = 0;
       for(int i = 0; i < nums.length; i++){
          total = total + nums[i];
       }
       total = total/people;
       //print out total
        System.out.println("The average height is " + total);
        
         for(int i = 0; i < nums.length; i++){
             if (nums[i] > total){
                 System.out.println(nums[i] + " is above average");
                 
             }
         }
    } 
    }

