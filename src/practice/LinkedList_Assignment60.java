package practice;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_Assignment60 {

	public static void main(String[] args) {
		
		LinkedList sortlist = new LinkedList();
		sortlist.add(10);
		sortlist.add(100);
		sortlist.add(90);
		
		System.out.println("before sort: "+sortlist);
		Collections.sort(sortlist);
		System.out.println("after sort: "+sortlist);
		
		System.out.println("to show to behaviour of LinkedList");
		
		LinkedList llist = new LinkedList();
		llist.add(10);
		llist.add(100);
		llist.add(100);
		llist.add(null);
		llist.add(null);
		llist.add(true);
		llist.add(100);
		System.out.println(llist);
	
		System.out.println("by using Iterator");
		
		Iterator i = llist.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("by using ListIterator");
		
		ListIterator i2= llist.listIterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		
				
		System.out.println("by using ListIterator - Previous");
		while(i2.hasPrevious()) {
			System.out.println(i2.previous());
		}


	}

}
