package eg1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListsTasks {

	public static void main(String[] args) {
		
		List<Integer> li1=new ArrayList<>();
		li1.add(1324);
		li1.add(2432);
		li1.add(3467);
		li1.add(4367);
		li1.add(5345);
		li1.add(63246);
		li1.add(743);
		li1.add(812);
		li1.add(963);
		li1.add(1013);
		
		
		//prints array in reverse order
		System.out.println("Printing in reverse order:");
		for (int i = li1.size()-1; i > 0; i--) {
			System.out.println(li1.get(i)+" ");
		}
			
		//deletes specific element from an array
		System.out.println("li1 before deletion:");
		System.out.println("li1 ="+li1);
		int num = 2432;
		
		for (int j = 0; j < li1.size(); j++) {
			if (num == li1.get(j)) {
				li1.remove(j);
			}
		}
		System.out.println("li1 after deletion:");
		System.out.println("li1 ="+li1);
		System.out.println();
		
		//sorting one list into odd list and even list
	
		List<Integer> li2=new ArrayList<>();
		List<Integer> oddList=new ArrayList<>();
		List<Integer> evenList=new ArrayList<>();
		
		for (int k = 1; k <= 20; k++) {
			li2.add(k);
			}
		for (int m = 0; m < li2.size(); m++) {
			if(li2.get(m)%2!=0) 
				oddList.add(li2.get(m));
			else
				evenList.add(li2.get(m));
		}
		System.out.println("li2 ="+li2);
		System.out.println("oddList ="+oddList);
		System.out.println("evenList ="+evenList);
		System.out.println();
		
		//sorting and finding the min and max of these lists
		Collections.sort(oddList);
		Collections.sort(evenList);
		
		System.out.println("The max number in oddLists is: "+oddList.get(oddList.size()-1));
		System.out.println("The max number in evenLists is: "+evenList.get(evenList.size()-1));
		System.out.println("The min number in oddLists is: "+oddList.get(0));
		System.out.println("The min number in evenLists is: "+evenList.get(0));
	
		//checking if list is palindrome
		List<Integer> li3=new ArrayList<>();
		li3.add(1111);
		li3.add(1234);
		li3.add(1110);
		li3.add(1001);
		
		
		for (int w = 0; w < li3.size(); w++) {
			if(li3.get(w)==palindromeCheck(li3.get(w)))  
				System.out.println(li3.get(w)+" is a palindrome");
			else 
				System.out.println(li3.get(w)+" is not a palindrome");
		}
		
		
		
	}

		
	public static int palindromeCheck(int n) {
			int reverse = 0;
			
			while(n > 0) {
				int remainder = n % 10;
				reverse = reverse * 10 + remainder;
				n = n/10;
			}
			
			return reverse;
	}	
		
}
		



