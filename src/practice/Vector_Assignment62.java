package practice;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_Assignment62 {

	public static void main(String[] args) {
		
		Vector v1 = new Vector();
		v1.addElement(100);
		v1.addElement(100);
		v1.addElement(null);
		v1.addElement(null);
		v1.addElement(10.6);
		v1.addElement("manish");
		v1.addElement(true);
		System.out.println("showing behaviour of vector class: "+v1);
		
		
		Vector v = new Vector();
		v.addElement(100);
		v.addElement(200);
		v.addElement(12.23);
		v.addElement("Hitech");
		System.out.println("for applying iterators: "+v);
		
		Iterator i =v.iterator();
		while(i.hasNext()) 
		{
			System.out.println(i.next());
		}
		
		System.out.println("----------------------");
		
		ListIterator j = v.listIterator();
		
		// forward iteration then reverse iteration
		while(j.hasNext()) {
			System.out.println(j.next());
		}
		
		System.out.println("----------------------");
		
		while(j.hasPrevious()) {
			System.out.println(j.previous());
		}
		
		System.out.println("----------------------");
		
		Enumeration e =v.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}



	}

