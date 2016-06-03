
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author howen2217
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create scanner to input numbers
        Scanner input = new Scanner(System.in);
        //get the number of grades
        System.out.println("Please input the number of grades");
        int grades = input.nextInt();

        int[] x = new int[grades];
        for (int i = 0; i < x.length; i++) {
            System.out.println("Please enter grade " + (i + 1));
            x[i] = input.nextInt();
        }
        //sort the grades from least to greatest
        for (int i = 0; i < x.length - 1; i++) {
            for (int a = i + 1; a < x.length; a++) {
                if (x[i] > x[a]) {
                    int save = x[a];
                    x[a] = x[i];
                    x[i] = save;
                }
            }
        }
        //output the grades
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
        //determine and output the median if the number of grades is even
        if (grades % 2 == 0) {
            double num = x[((grades / 2))];
            double num2 = x[((grades / 2) - 1)];
            System.out.println("The median is " + ((num2 + num) / 2));
            //determine and output the median of the grades are odd
        } else if (grades % 2 == 1) {
            System.out.println("The median is " + x[grades / 2]);
        }



    }
}
