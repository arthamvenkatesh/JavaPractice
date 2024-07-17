package july_17th2024;

class World {

	void className() {
		System.out.println("SuperClass: World");
	}

	void wpopulation() {
		System.out.println("795.09 crores");
	}

}

class WCountry extends World {

	void className() {
		System.out.println("SuperClass: Country");
	}

	void cpopulation() {
		System.out.println("141.72 crores");

	}

}

class State extends WCountry {
	void className() {
		System.out.println("Subclass : State");
	}

	void spopulation() {
		System.out.println("3.83 crores");

	}

}

public class MultiLevelInheritance_Assignment26D13 {

	public static void main(String[] args) {

		State s = new State();
		s.wpopulation();
		s.cpopulation();
		s.spopulation();

	}

}
