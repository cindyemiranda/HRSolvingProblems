import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class PlusMinusResult {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        double size=arr.size();
        double p_radio=0.000000;
        double n_radio=0.000000;
        double z_radio=0.000000;
        int p=0;
        int n=0;
        int z=0;
        for(int i=0; i<arr.size(); i++){
            Integer num= arr.get(i);
            if(num>0){
               p++;
            }
            else if(num<0){
                n++;
            }
            else{
                z++;
            }
        }
        p_radio=p/size;
        n_radio=n/size;
        z_radio=z/size;
        System.out.println(p_radio);
        System.out.println(n_radio);
        System.out.println(z_radio);
    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        PlusMinusResult.plusMinus(arr);

        bufferedReader.close();
    }
}