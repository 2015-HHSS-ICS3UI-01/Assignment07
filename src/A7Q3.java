
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        int[] numbers = new int[2];
        
        System.out.println("Please insert the first number.");
        numbers[0] = input.nextInt();
        System.out.println("Please insert the second number.");
        numbers[1] = input.nextInt();
        
        if(numbers[0] < numbers[1]){
            System.out.println("The order of the numbers are: " + numbers[0] + "," + numbers[1]);
        } else if 
                (numbers[1] < numbers[0]){
                System.out.println("The order of the numbers are: " + numbers[1] + "," + numbers[0]);
    }
            
        
    }
}
