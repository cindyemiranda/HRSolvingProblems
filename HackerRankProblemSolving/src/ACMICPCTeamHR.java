import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class ACMICPCTeamHRResult {

    /*
     * Complete the 'acmTeam' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY topic as parameter.
     */

    public static List<Integer> acmTeam(List<String> topic) {
    // Write your code here
        List<Integer> result= new ArrayList<Integer>();
        List<Integer> topicsKnown= new ArrayList<Integer>();
        for(int i=0; i<topic.size(); i++){
            for(int j=i+1;j<topic.size(); j++){
            	int topicKnown=0;
                String subjects1=topic.get(i);
                String subjects2=topic.get(j);
                for(int x=0; x<subjects1.length();x++){
                    if((char)subjects1.charAt(x)=='1' ||(char)subjects2.charAt(x)=='1'){
                        topicKnown++;
                    }
                }
                topicsKnown.add(topicKnown);
            }
            
        }
        //System.out.println(topicsKnown);
        int max_topic=Collections.max(topicsKnown);
        int teams=Collections.frequency(topicsKnown, max_topic);
        result.add(max_topic);
        result.add(teams);
        //System.out.println(result);
        return result;

    }

}

public class ACMICPCTeamHR {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<String> topic = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String topicItem = bufferedReader.readLine();
            topic.add(topicItem);
        }

        List<Integer> result = ACMICPCTeamHRResult.acmTeam(topic);

        for (int i = 0; i < result.size(); i++) {
            
            if (i != result.size() - 1) {
                
            }
        }

        
        bufferedReader.close();
        
    }
}
