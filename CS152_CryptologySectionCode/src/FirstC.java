
public class FirstC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		KeyCoder s = new PlayfairCoder();
//		s.setKey("To be, or not to be: that is the question:");
//		String enc = s.encrypt("Trouble at base");
//		System.out.println(s.decrypt(enc));
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
