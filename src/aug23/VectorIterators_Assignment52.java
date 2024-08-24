package aug23;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorIterators_Assignment52 {

		public static void main(String[] args) {
			
			//vectot is having 3 types of iterators
			//1. iterator()
			//2. ListIterator()
			//3. v.elements()
			
			Vector v = new Vector();
			v.add(100);
			v.add(200);
			v.add(12.23);
			v.add("Hitech");
			System.out.println(v);
			
			Iterator i =v.iterator();
			while(i.hasNext()) 
			{
				System.out.println(i.next());
			}
			
			ListIterator j = v.listIterator();
			
			// forward iteration then reverse iteration
			while(j.hasNext()) {
				System.out.println(j.next());
			}
			
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
