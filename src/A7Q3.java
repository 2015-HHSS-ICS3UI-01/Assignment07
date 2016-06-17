
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guanv6321
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here      
        Scanner input = new Scanner(System.in);
        // user input for the two numbers
        System.out.println("Enter two integers:");
        int i1 = input.nextInt();
        int i2 = input.nextInt();
        // if first number was bigger than second number
        if(i1 > i2){
            System.out.println("The integers in ascending order are: " + i2 + ", " +  i1);
        }
        // if second number was bigger than first number
        if(i2 > i1){
            System.out.println("The integers in ascending order are: " + i1 + ", " +  i2);
        }
    }
}
