package eg1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionMain {

	public static void main(String[] args) throws Exception {
		
		Method method = ClassA.class.getDeclaredMethod("someMethod");
		
		//makes the private static void method accessible
		method.setAccessible(true);
		
		//passing null because  there is no need for an object to pass since the method is static
		//also not passing any parameters since someMthod() does not have any arguments
		//invoke() allows us to call a private method from another class after making the method accessible
		method.invoke(null);

		
		String str = "Hello world";
		System.out.println("Begin");
		System.out.println(str);
		System.out.println("End\n");
		
		//calling the private value method
		Field field= String.class.getDeclaredField("value");
		//making the private method accessible
		field.setAccessible(true);
		
		//sending the string obj and returning an empty char array
		field.set(str, new char[] {});
		
		
		System.out.println("Begin");
		System.out.println(str);
		System.out.println("End\n");
		
		
	}

}
