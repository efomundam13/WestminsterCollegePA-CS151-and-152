
public abstract class Coder {

	public abstract String encrypt(String s);
	
	public abstract String decrypt(String s);
	
	public String justLetters(String s)
	{
		s = s.toUpperCase();
		String news = "";
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isLetter(ch))
				news += ch;
		}
		return news;
	}
}
