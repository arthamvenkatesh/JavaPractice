package july_19th2024;

public class This_CallingStatement_Assignment29 {

	This_CallingStatement_Assignment29() {
		this(22.45);
		System.out.println("3");

	}

	This_CallingStatement_Assignment29(int a) {
		System.out.println("1");

	}

	This_CallingStatement_Assignment29(double a) {
		this(50);
		System.out.println("2");
	}

	public static void main(String[] args) {
		System.out.println("0");
		new This_CallingStatement_Assignment29();

	}
		
}
