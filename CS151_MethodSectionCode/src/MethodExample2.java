/*
 * MethodExample2 - demonstrates the creation and use of a static method with parameters and return value
 * 
 * Programmer: John Bonomo
 *       Date: 10/17/21
 */
public class MethodExample2 {

	public static void main(String [] args)
	{
	int n = 4;
	String s = "hello";
	String t = repeatString(n, s);								// here the values of n and s are copied
	System.out.println(t);										//      to the parameters nTimes and s -+ 
	System.out.println(repeatString(2, "Walla"));				// here 2 and "Walla" are copied		|
	}															//    to nTimes and s --+				|
																//						|				|
	public static String repeatString(int nTimes, String s)		// <------------------------------------+
	/*
	 * repeatString - returns a string which repeats <s> <nTimes> times
	 * 
	 * nTimes - number of times to repeat the string
	 * s - the string to repeat
	 */
	{
	String ans = "";
	for (int i=1; i<=nTimes; i++) 
	   ans += s;
	return ans;
	}

}
