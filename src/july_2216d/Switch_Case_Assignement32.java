package july_2216d;

import java.util.Scanner;

public class Switch_Case_Assignement32 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1 to 7 numbers: ");
		int choice = s.nextInt();

		switch (choice) {

		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;

		default:
			System.out.println("choice invalid");
		}
		
		s.close();

	}

}
