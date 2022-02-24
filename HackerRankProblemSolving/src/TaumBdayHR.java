import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class TaumBdayHRResult {

    /*
     * Complete the 'taumBday' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER b
     *  2. INTEGER w
     *  3. INTEGER bc
     *  4. INTEGER wc
     *  5. INTEGER z
     */

    public static long taumBday(int b, int w, int bc, int wc, int z) {
    // Write your code here
    	long result=0;
    	long l_b=b;
    	long l_w=w;
    	long l_bc=bc;
    	long l_wc=wc;
    	long l_z=z;
    	
    	if (l_bc>=(l_wc+l_z)) {
    		//	System.out.println("1");
    			result=(l_b*(l_z+l_wc))+(l_w*l_wc);
    	}
    	else if(l_wc>=(l_bc+l_z)) {
    	//	System.out.println("2");
    		result=(l_w*(l_z+l_bc))+(l_b*l_bc);
    	}
    	else {
    	//	System.out.println("3");
    		result=(l_b*l_bc)+(l_w*l_wc);
    	}
    	//System.out.println(result);
    	return result;
    	
    }

}

public class TaumBdayHR {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int b = Integer.parseInt(firstMultipleInput[0]);

            int w = Integer.parseInt(firstMultipleInput[1]);

            String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int bc = Integer.parseInt(secondMultipleInput[0]);

            int wc = Integer.parseInt(secondMultipleInput[1]);

            int z = Integer.parseInt(secondMultipleInput[2]);

            long result = TaumBdayHRResult.taumBday(b, w, bc, wc, z);

          
        }

        bufferedReader.close();
        
    }
}
