import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class ResultAppendAndDeleteHR {

    /*
     * Complete the 'appendAndDelete' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     *  3. INTEGER k
     */

    public static String appendAndDelete(String s, String t, int k) {
    // Write your code here
        int count=0;
        int s_index=0;
        int t_index=0;
        String result="";
       if(s.length()+t.length()<=k) {
    	   
       }
       else {
    	   for(int i=0; i<s.length(); i++){
      		 s_index=i;
               t_index=i;
              if(i<t.length()){
                  if(s.charAt(i)!=t.charAt(i)){
                      break;
                  }
              }
              else{
                  break;
              }
             
          }
	      System.out.println(t.length()+"-"+t_index+"= "+(t.length()-t_index)+" | "+s.length()+"-"+s_index+"= "+(s.length()-s_index));
	      count=(t.length()-t_index)+(s.length()-s_index);
	      System.out.println(count);
	      if(k<count) {
	      	result="No";
	      }
	      else {
	    	 if((count-k)%2==0) { 
	    		 result="Yes";
	    	 }
	    	 else {
	    		 result="No";
	    	 }
	      }
       }
        	
        System.out.println(result);
        return result;    
         

    }

}

public class AppendAndDeleteHR {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       
        String s = bufferedReader.readLine();

        String t = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = ResultAppendAndDeleteHR.appendAndDelete(s, t, k);

       

        bufferedReader.close();
        
    }
}