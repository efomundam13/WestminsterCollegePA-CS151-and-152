
/**Programmer: Manny Fomundam
	 * Homework 3: Problem 1a and 1b
	 * Date: 2/28/2022
	 * 1a.) Modify this routine so that it returns the maximum value in an array of Comparables
	 * 1b.) Modify this routine so that it returns the index of the maximum value.
	 * 2.) A recursive method that returns the number of 1s in the binary representation
		   of N. Use the fact that this number equals the number of 1s in the representation
		   of N/2, plus 1 if N is odd.
	 * 3.) A recursive function string reverse(string s) which uses a divide and conquer approach.
	 * 4.) A recursive method to determine if a given string is a palindrome
	 * 7a.) Checks to see which half of the array x may lie in: either from low to mid or from
			mid + 1 to high. Then make a recursive call on that half of the array
	 * 7b.)	Only when we are down to a base case of an array subsection of length 1 to we finally
			perform an equality check on x. If x is equal to the single value in this subsection we
			return its index; otherwise we return -1.
	 **/

public class HW3P1 {
//1a).
	public static Object findMaxValue(Comparable [] a, int n) {
		Comparable maxVal = a[0];
        for(int i = 0; i < n; i++)	{
            if(maxVal.compareTo(a[i]) < 0)	{
            	maxVal = a[i];
            }
        }
        return maxVal;
        }
	
//1b).
	public static Object findIndexOfMaxValue(Comparable [] a, int n) {
		Comparable maxVal = a[0];
		int indexOfMaxValue = 0;
		for(int i = 0; i < n; i++)	{
			if(maxVal.compareTo(a[i]) < 0)	{
                maxVal = a[i];
                indexOfMaxValue = i;
                }
			}
		return indexOfMaxValue;
		}
	
//2.)
	public static int binaryCountOnes(int count) {
		if (count == 0)	{
			return 0;
		}
		else if(count == 1) {
			return 1;
		}
		else {
			return binaryCountOnes(count / 2) + binaryCountOnes(count % 2);
		}
	}
	
//3.)	
	public static String reverse(String s, int b, int e) {
		String divAndConq = null;
		if(b == e)	{
			divAndConq = s.charAt(b) + "";
			return divAndConq;
		}
		else if(b == e - 1)	{
			divAndConq = s.charAt(e) + "" + s.charAt(b);
			return divAndConq;
		}
		String leftInReverse = reverse(s, b, (b + e)/2);
		String rightInReverse = reverse(s, ((b + e ) / 2) + 1 ,e);
		divAndConq = rightInReverse + leftInReverse;
		return divAndConq;
		}

//4.)
	public static boolean isPalindrome(String s) {
		if(s.length() == 0 || s.length() == 1)
			return true;
		 if(s.charAt(0) == s.charAt(s.length()-1))
			 return isPalindrome(s.substring(s.length() - 1));
		 return false;
		 }
	
//7a.) 
	public static int binarySearch(int [] a, int low, int high, int x) {
	    if (low > high) {
	        return -1;
	    }
	    int mid = (high + low) / 2;
	    if (x == a[mid]) {
	        return mid;
	    }
	    else if (x < a[mid]) {
	        return binarySearch(a, low,  mid - 1, x);
	    }
	    else {
	        return binarySearch(a, mid + 1,  high, x);
	    }
	}
	
//7b.)
	public static int binarySearch(int [] a, int x) {
        int low = 0;
        int high = a.length - 1;
		while (low <= high)	{
			int mid = (low + high) / 2;
			if (x == a[mid]) {
				return mid;
			}
			else if (x < a[mid]) {
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		return -1;
		}
	}
