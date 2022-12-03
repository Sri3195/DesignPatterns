package com.Iterator.app;
import com.Iterator.iterator.*;
import com.Iterator.modal.Iterator;

public class IteratorPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionofNames collection=new CollectionofNames();
		
		for(Iterator itr=collection.getIterator();itr.hasNext();) {
			
			String name=(String)itr.next();
			System.out.println("Name: " + name);
		}
	}

}
