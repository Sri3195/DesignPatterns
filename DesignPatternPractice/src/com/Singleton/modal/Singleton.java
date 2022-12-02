package com.Singleton.modal;

public class Singleton {
	
	private static Singleton obj=null;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(obj==null)
			obj=new Singleton();
		return obj;
	}

	public void message() {
		System.out.println("Singleton Pattern is used.");
	}
}
