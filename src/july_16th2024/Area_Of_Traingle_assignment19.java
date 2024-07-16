package july_16th2024;

import java.util.Scanner;

public class Area_Of_Traingle_assignment19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base value : ");
		double a = sc.nextDouble();

		System.out.println("Enter Height value : ");
		double b = sc.nextDouble();

		double areaoftraingle = (a * b) / 2;
		System.out.println("Area Of Traingle is:" + areaoftraingle);

		sc.close();

	}

}
