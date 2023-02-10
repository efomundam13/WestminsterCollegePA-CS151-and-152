/** Manny Fomundam
	 * 11/25/2021
	 * HW 8: 2D Array
	 * Using arrays to find even locations, occurances, etc
	 */

public class H8 {

	public static int addEvenLocations(int [] arr) {
		int count = 0;
		int [] result = new int[count];
		for(int position = 0; position < arr.length; position++) {
			if(arr[position]%2 == 0) {
				result[count] = arr[position];
				count += position;
			}
		}
		return count;
	}

	public static int numOccurances(int [] arr, int val) {
		int result = 0;
		for (int i=0; i<val; i++) {
			if (val == arr[i])
				result++;
		}
		return result;
	}
	
	public static int diff(int [] arr, int size) {
		int diff = arr[1] - arr[0];
		int i, j;
		for (i=0; i < size; i++) {
			for (j = i + 1; j < size; j++) {
				if (arr[j]-arr[i] > diff)
					diff = arr[j] - arr[i];
			}
		}
				return diff;
	}
	
	public static int[] arrayAdd(int [] arr1, int [] arr2) {		
		int[] arr3 = new int[(int) (Math.max(arr1.length, arr2.length))];
		int j;
		for(int i=0; i < arr3.length; i++) {
			for (j = i + 1; j < arr3.length; j++) {
			if (arr1.length > i) {
				arr3[i] += arr1[i];
			}
			if (arr2.length > i) {
				arr3[i] += arr2[i];
			}
		}
	}
	return arr3;
}
	
	public static void shiftLeft(int [] arr) {
		for (int j = 0; j < arr.length; j++) {
			int a = arr[0];
			int i;
			for (i = 0; i < arr.length - 1; i++)
				arr[i] = arr[i + 1];
			arr[i] = a;
		}
	}
	
	public static int[] shiftLeft2(int [] arr) {
		for (int j = 0; j < arr.length; j++) {
			int a = arr[0];
			int i;
			for (i = 0; i < arr.length - 2; i++)
				arr[i] = arr[i + 1];
			arr[i] = a;
			}
		return arr;
		}

	}