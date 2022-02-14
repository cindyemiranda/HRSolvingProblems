import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class NonDivisibleSubsetResult {

    /*
     * Complete the 'nonDivisibleSubset' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY s
     */

    public static int nonDivisibleSubset(int k, List<Integer> s) {
    // Write your code here
    	int size=0;
    	List<Integer> listaResiduos= new ArrayList<Integer>(k-1);
    	for(int i=0; i<=k-1; i++) {
    		listaResiduos.add(0);
    	}
    	System.out.println(listaResiduos);
    	for(Integer num: s) {
    		if(listaResiduos.get(num%k)!=null) {
    			listaResiduos.set(num%k, listaResiduos.get(num%k)+1);
    		}
    		else {
    			listaResiduos.set(num%k, 1);
    		}
    	}
    	System.out.println(listaResiduos);
    	if((int)listaResiduos.get(0)>1) {
    		listaResiduos.set(0, 1);
    	}
    	if(k%2==0 && (int)listaResiduos.get(k/2)>1) {
    		listaResiduos.set(k/2, 1);
    	}
    	for(int i=1; i<k; i++) {
    		if((int)listaResiduos.get(i)>(int)listaResiduos.get(k-i)) {
    			listaResiduos.set(i,0);
    		}
    		else {
    			if(k%2!=0) {
    				listaResiduos.set(i,0);
    			}
    		}
    	}
    	for(int i=0; i<listaResiduos.size(); i++) {
    		size=size+listaResiduos.get(i);
    	}
    	System.out.println(size);
    	return size;
    }

}

public class NonDivisibleSubsetHR {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        String[] sTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> s = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int sItem = Integer.parseInt(sTemp[i]);
            s.add(sItem);
        }

        int result = NonDivisibleSubsetResult.nonDivisibleSubset(k, s);

        bufferedReader.close();
    }
}
