package eg2;

import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueueTasks {

	public static void main(String[] args) {
		//Priority Queue implements the Queue interface which extends the Collection interface 
		//so all the methods that are used on the last be used on this one
		
		//If I add elements to the queue now and want to print them, they will be removed in the order that I put them in.
		//A custom comparator will print the shortest name first
		Comparator<String> stringLengthComparator = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.length() - o2.length();
			}	
		};
		
		//New Priority Queue with stringLengthComparator as Comparator
		PriorityQueue<String> pq1 = new PriorityQueue<>(stringLengthComparator);
		
		pq1.add("Jason");
		pq1.add("Andrew");
		pq1.add("Tom");
		pq1.add("Tyler");
		pq1.add("Ashely");
		
		while (!pq1.isEmpty()) {
			System.out.println(pq1.remove());
		}
		
	}

}
