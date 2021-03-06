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
        
        int max = maxOfArray(arr, 0);
        System.out.println(max);
    }

    // the largest element from idx to the end
    public static int maxOfArray(int[] arr, int idx){
        if(idx == arr.length - 1){
            return arr[idx];
        }
        
        int misa = maxOfArray(arr, idx + 1); // misa is the greatest element from idx + 1 to the end
        if(arr[idx] > misa){
            return arr[idx];
        } else {
            return misa;
        }
    }

}