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

class LonelyIntegerHRResult {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
    // Write your code here
        int lonelyInt=0;
        boolean repetido=false;
        for(int i=0; i<a.size(); i++){
        	repetido=false;
            int num=a.get(i);
            for(int j=0; j<a.size(); j++){
                if(i!=j){
                    int num1=a.get(j);
                    if(num==num1){
                        repetido=true;
                        break;
                    }    
                }
            }
            if(!repetido){
                lonelyInt=num;
                break;
            }
        }
        return lonelyInt;
    }

}

public class LonelyIntegerHR {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = LonelyIntegerHRResult.lonelyinteger(a);

        bufferedReader.close();
        
    }
}
