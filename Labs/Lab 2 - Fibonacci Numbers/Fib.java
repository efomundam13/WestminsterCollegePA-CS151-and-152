import java.util.*;

public class Fib {
	
	class TwoFib {
		
		public long fibCurr, fibPrev;
			
		public TwoFib(long fibCurr, long fibPrev) {
			this.fibCurr = fibCurr;
			this.fibPrev = fibPrev;
			}
		}

	public static long fib1(int n)
	{
		if (n == 0) {
			return 1;
		}
		else if (n == 1) {
			return 1;
		}
		else {
			return fib1(n-1) + fib1(n-2);
			}
		}
	
	public static TwoFib fib2(int n) {
		if (n <= 1) {
			return new TwoFib(n, n - 1);
		}
		else {
			TwoFib tmp = fib2(n-1);
			return new TwoFib(tmp.fibCurr + tmp.fibPrev, tmp.fibCurr);	
		}
}

	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		int n;

		System.out.print("Enter a value for n --> ");
		n = in.nextInt();
		while (n >= 0) {
			System.out.println(n + "! = " + fib1(n));
			System.out.println(n + "! = " + fib2(n).fibCurr);
			System.out.print("Enter a value for n --> ");
			n = in.nextInt();			
		}
	}
	
}
