
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class ResultExtraLongFactorials {

    /*
     * Complete the 'extraLongFactorials' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void extraLongFactorials(int n) {
    // Write your code here
         BigInteger factorial =  BigInteger.valueOf(n);
        int cont=n-1;
        while(cont>0){
            factorial=factorial.multiply(BigInteger.valueOf(cont));
            cont--;
        }
        System.out.println(factorial);
    }

}

public class extraLongFactorialsHR{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        ResultExtraLongFactorials.extraLongFactorials(n);

        bufferedReader.close();
    }
}
