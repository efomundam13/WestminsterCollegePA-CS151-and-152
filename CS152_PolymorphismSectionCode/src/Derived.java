
public class Derived extends StaticBindingExample {
	public static void print_static()
	{
		System.out.println("Static print, derived class");
	}
	
	public void print()
	{
		System.out.println("Non-static print, derived class");
	}
	
	public void doit()
	{
		for(int i = 1; i < 10000; i++)
			;
		// end for
	}
}
