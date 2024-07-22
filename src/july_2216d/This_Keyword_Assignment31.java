package july_2216d;

public class This_Keyword_Assignment31 {

	int id;
	String name;
	int fee;

	This_Keyword_Assignment31(int id, String name, int fee) {

		this.id = id;
		this.name = name;
		this.fee = fee;
		System.out.println("parameters id: " + id + "  name: " + name + "  salary: " + fee);

	}

	public static void main(String[] args) {

		This_Keyword_Assignment31 s = new This_Keyword_Assignment31(12, "Employee", 150);

	}

}
