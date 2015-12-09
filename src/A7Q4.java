
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author whitb0039
 */
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //inport new scanner
        Scanner in = new Scanner(System.in);

        //create an array
        int[] marks = new int[10];

        //ask user for 10 marks
        System.out.println("Please enter 10 marks");

        
        //recieve all of the marks
        for (int a = 0; a < 10; a++){ //loop 10 times
        marks[a] = in.nextInt(); //next input is mark[a]
        }

        for (int x = 0; x < 10; x++) { //loop 10 times
            for (int i = 0; i < 9; i++) { //loop 9 times
                if (marks[x] < marks[i]) { //if the value of marks[x] is greater than marks[i]
                    int temp = marks[i]; //create a temp int of what marks[i] is
                    marks[i] = marks[x]; //swap marks[i] with marks[x]
                    marks[x] = temp; //swap marks[x] with the temp int
                }else{//otherwise do nothing
                    
                }
            }
        }
        ascending(marks); //run the method that prints the marks
    }
    public static void ascending(int[] marks){
        System.out.print("The numbers in ascending order are: "); //output the message
        
        for (int i = 0; i < 10; i++){ //loop 10 times
            System.out.print(marks [i] + " "); //output the current number in the array
        }
        
        
        
    }
}
