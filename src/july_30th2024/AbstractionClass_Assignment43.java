package july_30th2024;

abstract class ParentClass {
	// abstract methods need to implement in class
	abstract void addition();

	abstract void substraction();

	// concrete method
	static void concreteMethodFromabsClass() {
		System.out.println("abstract class : method implementation");
	}
}

public class AbstractionClass_Assignment43 extends ParentClass {
	public static void main(String[] args) {
		AbstractionClass_Assignment43 ac = new AbstractionClass_Assignment43();
		ac.addition();
		ac.substraction();
		mainmethodStatic();
		concreteMethodFromabsClass();
		ac.mainmethodNonStatic();
	}

	void addition() {
		int a = 10;
		int b = 20;
		System.out.println("abstract method implementation done in class --> addition --->:" + (a + b));
	}

	void substraction() {
		int a = 50;
		int b = 20;
		System.out.println("abstract method implementation done in class --> substraction --->:" + (a - b));
	}

	static void mainmethodStatic() {
		System.out.println("concrete class: main method1");
	}

	void mainmethodNonStatic() {
		System.out.println("concrete class: main method2 ");
	}

}
