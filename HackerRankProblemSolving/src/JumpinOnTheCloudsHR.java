import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class JumpinOnTheCloudsResult {

    /*
     * Complete the 'jumpingOnClouds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY c as parameter.
     */

    public static int jumpingOnClouds(List<Integer> c) {
    // Write your code here
        int count=0;
        int i=0;
        while(i<c.size()){
        	System.out.println(i);
        	if((i+2)<c.size()){
                if(c.get(i+2)==0){
                	System.out.println("posición "+(i+2)+"= 0");
                    i=i+2;
                    count++;
                }
                else {
                	if(c.get(i+1)==0){
                    	System.out.println("posición "+(i+1)+"= 0");
                        i=i+1;
                        count++;
                    }
                }
            }
            else if((i+1)<c.size()){
                if(c.get(i+1)==0){
                	System.out.println("posición "+(i+1)+"= 0");
                    i=i+1;
                    count++;
                }
            }
            if(i==(c.size()-1)) {
            	break;
            }
        }
        System.out.println(count);
        return count;

    }

}

public class JumpinOnTheCloudsHR {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] cTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> c = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cTemp[i]);
            c.add(cItem);
        }

        int result = JumpinOnTheCloudsResult.jumpingOnClouds(c);

        
        bufferedReader.close();
        
    }
}
