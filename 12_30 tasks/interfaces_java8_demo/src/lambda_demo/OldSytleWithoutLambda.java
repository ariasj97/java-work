package lambda_demo;

public class OldSytleWithoutLambda implements HelloFunctional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloFunctional h= new OldSytleWithoutLambda();
		h.hello();
		HelloFunctional h1 = new HelloFunctional() {
			
			@Override
			public void hello() {
				// TODO Auto-generated method stub
				System.out.println("Hello old style inner");
			}
		};
		h1.hello();
		
		HelloFunctional h2 = new HelloFunctional() {
			
			@Override
			public void hello() {
				// TODO Auto-generated method stub
				System.out.println("Hello again old inner");
			}
		};
		h2.hello();
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("hello old style");
	}

	

}
