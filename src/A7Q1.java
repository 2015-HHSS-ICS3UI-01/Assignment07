
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author voigr4865
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner input = new Scanner(System.in);//new Scanner
        
        
        
        System.out.println("How many students are in the class?");//ask how many students are in the class
        int stud = input.nextInt();//number of students inputted by the user
        int[] students = new int[stud];//make the number of students inputted into an array
        
        System.out.println("What are their marks");//ask the user what their marks are
        
        double total = 0;//have a double called total equal to zero
        for(int i = 0; i < students.length; i++){//for loop to walk through the array
        int marks = input.nextInt();//the marks inputted in the next lines
        students[i] = marks;//the student array equals the marks that were enterd
          total = total + students[i];//the total double plus the array to get the total of all the inputted numbers        
               
              
        }
                    
               
          
           
            double avg = total / students.length;//the average is the total of all the numbers we calculated above devided by the length of the array
            System.out.println("The class average is " + avg + "%");//output the average
        }
                
    }

