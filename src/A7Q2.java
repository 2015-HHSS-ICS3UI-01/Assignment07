
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dhila4674
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input  = new Scanner(System.in);
        
        int length = 0;
        int heights;
        System.out.print("Enter number of people");
        int n = input.nextInt();
       
        int t[] = new int [n];
        System.out.println("Enter their Heights in cm");
        for(int i = 0; i < n ; i++)
        {
            t[i] = input.nextInt();
            length = length + t[i];
        }
         heights = length/n;
         
         
        System.out.println("average Height: " + heights + "cm.");
    }
}
    

