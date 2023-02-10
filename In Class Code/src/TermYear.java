
import java.util.Scanner;

public class TermYear {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int year, sem;
		int yr = 0;
		String term="";
		
		System.out.print("Enter starting year and term number ---> ");
		year = in.nextInt();
		sem = in.nextInt();
		
		switch (sem) {
		case 1: yr = year;
				term = "Fall";
				break;
		case 2: yr = year+1;
				term = "Spring";
				break;
		case 3: yr = year+1;
				term = "Fall";
				break;
		case 4: yr = year+2;
				term = "Spring";
				break;
		case 5: yr = year+2;
				term = "Fall";
				break;
		case 6: yr = year+3;
				term = "Spring";
				break;
		case 7: yr = year+3;
				term = "Fall";
				break;
		case 8: yr = year+4;
				term = "Spring";
		}
}
}