/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fitws6356
 */
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int[]bubbleSorting = new int[10];
    bubbleSorting[0] = 34;
    bubbleSorting[1] = 73;
    bubbleSorting[3] = 452;
    bubbleSorting[4] = 98;
    bubbleSorting[5] = 12;
    bubbleSorting[6] = 256;
    bubbleSorting[7] = 502;
    bubbleSorting[8] = 9;
    bubbleSorting[9] = 999;
    for(int swapper = 0; swapper < bubbleSorting[0]; swapper++){
    swapper = bubbleSorting[0];
    if(bubbleSorting[0] > bubbleSorting[1]){
        bubbleSorting[1+1] = swapper;
        swapper = bubbleSorting[1];
        System.out.println(swapper);
    }   
    }
    
        
    }
}
