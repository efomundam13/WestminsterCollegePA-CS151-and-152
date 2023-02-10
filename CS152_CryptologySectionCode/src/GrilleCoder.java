
import java.util.Arrays;

/** Programmer: Manny Fomundam
* 02/07/2022
* Cryptology Methods: Project 1: Grille Encryption
* The grille encryption scheme is an example of a transposition cipher, i.e. one
that simply rearranges the letters in the plaintext. The scheme makes use of an n ×n grille (where
n is even) provided by the user: n2/4 of the grille squares are designated “hole” squares and the
remaining are “covered” squares
*/

public class GrilleCoder extends Coder {
	protected static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private boolean[][] grille;

	public GrilleCoder() {
		grille = new boolean[6][6];
	}

	public GrilleCoder(boolean[][] grille) {
		this.grille = grille;
	}

	public boolean[][] getGrille() {
		return grille;
	}

	public void set(boolean[][] grille) {
		this.grille = grille;
	}

	public String encrypt(String plaintext) {
		String ans = "";

		char[][] Grille_Cipher = new char[grille.length][grille.length];
		int idx = 0, count = 0, sum = 0;

//		Create the table
		for (int row = 0; row < grille.length; row++) {
			for (int col = 0; col < grille.length; col++) {
				char curr = count >= plaintext.length() ? ALPHABET.charAt(idx++) : plaintext.charAt(count++);
				Grille_Cipher[row][col] = curr;
				sum++;
			}
		}

		int timesRun = sum / ((grille.length * grille.length) / 4);
		boolean[][] grilleCopy = getCopy();


		for (int i = 0; i < timesRun; i++) {
			for (int row = 0; row < grille.length; row++) {
				for (int col = 0; col < grille[row].length; col++) {
//					If we're at a hole, add that letter
					if (grilleCopy[row][col]) {
						ans += Grille_Cipher[row][col];
					}
				}
			}
//			Add a space and rotate the array
			ans += " ";
			rotateArr(grilleCopy);
		}

		return ans;
	}

	public String decrypt(String ciphertext) {
		String decrypted = "";
		ciphertext = justLetters(ciphertext);
		System.out.println(ciphertext);
		char[][] Grille_Cipher = new char[grille.length][grille.length];
		char[][] ans = new char[grille.length][grille.length];
		int idx = 0, sum = 0;

//		Create the table
		for (int row = 0; row < grille.length; row++) {
			for (int col = 0; col < grille.length; col++) {
				char curr = ciphertext.charAt(idx++);
				if (curr == ' ')
					continue;
				Grille_Cipher[row][col] = curr;
				sum++;
			}
		}

//		Create 
		int timesRun = sum / ((grille.length * grille.length) / 4);
		boolean[][] grilleCopy = getCopy();
		
//		Reverse the steps
		int cu = 0;
		for (int i = 0; i < timesRun; i++) {
			for (int row = 0; row < grille.length; row++) {
				for (int col = 0; col < grille[row].length; col++) {
//					If we're at a hole, add that letter
					if (grilleCopy[row][col]) {
						ans[row][col] = ciphertext.charAt(cu++);
					}
				}
			}
//			Add a space and rotate the array
			rotateArr(grilleCopy);
		}

//		Convert from 2d array to text
		for (char[] arr : ans) {
			for (char curr : arr) {
				decrypted += curr;
			}
		}

		return decrypted;
	}

//	This method handles all the logic for rotating the array
	private void rotateArr(boolean[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				boolean temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length / 2; j++) {
				boolean temp = arr[i][j];
				arr[i][j] = arr[i][arr.length - j - 1];
				arr[i][arr.length - j - 1] = temp;
			}
		}
	}
	
//	This method returns a copy of the grille 
	private boolean[][] getCopy() {
		boolean[][] grilleCopy = new boolean[grille.length][];
		for (int i = 0; i < grille.length; i++) {
			boolean[] curr = grille[i];
			grilleCopy[i] = Arrays.copyOf(curr, curr.length);
		}
		return grilleCopy;
	}


public static void main(String[] args) {
	// TODO Auto-generated method stub
//	KeyCoder s = new PlayfairCoder();
//	s.setKey("To be, or not to be: that is the question:");
//	String enc = s.encrypt("Trouble at base");
//	System.out.println(s.decrypt(enc));
	boolean[][] grille = {{false, true, false, false, false, true},
						  {false, false, true, false, false, false},
						  {false, false, true, false, false, false},
						  {true, false, false, false, true, true},
						  {false, false, false, false, true, false},
						  {false, true, false, false, false, false}};
	GrilleCoder gc = new GrilleCoder(grille);
	String enc = gc.encrypt("WHENINDOUBTSENDEVENMOREMONKEYS");
	String dec = gc.decrypt(enc);
	System.out.println(dec);
}

}

