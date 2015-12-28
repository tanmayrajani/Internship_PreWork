
public class Vehicle {
	//Encapsulation
	int NumOfWheels;
	private String NumPlate;
	Engine OwnsEngine; //Composition
	
	//Constructor overloading
	public Vehicle() {
		super();
	}
	
	public Vehicle(int numOfWheels) {
		super();
		NumOfWheels = numOfWheels;
	}
	
	public Vehicle(int numOfWheels, String numPlate) {
		super();
		NumOfWheels = numOfWheels;
		NumPlate = numPlate;
	}
	
	public int getNumOfWheels() {
		return NumOfWheels;
	}
	public void setNumOfWheels(int numOfWheels) {
		NumOfWheels = numOfWheels;
	}
	public String getNumPlate() {
		return NumPlate;
	}
	public void setNumPlate(String numPlate) {
		NumPlate = numPlate;
	}
	
	public void who() {
		System.out.println("I am a Vehicle");
	}
	
	public String toString() {
		return "Vehicle with " + this.NumOfWheels + " has number " + this.NumPlate;
	}

}
