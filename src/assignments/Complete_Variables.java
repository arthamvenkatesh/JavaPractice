package assignments;

public class Complete_Variables {

	static int a = 1000; // global variable

	final static int fix_value = 100; // final variable

	public static void main(String[] args) {

		callingVariableTypes();

		/*
		 * LV - inside method declaration GV - inside class, out side method LV - can't
		 * declared as static / non static GV - can declare the static and non static as
		 * well LV - not having default values GV - is having default values LV - we
		 * can't utilize until it will instalize GV - we can utilize without instalize
		 * 
		 */
		
		// this should 

	}

	public static void callingVariableTypes() {

		int thisint = 20; // local variable : can't be static / non static
		System.out.println("Global variable calling :" + a);
		System.out.println("Global final variable calling: " + fix_value);
		System.out.println("Local varible calling: " + thisint);

	}

}
