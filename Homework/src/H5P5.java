
import java.util.Random;
import java.util.Scanner;

/**
 * Manny Fomundam
 * HW 5, Problem 5 - Game Simulation
 * Using selection statements to determine the outcome of a game
 */
public class H5P5 {

	public static void main(String[] args) {
		
			System.out.print("Enter the number of dice (Enter the number 2 in): "); 
			 
			Scanner in = new Scanner(System.in);
			int numberOfDice = in.nextInt();
			
			Random rnd = new Random();
			
			System.out.print("Hey, you rolled: ");
			int total = 0;
			int randomNumber = 0;
			
			for (int i = 0; i <  numberOfDice; i++) {
					
				randomNumber = rnd.nextInt(6) + 1;
				total = total + randomNumber;
				System.out.print(randomNumber);
				System.out.print(" ");
				}
				
				System.out.print("");
				System.out.println("Total: " + total);
				
				if (total == 7) {
					System.out.println("Player wins");
				}
				else if (total == 9) {
					System.out.println("Player loses");
				}
				else if (total == 12) {
					System.out.println("Player loses");
				}
				else if (total == 6) {
					System.out.println("Player loses");
				}
				else if (total == 7) {
					System.out.println("Player loses");
				}
				else if (total == 3) {
					System.out.println("Player loses");
				}
				else if (total == 5) {
					System.out.println("Point set at 5");
				}
				else {
					System.out.println("Roll Again");
				}			
			}
	}
