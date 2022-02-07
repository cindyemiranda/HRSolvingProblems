import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class ResultSherlockAndSquaresHR {

    /*
     * Complete the 'squares' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER a
     *  2. INTEGER b
     */

    public static int squares(int a, int b) {
    // Write your code here
    	int result=0;
    	double sqrt_b=Math.sqrt(b);
		double sqrt_a=Math.sqrt(a);
		int int_sqrt_a=(int)sqrt_a;
		if(sqrt_a-int_sqrt_a==0) {
			sqrt_a=sqrt_a-1;
		}
		result=(int)((int)sqrt_b-(int)sqrt_a);
        return result;       
    }

}

public class SherlockAndSquaresHR {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       
        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int a = Integer.parseInt(firstMultipleInput[0]);

            int b = Integer.parseInt(firstMultipleInput[1]);

            int result = ResultSherlockAndSquaresHR.squares(a, b);

            
        }

        bufferedReader.close();
        
    }
}
