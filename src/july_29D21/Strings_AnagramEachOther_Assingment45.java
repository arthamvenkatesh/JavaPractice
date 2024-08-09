package july_29D21;

import java.util.Arrays;

public class Strings_AnagramEachOther_Assingment45 {

	public static void main(String[] args) {
		
		String s1 = "ram";
		String s2 = "armd";
		
		if(s1.length() == s2.length())
		{
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
			
			System.out.println("Before sorting, S1 is "+Arrays.toString(c1)+ " and " +" S2 is "+Arrays.toString(c2));
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			System.out.println("After sorting, S1 is "+Arrays.toString(c1)+ " and " +" S2 is "+Arrays.toString(c2));
			
			if(Arrays.equals(c1, c2)== true) {
				System.out.println("Anagram");
			}else
			System.out.println("not anagram");
		
		}
		else
			System.out.println("Not an anagram ! length mismatched");

	}

}
