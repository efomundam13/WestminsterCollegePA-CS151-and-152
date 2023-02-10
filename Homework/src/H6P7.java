
/**
 *  Programmer: Manny Fomundam
 *  	Date 10/21/21
 * HW 6, Problem 7 - Using different methods to determine if a credit card/ debit card is valid or not
 */

import java.util.Scanner;

public class H6P7 {
	
	public static void main(String [] args) {		//entering in card information
		Scanner in = new Scanner(System.in);
		System.out.println("Luhn Algorothm Calculator");
		System.out.println("Enter in a credit/debit card numbers");
		String card=in.next();
		System.out.println(processCard(card));
		System.out.println(removeBlanks(card));
	}
	
	private static char[] processCard(String card) {
		// TODO Auto-generated method stub
		return null;
	}

	public static String removeBlanks(String s) {
		String card = s;
		return card;
	}
		
	public static int badCharacterCheck(String s) {
		String card = s;
		return 0;
	}
	
	public static int checkSum(String s)	{
		String card = s;
	int[] cardInt = new int[card.length()];
		
		for (int i = 0; i < card.length(); i++)
		{
			cardInt[i] = Integer.parseInt(card.substring(i, i + 1));
		}
		
		for (int i = cardInt.length - 2; i >= 0; i = i - 2)
		{
			int tempValue = cardInt[i];
			tempValue = tempValue * 2;		//multiplying each odd value by 2
			if(tempValue > 9)
			{
				tempValue = tempValue % 10 + 1;  //figuring out if it's a mutiple of 10
			}
			cardInt[i] = tempValue;
		}
		int checksum = 0;
		for (int i = 0; i < cardInt.length; i++)
		{
			checksum += cardInt[i];
		}
		return checksum;
	}
	
	
	
}
	