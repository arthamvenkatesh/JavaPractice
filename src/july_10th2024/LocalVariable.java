package july_10th2024;

public class LocalVariable {

	public static void main(String[] args) {

		int a = 10; //Local variable - because in main method
		System.out.println("in main method");
		System.out.println(a);
		add();

	}

	static void add() {

		int a = 10; // local variable in add method
		int b = 20;

		int c = a + b;
		System.out.println(c);

	}

}
