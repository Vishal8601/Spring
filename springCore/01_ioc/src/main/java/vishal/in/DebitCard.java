package vishal.in;

class DebitCard implements Ipayment{

	public DebitCard() {
		System.out.println("Debit Card Constructor");
	}
	@Override
	public boolean processPayment(double bill) {
		System.out.println("Debit card Accept");
		return true;
	}

}
