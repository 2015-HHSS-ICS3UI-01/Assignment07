
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author singk4158
 */
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new scanner
        Scanner input = new Scanner(System.in);
        System.out.println("please enter ten numbers");  
        int[] numbers = new int[10];
    // as long as i is greater less than the amount of spaces avalible in number allow user to enter anumber
    for (int i = 0; i < numbers.length; i++) {
      //ask i
      //allow user to enter numbers         
          
        numbers[i] = input.nextInt();
    }
    
    
       for (int x = 0; x < numbers.length-1; x++) {
            //int y starts at one avove x and as long as it is less than 9
            for (int y = x + 1; y < numbers.length; y++) {
                if (numbers[x] > numbers[y]) {
                    //crate a temp variable to store the number in place y
                    int a = numbers[x];
                    int b = numbers[y];
                    numbers[x] = b;
                    numbers[y] = a;
                  }
            }
       }
       
       // tell the numbers in acending numbers
    
        System.out.println("The numbers in acending order are");
        
        for (int i = 0; i < numbers.length; i++) {
           System.out.println(numbers[i]);

        }
    }
}
