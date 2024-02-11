package day6;

public class ICICIBank implements IRBI{

	public void depositMoney() {
		System.out.println("ICICI deposit money");
		
	}

	@Override
	public void withdrawMoney() {
		System.out.println("ICICI withdraw money");
		
	}
}
