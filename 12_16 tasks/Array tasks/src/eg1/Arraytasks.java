package eg1;

import java.util.Arrays;

public class Arraytasks {

	public static void main(String[] args) {
		
		int ar1[]= {1,2,3,4,5,6,7,8,9};
		
		//prints array in reverse order
		for (int i = ar1.length-1; i >= 0; i--) {
			System.out.print(ar1[i] +" ");
		}
		System.out.println();
		
		
		//deletes specific element from an array
		int ar2[]= {10,11,12,13,14,15,16,17,18,19};
		int num=11;
		int count=0;
		
		for (int i = 0; i < ar2.length; i++) {
			if(num==ar2[i]) { 
				ar2[i]=0;
				count++;
			}
		}
		for (int j = count; j < ar2.length-1; j++) {
			ar2[j]=ar2[j+1];
		}
		
		System.out.println(Arrays.toString(ar2));
		
	}

}
