import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class RepeatedStringResult {

    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
    // Write your code here
        long count=0;
        int a_in_s=0;
        int lon_s=s.length();
        int x_end=0;
        int index_a=0;
        while(index_a!=-1){
            index_a=s.indexOf('a',x_end);
            if(index_a!=-1){
                a_in_s++;
                x_end=index_a+1;
            }
        }
       // System.out.println(lon_s);
       // System.out.println(n/lon_s);
       // System.out.println((n/lon_s)*a_in_s);
       // System.out.println(n%lon_s);
        count=(n/lon_s)*a_in_s;
        x_end=(int) (n%lon_s);
     //   System.out.println("***"+x_end);
        if(x_end>0){
       // 	System.out.println("***"+x_end);
            a_in_s=0;
            String s_sub=s.substring(0, x_end);
         //   System.out.println("****"+s_sub);
            x_end=0;
            index_a=0;
            while(index_a!=-1){
	            index_a=s_sub.indexOf('a', x_end);
	            if(index_a!=-1){
	                a_in_s++;
	                x_end=index_a+1;
	            }
            }
            count=count+a_in_s;
        }
        System.out.println(count);
        return count;

    }

}

public class RepeatedStringHR {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       
        String s = bufferedReader.readLine();

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = RepeatedStringResult.repeatedString(s, n);

        

        bufferedReader.close();
        
    }
}

