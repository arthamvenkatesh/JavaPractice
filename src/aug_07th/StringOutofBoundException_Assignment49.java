// 49: WAP String Out Of Bound Exception #
package aug_07th;

public class StringOutofBoundException_Assignment49 {

	public static void main(String[] args) {
		
		String s1 = "name";
		try {
			char c = s1.charAt(1000); // change the value here to get an exception
		}catch(StringIndexOutOfBoundsException e1) {
			System.out.println("please enter correct char index value");
		}
	
	}

}
