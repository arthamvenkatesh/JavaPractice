package practice;

class PrivateInformation{
	
	private int BankAccountNumber = 123456;
	private String name = "manish";
	private boolean Taxpay = true;
	
	public int getBankAccountNumber() {
		return BankAccountNumber; //return in int datatype
	}
	
	public void setBankAccountNumber(int number) {
		this.BankAccountNumber = number;
	}
	
	public void setName(String name) { 
		this.name = name;
	}
	
	public String getName() {
		return name; //return in string datatype
	}
	
	public void setTaxpay(boolean Taxpay) { 
		this.Taxpay = Taxpay;
	}
	
	public boolean getTaxpay() { 
		return Taxpay; //return in boolean datatype
	}
	
}

public class Java_Encapsulation {

	public static void main(String[] args) {
		
		PrivateInformation p = new PrivateInformation();
		p.setBankAccountNumber(125);
		System.out.println(p.getBankAccountNumber());
		
		p.setName("tiwari");
		System.out.println(p.getName());
		
		p.setTaxpay(false);
		System.out.println(p.getTaxpay());
	}

}
