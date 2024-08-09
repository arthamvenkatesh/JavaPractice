//Assignment 48 Take size from scanner class n get two exception one for nextInt other for ArrayOutOfBoundException Handled it using try catch#
package aug_07th;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsScannerClass_Assignement48 {

	public static void main(String[] args) {

		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter Array Length");
		int[] a = new int[s2.nextInt()];

		try {
			for (int i = 0; i <= a.length; i++) {
				a[i] = s2.nextInt();
			}
		} catch (InputMismatchException a1) {
			System.out.println("Inputmismatch exception handled");
		}catch(ArrayIndexOutOfBoundsException a2) {
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
		System.out.println(Arrays.toString(a));
		s2.close();
	}

}
