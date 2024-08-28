package practice;

class InfoShare{
	
	private boolean isTaxPay = true;
	
	public void setIsTaxPay(boolean status) {
		this.isTaxPay = status;
	}
	
	public boolean getIsTaxPay() {
		return isTaxPay;
	}
}

public class Encapsulation_BooleanType {

	public static void main(String[] args) {
		InfoShare i = new InfoShare();
		i.setIsTaxPay(false);
		System.out.println(i.getIsTaxPay());

	}

}
