
public class SortedList <T extends Comparable> {

	T item;
	SortedList<T> nextItem;
	SortedList<T> firstItem;
	SortedList<T> lastItem;
	
	SortedList(T object) {
		this(object, null);
	}
	
	public SortedList(T object, SortedList<T> Item2) {
		item = object;
		nextItem = Item2;
	}
	
	T get(int i) {
		return item;
	}
	
	SortedList<T> getNext() {
		return nextItem;
	}
	
	void makeEmpty() {
		System.out.print("List: ");
	}

	boolean isEmpty() {
		return firstItem == null;
	}
	
	int size () {
		int count = 0;
		int size;
		return count;
	}
	
	void add(T item) {
		if(isEmpty() == true) {
			firstItem = lastItem = new SortedList<T>(item);
		}
		else {
			firstItem = new SortedList<T>(item, firstItem);
		}	
	}
	
	int find(T item) {
		int loc = 0;
		if(item.compareTo(nextItem) < 0) {
			return loc;
		}
		else {
			return -1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
