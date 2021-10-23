import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pdi(n);
    }

    // exp = pdi(3) 3 2 1 1 2 3
    // faith = pdi(2) 2 1 1 2
    // Exp -> Faith = n pdi(n-1) n
    
    public static void pdi(int n){
        if(n==0){
            return;
        }
        System.out.println(n); // pre recursion area
        pdi(n-1); // recursive call
        System.out.println(n); // post recursion area
    }

}