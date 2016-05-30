
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dhila4674
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input  = new Scanner(System.in);
        
        double sum = 0;
        double average;
        System.out.print("Enter number of students");
        int n = input.nextInt();
        int a[] = new int [n];
        System.out.println("Enter the marks");
        for(int i = 0; i < n ; i++)
        {
            a[i] = input.nextInt();
            sum = sum + a[i];
        }
         average = sum/n;
         
         
        System.out.println("average: " + average + "%.");
    }
}
