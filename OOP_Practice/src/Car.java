
public class Car extends Vehicle {
		
	public Car() {
		super(4);
	}

	public Car(String numPlate) {
		super(4, numPlate);
		// TODO Auto-generated constructor stub
	}

	//Overriding
	public void who() {
		System.out.println("I am a Car");
	}
	
	public void CarLocalMethod() {
		System.out.println("Car's own method");
	}
	
	public String toString() {
		return "Car with " + this.NumOfWheels + " has number " + this.getNumPlate();
	}
	
}
