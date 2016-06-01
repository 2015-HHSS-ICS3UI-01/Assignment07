
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author yuk4142
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        //asks for number of marks,and creates variable to input value for it
        System.out.println("How many marks are there?");
        int marksnum = in.nextInt();

        System.out.println("Enter the marks");
        double marks[] = new double[marksnum];

        for (int i = 0; i != marksnum; i++) {//for loop to enter 10 marks
            //enter array spot as inputed mark
            marks[i] = in.nextInt();



            //if all integers have been entered into array
            if (i == marksnum - 1) {
                //create variables for "for" loop
//for x = 0 and y = x+1, keep adding on to them, and in the loops keep comparing them both to see if x >y
                for (int x = 0; x < marksnum - 1; x++) {
                    for (int y = x + 1; y < marksnum; y++) {
                        //create and set integers for specific mark area
                        double int1 = marks[y];
                        double int2 = marks[x];
                        //if the first mark is bigger than the second mark, then switch the 2 marks
                        if (marks[y] < marks[x]) {
                            marks[y] = int2;
                            marks[x] = int1;

                        }
                        //if all marks have been ordered
                        if (x == marksnum - 2) {
                            //print out marks in loop in ordered fashion
                            System.out.println("The marks are");
                            for (int z = 0; z < marksnum; z++) {
                                System.out.println(marks[z]);

                            }
                        }
                        //if all marks have been ordered
                        if (x == marksnum - 2) {

                            //if the number of marks is an even number
                            if (marksnum % 2 == 0) {
                                int marksnum2 = marksnum / 2;
                                //find the average of the two numbers at the middle
                                double avg = ((marks[marksnum2]) + (marks[marksnum2 - 1])) / 2;
                                //print out average
                                System.out.println("Media is " + avg);
                            }
                            //if the number of marks is odd, that means there is one number in the middle
                            if (marksnum % 2 != 0) {
                                int marksnum2 = marksnum / 2;
                                //since we use interger, it will round down so then we add 1 to it 
                                double avg = marksnum2 + 1;
                                //print out median
                                System.out.println("Median is " + avg);
                            }
                        }
                    }
                }
            }
        }
    }
}
