import java.util.Scanner;

public class SelectionExample1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int grade, bonus, totalScore;

		System.out.print("Enter grade and bonus points --> ");
		grade = in.nextInt();
		bonus = in.nextInt();
		totalScore = grade+bonus;
		if (totalScore > 100) {
			totalScore = 100;
		}
		System.out.println("Total score = " + totalScore);
		
		if (totalScore < 60) {
			System.out.println("Grade: F");
		}
		else {
			System.out.println("Grade: P");
		}
	}

}
