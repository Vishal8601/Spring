package vishal.in;

public class Car {
	
	private Engine engine;
	
	public Car(Engine engine) {
		this.engine=engine;
	}
	public void engineType() {
		int status=engine.start();
		if(status>=1) {
			System.out.println("Engine Started");
		}
		else {
			System.out.println("Engine In problem");
		}
	}

}
