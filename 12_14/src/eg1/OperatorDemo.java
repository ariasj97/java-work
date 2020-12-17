package eg1;

public class OperatorDemo {

	public static void main(String[] args) {
		int a = 25, b = 5 ;
		
		//math operators
		System.out.println("Addition: "+(a+b));
		System.out.println("Subtraction: "+(a-b));
		System.out.println("Multiplication: "+(a*b));
		System.out.println("Division: "+(a/b));
		System.out.println("Modular Div: "+(a%b));
		
		//conditional operators
		if (a<b) {
			System.out.println("Integer b is larger than integer a.");
		}
		else {
			System.out.println("Integer a is larger than integer b.");
		}
			

	}

}
