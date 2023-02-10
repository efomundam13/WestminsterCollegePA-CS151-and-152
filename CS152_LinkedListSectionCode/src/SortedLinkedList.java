
public class SortedLinkedList<T extends Comparable> extends LinkedList {
	
	public SortedLinkedList() {
		super();
	}

	public void add(int index, T val) {
		throw new UnsupportedOperationException("add(int, T)");
	}
	
	public void set(int index, T val) {
		throw new UnsupportedOperationException("set(int, T)");
	}
	
	public void add(T val) {
		Node p = head;
		while(p.next != null && val.compareTo(p.next.value) >= 0);
			p = p.next;
			p.next = new Node(val, p.next);
		numNodes++;
	}
	
	public static void main(String[] args) {
		SortedLinkedList<String> list = new SortedLinkedList<>();
		
		list.add("Elizabeth");
		list.add("Lucas");
		list.add("Asia");
		list.add("Ian");
		System.out.println(list);
		list.remove("Elizabeth");
		System.out.println(list);
		list.add(0,"Mike");
		
	}

}
