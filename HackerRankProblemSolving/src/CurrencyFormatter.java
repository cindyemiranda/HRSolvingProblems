import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class CurrencyFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        System.out.println(payment);
        DecimalFormat df = new DecimalFormat("#.##");
        
        String i_format=NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        i_format=i_format.replace("$", "");
        i_format="Rs."+i_format;
        
        System.out.println("US: " + NumberFormat.getCurrencyInstance(Locale.US).format(payment));
        System.out.println("India: " + i_format);
        System.out.println("China: " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment));
        System.out.println("France: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment));
    }	
	

}
