
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moore3607
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //made a new scanner called input
        Scanner input = new Scanner(System.in);
        //prints "Enter two numbers." onto the screen
        System.out.println("Enter two numbers.");
        //made a new integer called first and made it equal to the next input
        //from the user
        int first = input.nextInt();
        //made a new integer called second and made it equal to the next input
        //from the user
        int second = input.nextInt();
        //created a new array called A and it's amount of spaces is 2
        int[] A = new int [2];
        //made the first space in A equal to first
        A[0] = first;
        //made the second space in A equal to second
        A[1] = second;
        //created a new integer called temp and made it equal to the first
        //space of A
        int temp = A[0];
        //of the first space of A is more than the second, then the first space
        //will be equal to the second space and the second space will be equal
        //to temp. 
        if(A[0] > A[1]){
            A[0] = A[1];
            A[1] = temp;
            //prints A[0] + "," + A[1] onto the screen
            System.out.println(A[0] + "," + A[1]);
            //if the second space in A is more than the first, then
            //A[0] + "," + A[1] will be printed onto the screen
        }else{
            System.out.println(A[0] + "," + A[1]);
        }
        
    }
}
