package july_17th2024;

class World {

	// parent of superclass

	void className() {
		System.out.println("SuperClass: World");
	}

	void wpopulation() {
		System.out.println("795.09 crores");
	}

}

class WCountry extends World {

	// superclass

	void className() {
		System.out.println("SuperClass: Country");
	}

	void cpopulation() {
		System.out.println("141.72 crores");

	}

}

public class MultiLevelInheritance_Assignment26D13 extends WCountry {

	public static void main(String[] args) {

		// Subclass

		MultiLevelInheritance_Assignment26D13 w = new MultiLevelInheritance_Assignment26D13();
		w.wpopulation();
		w.cpopulation();
	}

}
