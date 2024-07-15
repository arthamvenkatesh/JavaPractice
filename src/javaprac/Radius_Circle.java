package javaprac;

public class Radius_Circle {

	static double radius;
	static double diameter;
	static double circumference;
	final static double pi = 3.14159;
	static double area;

	public static void main(String[] args) {

		find_RadiusofCirlce();
		area_ofCircle();
		area_circumferenceofCircle();
		diameterofCircle();

	}

	public static void find_RadiusofCirlce() {

		diameter = 6.0; // here value is declared
		radius = diameter / 2;
		System.out.println("Radius of Circle: " + radius);

	}

	public static void area_ofCircle() {

		radius = 8;
		area = pi * (radius) * (radius);
		System.out.println("Area of Cirlce: " + area);

	}

	public static void area_circumferenceofCircle() {

		radius = 2;
		circumference = 2 * pi * radius;
		System.out.println("Cirumference of Circle: "+circumference);

	}
	
	public static void diameterofCircle() {
		radius = 5;
		diameter=2*radius;
		System.out.println("Diameter of Circle: "+diameter);
		
	}

}
