
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mitrm7692
 */
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a scanner
        Scanner input = new Scanner(System.in);
        //Make 10 spots in the array for the marks
        int[] marks = new int[10];
        //Asks user to enter 10 marks
        System.out.println("Please enter the 10 marks ");
        //loops 10 times for the 10 marks being entered
        for(int i=0;i < 10; i++){
            //Makes int mark for marks being entered
            int mark=input.nextInt();
            //marks[i] is euqal to the mark that is entered 
            marks[i]=mark;
        }
        //loops 10 times to sort the marks lowest to highest
        for(int sort=0; sort<10; sort++){
            for (int i = 0; i < 9; i++) {
                //nxtMark is equal to the position of the array plus 1 to go to the next position 
                int nxtMark = i + 1;
                //int temp is a temporary variable
                int temp;
                //if marks[i] is greater than marks[nxtMark]  
                if (marks[i] > marks[nxtMark]) {
                    //int temp is equal to marks[i]
                    temp = marks[i];
                    //marks[i] is equal to marks[nxtMark]
                    marks[i] = marks[nxtMark];
                    //marks[nxtMark] is equal to temp
                    marks[nxtMark] = temp;
                }
            }
        }
        //runs BubbleSorting method with the marks
            BubbleSorting(marks);
        }
    //makes a new method to make marks for lowest to highest
        public static void BubbleSorting(int[] marks){
        //outputs "The marks from lowest to highest order are: "
        System.out.print("The marks from lowest to highest order are: ");
        //loops the lowestToHighest 10 times
        for(int lowestToHighest=0; lowestToHighest<10; lowestToHighest++){
            //outputs the marks from lowest to highest order
            System.out.print(marks[lowestToHighest]+", ");
        }
        
    }
}
