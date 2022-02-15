import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class ETAHRResult {

    /*
     * Complete the 'equalizeArray' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int equalizeArray(List<Integer> arr) {
    // Write your code here
        int minDeletions=0;
        int maxCoincidences=0;
        List<Integer> listC=new ArrayList<Integer>();
        for(int i=0; i<arr.size(); i++){
            if((int)arr.get(i)!=0){
                int coincid=1;
                for(int j=(i+1); j<arr.size(); j++){
                    if((int)arr.get(j)!=0){
                        if((int)arr.get(i)==(int)arr.get(j)){
                            coincid++;
                            arr.set(j,0);
                        }
                    }
                }
                listC.add(coincid);        
            }
        }
        maxCoincidences=Collections.max(listC);
        minDeletions=arr.size()-maxCoincidences;
        return minDeletions;
    }

}

public class EqualizeTheArrayHR {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        int result = ETAHRResult.equalizeArray(arr);

        
        bufferedReader.close();
        
    }
}
