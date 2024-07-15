package july_09th2024;

public class MethodOverloading {

	public static void main(String[] args) {

		MethodOverloading ml = new MethodOverloading();
		ml.login(1058785);
		ml.login("venkatesh");

	}

	public void login(String username) {

		System.out.println(username);

	}

	public void login(long userid) {

		System.out.println(userid);

	}

}
