package assignments;

public class Practice1 {

	int i; // 0
	String name; // null
	double d; // 0.0

	public static void main(String[] args) {

		Practice1 p = new Practice1();
		p.method1(25, "bbb", 5.6);
		System.out.println("i value : " + p.i);
		System.out.println("name is: " + p.name);
		System.out.println("d value is :" + p.d);

	}

	public void method1(int i, String name, double d) {

		System.out.println("non static method");

	}
}
