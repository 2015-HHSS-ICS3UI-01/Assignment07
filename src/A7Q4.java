
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author munta
 */
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int[] numbers = new int[10];


        //new scanner 
        Scanner input = new Scanner(System.in);
        {
            //as long as i is grater les than the amout of spaces avalible in nuimbers allow user to enter a number 
            for (int i = 0; i < numbers.length; i++) {
                //ask i
                System.out.println("please enter ten numbers");
                //allow user to enter numbers 
                numbers[i] = input.nextInt();
    
}
        }
}
}