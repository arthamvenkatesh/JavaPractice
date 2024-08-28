package practice;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Assignment65 {

	public static void main(String[] args) {

		TreeSet t = new TreeSet();

		t.add(100);
		t.add(100);
		t.add(20);
		t.add(200);
		t.add(201);
		t.add(208);
		// t.add(true);
		// t.add("manish");
		// t.add(10.36);
		t.add(20);
		System.out.println(t);

		System.out.println("---------------");
		
		Iterator i = t.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
	}
}
