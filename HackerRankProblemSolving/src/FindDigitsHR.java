import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class ResultFindDigitsHR {

    /*
     * Complete the 'findDigits' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int findDigits(int n) {
    // Write your code here
        String digit=String.valueOf(n);
        int count=0;
        for(int i=0; i<digit.length(); i++){
            Integer d=Integer.parseInt(""+digit.charAt(i));
            if(d!=0){
                if(n%d==0){
                    count++;
                }    
            }
            
        }
        return count;
    }

}

public class FindDigitsHR {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       
        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            int result = ResultFindDigitsHR.findDigits(n);

            
        }

        bufferedReader.close();
       
    }
}
