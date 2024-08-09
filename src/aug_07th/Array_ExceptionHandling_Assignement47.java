package aug_07th;

import java.util.Arrays;
import java.util.Scanner;

public class Array_ExceptionHandling_Assignement47 {

	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter size of an Array");
		int[] array = new int[s1.nextInt()];

		try {
			for (int i = 0; i <= array.length; i++) {
				array[i] = s1.nextInt();
			}
		} catch (ArrayIndexOutOfBoundsException a1) {
			System.out.println("Exception handeld here");
		}
		System.out.println(Arrays.toString(array));
		s1.close();
	}

}
