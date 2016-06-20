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
public class A7Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
  //input scanner
       Scanner input = new Scanner(System.in);

       //ask user size of class 
       System.out.println("Enter the size of the class.");
       int c = input.nextInt();



       //make an array
       int[] classMarks = new int[c];



       //loop to enter marks in array
       for (int a = 0; a < classMarks.length; a++) {
           System.out.println("Please enter a mark.");
           classMarks[a] = input.nextInt();


       }
       //order the marks from lowest to highest


       for (int r = 0; r < classMarks.length - 1; r++) {




           for (int a = r + 1; a < classMarks.length; a++) {


               int x = classMarks[r];


               int y = classMarks[a];







               if (classMarks[r] > classMarks[a]) {


                   classMarks[r] = y;


                   classMarks[a] = x;


               }


           }


       }


       //find the highest mark by souting the last int in the array


       int hMark = classMarks[classMarks.length - 1];

//tell user the highest mark of the class
       System.out.println("The highest mark in the class is " + hMark);







       //find the lowest mark 


       int lMark = classMarks[0];

//tell the user what the lowest mark of the class is
       System.out.println("The lowest mark in the class is " + lMark);







       //find the average


       //find sum of the array


       int total = 0;


       for (int t = 0; t < classMarks.length; t++) {


           total = total + classMarks[t];







       }


       //divide the total by the class size







       double avMark = total / c;


       System.out.println("The average mark in the class is " + avMark);



      



       //close the scanner


       input.close();

















   }


}

    

