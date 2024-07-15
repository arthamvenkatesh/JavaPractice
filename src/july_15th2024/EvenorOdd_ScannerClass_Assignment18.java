package july_15th2024;

import java.util.Scanner;

public class EvenorOdd_ScannerClass_Assignment18 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number to Check Even or Odd ");
		
		int a = s.nextInt();
		if(a % 2 == 0 ) {
			System.out.println("Enter number is even");
		}else {
			System.out.println("Number is Odd");
		}
		
		s.close();

	}

}
