import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        
        int xpn = power(x, n);
        System.out.println(xpn);
    }

    // E => p(2, 5) = 2.2.2.2.2
    // F => p(2, 4) = 2.2.2.2
    // Ewf => p(2,5) = p(2,4) . 2
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        
        int xpb2 = power(x, n / 2);
        int xpn = xpb2 * xpb2;
	
	if(n % 2 == 1){
		xpn = xpn * x;
	}

        return xpn;
    }

}