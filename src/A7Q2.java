
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author butlj9437
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("How many people?");
        Scanner input = new Scanner(System.in);
        int ppl = input.nextInt();
        System.out.println("What are their high?");
        int[] height = new int[ppl];
        for(int i = 0; i < ppl ; i++){
            height[i] = input.nextInt();
        }
        int avg = 0;
        for(int i = 0; i < ppl ; i++){
            avg = avg + height[i];
        }
        avg = avg / ppl;
        System.out.println("The heights above average are:");
        for(int i = 0; i < ppl ; i++){
            if(height[i]>avg){
                System.out.println(height[i]);
            }
        }
    }
}
