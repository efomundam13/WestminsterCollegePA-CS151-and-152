/**Programmer: Manny Fomundam
	 * Homework 4: Problem 5
	 * Date: 3/29/2022
	 * Use an inner class PQElement to create objects
that bundles the items and their priorities together. 
	 **/

import java.util.*;

public class HW4P5 {
	
	private class Item {
		public Object value;
		public int priority;
		
	public Item(Object obj, int pr) {
		value = obj;
		priority = pr;
		}
	}

		private int mySize;
		private ArrayList<Item> myList;

	public void PriorityQueue() {
		myList = new ArrayList<Item>(32);
		mySize = 0;
		}

	public boolean add(Object object, int priority) {
		Item item = new Item(object, priority);
		int i;
		for(i = 0; i < mySize; i++) {
			if(myList.get(i).priority < priority) {
				break;
				}
			}
		myList.add(i, item);
		mySize++;
		return true;
	}

	public Object remove() {
		if (mySize != 0) {
			Item hold = myList.get(0);
			myList.remove(0); // pop last off
			mySize--;
			return hold.value;
			}
		return null;
		}

	public static void main(String args[]) {
		PriorityQueue pq = new PriorityQueue();
		pq.add("X");
		pq.add("Y");
		pq.add("Z");
		
		System.out.println(pq.remove()); 
		System.out.println(pq.remove()); 
		System.out.println(pq.remove());
		}
	}
