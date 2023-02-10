import java.util.Scanner;

public class MethodExample3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter a positive integer (-1 to stop) --> ");
		int val = in.nextInt();
		while (val >= 0) {
			long ans = 1;
			for(int i=1; i<=val; i++)
				ans *= i;
			System.out.println(val + "! = " + ans);
			System.out.print("Please enter a positive integer (-1 to stop) --> ");
			val = in.nextInt();
		}

	}

}
