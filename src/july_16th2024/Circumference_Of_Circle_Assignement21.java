package july_16th2024;

import java.util.Scanner;

public class Circumference_Of_Circle_Assignement21 {

	static double p = Math.PI;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Radius Of Circle: ");
		double radius = sc.nextDouble();

		double Circum_Circle = 2 * p * radius;

		System.out.println("Circum of Circle: " + Circum_Circle);
		
		sc.close();

	}

}
