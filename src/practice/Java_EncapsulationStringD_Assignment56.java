package practice;

class PrivateInfo{
	
	private String name = "manish";
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}

public class Java_EncapsulationStringD_Assignment56 {

	public static void main(String[] args) {
		
		PrivateInfo p = new PrivateInfo();
		p.setName("Kalyan");
		System.out.println(p.getName());

	}

}
