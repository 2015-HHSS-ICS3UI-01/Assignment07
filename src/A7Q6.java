
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lalim9800
 */
public class A7Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner 
        Scanner input = new Scanner(System.in);
        //ask user how many marks there are 
        System.out.println("Please enter how many students there are in the class");
        //alloe user to enter student amount 
        int studentamount = input.nextInt();
        //allow user to enter marks 
        int[] marks = new int[studentamount];

        //as long as i is grater les than the amout of spaces avalible in nummbers allow user to enter a number 
        for (int i = 0; i < marks.length; i++) {
            //ask user to enter the marks 
            System.out.println("please enter the marks ");
            //allow user to enter marks 
            marks[i] = input.nextInt();
        }

        //AS LONG AS X IS LESS THAN  the amount REPEAT 
        for (int x = 0; x < studentamount - 1; x++) {
            //int y starts at one avove x and as long as it is less than 9 
            for (int y = x + 1; y < studentamount; y++) {
                if (marks[x] > marks[y]) {
                    //crate a temp variable to store the number in place y
                    int temp = marks[y];
                    //set the number in spot y equal to the number in spot x
                    marks[y] = marks[x];
                    //set the number in spot x to the temp integer(number in spot 1)
                    marks[x] = temp;


                }
            }
        } //set total to 0 
        int total = 0;
        //calculate the total of all marks entered 
        for (int z = 0; z < marks.length; z++) {
            //craete integer to store total amount
            total = total + marks[z];


            //create a variable that will store the average mark
        }
        //set the highest mark number spot   in the array to the amount of marks -1 
        int highnumber = studentamount - 1;
        //create intiger to store the average by didving the sum of the marks by the amount of marks 
        int average = total / studentamount;
        //tell the user the lowest lowest mark
        System.out.println("The lowest mark is " + marks[0]);
        //Tell user the highest mark
        System.out.println("The highest mark is " + marks[highnumber]);
        //tell user the average of the marks 
        System.out.println("the average is " + average);




    }
}
