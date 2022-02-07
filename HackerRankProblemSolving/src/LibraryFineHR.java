
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class LibraryFineResult {

    /*
     * Complete the 'libraryFine' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER d1
     *  2. INTEGER m1
     *  3. INTEGER y1
     *  4. INTEGER d2
     *  5. INTEGER m2
     *  6. INTEGER y2
     */

    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
    // Write your code here
    	//1 Returned
    	//2 Due
    	int hackos=0;
        if(y1>y2){
            hackos=10000;
        }
        
        else{
        	if(y1==y2) {
	        	if(m1>m2){
	            	hackos=(m1-m2)*500;
	            }
	            else {
	            	if(m1==m2) {
	            		if(d1>d2){
		                	hackos=hackos+((d1-d2)*15);
		                }
	            	}
	            	
	            }
        	}
        }
        return hackos;
    }
   
}

public class LibraryFineHR {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d1 = Integer.parseInt(firstMultipleInput[0]);

        int m1 = Integer.parseInt(firstMultipleInput[1]);

        int y1 = Integer.parseInt(firstMultipleInput[2]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d2 = Integer.parseInt(secondMultipleInput[0]);

        int m2 = Integer.parseInt(secondMultipleInput[1]);

        int y2 = Integer.parseInt(secondMultipleInput[2]);

        int result = LibraryFineResult.libraryFine(d1, m1, y1, d2, m2, y2);

        
        bufferedReader.close();
        
    }
}