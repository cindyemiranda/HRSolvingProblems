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

class MinMaxSumHRResult {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
        List<BigInteger>results= new ArrayList<BigInteger>();
        for(int i=0; i<arr.size(); i++){
            BigInteger sum= BigInteger.ZERO;
            for(int j=0; j<arr.size(); j++){
                if(i!=j){
                    BigInteger num= new BigInteger(String.valueOf(arr.get(j)));
                    sum=sum.add(num);
                }
            }
            results.add(sum);
        }
        System.out.println(Collections.min(results)+" "+Collections.max(results));
    }

}

public class MinMaxSumHR {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        MinMaxSumHRResult.miniMaxSum(arr);

        bufferedReader.close();
    }
}
