package july_15th2024;

import java.util.Scanner;

public class AreaofCircle_ScannerClass_assignment17 {
	
	static double pi = 3.14;

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Radius of Circle:");
		double radius = s.nextDouble();

		double area = pi * (radius) * (radius);
		System.out.println("Area of Cirlce: " + area);
		
		s.close();

	}
	
}
