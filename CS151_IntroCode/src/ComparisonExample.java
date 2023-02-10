import java.util.Scanner;

public class ComparisonExample {

	public static void main(String[] args) {
		
		String name1, name2;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter two names");
		name1 = in.next();
		name2 = in.next();
		if (!name1.equals(name2)) {
			System.out.println("Names are not equal");
		}
		else {
			System.out.println("Names are equal");
		}

	}

}
