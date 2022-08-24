import java.io.*;
import java.util.*;

public class StringTokens {

	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        // Write your code here.true  
	        s=s.replace("!"," ");
	        s=s.replace(","," ");
	        s=s.replace("?"," ");
	        s=s.replace("."," ");
	        s=s.replace("_"," ");
	        s=s.replace("'"," ");
	        s=s.replace("@"," ");
	        String [] split= s.split(" ");
	        int size=0;
	        //System.out.println(split.length);
	        for(int i=0; i<split.length; i++){
	            if(split[i].trim().length()>0){
	                size++;
	            }
	        }
	        System.out.println(size);
	        for(int i=0; i<split.length; i++){
	            if(split[i].trim().length()>0){
	                System.out.println(split[i]);
	            }
	        }
	        scan.close();
	    }
}

