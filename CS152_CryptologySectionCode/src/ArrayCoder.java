import java.util.Scanner;

public class ArrayCoder extends Coder {
	
	private char[][] grid = new char[5][5];
	
	public String encrypt(String s)
	{
		s = justLetters(s);
		if (s.length()% 25 != 0)
			s = s + "ABCDEFGHIJKLMNOPQRSTUVWX";
		String ciphertext = "";
		while (s.length() >= 25) {
			int k=0;
			for(int r=0; r<grid.length; r++) {
				for(int c=0; c<grid[0].length; c++)
					grid[r][c] = s.charAt(k++);
			}
			for(int c=0; c<grid[0].length; c++)
				for(int r=0; r<grid.length; r++)
					ciphertext += grid[r][c];
			s = s.substring(25);
		}
		return ciphertext;
	}
	
	public String decrypt(String s)
	{
		return encrypt(s);
	}

	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a line of text to encode --> ");
		String plaintext = in.nextLine();
		
		Coder coder = new ArrayCoder();
		String ciphertext = coder.encrypt(plaintext);
		System.out.println(ciphertext);
		plaintext = coder.decrypt(ciphertext);
		System.out.println(plaintext);
	}
}
