package lambda_demo;

public class LambdaStyleMain {

	public static void main(String[] args) {
		
		HelloFunctional h1 = ()->System.out.println("Hello lambda");
		h1.hello();
		
		HelloFunctional h2 = ()->{
			System.out.println("Hi again ");
			System.out.println("Hi again again");
		};
		h2.hello();
		
		HelloInterfaceFunctionalByName h3 = (n)->{
			System.out.println("Hello "+n);
		};
		h3.sayHello("Jason");
		
		AddFunctional add=(x,y,z)->{
			return x+y+z;
		};
		System.out.println("result of the 3 numbers is: "+add.sum(5, 13, 1232345));
	}

}
