package practice;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Assignment61 {

	public static void main(String[] args) {
		
		HashSet hs1 = new HashSet();
		hs1.add(100);
		hs1.add(10);
		hs1.add(70);
		hs1.add(65);
		System.out.println(hs1);
		
		
		HashSet hs = new HashSet();
		hs.add(100);
		hs.add(550);
		hs.add(null);
		hs.add(null);
		hs.add("name");
		hs.add(569.36);
		System.out.println(hs);
		
		System.out.println("by using Iterator");
		
		Iterator i = hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
