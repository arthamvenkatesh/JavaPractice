// both Parent and child class has 2 nonstatic and 2 static methods. do up casting and down casting #
package aug_0808D28;

class Parent {
	static void pm1() {
		System.out.println("Parent Method 1 static nature");
	}

	static void pm2() {
		System.out.println("Parent Method 2 static nature");
	}

	void pm3() {
		System.out.println("Parent Method 3 non static nature");
	}

	void pm4() {
		System.out.println("Parent Method 4 non static nature");
	}

}

class Child extends Parent {

	static void cm1() {
		System.out.println("Child Method 1 static nature");
	}

	static void cm2() {
		System.out.println("Child Method 2 static nature");
	}

	void cm3() {
		System.out.println("Child Method 3 non static nature");
	}

	void cm4() {
		System.out.println("Child Method 4 non static nature");
	}
}

public class Upcasting_DownCasting_Assignement51 {

	public static void main(String[] args) {
		// upcasting : child object to parent type doing this we can access parent class
		// methods only
		Parent p1 = new Child();
		p1.pm1();
		p1.pm2();
		p1.pm3();
		p1.pm4();
		// downcasting : childobject to parent type by doing this we can access all
		// methods from parent and child class
		Child c1 = (Child) p1;
		System.out.println("Downcast");
		c1.cm1();
		c1.cm2();
		c1.cm3();
		c1.cm4();
		c1.pm1();
		c1.pm2();
		c1.pm3();
		c1.pm4();
	}

}
