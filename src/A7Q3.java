
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dhila4674
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input  = new Scanner(System.in);
        int[] num = new int[2];
        System.out.println("enter first integer");
        num[0] = input.nextInt();
        System.out.println("enter second integer");
        num[1] = input.nextInt();
        
        if (num[0] > num[1]){
            System.out.println("your integers in ascending order are: " + num[1] + " " + num[0]);
        } else if (num[0] < num[1]){
            System.out.println("your integers in ascending order are: " + num[0] + " " + num[1]);
        }
          
    }
}  