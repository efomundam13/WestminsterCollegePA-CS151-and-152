import java.util.Scanner;

public class ExceptionExample1 {

	public static void main(String[] args) {
		
		int nsales;
		int total = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number of sales followed by sale values");
		nsales = in.nextInt();
		for(int i=0; i<nsales; i++) {
			int val = in.nextInt();
			total += val;
		}
		
		try {
			if (nsales == 0)
				throw new DivideByZeroException();
			double avg = total/(double)nsales;
			System.out.println("Number of sales = " + nsales);
			System.out.println("Total sales = " + total);
			System.out.println("Average sales = " + avg);
		}
		catch (Exception e) {
			System.out.println("Number of sales = " + nsales);
			System.out.println("Total sales = " + total);
			System.out.println("Average sales = ******");
		}
	}

}
