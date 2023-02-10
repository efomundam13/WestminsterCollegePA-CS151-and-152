import java.io.*;
public class Example5 {

	public static void main(String[] args) {
		
		ObjectInputStream fin = null;
		
		try {
			fin = new ObjectInputStream(new FileInputStream("out.bin"));
		}
		catch (IOException e) {
			System.out.println(e);
			System.exit(-1);
		}
		
		int count = 0; int val;
		try {
			while(true) {
				val = fin.readInt();
				count++;
			}
		}
		catch (IOException e) {
			System.out.println("Read in " + count + " values");
				System.out.println(e);
				System.exit(-1);
			}
		}
	}
