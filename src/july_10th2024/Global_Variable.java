package july_10th2024;

public class Global_Variable {

	static int a = 10; // this static global variable
	String name = "venkatesh"; // non static variable

	// these two are global variables - outside method and inside class.

	public static void main(String[] args) {

		System.out.println("inside main method");
		System.out.println(a);
		// this called by direct - its a static variable
		method1();
		// static method calling here

	}

	static void method1() {

		Global_Variable gv = new Global_Variable();
		System.out.println(gv.name);
		// non static method calling by creating class reference.

		System.out.println("in method1");

	}

}
