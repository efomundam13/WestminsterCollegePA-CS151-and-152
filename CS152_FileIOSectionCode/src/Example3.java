
import java.io.*;

public class Example3 {

	public static void main(String[] args) {
		
		PrintWriter fout_txt = null;
		ObjectOutputStream fout_bin = null;
	
		try {
			fout_txt = new PrintWriter(new FileOutputStream("out.txt"));
			fout_bin = new ObjectOutputStream(new FileOutputStream("out.bin"));
		
			for(int i = 1; i <= 100000; i++) {
				fout_txt.println(i);
				fout_bin.writeInt(i);
			}
			fout_txt.close();
			fout_bin.close();
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}

}
