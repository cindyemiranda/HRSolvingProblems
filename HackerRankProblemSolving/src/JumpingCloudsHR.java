import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JumpingCloudsHR {

	// Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c, int k) {
        int energy=100;
        int i=k;
        int n=c.length;
        System.out.println("longitud  "+n);
        System.out.println("antes  "+(i%n));
        while (true){
        	System.out.println(i+"  "+(i%n));
        	System.out.println("energy  "+(energy));
            if(c[(i)%n]==0){
                energy=energy-1;
            }
            else{
                energy=energy-1-2;
            }
            if((i%n)==0) {
            	break;
            }
            else {
            	i=i+k;
            }
            
            
        }
       System.out.println(energy); 
       return energy; 

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c, k);
        
        
        
        scanner.close();
    }
}