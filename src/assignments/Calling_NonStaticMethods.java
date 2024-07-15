package assignments;

public class Calling_NonStaticMethods {

	public static void main(String[] args) {

		Calling_NonStaticMethods cn = new Calling_NonStaticMethods();
		cn.method1();

	}

	public void method1() {

		System.out.println("Calling Non_static method");
	}

}
