package com.Singleton.app;

import com.Singleton.modal.Singleton;

public class SingletonPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton singletonObject=Singleton.getInstance();
		System.out.println(singletonObject.hashCode());
		
		Singleton singletonObject1=Singleton.getInstance();
		System.out.println(singletonObject1.hashCode());
		singletonObject.message();

	}

}
