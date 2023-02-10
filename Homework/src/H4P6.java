
import java.util.Scanner;

/**
 * Manny Fomundam
 * H4P6 - Shoulder Pain Diagnostic Program
 * Using if and else statements to get a diagnostic
 */

public class H4P6 {

	public static void main(String[] args) {
		
		int yes = 1, no = 0;
		
		Scanner in = new Scanner(System.in); 
		System.out.println("Answer Yes and No to each question!");
		System.out.println("Type either 1 or 0 as in Yes = 1, No = 0");
		System.out.println("Question 1: Did you injure your shoulder within the last 24 hours?");
		int question1 = in.nextInt();
		System.out.println("Question 2: Did the pain begin suddenly?");
		int question2 = in.nextInt();
		System.out.println("Question 3: Is your temperature 100 F (38 C) or above AND/OR have you recently started to feel sick?");
		int question3 = in.nextInt();
		
			if (question1 == 1) {
				System.out.println("GO TO THE EMERGENCY ROOM RIGHT NOW!");
			}
			else {
			}
			
			if (question2 == 0) {
				System.out.println("GO TO THE PHARAMACY AND GET SOME PAIN MEDICATION!");
			}
			else {
			}
			
			if (question3 == 1) {
				System.out.println("YOU MAY HAVE AN INFLAMED SHOULDER!");
			}
			else {
			}
		}
	}
