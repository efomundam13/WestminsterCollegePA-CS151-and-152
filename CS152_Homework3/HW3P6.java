
/**Programmer: Manny Fomundam
	 * Homework 3: Problem 6
	 * Date: 2/28/2022
	 * 6.) Write numSubstring(int [] a, int [] b) which returns the number of times b appears as
		   a substring of a
	 **/

public class HW3P6 {
	public static int numSubstring(int [] a, int [] b) {
		int ans = 1;
		
		int [] tmp = b;
		
		while(tmp.length < a.length)	{
			tmp.equals(b);
			ans++;
		}
		
		if (numSubstring(a, tmp) == 0) {
			return ans;
		}
		if (numSubstring(a, tmp) != 0) {
	        return ans + 1;
	    }
	    return -1;
	    }
	}

