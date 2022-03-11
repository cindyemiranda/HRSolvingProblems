import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class ModifiedKaprekarNumbersHRResult {

    /*
     * Complete the 'kaprekarNumbers' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER p
     *  2. INTEGER q
     */

    public static void kaprekarNumbers(int p, int q) {
    // Write your code here
        List <Integer> ListKaprekar= new ArrayList<Integer>();
        for(int i=p; i<=q; i++){
        	BigInteger l_i=BigInteger.valueOf(i);
        	BigInteger pow=l_i.multiply(l_i);
            System.out.println(i+"***"+pow);
            String num=String.valueOf(pow);
            if(num.length()%2!=0) {
            	num="0"+num;
            }
            String alfa=num.substring(0, num.length()/2);
            String beta=num.substring((num.length()/2),num.length());
            System.out.println(num);
            System.out.println(alfa+" "+beta);
            long n_alfa=Long.valueOf(alfa);
            long n_beta=Long.valueOf(beta);
            //System.out.println(alfa+" "+beta);
            //System.out.println(n_alfa+" "+n_beta);
            
            if((n_alfa+n_beta)==i){
                ListKaprekar.add(i);
            }
        }
        if(ListKaprekar.isEmpty()){
            System.out.println("INVALID RANGE");
        }
        else{
            for(Integer num: ListKaprekar){
                System.out.print(num+" ");
            }
        }
    }

}

public class ModifiedKaprekarNumbersHR {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        ModifiedKaprekarNumbersHRResult.kaprekarNumbers(p, q);

        bufferedReader.close();
    }
}


