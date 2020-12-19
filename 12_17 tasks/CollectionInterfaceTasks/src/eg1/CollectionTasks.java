package eg1;

import java.util.LinkedList;
import java.util.Queue;

public class CollectionTasks {

	public static void main(String[] args) {
		//Explore Queue Interface and try implementing Queue using LinkedList and PriorityQueue, and get the difference between them
		
		//adding someone to the queue
		Queue<String> bankLine = new LinkedList<String>();
		
		bankLine.add("John");
		bankLine.add("James");
		bankLine.add("Connor");
		bankLine.add("Rebecca");
		bankLine.add("Gabby");
		bankLine.add("Andrew");
		
		System.out.println(bankLine);
		System.out.println();
		
		//removing the first person from the queue
		bankLine.poll();
		System.out.println(bankLine);
		System.out.println();
		
		//check to see who is next in the queue
		System.out.println(bankLine.peek());
		System.out.println();
		
		//check to if Tim is in the Queue
		if(bankLine.contains("Connor")==true) 
			System.out.println("This person is in the Queue");
		else 
			System.out.println("This person is not in the Que");
	
		System.out.println();
		
		//Queue does not have access to a specific value, but you can turn it into an array and access a value that way
		System.out.println(bankLine.toArray()[4]);
		
		
		
	}
}