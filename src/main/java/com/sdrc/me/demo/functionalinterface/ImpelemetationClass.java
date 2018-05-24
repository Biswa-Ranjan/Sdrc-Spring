package com.sdrc.me.demo.functionalinterface;

public class ImpelemetationClass implements FunctinalInterfaceExample {
	
	public static void main(String[] args) {
		ImpelemetationClass obj=new ImpelemetationClass();
		obj.formatName();
		obj.welcome("xyz");
	//	obj.farewell("mno");
		System.out.println(obj.num);
	}
	

	@Override
	public String formatName() {
		// TODO Auto-generated method stub
		System.out.println("Abstarct methods");
		return null;
	}
}
