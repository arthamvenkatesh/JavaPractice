package july_13th2024;

public class AgeVerification_Assignment15 {

	public static void main(String[] args) {

		char ingender = 'M';

		char gender2Age = 62;

		if (ingender == 'F') {
			System.out.println("Travelling Free");
		} else {
			if (ingender == 'M') {

				if (gender2Age < 12) {
					System.out.println("Half Ticket");
				} else if (gender2Age > 12 && gender2Age < 59) {
					System.out.println("Full Ticket");
				} else {
					System.out.println("Half Ticket");
				}
			}
		}

	}

}
