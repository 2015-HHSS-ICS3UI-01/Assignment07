
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
        int[] marks = new int[studentamount];

        //as long as i is grater les than the amout of spaces avalible in nummbers allow user to enter a number 
        for (int i = 0; i < marks.length; i++) {

            System.out.println("please enter the marks ");
            //allow user to enter numbers 
            marks[i] = input.nextInt();




        }

        //set total to 0 
        int total = 0;
        //calculate the total of all height entered 
        for (int i = 0; i < marks.length; i++) {
            total = total + marks[i];


            //crarte a variable that will store the average height 
        }
        int average = total / studentamount;

        


    }
}
