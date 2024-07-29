//Given element present in a array or not#
package july_2519d;

public class GivenPartOfArray_Assignment39 {

	public static void main(String[] args) {

		int[] array1 = new int[4];
		array1[0] = 100;
		array1[1] = 200;
		array1[2] = 300;
		array1[3] = 400;

		int given_number = 200;

		for (int i = 0; i < array1.length; i++) {
			if (given_number == array1[i]) {
				System.out.println("Element found and index position is--> " + i);
			} else {
				System.out.println("Element not found");
			}
		}

	}

}
