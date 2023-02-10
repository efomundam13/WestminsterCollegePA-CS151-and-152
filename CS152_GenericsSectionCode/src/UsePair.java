
public class UsePair {

	public static void main(String[] args) {
		Pair<Integer> pint1 = new Pair<>(7,3);
		Pair<Integer> pint2 = new Pair<>(3,7);
		
		if(pint1.equals(pint2))
			System.out.println("pint1 and pint2 are equal");
		else
			System.out.println("pint1 and pint2 are not equal");
		
		UnorderedPair<Integer> upint1 = new UnorderedPair<>(7,3);
		UnorderedPair<Integer> upint2 = new UnorderedPair<>(3,7);
		
		if(upint1.equals(upint2))
			System.out.println("upint1 and upint2 are equal");
		else
			System.out.println("upint1 and upint2 are not equal");
		
		Pair pint3 = new Pair(4,13);
	
		int i = pint1.getFirst();
		//String s = pint1.getFirst();
		
		i = (Integer) pint3.getFirst();
		String s = (String) pint3.getFirst();
	}

}
