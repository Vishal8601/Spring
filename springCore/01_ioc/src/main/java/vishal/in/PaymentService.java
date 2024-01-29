package vishal.in;

class PaymentService {

	private Ipayment payment;
	
	public PaymentService() {
		System.out.println("Payment Service Constructor");
	}
	
	public PaymentService(Ipayment payment) {
		this.payment=payment;
	}
	public void setPayment(Ipayment payment) {
		this.payment=payment;
	}
	
	public void doPayment(double billAmount) {
		boolean processPayment = payment.processPayment(billAmount);
		if(processPayment) {
			System.out.println("Print Bill");
		}
		else {
			System.out.println("Payment Decline");
		}
	}
}
