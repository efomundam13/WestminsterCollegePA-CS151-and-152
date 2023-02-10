import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		Scanner fin = null;
		try {
			fin = new Scanner(new FileInputStream("presidents.txt"));
		}
		
		catch (FileNotFoundException e) {
			System.out.println(e);
			System.exit(-1);
		}
		
		String name;
		int month, day, year;
		while (fin.hasNextLine()) {
			name = fin.nextLine();
			month = fin.nextInt();
			day = fin.nextInt();
			year = fin.nextInt();
			System.out.println("President " + name + " was born on " + month + "/" + day + "/" + year);
			fin.nextLine();
		}
		

	}

}
