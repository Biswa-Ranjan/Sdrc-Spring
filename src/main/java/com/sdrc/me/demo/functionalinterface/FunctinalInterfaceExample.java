package com.sdrc.me.demo.functionalinterface;

@FunctionalInterface
public interface FunctinalInterfaceExample {

	/*
	 * @FunctionalInterface can be applicable to the interface which must be having only one
	 * unimplemented function .  
	 */
	String formatName(String name);
//	String formatName1(String name);
	//
	/* default keyword must be used in order to implement the functionality of a
	function inside the interface */
	default void welcome(String name){
		System.out.println("welcome back "+name);
	}
}
