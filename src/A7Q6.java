
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snowc4636
 */
public class A7Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
         // create a scanner for input
        Scanner input = new Scanner(System.in);
        // enter the number of students
        System.out.println("Please enter the number of students? ");
        int nums = input.nextInt();
        // if the number is less then 0
        if(nums > 0){
            
            // formula for mark
            double[] mark = new double[nums];
            
            // please enter the marks
            System.out.println("Please enter marks ");
            
           
            for(int number = 0; number < nums; number = number + 1){
               mark[number] = input.nextInt();
            }
            for(int i = 0; i < mark.length - 1; i = i + 1){
                
                for(int c = i + 1; c < mark.length; c = c + 1){
            //switching variables
                    if(mark[i] > mark[c]){
                        double insert = mark[i];
                        mark[i] = mark[c];
                        mark[c] = insert;
                    }
                }
            }
           // let average = 0
            double av = 0;
            // for loop for average
            for(int number = 0; number < mark.length; number = number + 1){
                av = av + mark[number];
            }
            // formula for average
            av = av / nums;
            
            // what the lowest mark is
            System.out.println("The lowest mark is " + mark[0]);
            // what the highest mark is
            System.out.println("The highest marks is " + mark[mark.length-1]);
           // what the class average is
            System.out.println("The average is " + av);
        }

       }
   }

