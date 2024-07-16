package javaprac;

public class ConstructorsPractice {
	
	static int b;
	
	public ConstructorsPractice(int a) {
		
		this.b=a;
		
		System.out.println("default calls" +b);
	}

	public static void main(String[] args) {
		
		
		ConstructorsPractice c = new ConstructorsPractice(500);
		System.out.println(b);
		

	}

}
