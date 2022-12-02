package com.factory.app;

import com.factory.Factory.ShapeFactory;
import com.factory.modal.Shape;

public class FactoryPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==Factory PAttern Demo==");
		ShapeFactory shapeFactory=new ShapeFactory();
		Shape shape=shapeFactory.getShape("rectangle");
		shape.draw();
		
	}

}
