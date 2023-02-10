
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HW1P5 {
 	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter birth month: ");
		int input = sc.nextInt();

		String path = "/Users/emman/eclipse-workspace/CSII HW/presidents.txt";

		findMonths(path, input);
		
	}

	public static void findMonths(String path, int inputMonth) throws IOException {
		File file = new File(path);
		Scanner sc = new Scanner(file);
		String filePath = "/Users/emman/eclipse-workspace/CSII HW/presidents" + inputMonth;
		FileWriter myWriter = new FileWriter(filePath);

		while (sc.hasNextLine()) {
			String presidentName = sc.nextLine();
			String[] dates = sc.nextLine().split(" ");
			int month = Byte.parseByte(presidentName);
			if (month == inputMonth) {
//				writeToFile(myWriter, presidentName);
				myWriter.write(presidentName + "\n");
			}
		}
		myWriter.close();
		sc.close();
	}

	private static void writeToFile(FileWriter myWriter, String text) throws IOException {
		
	}
}
