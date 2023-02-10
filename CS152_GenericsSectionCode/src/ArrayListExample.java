
import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> classList = new ArrayList<>();

		classList.add("Mike");
		classList.add("Ian");
		classList.add("Asia");
		classList.add(1, "Elizabeth");
		classList.add("Manny");
		classList.add("Lucas");
		System.out.println(classList.size());
		System.out.println(classList);
		classList.set(2, "Loren");
		System.out.println();
		System.out.println(classList);
		
		String s = classList.remove(0);
		System.out.println(s + " is removed");
		System.out.println(classList);
		if(classList.remove("Loren"))
			System.out.println("remove was successful");
		else
			System.out.println("remove was not successful");
			
	}

}
