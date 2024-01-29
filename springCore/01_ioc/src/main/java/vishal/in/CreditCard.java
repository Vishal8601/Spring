package vishal.in;

public class CreditCard implements Ipayment{
	
	public CreditCard() {
		System.out.println("Credit card Default Constructor");
	}

	@Override
	public boolean processPayment(double bill) {
		
		System.out.println("Credit Card Payment Accept");
		
		return true;
	}
	

}
