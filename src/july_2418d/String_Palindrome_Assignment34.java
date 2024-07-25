package july_2418d;

public class String_Palindrome_Assignment34 {

	public static void main(String[] args) {
		String s1 = "radar";
		String s2 = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			char c = s1.charAt(i);
			s2 = s2 + c; // logic temp+0
		}
		System.out.println("Given String is ----> " + s1 + "  Reversed as ----> " + s2);
		if (s1.equals(s2)) {
			System.out.println("The given string is palindrome");
		} else
			System.out.println("The given string is not palindrome");
	}

}
