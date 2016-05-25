
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kangh4484
 */
public class Q7A4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        //ask user to input 10 marks
        System.out.println("Please enter the marks");
        int[] marks = new int[10];
        for (int i = 0; i < marks.length; i++) {
            //record marks in array
            marks[i] = input.nextInt();
        }
        for (int i = 0; i < marks.length - 1; i++) {
            for (int a = i + 1; a < marks.length; a++){
                if(marks[i]>marks[a]){
                    //check 1 after the other and change value if prev num is lower than next num
                    int x = marks[i];
                    int y = marks[a];
                    marks[i]=y;
                    marks[a]=x;      
                }
            }
        }
        // print out numbers
        System.out.println("Sorted");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
