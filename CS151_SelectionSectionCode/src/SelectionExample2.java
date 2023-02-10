import java.util.Scanner;

public class SelectionExample2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int feet, inches;
		double idealWeight;
		
		System.out.print("Enter height in feet and inches --> ");
		feet = in.nextInt();
		inches = in.nextInt();
		if (feet < 5) {
			idealWeight = 22*feet + 11.0/6.0*inches;
		}
		else {
			idealWeight = 110 + ((feet-5)*12 + inches)*5;
		}
		System.out.println("Your ideal weight = " + idealWeight + " lbs");
		System.out.printf("Your ideal weight = %.1f lbs\n", idealWeight);

	}

}
