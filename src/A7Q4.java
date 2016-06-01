
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author yuk4142
 */
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 10 marks");

        int marks[] = new int[10];

        for (int i = 0; i != 10; i++) {//for loop to enter 10 marks
            //enter array spot as inputed mark
            marks[i] = in.nextInt();



            //if all integers have been entered into array
            if (i == 9) {
                //create variables for "for" loop
//for x = 0 and y = x+1, keep adding on to them, and in the loops keep comparing them both to see if x >y
                for (int x = 0; x < 9; x++) {
                    for (int y = x + 1; y < 10; y++) {
                        //create and set integers for specific mark area
                        int int1 = marks[y];
                        int int2 = marks[x];
                        //if the first mark is bigger than the second mark, then switch the 2 marks
                        if (marks[y] < marks[x]) {
                            marks[y] = int2;
                            marks[x] = int1;

                        }
                        //if all marks have been ordered
                        if (y == 9) {
                            System.out.println("The marks are");
                            //print out marks in loop
                            for (int z = 0; z < 10; z++) {
                                System.out.println(marks[z]);
                            }
                        }
                    }
                }
            }
        }
    }
}
