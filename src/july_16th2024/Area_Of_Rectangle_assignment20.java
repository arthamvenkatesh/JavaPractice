package july_16th2024;

import java.util.Scanner;

public class Area_Of_Rectangle_assignment20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length");
		double l = sc.nextDouble();
		System.out.println("Enter Width");
		double w = sc.nextDouble();

		double AreaofRectangle = l * w;

		System.out.println("Area of Rectangle is :" + AreaofRectangle);

		sc.close();
	}

}
