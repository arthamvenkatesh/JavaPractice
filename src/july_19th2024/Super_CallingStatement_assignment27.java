package july_19th2024;

class A {

	A() {
		System.out.println("A Constructor");
	}
}

class B extends A {

	B() {
		super(); // Calling: A class constructor
		System.out.println("B Constructor");
	}
}

class C extends B {

	C(int a, int b) {
		super(); // Calling : B class constructor and its should be in first line
		System.out.println("C Constructor");
	}
}

public class Super_CallingStatement_assignment27 extends B {

	public static void main(String[] args) {
		System.out.println("Main Method");

		new C(55, 55); // Object Creation: Calling C Class Method

	}

}
