
public class Opish {
													//determines if it's a consonant or not
	private static boolean isConsonant(char c) {
		boolean consonant;
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
			consonant = false;
			System.out.println("no");
		}
		else {
			consonant = true;
			System.out.println("yes");
		}
		return consonant;
		}
												//sets the phrase and adds op to all consonants													//his return the Opish version of whatever phrase was given to the object
	public String setPhrase(String s) {
		int i;
		boolean c;
		for (i=0; i<s.length(); i++) {
			c = isConsonant(s.charAt(i));
			
			if (c == false) {
				String d = s.substring(i,s.length());
	            System.out.println(d);
	            String a = s.substring(0,i);
	            System.out.println(a);
	            return (d + a + "ay");
			}
			}
			return s;
			}
												//This return the Opish version of whatever phrase was given to the object.
	public static String getOpish(String s) {
	 int i; 
	 boolean c;
	    for (i = 0; i<s.length(); i++){
	        c = isConsonant(s.charAt(i));
	        if (c == true)  {
	            String front = s.substring(0,i+1);
	            String back = s.substring(i+1,s.length());
	            s =  front + "op" + back ;
	            i=i+3;
	            System.out.println("s " + s);
	        }
	    }
		return s;
}
}
