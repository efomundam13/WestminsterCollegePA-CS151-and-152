import java.util.Scanner;

public class DriverCoder {

	public static void main(String [] args) {
		Coder [] coders = new Coder[10];
		coders[0] = new SubstitutionCoder("Hakuna Matata: it means no worries!");
		coders[1] = new ArrayCoder();
		coders[2] = new PlayfairCoder("Beam me up Scottie");
		coders[3] = new ArrayCoder();
		coders[4] = new GrilleCoder();
		coders[5] = new ArrayCoder();
		coders[6] = new PlayfairCoder();
		coders[7] = new ArrayCoder();
		coders[8] = new SubstitutionCoder();
		coders[9] = new ArrayCoder();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter line to encrypt --> ");
		String plaintext = in.nextLine();
	
		String ciphertext = plaintext;
		for(int i=0; i<coders.length; i++) {
			ciphertext = coders[i].encrypt(ciphertext);
		}
		System.out.println(ciphertext);
		
		plaintext = ciphertext;
		for(int i=coders.length-1; i>=0; i--) {
			plaintext = coders[i].decrypt(plaintext);
		}
		System.out.println(plaintext);
	}
	
}