
import java.util.Scanner;

/**
 * Manny Fomundam
 * HW 5, Problem 4 - Palindrome statements
 * Using selection statements figure out if a statement is a palindrome or not
 */

public class H5P4 {

	public static void main(String[] args) {
	  
		      String forwards, backwards = "";
		      Scanner in = new Scanner(System.in);   
		      System.out.println("Enter a string below to check if it is a palindrome");  
		      forwards = in.nextLine();   
		     
		      int length = forwards.length();   
		      for ( int i = length - 1; i >= 0; i-- )  
		         backwards = backwards + forwards.charAt(i);  
		      if (forwards.equals(backwards))  
		         System.out.println("Entered string is a palindrome.");  
		      else  
		         System.out.println("Entered string isn't a palindrome.");   
		   }  
	}
