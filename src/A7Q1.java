
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fitws6356
 */
public class A7Q1 {

    public static void main(String[] args) {
        //create the scanner
        Scanner input = new Scanner(System.in);
        //ask how many students are in the class
        System.out.println("How many students in the class?");
        int students = input.nextInt();
        //to make sure the program swithches after the number of marks... 
        //...entered match the number of students
        int[] average = new int[students];
        System.out.println("Enter the marks of students.");
        for (int i = 0; i < average.length; i++) {
            average[i] = input.nextInt();
        }
        double total = 0;
        for (int i = 0; i < average.length; i++) {
            total = total + average[i];
        }
        //create code that gives the average mark out of the students
        double averageTotal = total/100;
        averageTotal= total/students;
        System.out.println("Your " + averageTotal);
    }
}
