import java.util.Scanner;

public class FibInner {

	private class TwoFib {
		private long fcurr, fprev;
		
		public TwoFib(long f1, long f2) {
			fcurr = f1;
			fprev = f2;
		}
	}
	
	private TwoFib fib_rec(int n) {
		if (n <= 1) {
			return new TwoFib(1,1);
		}	
		else {
			TwoFib ans = fib_rec(n-1);
			return new TwoFib(ans.fcurr + ans.fprev, ans.fcurr);
		}
	}
	
	public long fib(int n) {
		TwoFib ans = fib_rec(n);
		return ans.fcurr;
	}
	public static void main(String[] args) {
		
		int n;
		Scanner in = new Scanner(System.in);
		FibInner f = new FibInner();
		
		System.out.print("Enter a interger -->");
		n = in.nextInt();
		while (n >= 0) {
			System.out.println("f(" + n + ") = " + f.fib(n));
			System.out.print("Enter a interger -->");
			n = in.nextInt();
		}
	}

}
