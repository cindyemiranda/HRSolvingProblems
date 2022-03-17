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

class TimeConversionHRResult {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
        int index= s.indexOf(":");
        String s_h= s.substring(0, index);
        String left=s.substring(index+1, s.length());
        int i_h=Integer.valueOf(s_h);
        if(s.contains("AM")){
            if(i_h==12){
                s="00:"+left;
            }
        }
        else{
            if(i_h!=12){
                s=(i_h+12)+":"+left;    
            }
        }
        s=s.replace("AM","");
        s=s.replace("PM", "");
        return s;
    }
}

public class TimeConversionHR {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = TimeConversionHRResult.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
