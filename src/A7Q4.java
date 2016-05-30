
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dhila4674
 */
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input  = new Scanner(System.in);
        System.out.println("Input 10 marks");
        int[] marks = new int[10];
        int a = 10;
        while (a > 0){
            a = a - 1;
            marks[a] = input.nextInt();
        }
        boolean b = false;
        int x = 0;
        int y = 0;
        while(b == false){
           b = true;
           a = 10;
           while(a > 1){
               a = a - 1;
               if(marks[a] > marks[a-1]){
                   x = marks[a];
                   y = marks[a-1];
                   marks[a] = y;
                   marks[a-1] = x;
                   b = false;
               }
           }
        }
        System.out.println("the marks in order are: ");
        a=10;
        while (a >0) {
            a = a-1;
            System.out.println(marks[a]);
        }
}
}
