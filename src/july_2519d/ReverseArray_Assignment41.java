// reverse an array by using scanner class #
package july_2519d;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray_Assignment41 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Array 3 values as int type ");

		int[] array1 = new int[3];
		for (int a = 0; a < array1.length; a++) {
			array1[a] = scanner.nextInt();
		}
		int[] reversearray = new int[3];

		for (int i = 0, j = 2; i < array1.length; i++, j--) {

			reversearray[j] = array1[i];
		}
		System.out.println("Given Array is ------> " + Arrays.toString(array1));
		System.out.println("Reversed Array is ------> " + Arrays.toString(reversearray));
		scanner.close();
	}

}
