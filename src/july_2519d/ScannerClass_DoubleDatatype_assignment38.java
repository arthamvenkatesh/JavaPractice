//ScannerClass- DoubleDatatype Input #
package july_2519d;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerClass_DoubleDatatype_assignment38 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter double values to an array");
		double[] darray = new double[3];
		for (int i = 0; i < darray.length; i++) {
			darray[i] = s.nextDouble();
		}
		System.out.println("Array elements are:" + Arrays.toString(darray));
		s.close();
	}

}
