package practice;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class Stack_Assignment64 {

	public static void main(String[] args) {

		Stack s = new Stack();

		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(40);
		s.push(null);


		// push, peek and pop methods

		System.out.println("Stack Elements are: " + s);
		System.out.println("Return Element from Top : " + s.peek()); // return the top element
		System.out.println("Remove Element from Top : " + s.pop()); // remove the top element top and print that
		System.out.println("After removing elements : " + s); // after removing top element and display remain elements

		Enumeration e = s.elements();

		System.out.println("------------");
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		System.out.println("------------");
		
		Iterator i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("------------");
		
		ListIterator i1 = s.listIterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		System.out.println("------------");
		
		while(i1.hasPrevious()) {
			System.out.println(i1.previous());
		}

	}

}
