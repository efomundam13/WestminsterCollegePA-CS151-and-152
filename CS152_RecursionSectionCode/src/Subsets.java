
public class Subsets {

	public static void main(String [] args) {
		int [] arr = {3,7,12,56,-1,123};
		
		printSubsets(arr);
	}
	public static void printSubsets(int [] a) {
		boolean [] inSet = new boolean[a.length];
		printSubsets(a, inSet, 0);
	}
	
	public static void printSubsets(int [] a, boolean [] inSet, int level) {
		if(level == a.length) {
			System.out.print("{");
			int i = 0;
			while (i < inSet.length && !inSet[i])
				i++;
			if (i < inSet.length) {
				System.out.print(a[i]);
				i++;
				for(; i < inSet.length; i++) {
					if ( inSet[i])
						System.out.print("," + a[i]);
				}
				System.out.println("}");
		}
		}
		else {
			inSet[level] = false;
			printSubsets(a, inSet, level + 1);
			inSet[level] = true;
			printSubsets(a, inSet, level + 1);
		}
	}

}
