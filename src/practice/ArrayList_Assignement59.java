//ArrayList Behaviour shown in below pgm
package practice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_Assignement59 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		
		al.add(12);
		al.add(1);
		al.add(10);
		al.add(10);
		System.out.println("before sort: "+al);
		Collections.sort(al);
		System.out.println("after sort: "+al);
		
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(10);
		a1.add(10.3);
		a1.add(null);
		a1.add(null);
		System.out.println("a1 ArrayList Elements are: "+a1);
		
		System.out.println("by using Iterator");
		
		Iterator i = a1.iterator();
		while(i.hasNext()) {
			System.out.println("iterator next element: "+i.next());
		}
		
		System.out.println("by using ListIterator");
		
		ListIterator i2= a1.listIterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		
		System.out.println("by using ListIterator - Previous");
		while(i2.hasPrevious()) {
			System.out.println(i2.previous());
		}

	}

}
