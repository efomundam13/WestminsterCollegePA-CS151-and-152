/**Programmer: Manny Fomundam
	 * Homework 4: Problem 3
	 * Date: 3/29/2022
	 * Write a compareTo method for this class which first compares the first
elements of both objects and only when they are equal does it compare the second elements.
	 **/

public class PAIR <T extends Comparable> {
	
	protected T first;
	protected T second;
		
		public PAIR() {
		first = second = null;
	}
		
		public PAIR(T val1, T val2) {
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
				PAIR<T> otherPair = (PAIR<T>) other;
				return (first.equals(otherPair.first) && second.equals(otherPair.second));
			}
		}

	
	public boolean compareTo(PAIR<T> object) {
		if(first.equals(object.getFirst())) {
			if(second.equals(object.getSecond())) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
}
