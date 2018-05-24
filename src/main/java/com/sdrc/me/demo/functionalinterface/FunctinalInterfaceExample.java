package com.sdrc.me.demo.functionalinterface;

@FunctionalInterface
public interface FunctinalInterfaceExample {

	int num=100;
	
	/*
	 * @FunctionalInterface can be applicable to the interface which must be having only one
	 * unimplemented function .  
	 */
	String formatName();
//	String formatName1(String name);
	//
	/* default keyword must be used in order to implement the functionality of a
	function inside the interface 
	Lambda: An interface with exactly one default method can be used for lambda expression
	*/
	default void welcome(String name){
		System.out.println("welcome back "+name);
	}
	/*default void farewell(String name){
		System.out.println("farewell to "+name);
	}*/
}
