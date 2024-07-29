//Array values copy from one to another Array #
package july_2519d;

import java.util.Arrays;

public class CopyArrayintoAnotherArray_Assignment40 {

	public static void main(String[] args) {

		int[] array1 = new int[3];
		array1[0] = 1;
		array1[1] = 20;
		array1[2] = 300;
		
		int[] carray = new int[3];
		
		for(int i = 0; i<array1.length; i++) {
			
			carray[i]=array1[i];
		}
		System.out.println("copied into another array ---->" +Arrays.toString(carray));

	}

}
