package eg1;

import java.util.Arrays;
import java.util.Scanner;
public class Arraytasks2 {

	public static void main(String[] args) {
		int size;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements in array");
		size=s.nextInt();
		
		int ar1[]= new int [size] ;
		int evenAr[] = new int [size] ;
		int oddAr[] =new int [size] ;
		
		//input from user
		System.out.println("Enter the elements");
		for (int i = 0; i < size; i++) {
			ar1[i]=s.nextInt();
		}
		
		//distinguish from odd and even
		for (int j = 0; j < size; j++) {
			if(ar1[j] % 2 !=0) { 
				oddAr[j]=ar1[j];
			}else {
				evenAr[j]=ar1[j];
			}
		}
		
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(oddAr));
		System.out.println(Arrays.toString(evenAr));
		
		//Finds the sum of odd array and even array
		int oddSum = 0, evenSum = 0;
		
		for (int k = 0; k < size; k++) {
			oddSum += oddAr[k];
			evenSum += evenAr[k];
		}
		System.out.println("Odd sum = "+oddSum);
		System.out.println("Even sum = "+evenSum);
		
		
		//Finds the min and max of odd and even arrays
		
	
		int evenMin = evenAr[0], oddMin = oddAr[0];
		
		//sort both arrays from least to most
		Arrays.sort(evenAr);
		Arrays.sort(oddAr);
		
		
		//make sure that 0 is not the least
		for (int z = 0; z < size; z++) {
			if(evenAr[z]!=0 ) {
				evenMin = evenAr[z];
				break;
			}
		}
		for (int y = 0; y < oddAr.length; y++) {
			if(oddAr[y]!=0 ) {
				oddMin = oddAr[y];
				break;
			}
		}
			
		
		//max is always the last element
		System.out.println("Even Max number: "+evenAr[size-1]);
		System.out.println("Odd Max number: "+oddAr[size-1]);
		
		System.out.println("Even Min number: "+evenMin);
		System.out.println("Odd min number: "+oddMin);
		
		
	}

}
