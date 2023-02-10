import java.util.Scanner;

public class PolyEx {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Employee e = null;
		
		printMessage("Polymorphism example");
		
		for(int i = 1; i <= 5; i++)	{
			System.out.print("Type 1 for Hourly Employee, 2 for Salaried Employee -->");
			int ans = in.nextInt();
			if (ans == 1)
				e = new HourlyEmployee("Joe", new Date(1,21,2022), 10.0, 120);
			else
				e = new SalariedEmployee("Jane", new Date(1,21,2022), 120000);
			System.out.print(e.toString());
		}

	}
	
	public static void printMessage(String msg) {
		System.out.print(msg + "\n");
	}

}
