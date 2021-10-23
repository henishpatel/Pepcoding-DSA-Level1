import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int[] arr = new int[n];
       for(int i = 0; i < arr.length; i++){
           arr[i] = scn.nextInt();
       }
       
       displayArray(arr, 0);
    }
    
    // E => da(a, v) => a[v] a[v+1] .. a[n - 1]
    // F => da(a, v+1) => a[v+1] a[v+2] .. a[n - 1]
    // EwF => da(a, v) = a[v] da(a, v+1)
    public static void displayArray(int[] arr, int i){
        if(i == arr.length){
            return;
        }
        
        System.out.println(arr[i]);
        displayArray(arr, i + 1); // it promises to print everything from i+1 to the end
    }

   

}