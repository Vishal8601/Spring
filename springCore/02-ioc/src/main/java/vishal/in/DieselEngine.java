package vishal.in;

public class DieselEngine implements Engine{
	
	public DieselEngine() {
		System.out.println("Diesel Engine Constructor");
	}


	public int start() {
		System.out.println("Diesel Engine Started....");
		return 1;
	}
	
	
}
