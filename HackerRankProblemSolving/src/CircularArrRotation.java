import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'circularArrayRotation' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER k
     *  3. INTEGER_ARRAY queries
     */

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
    // Write your code here
        List<Integer> arrayRotated= Arrays.asList(new Integer[a.size()]);
        List<Integer> values= new ArrayList<Integer>();
        if(k>a.size()) {
        	while(k>a.size()) {
        		k=k-a.size();
        	}
        }
        for(int i=0; i<a.size(); i++){
        	//System.out.println(a.size());
        	//System.out.println(i+k);
            if(i+k>=a.size()){
            	//System.out.println("("+i+"+"+k+")"+"-"+a.size());
            	//System.out.println("posición (i+k)-a.size() "+ ((i+k)-a.size()));
                arrayRotated.set((i+k)-a.size(), a.get(i));
                
            }
            else{
            	//System.out.println("posición (i+k) "+ (i+k));
                arrayRotated.set((i+k), a.get(i));
            }
           // System.out.println(arrayRotated);
           // System.out.println(a);
        }
        for(Integer query: queries){
            values.add(arrayRotated.get(query));
        }
        //System.out.println("veces rotado: "+k);
        //System.out.println("arreglo origninal: "+a);
        //System.out.println("arreglo rotado: "+arrayRotated);
        //System.out.println("queries: "+queries);
        System.out.println("valores de queries: "+values);
        return values;
    }

}

public class CircularArrRotation {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        int q = Integer.parseInt(firstMultipleInput[2]);

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        List<Integer> queries = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            int queriesItem = Integer.parseInt(bufferedReader.readLine().trim());
            queries.add(queriesItem);
        }

        List<Integer> result = Result.circularArrayRotation(a, k, queries);

        for (int i = 0; i < result.size(); i++) {
            
            if (i != result.size() - 1) {
                
            }
        }

        

        bufferedReader.close();
    }
}
