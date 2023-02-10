
import java.util.Scanner;

public class InerationExample {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n;
		
		System.out.print("Enter positive value for n ---> ");
		n = in.nextInt();
		while (n <= 0) {
			System.out.println("Invalid Entry: n must be positive");
			System.out.println("Enter positive value for n --->");
			n = in.nextInt();
		}
		int i = 1;
		while (i <= n) {
			System.out.println(i);
			i++;
		}
		i=1;
		do {
			System.out.println(i);
			i++;
		} while (i <= n);
		for (i=1; i<=n; i++) {
			System.out.println(i);
		}
		}
	}
