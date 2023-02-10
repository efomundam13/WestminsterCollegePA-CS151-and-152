
public class SimpleClassExamples {

	public static void main(String[] args) {
/*		
		System.out.println(Math.sin(90*Math.PI/180.0));
		
		String s = "1234";
		int val = Integer.parseInt(s) + 1;
		System.out.println(val);
		System.out.println(Integer.MAX_VALUE + " " + Long.MAX_VALUE);
		
		System.out.println(Character.toUpperCase('p'));
*/
		int age = 50;
		String name = "Irving Botchwell";
		System.out.printf("My name is %20s and I am %5d years old\n", name, age);
		System.out.printf("My name is %-20s and I am %-5d years old\n", name, age);
	}

}
