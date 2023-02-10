
import java.awt.Point;
import java.util.Arrays;
import java.util.Scanner;

/** Programmer: Manny Fomundam
* 02/07/2021
* Cryptology Methods: Project 1: Playfair Encryption
* The Playfair Cipher is a key-based encryption scheme. This scheme makes
use of a 5 ×5 table constructed from the key, and encrypts/decrypts groups of two letters at a time
(the groups are called digrams)
*/

public class PlayfairCoder extends KeyCoder {

	private char[][] PlayFair_Cipher;
	char ch1 = 0;
	char ch2 = 0;
	private String[] digrams;

	private Point getPoint(char c) {
		for (int row = 0; row < PlayFair_Cipher.length; row++) {
			for (int col = 0; col < PlayFair_Cipher[row].length; col++) {
				if (c == PlayFair_Cipher[row][col])
					return new Point(row, col);
			}
		}
//	    won't be reached since every letter is in the arr
		return null;
	}

	public PlayfairCoder() {
		super();
		PlayFair_Cipher = new char[5][5];
	}

	public PlayfairCoder(String key) {
		super(key);
		PlayFair_Cipher = new char[5][5];
	}
	
	public String encrypt(String plaintext) {
		plaintext = justLetters(plaintext);
		plaintext = plaintext.length() % 2 != 0 ? plaintext + "X" : plaintext;
		boolean seenIOrJ = false;
		int idx = 0;
		
//		Create the table
		for(int row = 0; row < PlayFair_Cipher.length; row++) {
			for(int col = 0; col < PlayFair_Cipher[row].length; col++) {
				char curr = key.charAt(idx);
				if (seenIOrJ && curr == 'I' || curr =='J') curr = key.charAt(++idx);
				if (curr == 'I' || curr =='J') seenIOrJ = true;
				PlayFair_Cipher[row][col] = curr;
				idx++;
			}
		}
		
		digrams = splitText(plaintext);
		
		String encrypted = "";
		for(int i = 0 ; i < digrams.length; i++) {
			char word1 = digrams[i].charAt(0);
			char word2 = digrams[i].charAt(1);
			int row1 = (int) getPoint(word1).getX();
			int col1 = (int) getPoint(word1).getY();
			int row2 = (int) getPoint(word2).getX();
			int col2 = (int) getPoint(word2).getY();
			
//			If letters are in the same row
			if (row1 == row2) {
				int firstCol = col1 + 1 == 5 ? 0 : col1 + 1;
				int secondCol = col2 + 1 == 5 ? 0 : col2 + 1;
				String toAdd = PlayFair_Cipher[row1][firstCol] + "" + PlayFair_Cipher[row2][secondCol];
				encrypted += toAdd; 
			}
			
//			If letters are in the same col
			if(col1 == col2) {
				int firstRow = row1 + 1 == 5 ? 0 : row1 + 1;
				int secondRow = row2 + 1 == 5 ? 0 : row2 + 1;
				String toAdd = PlayFair_Cipher[firstRow][col1] + "" + PlayFair_Cipher[secondRow][col2];
				encrypted += toAdd; 
			}
			
//			If letters are in a different row and col
			if (row1 != row2 && col1 != col2) {
				String toAdd = PlayFair_Cipher[row1][col2] + "" + PlayFair_Cipher[row2][col1];
				encrypted += toAdd; 
			}

		}
		
		return encrypted;
	}
	
	public String decrypt(String ciphertext) {
		String decrypted = "";
		digrams = splitText(ciphertext);
		
		for(int i = 0 ; i < digrams.length; i++) {
			char word1 = digrams[i].charAt(0);
			char word2 = digrams[i].charAt(1);
			int row1 = (int) getPoint(word1).getX();
			int col1 = (int) getPoint(word1).getY();
			int row2 = (int) getPoint(word2).getX();
			int col2 = (int) getPoint(word2).getY();
			
//			If letters are in the same row
			if (row1 == row2) {
				int firstCol = col1 - 1 < 0 ? PlayFair_Cipher[row1].length - 1 : col1 - 1;
				int secondCol = col2 - 1 < 0 ? PlayFair_Cipher[row2].length - 1 : col2 - 1;
				String toAdd = PlayFair_Cipher[row1][firstCol] + "" + PlayFair_Cipher[row2][secondCol];
				decrypted += toAdd; 
			}
			
//			If letters are in the same col
			if(col1 == col2) {
				int firstRow = row1 - 1 < 0 ? PlayFair_Cipher.length - 1 : row1 - 1;
				int secondRow = row2 - 1 < 0 ? PlayFair_Cipher.length - 1 : row2 - 1;
				String toAdd = PlayFair_Cipher[firstRow][col1] + "" + PlayFair_Cipher[secondRow][col2];
				decrypted += toAdd; 
			}
			
//			If letters are in a different row and col
			if (row1 != row2 && col1 != col2) {
				String toAdd = PlayFair_Cipher[row1][col2] + "" + PlayFair_Cipher[row2][col1];
				decrypted += toAdd; 
			}

		}
		return decrypted;
	}
	
//	This helper method returns an array of 2 letter strings
	private String[] splitText(String text) {
		String[] digrams = new String[text.length() / 2];
		int idx = 0;
		for (int i = 0; i < text.length() - 1; i += 2) {
			String sub = text.charAt(i) + "" + text.charAt(i + 1);
			digrams[idx++] = sub;
		}
		return digrams;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a line of text to encode --> ");
		String plaintext = in.nextLine();

		Coder coder = new PlayfairCoder();
		String ciphertext = coder.encrypt(plaintext);
		System.out.println(ciphertext);
		plaintext = coder.decrypt(ciphertext);
		System.out.println(plaintext);
	}
}
