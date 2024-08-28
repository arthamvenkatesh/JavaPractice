package practice;

import java.util.Date;

public class Date_Assignment58 {

	public static void main(String[] args) {
		
		Date date = new Date();
		long time= date.getTime();
		
		Date date1 = new Date(date.getTime());
		System.out.println(date);

		String tim = date.toString(); //method from object class
		
		String month = tim.substring(4, 7);
		String day = tim.substring(8, 10);
		String y = tim.substring(tim.length()-4);
		
		String dateformat1 = day.concat(" ").concat(month).concat(" ").concat(y);
		String dateformat2 = day.concat("-").concat(month).concat("-").concat(y);
		String dateformat3 = day.concat("/").concat(month).concat("/").concat(y);
		
		System.out.println(dateformat1);
		System.out.println(dateformat2);
		System.out.println(dateformat3);
		
	}

}
