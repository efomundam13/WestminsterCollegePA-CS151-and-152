import java.util.*;

public class LinkedList<T> {

	protected class Node {
		public T value;
		public Node next;
		
		public Node(T value, Node next) {
			this.value = value;
			this.next = next;
		}
		
		public Node(T value) {
			this(value, null);
		}
		
		public Node() {
			this(null, null);
		}
		
		//#7a on hw
		public boolean contains(T val) {
			if(value.equals(val)) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	
	public class ListIterator {
		private Node curr;
		private Node prev;
		
		public ListIterator() {
			reset();
		}
		
		public void reset() {
			curr = head.next;
			prev = head;
		}
		
		public boolean hasNext() {
			return (curr != null);
		}
		
		public T next() {
			if(!hasNext())
				throw new NoSuchElementException();
			T retVal = curr.value;
			curr = curr.next;
			return retVal;
			}
		
		public void add(T val) {
			prev.next = new Node(val, curr);
			curr = prev.next;
			numNodes++;
		}
		
		public void set(T val) {
			if(!hasNext())
				throw new NoSuchElementException();
			curr.value = val;
		}
		
		public void remove() {
			if(!hasNext())
				throw new NoSuchElementException();
			prev.next = curr.next;
			curr = curr.next;
			numNodes--;
			}
		
		//#9 on hw
		public void moveTo(int i) {
			for(i = 0; i < size() - 1; i++) {
				moveTo(i);
				if(i < 0 || i > size()) {
					throw new IndexOutOfBoundsException();
					}
				}
			}
		}
	
	protected Node head;
	protected int numNodes;
	
	public LinkedList() {
		head = new Node();
		//numNodes = 0;
		clear();
	}
	
	public int size() {
		return numNodes;
	}
	
	public boolean isEmpty() {
		return (size() == 0);
	}
	
	public void clear() {
		head.next = null;
		numNodes = 0;
	}
	
	public void add(int index, T value) {
		if(index < 0 || index > size())
			throw new IndexOutOfBoundsException();
		Node p = head;
		for(int i = 0; i < index; i++)
			p = p.next;
		p.next = new Node(value, p.next);
		numNodes++;
	}
	
	public T get(int index) {
		if(index < 0 || index >= size())
			throw new IndexOutOfBoundsException();
		Node p = head.next;
		for(int i = 0; i < index; i++)
			p = p.next;
		return p.value;
	}
	
	public T set(int index, T value) {
		if(index < 0 || index >= size())
			throw new IndexOutOfBoundsException();
		Node p = head.next;
		for(int i = 0; i < index; i++)
			p = p.next;
		T oldValue = p.value;
		p.value = value;
		return oldValue;
	}
	
	public void add(T value) {
		add(size(), value);
	}
	public String toString() {
		if(size() == 0)
			return "";
		String ans = head.next.value + "";
		for(Node p = head.next.next; p != null; p = p.next)
			ans += ", " + p.value;
		return ans;
	}
	
	public int indexOf(T value) {
		int index = 0;
		for(Node p = head.next; p != null; p = p.next) {
			if(value.equals(p.value))
				return index;
			index++;
		}
		return -1;
	}
	
	public T remove(int index) {
		if (index < 0 || index >= size())
			throw new IndexOutOfBoundsException();
		Node p = head;
		for(int i = 0; i < index; i++)
			p = p.next;
		T retVal = p.next.value;
		p.next = p.next.next;
		numNodes--;
		return retVal;
	}
	
	public boolean remove(T value) {
		Node p = head;
		while(p.next.equals(null) && !p.next.value.equals(value))
			p = p.next;
		if(p.next == null)
			return false;
		else {
			p.next = p.next.next;
			numNodes--;
			return true;
		}
	}
	
	public ListIterator iterator() {
		return new ListIterator();
	}

	//#4 on hw
	public boolean equals(LinkedList<T> rhs) {
		Node curr1 = this.head;
		Node curr2 = rhs.head;
		if(curr1 == null && curr2 == null) {
			return true;
		}
		if(curr1 == null || curr2 == null) {
			return false;
		}
		
		while(!curr1.value.equals(curr2.value)) {
			if(!curr1.value.equals(curr2.value)) 
				return false;
			curr1 = curr1.next;
			curr2 = curr2.next;
			
			 if(curr1 != null || curr2 != null) {
				 return false;
			 }
			 }
		return true;
		}
	
	//#5 on hw
	public void printReverse(Node node) {
		if(node == null) {
			return;
		}
		
		printReverse(node.next);
		
		System.out.println(node.value + " ");
	}
	
	//#6 on hw
	public boolean removeLast(T val) {
		int index = 1, valIndex = -1;
		Node temp = head.next;
		while( temp != null) {
			if(temp.value.equals(val)) {
				valIndex = index;
			}
			temp = temp.next;
			index++;
		}
		if(valIndex == -1) {
			return false;
		}
		if(valIndex == 0) {
			head = head.next;
		}
		else {
			int k = 0;
			temp = head;
			while(k < valIndex - 1) {
				temp = temp.next;
				k++;
			}
			temp.next = temp.next.next;
			numNodes--;
			}
		return true;
		}
		
	//#3 on hw
	public void removeRange(int fromIndex, int toIndex) {
		if(fromIndex < 0 || fromIndex >= size() - 1) {
			throw new IndexOutOfBoundsException();
		}
		else if(toIndex < fromIndex || toIndex > size()) {
			throw new IndexOutOfBoundsException();
		}
	}
	
	//#8 on hw
	public int count(LinkedList<String> list, String val) {
		int count = 0;
		String value = null;
		if(value.equals(val)) {
			count = count + 1;
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		
		System.out.println("Size of list = " + list.size());
		if(list.isEmpty())
			System.out.println("List is empty");
		else
			System.out.println("List is not empty");
		
		list.add("Manny");
		list.add("Ian");
		list.add("Loren");
		list.add(1, "Steel");
/*	
		System.out.println("Size of list = " + list.size());
		if(list.isEmpty())
			System.out.println("List is empty");
		else
			System.out.println("List is not empty");
		System.out.println(list);
		
		for(int i = list.size() - 1; i >= 0; i--)
			System.out.println(list.get(i));
		
		String oldValue = list.set(2, "ELizabeth");
		System.out.println("Replaced " + oldValue + " with Elizabeth");
		System.out.println(list);
		System.out.println("Manny is at location " + list.indexOf("Manny"));
		System.out.println("Loren is at location " + list.indexOf("Loren"));
		System.out.println("Mike is at location " + list.indexOf("Mike"));
		
		list.remove(1);
		System.out.println(list);
		if(list.remove("Elizabeth"))
			System.out.println("Elizabeth removed from list");
		else
			System.out.println("Elizabeth was not in the list");
		if(list.remove("Asia"))
			System.out.println("Asia removed from list");
		else
			System.out.println("Asia was not in the list");
*/		
		list.add("Lucas");
		list.add("Ian");
		list.add(3, "Elizabeth");
		list.add("Asia");
		
		LinkedList<String>.ListIterator itr = list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
