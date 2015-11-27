
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stahc1596
 */
public class A7Q1 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int students = input.nextInt();
        int[] marks = new int [students];
        for (int e = students -1; e > -1; e--){
            marks[e] = input.nextInt();
        
        }
        System.out.println(marks[2] + marks[1] + marks[0]);
    }
}
