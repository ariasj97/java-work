package eg2;

public class LoopDemos {

	public static void main(String[] args) {
		oddNumbers(50);
		System.out.println();
		fibSeq(10);
		System.out.println();
		palindromeTest("level");
}
		

// method that prints odd numbers  from 0-50
	public static void oddNumbers(int num){
	for (int i = 0; i < num; i++) {
		int a = i % 2;
		if (a!=0) {
			System.out.print(i+ " ");
		}
	}

	}

//method that generates fibonacci numbers
	public static void fibSeq(int num) {
		int n1 = 0;
		int n2 = 1;
		for (int i = 0; i < num; i++) {
			System.out.print(n1+" ");
			
			int n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
					
		}

	}

//method that tests if string is palindrone		
	public static void palindromeTest(String str) {
		int length = str.length()-1;
		int count = 1;
		
		for(int j =0; j <str.length();j++) {
			if(str.charAt(j)!= str.charAt(length)) {
				length--;
				count ++;
			}
			
		}
		

		if(count == str.length()) {
			System.out.println("this is a Palindrome");
		}else {
			System.out.println("This is not a Palindrone");
		}
	
	
	
	}
}



