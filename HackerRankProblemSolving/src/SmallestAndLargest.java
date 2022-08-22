import java.util.Scanner;

public class SmallestAndLargest {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        smallest=s.substring(0,k);
        largest=smallest;
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        //System.out.println(s.length());
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j=j+k){
                if(j+k<=s.length()){
                    String sub=s.substring(j,j+k);
                    if(sub.compareTo(smallest)<=0){
                        smallest=sub;
                    }
                    if(sub.compareTo(largest)>=0){
                        largest=sub;
                    }
                }
            }
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
