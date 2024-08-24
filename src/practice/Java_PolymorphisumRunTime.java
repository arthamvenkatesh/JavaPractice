// Runtime polymorphisum with method overriding concept by creating parent and child objects#
package practice;

class Parent1 {

	void pDisplay() {
		System.out.println("parent display method");
	}

	void PCount() {
		System.out.println("PCount display method");
	}

}

public class Java_PolymorphisumRunTime {

	public static void main(String[] args) {

		// object behaviour is different in different stages of lifecycle in rumtime
		// based on object creation know as runtimepoly

		Java_PolymorphisumRunTime p1 = new Java_PolymorphisumRunTime();
		p1.cCount();
		p1.cDisplay(); // by creating child class object child methods will access

		Parent1 p = new Parent1();
		p.PCount();
		p.PCount(); // by creating parent class object will access parent class methods

	}

	void cDisplay() {
		System.out.println("cDisplay child method");
	}

	void cCount() {
		System.out.println("cCount child method");
	}

}
