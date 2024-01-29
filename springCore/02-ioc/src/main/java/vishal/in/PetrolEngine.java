package vishal.in;

public class PetrolEngine implements Engine{
	
	public PetrolEngine() {
		System.out.println("Petrol Engine Constructor");
	}

	
	public int start() {
		System.out.println("Petrol Engine Started....");
		return 1;
	}
	
	

}
