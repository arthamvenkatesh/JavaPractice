package july_11th2024;

public class If_ConditionComp_assigment13 {

	public static void main(String[] args) {

		int feb_days = 29;
		if (feb_days <= 28) {
			System.out.println("Non leap year");

		}
		if (feb_days > 28) {
			System.out.println("Leap year");

		}
		
		//timeCount();

	}
	
	public static void timeCount() {
		int seconds = 65;
		int minutes = 60;
		int hours = 25;
		
		if (seconds >= 60) {
			System.out.println("caluclate as one minute");
		}
		if (minutes >= 60) {
			System.out.println("caluclate as one hour");
		}
		if (hours <= 24) {
			System.out.println("caluclate as one day");
		}
		
	}

}
