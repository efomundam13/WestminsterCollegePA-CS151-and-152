
public class StaticBindingExample {
	
	public static void print_static()
	{
		System.out.println("Static print, base class");
	}
	
	public void print()
	{
		System.out.println("Non-Static print, base class");
	}
	
	public void doit()
	{
		for(int i = 1; i < 10000; i++)
			;
		// end for
	}
	
	public static void doit_static()
	{
		for(int i = 1; i < 10000; i++)
			;
		// end for
	}
	public static void main(String[] args) {
		
		StaticBindingExample obj1 = new StaticBindingExample();
		Derived obj2 = new Derived();
		
		obj1.print_static();
		obj1.print();
		
		System.out.println();
		
		obj2.print_static();
		obj2.print();
		
		StaticBindingExample obj3 = obj2;
		
		System.out.println();
		
		obj3.print_static();
		obj3.print();
		
		
		long start = System.nanoTime();
		
		for(int i = 0; i < 10000; i++)
			obj2.doit();
		// end for
		
		long end = System.nanoTime();
		
		System.out.println("late binding time = " + (end - start) / 1000000000.0);
		
		start = System.nanoTime();
		
		for(int i = 0; i < 10000; i++)
			obj2.doit_static();
		// end for
		
		end = System.nanoTime();
		
		System.out.println("early binding time = " + (end - start) / 1000000000.0);
	}

}