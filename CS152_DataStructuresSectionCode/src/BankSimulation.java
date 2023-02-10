import java.util.*;
import java.util.LinkedList;

public class BankSimulation {
	public static int numCustomers = 30;
	public static int numTellers = 3;
	public static int duration = 60;
	public static int maxTransactionTime = 10;
	
	public static void main(String[] args) {
		PriorityQueue<Event> pq = new PriorityQueue<>();
		Queue<Event> queue = new LinkedList<>();
		Teller [] tellers = new Teller[numTellers];
		for(int i = 0; i < numTellers; i++)
//			tellers[i] = new Teller(queue);
			tellers[i] = new Teller(new LinkedList<>());	
		Random rnd = new Random();
		rnd.setSeed(123);

		for(int i = 0; i < numCustomers; i++) {
			int time = rnd.nextInt(duration + 1);
			int transactionTime = rnd.nextInt(maxTransactionTime) + 1;
			pq.add(new Event(i, -1, transactionTime, Event.ARRIVAL, time));
		}
		
		int totalWaitTime = 0;
		while(!pq.isEmpty()) {
			Event e = pq.poll();
			int currt = e.time;
			if(e.type == Event.ARRIVAL) {
				System.out.println("Custiomer " + e.custID + " arrives at " + currt);
				boolean served = false;
				for(int i = 0; i < numTellers; i++) {
					if(tellers[i].isFree) {
						tellers[i].isFree = false;
						served = true;
						pq.add(new Event(e.custID, i, e.transactionLength, Event.END_TRANSACTION, currt+e.transactionLength));
						System.out.println("   Served be teller " + i);
						break;
					}
				}
				if(!served) {
					int minIndex = 0;
					for(int i = 1; i < numTellers; i++) {
						if(tellers[i].q.size() < tellers[minIndex].q.size()) {
							minIndex = i;
						}
					}
					tellers[minIndex].q.add(e);
					System.out.println("     Gets in line" + minIndex);
				}
			}
			else {
				if(!tellers[e.tellerID].q.isEmpty()) {
					Event removed = tellers[e.tellerID].q.remove();
					pq.add(new Event(removed.custID, e.tellerID, removed.transactionLength, Event.END_TRANSACTION, currt + removed.transactionLength));
					totalWaitTime += currt - removed.time;
					System.out.println("Teller " + e.tellerID + " serves customer " + removed.custID + " off of que at time " + currt);
					System.out.println(" Customer wait time = " + (currt - removed.time));
				}
				else {
					tellers[e.tellerID].isFree = true;
					System.out.println("Teller " + e.tellerID + " goes idle at time " + currt);
				}
			}
		}
		System.out.println("Average wait time: " + (double)totalWaitTime/numCustomers);
	}
	
class Teller {
	public boolean isFree;
	public Queue<Event> q;
		
	public Teller(Queue<Event> q) {
		this.q = q;
		isFree = true;
	}
}
	
class Event implements Comparable<Event> {
	public static final int ARRIVAL = 0;
	public static final int END_TRANSACTION = 1;
	
	public int custID;
	public int tellerID;
	public int transactionLength;
	public int type;
	public int time;
	
	public Event(int custID, int tellerID, int transactionLength, int type, int time) {
		this.custID = custID;
		this.tellerID = tellerID;
		this.transactionLength = transactionLength;
		this.type = type;
		this.time = time;
	}
	
	public int compareTo(Event other ) {
		return time - other.time;
	}
}}
