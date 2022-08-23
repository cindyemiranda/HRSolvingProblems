import java.util.Scanner;

public class IsAnagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        int countA=0;
        int countB=0;
        a=a.toLowerCase();
        b=b.toLowerCase();
        boolean anagram=true;
        if(a.length()==b.length()){
            for(int i=0; i<a.length(); i++){
                countA=0;
                countB=0;
                for(int j=0; j<a.length(); j++){
                    if(a.charAt(i)==a.charAt(j)){
                        countA++;
                    }
                }
                for(int j=0; j<b.length(); j++){
                    if(a.charAt(i)==b.charAt(j)){
                        countB++;
                    }
                }
                if(countA!=countB){
                    anagram=false;
                    break;
                }
            }    
        }
        else{
            anagram=false;
        }
        return anagram;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

