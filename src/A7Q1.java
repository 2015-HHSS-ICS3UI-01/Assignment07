
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author butlj9437
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many students?");
        int num = input.nextInt();
        int[] marks = new int[num];
        System.out.println("Enter the marks");
        for(int i = 0; i<num; i++){
            marks[i]=input.nextInt();
        }
        double avg = 0;
        for(int i = 0; i<num; i++){
            avg = avg + marks[i];
        }
        avg = avg * 100;
        avg = avg / num;
        avg = (int) (avg);
        avg = avg / 100;
        System.out.println("The average is " + avg + "%.");
    }
}
