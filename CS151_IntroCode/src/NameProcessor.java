import java.util.Scanner;

public class NameProcessor {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your full name --> ");
		String name = in.nextLine();
		int blankLoc1 = name.indexOf(" ");
		int blankLoc2 = name.lastIndexOf(" ");
		String first = name.substring(0, blankLoc1);
		String middle = name.substring(blankLoc1+1, blankLoc2);
		String last = name.substring(blankLoc2+1);
		
		String name2 = last + ", " + first.charAt(0) + ". " + middle.charAt(0) + ".";
		System.out.println(name2);

	}

}
