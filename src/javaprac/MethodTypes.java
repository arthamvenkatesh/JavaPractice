package javaprac;

public class MethodTypes {

	public static void main(String[] args) {
				
		System.out.println("Main method");
		
		// method calling 
		method1();
		int a = method4();
		System.out.println(a);
		method5();
		short b = method5();
		System.out.println(b);
		method6();
		byte c = method6();
		System.out.println(c);
		method7();
		float d= method7();
		System.out.println(d);
		method8();
		double e=method8();
		System.out.println(e);



	}
	
	// Access Specifiers, Modifier, Return type, method name, param
	
	
	public static void method1 () {
		
		System.out.println("In method 1");
	}
	
	public void method2 () {
		
		System.out.println("In method 2");
	}
	
	private void method3 () {
		
		System.out.println("In method 3");
	}
	
	public static int method4 () {
		System.out.println("In method 4");
		return 5;
		
	}
	
	public static short method5() {
		System.out.println("In method 5");
		return 0;
		
	}
	
	public static byte method6() {
		System.out.println("In method 6");
		return 12;
		
	}
	
	static float method7() {
		System.out.println("In method 7");
		return 2;
		
	}
	
	public static double method8() {
		System.out.println("In method 8");
		return 9.5;
	}


}
