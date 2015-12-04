
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stahc1596
 */
public class A7Q3 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int[] numbers = new int [2];
        System.out.println("Enter two integers");
        for (int e = 0; e < numbers.length; e++){
            number = input.nextInt();
            numbers[e] = number;
        }if (numbers[0] > numbers[1]){
            System.out.println(numbers[1] + ", " + numbers[0]);
        }else if (numbers[0] < numbers[1]){
            System.out.println(numbers[0] + ", " + numbers[1]);
        }
    }
}
