import java.util.Scanner;

public class Lab5b {

	/**
	 * Manny Fomundam
	 * Lab 5b - Selection statements
	 * Using selection statements figure out the heart rate of kids based on age and gender
	 */

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String M, F, b, g;

		System.out.println("Enter in 'M' or 'F' for gender ---> ");
		String gender = in.nextLine();
		System.out.println("Enter in age of child ---> ");
		int age = in.nextInt();
		
		if (gender.equals("M")) {
			
			if(age >= 1 && age <= 4){
				System.out.printf("Blood Pressure is equal to 80/34 through 120/75");
			}
			}
			else if(age >= 4 && age <= 6) {
				System.out.printf("Blood Pressure is equal to 88/47 through 128/84");
			}
			else if(age >= 7 && age <= 10) {
				System.out.printf("Blood pressure is equal to 92/53 through 130/90");
			}
			else { 
				System.out.print("Error");
			}
			
	
				
		if (gender.equals("F")) {
				if(age >= 1 && age <= 4) {
					System.out.printf("Blood Pressure is equal to 83/38 through 117/76");
				}
				}
				else if(age >= 4 && age <=6) {
					System.out.printf("Blood Pressure is equal to 88/50 through 128/83");
				}
				else if(age >=7 && age <=10) {
					System.out.printf("Blood pressure is equal to 93/55 through 129/88");
				}
				else { 
					System.out.print("Error");
				}
		}
}
