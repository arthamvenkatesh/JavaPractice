package july_16th2024;

import java.util.Scanner;

public class Area_Of_Trapezium_Assignment24 {

	public static void main(String[] args) {

		// formula: 1/2*(a+b)*h;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A- Base value");
		double a = sc.nextDouble();

		System.out.println("Enter B- Base value");
		double b = sc.nextDouble();

		System.out.println("Enter H- Height value");
		double h = sc.nextDouble();

		double area_trip = (a + b)/2 * h;

		System.out.println("Area Of Trapezium: " + area_trip);
		
		sc.close();

	}

}
