import java.util.Scanner;

public class ExceptionExample2 {

	public static void main(String[] args) {
		
		int n=0;
		Scanner in = new Scanner(System.in);
		
		boolean done = false;
		while (!done) {
			try {
				System.out.print("Enter a positive number --> ");
				n = in.nextInt();
				if (n <= 0) {
					throw new Exception("non-positive integer entered");
				}
				done = true;
			}
			catch (Exception e) {
				in.nextLine();
				System.out.println(e);
				System.out.println("Please try again");
			}
		}
		System.out.println("You entered " + n);

	}

}
