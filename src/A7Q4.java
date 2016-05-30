
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please input 10 marks.");
        int[] sort = new int[10];
        int s = 10;
        while(s > 0){
            s = s - 1;
            sort[s] = input.nextInt();
            
        }
        boolean a = false;
        int x = 0;
        int y = 0;
        while(a == false){
            a = true;
            s = 10;
            while(s > 1){
                s = s - 1;
                if (sort[s] > sort[s - 1]){
                    x = sort[s];
                    y = sort[s - 1];
                    sort[s] = y;
                    sort[s - 1] = x;
                    a = false;
                }
            }
        }
        System.out.println("The marks in order are: ");
        s = 10;
        while(s > 0){
            s = s - 1;
            System.out.println(sort[s]);
        }
    }
}
