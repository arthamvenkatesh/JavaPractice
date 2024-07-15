package javaprac;

public class Global_Local {

	static int a = 100; // Global Variable - Bule
	static int b = 20;

	public static void main(String[] args) {

		add();
		sub();

	}

	public static void add() {
		int a = 500; // Local Variable - Brown
		int b = 1500;
		System.out.println("Addition :" + (a + b));
	}

	public static void sub() {
		System.out.println("Substraction: " + (a - b));

	}

}
