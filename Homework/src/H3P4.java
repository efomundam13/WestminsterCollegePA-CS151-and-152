
public class H3P4 {

	public static void main(String[] args) {
	
	String s = "IloveWestminster";

	s.length();
	
	s.substring(s.length()/2);
	
		s.substring(0, 3);
		s.substring(4, 7);
		s.substring(8, 11);
		s.substring(12,15);
		
		String a = s.substring(0, 4);
		String b = s.substring(4, 8);
		String c = s.substring(8, 12);
		String d = s.substring(12,16);
		
		String news = b + " " + a + " " +  d + " " + c;
		System.out.print(news);
		
	}

}
