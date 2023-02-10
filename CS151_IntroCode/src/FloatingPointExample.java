
public class FloatingPointExample {

	public static void main(String [] args)
	{
		int n = 2;
		double d = Math.sqrt(n);
		System.out.println(d);
		System.out.println(d*d);
		d = 1.0/6.0;
		System.out.println(d+d+d+d+d+d);
		d = 2.0/0.0;
		System.out.println(d/d);
		System.out.println(1.0/d);
	}
}
