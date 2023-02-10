import java.io.*;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		
		Scanner fin = null;
		PrintWriter fout = null;
		
		try {
			fin = new Scanner(new FileInputStream("presidents.txt"));
			fout = new PrintWriter(new FileOutputStream("presidents2.txt", true));			
		}
		catch (IOException e) {
			System.out.println(e);
			System.exit(-1);
		}
		String name;
		int month, day, year;
		while (fin.hasNextLine()) {
			name = fin.nextLine().trim();
			month = fin.nextInt();
			day = fin.nextInt();
			year = fin.nextInt();
//			fout.println("President " + name + " was born on " + month + "/" + day + "/" + year);
			fout.printf("President %s was born on %d/ %d/ %d/\n", name, month, day, year);
			fin.nextLine();
		}
		fout.flush();
		fin.close();
		fout.close();
	}
	
}
