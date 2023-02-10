
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**Programmer: Manny Fomundam
	 * Homework 1: Problem 5a and 5b
	 * 5a: Adds a new constructor which takes a String file
	 * and the string will have the grille in this format: 
	 * The first line will contain asingle (even) integer n
	 * specifying the size of the grille. After that will be 
	 * n lines, each containing n values. These values will either 
	 * be a 0 (indicating a hole in the grille) or 1(indicating a non-hole).
	 * 
	 * 5b. Adds a method isValidGrille and throws a RuntimeException if a grille
	 * is invalid and return otherwise
	 **/

public class HW1P6 {
	
private boolean[][] grille;

//5a)
	public HW1P6(String path) throws FileNotFoundException {
		File file = new File(path);
		Scanner sc = new Scanner(file);
		int num = Integer.parseInt(sc.nextLine());
		grille = new boolean[num][num];
		
		int index = 0;
		while (sc.hasNextLine()) {
			String[] values = sc.nextLine().split(" ");
			boolean[] boolVals = new boolean[num];
			for(int i = 0; i < num; i++) {
				boolVals[i] = values[i] == "0" ? true : false;
			}
			grille[index++] = boolVals;
		}
		
		sc.close();
	}
}


