// Comiple time polymorphisum with method overload concept #
package practice;

public class Java_PolymorphisumCompileTime {

	public static void main(String[] args) {
		
		Java_PolymorphisumCompileTime j = new Java_PolymorphisumCompileTime();
		j.Login(5);
		j.Login("manish");

	}
	
	void Login(String name) {
		System.out.println("using name login can be perform");
	}
	
	void Login(int tokennumber) {
		System.out.println("using token login can be perform");
	}

}
