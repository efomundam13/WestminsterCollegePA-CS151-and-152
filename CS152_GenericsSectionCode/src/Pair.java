
public class Pair<T> {
	
	protected T first;
	protected T second;
		
		public Pair() {
		first = second = null;
	}
		
		public Pair(T val1, T val2) {
			first = val1;
			second = val2;
		}
		
		public T getFirst() {
			return first;
		}
		
		public T getSecond() {
			return second;
		}
		
		public void setFirst(T val) {
			first = val;
		}
		
		public void setSecond(T val) {
			second = val;
		}
		
		public String toString() {
			return "[" + first + "," + second+ "]";
		}

		public boolean equals(Object other) {
			if (other == null)
				return false;
			else if(getClass() != other.getClass())
				return false;
			else {
				Pair<T> otherPair = (Pair<T>) other;
				return (first.equals(otherPair.first) && second.equals(otherPair.second));
			}
		}
			
		public static void main(String [] args) {
			Pair<Integer> location = new Pair<>(4, 6);
			Pair<String> team = new Pair<>("Mike" , "Steel");
			System.out.println(location);
			System.out.println(team);
		}
}
