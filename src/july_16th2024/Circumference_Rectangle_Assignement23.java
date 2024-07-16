package july_16th2024;

import java.util.Scanner;

public class Circumference_Rectangle_Assignement23 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A value");
		double a = sc.nextDouble();

		System.out.println("Enter B value");
		double b = sc.nextDouble();

		double cir_rect = 2 * (a + b);

		System.out.println("Circumference of Rectangle :" + cir_rect);

		sc.close();

	}

}
