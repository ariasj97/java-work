package eg1;
import java.util.Scanner;

public class RegexTasks {

		//task1 - Convert every word's last character to uppercase and print back the sentence.
		//task2 - write a program to validate an SSN number using regex
		//task3 - write a program to validate DL 



	public static void main(String[] args) {
		//task1 - write a program to validate an SSN number using regex	
		String ssn;
		System.out.println("Enter a valid SSN ");
		Scanner sc = new Scanner(System.in);
		
		ssn = sc.nextLine();
		
		System.out.println(ssn);
		
		if (ssn.matches("[0-9]{3}\\-[0-9]{2}\\-[0-9]{4}")) {
			System.out.println("This is a valid SSN");
		}else {
			System.out.println("This is not a valid SSN");
		}
	
		//task2 - write a program to validate DL 
		String dl;
		System.out.println("Enter a valid Drivers License # ");
		Scanner sc2 = new Scanner(System.in);
		
		dl = sc2.nextLine();
		System.out.println(dl);
		
		//In NJ a valid dl numbers is a capital letter followed by 14 digits
		if (dl.matches("[A-Z]{1}[0-9]{14}")) {
			System.out.println("This is a valid Driverse License #");
		}else {
			System.out.println("This is not a valid Drivers License #");
		}
		
	}



}


