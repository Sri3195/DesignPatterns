package com.factory.Factory;

import com.factory.modal.Circle;
import com.factory.modal.Rectangle;
import com.factory.modal.Shape;

public class ShapeFactory {
	public Shape getShape(String shapeType) {
		
		if(shapeType == null)
			return null;
		if(shapeType.equalsIgnoreCase("circle"))
			return new Circle();
		if(shapeType.equalsIgnoreCase("rectangle"))
			return new Rectangle();
		return null;
	
	}

}
