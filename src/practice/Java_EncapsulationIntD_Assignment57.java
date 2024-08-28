package practice;

class PrivateIn
{
	private int BankAccountNumber = 123456;
	
	public void setBankAccountNumber(int number) {
		this.BankAccountNumber = number;
	}
	
	public int getBankAccountNumber() {
		return BankAccountNumber; //return in int datatype
	}
	
}

public class Java_EncapsulationIntD_Assignment57 {

	public static void main(String[] args) {
		
		PrivateIn pr = new PrivateIn();
		pr.setBankAccountNumber(1545);
		System.out.println(pr.getBankAccountNumber());
	}

}
