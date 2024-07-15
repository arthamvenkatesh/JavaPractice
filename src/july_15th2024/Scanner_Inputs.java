package july_15th2024;

import java.util.Scanner;

public class Scanner_Inputs {

	static int a;
	static int b;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter A values :");
		int a = s.nextInt();
		System.out.println("Enter B value : ");
		int b = s.nextInt();

		System.out.println("addition a and b values :" + (a + b));
		System.out.println("substraction a and b values :" + (a - b));
		System.out.println("multiplication a and b values :" + (a * b));
		System.out.println("dividing a and b values :" + (a / b));
		System.out.println("modulas a and b values :" + (a % b));

		s.close();
	}

}
