package july_19th2024;

class F_class {

	void login() {
		System.out.println("F_Class: login method");
	}

}

class S_class extends F_class {

	void login() {
		System.out.println("S_Class: login method");
		super.login(); // it will call Fclass login
	}

}

public class Super_Keyword_Assignment28 extends S_class {

	public static void main(String[] args) {
		Super_Keyword_Assignment28 s = new Super_Keyword_Assignment28();
		s.login();
		//this method supressing parentclass method so we need to use super keyword
		//super.login(); - will get an runtime error because superkeyword not used in static methods
	}
	
	void login() {
		System.out.println("Main Method: login");
		super.login(); // it will call S_class login
	}

}
