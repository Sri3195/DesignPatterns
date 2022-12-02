package com.prototype.modal;

public class Square extends Shape{
	public Square() {
		type="Rectangle";
	}
	
	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method");
	}

}
