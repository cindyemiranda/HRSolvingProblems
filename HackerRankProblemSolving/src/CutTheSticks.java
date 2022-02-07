import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class CutTheSticksResult {

    /*
     * Complete the 'cutTheSticks' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> cutTheSticks(List<Integer> arr) {
    // Write your code here
        int min=1000;
        List <Integer> listResult= new ArrayList<Integer>(); 
        listResult.add(arr.size());
        int size=0;
        int size_ant=arr.size();
        //find the shortest
        while(true){
            
            size=0;
            //find the smallest
            for(Integer num: arr){
                if((int)num<=min && (int)num>0){
                    min=num;
                }
            }
            //cut the sticks with the shorter one;
            for(int i=0; i<arr.size(); i++) {
                if((int)arr.get(i)>0){
                	int aux=(int)arr.get(i);
                	arr.set(i, (aux-min));
                }
                if((int)arr.get(i)>0){
                    size++;
                }
            }
            if(size==0){
                break;
            }
            else{
            	if(size_ant!=size) {
            		listResult.add(size);
            		size_ant=size;
            	}
            }
            //System.out.println(size);
        }
        //System.out.println(listResult);
        return listResult;
    }

}

public class CutTheSticks {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        List<Integer> result = CutTheSticksResult.cutTheSticks(arr);

        
        
        bufferedReader.close();
        
    }
}

