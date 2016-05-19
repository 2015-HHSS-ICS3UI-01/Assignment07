
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author halll7908
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("How many heights are being recorded?");
        int pplNum = input.nextInt();
        int[] ppl = new int[pplNum];
        int[] height = new int[pplNum];

        int total = 0;
        System.out.println("Please input their heights (in rounded cm) on different lines:");
        for (int i = 0; i < ppl.length; i++) {
            height[i] = input.nextInt();
            total = total + height[i];
        }
        
        double avg = (total / pplNum);

        System.out.println("The height(s) over the average are:");
        for (int i = 0; i < ppl.length; i++) {
            if (height[i] > avg) {
                System.out.println(height[i]);
            }
        }
    }
}
