
import java.io.*;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		 Scanner fin = null;
		 ObjectOutputStream fout = null;

		 try {
			 fin = new Scanner(new FileInputStream("presidents.txt"));
			 fout = new ObjectOutputStream(new FileOutputStream("presidents.dat"));
		 }
		 catch (IOException e) {
			System.out.println(e);
			System.exit(-1);
		 }
		 
		 try {
			 while (fin.hasNextLine()) {
					String name = fin.nextLine();
					int m = fin.nextInt();
					int d = fin.nextInt();
					int y= fin.nextInt();
					System.out.println(name);
					fout.writeUTF(name);
					fout.writeInt(m);
					fout.writeInt(d);
					fout.writeInt(y);
					
					fin.nextLine();
			 		}
			 fin.close();
			 fout.close();
				}
		 catch (IOException e) {
			 System.out.println();
		 }
	}
}
