
/**Programmer: Manny Fomundam
	 * Homework 3: Problem 5a and 5b
	 * Date: 2/28/2022
	 * 5a.) A non-recursive routine void spiralFill(int [][] a, int n) and performs a
			spiral fill in the first n rows and columns.
	 * 5b.) Devise a recursive routine to perform the spiral fill function.
	 **/

public class HW3P5 {
	
//5a.)
	public static void spiralFill(int [][] a, int n)	{
		int k = 0;
		 for(int i = 0; i < n/2; i++)	{
			 for(int j = i; j < n-i; j++) {
	               a[i][j] = k++;
			 }
			 for(int j = i+1; j < n-i-1; j++) {
	               a[j][n-i-1] = k++;
			 }
			 for(int j = n-i-1; j>=i ; j--) {
	               a[n-i-1][j] = k++;
			 }
			 for(int j = n-i-2; j>i; j--) {
	               a[j][i] = k++;
	               }
			 }
			 if(n % 2 != 0){
		           a[n/2][n/2] = k;
		           }
			 }
	
//5b.)
	public static void spiralFillRec(int [][] a, int startIndx, int endIndx, int startVal)	{
		if(startIndx == endIndx)
			return;
		if(startIndx > endIndx)	{
			a[startIndx][startIndx] = startVal;
			return;
		}
		for(int j = startIndx; j <= endIndx; j++) {
			a[startIndx][j] = startVal++;
		}
		for(int j = startIndx + 1; j < endIndx; j++) {
	        a[j][endIndx] = startVal++;
		}
		for(int j = endIndx; j >= startIndx; j--) {
	        a[endIndx][j]=startVal++;
		}
		for(int j = endIndx - 1; j > startIndx; j--) {
	        a[j][startIndx]=startVal++;
		}
		spiralFillRec(a, startIndx+1, endIndx-1, startVal);
		}
	}
