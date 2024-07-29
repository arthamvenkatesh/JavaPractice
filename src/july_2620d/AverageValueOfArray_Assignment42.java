//find the average value of an array values #
package july_2620d;

public class AverageValueOfArray_Assignment42 {

	public static void main(String[] args) {

		int[] array1 = new int[4];
		array1[0] = 17;
		array1[1] = 35;
		array1[2] = 81;
		array1[3] = 42;

		double sum = 0;

		for (int i = 0; i < array1.length; i++) {

			sum = sum + array1[i];
		}
		System.out.println("Average value is ---->"+ sum / 4);
	}

}
