package aug23;

public class StringBuilder_Methods_Assignment53 {

	public static void main(String[] args) {

		StringBuilder s1 = new StringBuilder("Manish");

		s1.append(" Tiwari");
		System.out.println("Append : " + s1);

		s1.insert(7, "Kumar ");
		System.out.println("insert done on :" + s1);

		s1.replace(0, 6, "Abhishek");
		System.out.println("Replace manish with: " + s1); 

		StringBuilder s2 = new StringBuilder("Noman Country"); 
		s2.delete(0, 6); 
		System.out.println("After deleting: " + s2);

		System.out.println("String reverse: " + s2.reverse());

		StringBuilder s3 = new StringBuilder("Manish");
		System.out.println("length of string is: " + s3.length()); // 6 strat from 1
		System.out.println("defult 16+ char count is: " + s3.capacity()); // defalut 16 + characters count

		StringBuilder s4 = new StringBuilder();
		System.out.println(s4.capacity());

		StringBuilder s5 = new StringBuilder("manish"); // charAt index
		System.out.println("char at index :" + s5.charAt(0));

		StringBuilder s6 = new StringBuilder("manish kumar tiwari");
		System.out.println(s6.substring(7)); // include space - 7
		System.out.println(s6.substring(8)); // umar tiwari
		System.out.println(s6.substring(13)); // tiwari

		System.out.println(s6.substring(0, 6)); // manish
		System.out.println(s6.substring(7, 12)); // kumar
		System.out.println(s6.substring(13, 19)); // tiwari

	}

}
