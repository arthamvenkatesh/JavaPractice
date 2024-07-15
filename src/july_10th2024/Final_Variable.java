package july_10th2024;

public class Final_Variable {

	final static int fixed_value = 100;
	// final global variable

	public static void main(String[] args) {

		final int fix = 200;
		System.out.println(fix); // final-local variable calling
		System.out.println(fixed_value); // global-final variable calling

	}

}
