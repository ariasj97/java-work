package eg1;

public class StringBufferTasks {

	public static void main(String[] args) {
		// Task - Print all of the palidromes between 1000 to 9999
		
		String s;
		for(int num = 1000; num<=9999; num++) {
			s=num+"";
			if (new StringBuffer(s).reverse().toString().equals(s)) {
				System.out.println(s+" is a palindrome" );
			}
			
		}
		
	}

}
