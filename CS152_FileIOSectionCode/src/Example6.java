import java.io.*;
import java.util.Scanner;

public class Example6 {
	
	class President implements Serializable {
		String name;
		int month;
		int day; 
		int year;
		
		public President(String n, int m, int d, int y) {
			name = n; 
			month = m;
			day = d;
			year = y;
		}
		
		public String toString() {
			return name;
			
		}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner fin = null;
		ObjectOutputStream fout = null;
		ObjectInputStream fin2 = null;
		
		try {
			fin = new Scanner(new FileInputStream("presidents.txt"));
			fout = new ObjectOutputStream(new FileOutputStream("presidents2_obj.dat"));			
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
			fin.nextLine();
			President p = new President(name, m, d, y);
			fout.writeObject(p);
	 		}
	 fin.close();
	 fout.close();
	}
		catch (IOException e) {
			System.out.println(e);
			System.exit(-1);
		}
		try {
			fin2 = new ObjectInputStream(new FileInputStream("presidents2_obj.dat"));
			President p = null;
			for(int i = 0; i<5; i++) {
				p = (President) fin2.readObject();
				System.out.println(p);
				}
			}
		finally {
			
		}
		}
	}
}
