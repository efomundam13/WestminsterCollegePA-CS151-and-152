
public class UnorderedPair <T> extends Pair<T> {

	public UnorderedPair() {
		super();
	}
	
	public UnorderedPair(T val1, T val2) {
		super(val1, val2);
	}
	
	public boolean equals(Object other) {
		if (other == null)
			return false;
		else if(getClass() != other.getClass())
			return false;
		else {
			UnorderedPair<T> otherPair = (UnorderedPair<T>) other;
			return (first.equals(otherPair.first) && second.equals(otherPair.second)) || (first.equals(otherPair.second) && second.equals(otherPair.first));
		}
	}
}
