import java.util.Scanner;
import java.util.regex.*;

public class PatternSyntaxChecker
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
        int idx=0;
		while(testCases>idx){
			String pattern = in.nextLine();
          	//Write your code
              
            try{
                Pattern.compile(pattern);      
                System.out.println("Valid");
            }  
            catch(Exception e){
                System.out.println("Invalid");
            }
            idx++;
		}
        in.close(); 
	}
}



