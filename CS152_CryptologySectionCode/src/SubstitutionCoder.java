import java.util.Scanner;

public class SubstitutionCoder extends KeyCoder {

	public SubstitutionCoder()
	{
		super();
	}
	
	public SubstitutionCoder(String key)
	{
		super(key);
	}
	
	public String encrypt(String plaintext)
	{
		plaintext = justLetters(plaintext);
		String ciphertext = "";
		
		for(int i=0; i<plaintext.length(); i++) {
			int index = ALPHABET.indexOf(plaintext.charAt(i));
			ciphertext += key.charAt(index);
		}
		return ciphertext;
	}
	
	public String decrypt(String ciphertext)
	{
		String plaintext = "";
		
		for(int i=0; i<ciphertext.length(); i++) {
			int index = key.indexOf(ciphertext.charAt(i));
			plaintext += ALPHABET.charAt(index);
		}
		return plaintext;
	}
	
	public static void main(String [] args)
	{
		Coder [] coders = new Coder[3];
		coders[0] = new SubstitutionCoder("Hakuna Matata: it means no worries!");
		coders[1] = new ArrayCoder();
		coders[2] = new SubstitutionCoder("Beam me up Scottie");
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
