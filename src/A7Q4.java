
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rahmf8586
 */
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        int marks[] = new int[10];

        System.out.println("Enter in 10 marks:");

        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextInt();
        }

        boolean flag = true;
        int num;

        while (flag == true) {
            flag = false;
            for (int i = 0; i < marks.length - 1; i++) {
                if (marks[i] > marks[i + 1]) {
                    num = marks[i];
                    marks[i] = marks[i + 1];
                    marks[i + 1] = num;
                    flag = true;
                }
            }
        }
        System.out.println("The marks in ascending order are:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

    }
}