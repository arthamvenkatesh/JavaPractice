package july_16th2024;

import java.util.Scanner;

public class Circumference_Traingle_Assignment22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a value: ");
		double a = sc.nextDouble();

		System.out.println("Enter b value: ");
		double b = sc.nextDouble();

		System.out.println("Enter c value: ");
		double c = sc.nextDouble();

		double cir_train = a + b + c;

		System.out.println("Circumference_of_Traingle: " + cir_train);
		
		sc.close();

	}

}
