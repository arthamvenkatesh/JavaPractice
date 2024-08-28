package practice;

import java.util.Iterator;
import java.util.PriorityQueue;

public class ProrityQueqe_Assignment63 {

	public static void main(String[] args) {
		PriorityQueue p = new PriorityQueue();
		p.add(100);
		p.add(300);
		p.add(10);
		p.add(300);
		//p.add(null);
		//p.add(null);
		//p.add(true);
		System.out.println("showing behaviour priorityQueue: "+p);
		
		PriorityQueue p1 = new PriorityQueue();
		p1.add(1);
		p1.add(5);
		p1.add(4);
		p1.add(9);
		System.out.println("applying iterator concept");
		
		Iterator i =p1.iterator();
		while(i.hasNext()) 
		{
			System.out.println(i.next());
		}
	}
}
