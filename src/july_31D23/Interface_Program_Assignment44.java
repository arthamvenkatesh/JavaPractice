// interface program : archive multiple inheritance#
package july_31D23;

interface RootClass1 { // interface 1

	void imethod1(); // abstract method

}

interface RootClass2 { //interface 2

	void imethod2(); // abstract method

}

public class Interface_Program_Assignment44 implements RootClass1, RootClass2 {

	public void imethod1() { //abstract method implement here
		int a = 10;
		int b = 20;
		System.out.println(a + b);

	}

	public void imethod2() { //abstract method implement here
		int a = 10;
		int b = 20;
		System.out.println(a * b);

	}

	public static void main(String[] args) {

		Interface_Program_Assignment44 ip = new Interface_Program_Assignment44(); 
		ip.imethod1();
		ip.imethod2();

	}

}
