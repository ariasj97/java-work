package eg2;


import java.util.Scanner;

public class Arraytasks3 {
	
	public static void main(String[] args) {
		int size;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements in array");
		size=s.nextInt();
		
		int ar[]= new int [size] ;
		
		//input from user
		System.out.println("Enter the elements");
		for (int i = 0; i < size; i++) {
			ar[i]=s.nextInt();
		}
		
		
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]==palindromeCheck(ar[i])) {
				System.out.println(ar[i]+" is a palindrome");
			}else {
				System.out.println(ar[i]+" is not a palindrome");
			}
		}
		
		
		
	}
	
	//method that uses recursion 
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
