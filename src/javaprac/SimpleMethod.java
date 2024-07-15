package javaprac;

public class SimpleMethod {

	public static void main(String[] args) {

		System.out.println("In main method");
		int g = method(9);
		System.out.println("value of g is:" +g);

	}
	
	 static int method(int l) {
		
		System.out.println("In sub method");
		return l;
		
	}
	 
	 public static String man(String s) {
		return s;
		 
	 }

}
