
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author howen2217
 */
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create scanner to input numbers
        Scanner input = new Scanner(System.in);
        //input 10 grades
        int[] x = new int[10];
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
    }
}
