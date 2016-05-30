
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.println("How many marks are there?");
        int b = input.nextInt();
        int[] marks = new int[b];
        int s = b;
        while(s > 0){
            s = s - 1;
            marks[s] = input.nextInt();
        }
        
        boolean a = false;
        int x = 0;
        int y = 0;
        while(a == false){
            a = true;
            s = b;
            while(s > 1){
                s = s - 1;
                if (marks[s] > marks[s - 1]){
                    x = marks[s];
                    y = marks[s - 1];
                    marks[s] = y;
                    marks[s - 1] = x;
                    a = false;
                }
            }
        }
        System.out.println("The marks in order are: ");
        s = b;
        while(s > 0){
            s = s - 1;
            System.out.println(marks[s]);
        }
    }
}

