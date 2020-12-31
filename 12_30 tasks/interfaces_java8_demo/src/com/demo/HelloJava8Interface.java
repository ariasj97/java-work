package com.demo;

public interface HelloJava8Interface {

	public static void hiStatic() {
		System.out.println("Hello from static method within a interface from java8 and above");
	}

	default void hiDefault() {
		System.out.println("Hi from default methods from java8 and above");
	}
}
