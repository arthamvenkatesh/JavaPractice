package july_17th2024;

class Country {

	// Country is Superclass

	void superclassMethod() { // non static method
		System.out.println("Superclass: Method1");
	}

	static void superclassMethod2() { // static method
		System.out.println("Superclass: Method2");

	}
}

public class SingleLevelInheritance_Assignment25D13 extends Country {

	// extends keyword is used to inherit the properties of superclass.
	public static void main(String[] args) {

		SingleLevelInheritance_Assignment25D13 sd = new SingleLevelInheritance_Assignment25D13();
		sd.superclassMethod(); // non static method calling
		superclassMethod2(); // static method calling

	}

}
