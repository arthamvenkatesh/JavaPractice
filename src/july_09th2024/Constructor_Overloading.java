package july_09th2024;

public class Constructor_Overloading {

	public Constructor_Overloading(int id) {

		System.out.println("constructor id type");

	}

	public Constructor_Overloading(String username) {

		System.out.println("constructor username type");

	}

	public static void main(String[] args) {
		
		Constructor_Overloading co = new Constructor_Overloading(1122);
		Constructor_Overloading c1 = new Constructor_Overloading("venkatesh");
		
		System.out.println("In_Main Method");

	}

}
