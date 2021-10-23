import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        
        displayArrReverse(arr, 0);
    }

    // idx se end tak ka ulta print karna hai
    public static void displayArrReverse(int[] arr, int idx) {
        if(idx == arr.length){
            return;
        }
        
        displayArrReverse(arr, idx + 1); // idx + 1 se end tak ka ulta print kar do
        System.out.println(arr[idx]);
    }

}