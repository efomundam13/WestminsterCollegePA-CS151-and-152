
public class H9 {

	static boolean isSquare(int[][] a) {
		int temp = 0;
		boolean val = false;
		for(int i = 0;i<a.length;i++) {
			if (a[i].length == a.length) {
				temp++;
				}
			}
		if (temp == a.length) {
			val = true;
		}
			return val;
		}
	
	static int max(int[][] a) {
		int max = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] > max) {
					max = a[i][j];
				}
			}
		}

		return max;
	}
	
	static int[][] rowSort() {
		int i, j, k;
		int row = 0;
		int col = 0;
		int[][] arr = null;
		
		for(i = 0; i < row; i++) {
			int temp = 0;
		for(j = 0; j < col; j++) {
			for(k=1; k < (col-1); k++) {
				if(arr[1][k-1] > arr[i][k]){
					temp = arr[i][k-1];
					arr[i][k-1] = arr[i][k];
					arr[i][k] = temp;
				}
			}
		}
	}
		return arr;
}

	
	static int[][] colSort() {
		int i, j, k;
		int row = 0;
		int col = 0;
		int[][] arr = null;
		
		for(i = 0; i < col; i++) {
			int temp = 0;
		for(j = 0; j < row; j++) {
			for(k=1; k < (row-1); k++) {
				if(arr[1][k-1] > arr[i][k]){
					temp = arr[i][k-1];
					arr[i][k-1] = arr[i][k];
					arr[i][k] = temp;
				}
			}
		}
	}
		return arr;
}
	
	static boolean isMagic(int[][] grid) {
		int b= 0,c=0;
		for (int i = 0; i <grid.length; i++)
			b = b + grid[i][i];
		for (int i = 0; i < grid.length; i++)
			c = c + grid[i][grid.length-1-i];
		if(b!=c)
			return false;
		for (int i = 0; i < grid.length; i++) {
			int row = 0;
				for (int j = 0; j < grid.length; j++)
					row =row + grid[i][j];
				if (row!= b)
					return false;
		}
		for (int i = 0; i < grid.length; i++) {
			int col = 0;
		for (int j = 0; j < grid.length; j++)
			col=col + grid[j][i];
		if (b != col)
			return false;
		}
			return true;
		}
	}
