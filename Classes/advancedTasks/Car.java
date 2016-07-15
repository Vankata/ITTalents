package advancedTasks;

public class Car {
	String model;
	float maxSpeed;
	float currentSpeed;
	String color;
	char currentGear;
	Person owner;
	double price;
	boolean isSportCar;
	
	Car() {
		
	}
	
	Car(String model, boolean isSportCar, String color, double price, int maxSpeed) {
		if ((model != null) && (!model.equals(""))) {
			this.model = model;
		} else {
			this.model = "";
			System.out.println("Invalid model! ");
		}
		
		this.isSportCar = isSportCar;
		
		if ((color != null) && (!color.equals(""))) {
			this.color = color;
		} else {
			this.color = "red";
			System.out.println("Invalid color! ");
		}
		
		if(maxSpeed <= 20){
			System.out.println("Invalid max speed! ");
			this.maxSpeed = 50;
		}else{
			this.maxSpeed = maxSpeed;
		}
		this.currentGear = 'N';

		if(price <= 0){
			System.out.println("Invalid price! ");
			this.price = 1000;
		}else{
			this.price = price;
		}
	}
	
	void changeOwner(Person newOwner) {
		if (newOwner != null) {
			this.owner = newOwner;
		}
	}
	
	boolean isMoreExpensive(Car otherCar) {
		return (otherCar == null) ? true : (this.price > otherCar.price);
	}
	
	double calculateCarPriceForScrap(double metalPrice){
		double coef = 0.2;
		if(this.color.equalsIgnoreCase("white") || this.color.equalsIgnoreCase("black")){
			coef += 0.05;
		}
		if(this.isSportCar){
			coef += 0.05;
		}
		
		return metalPrice * coef * 1500;
	}
	
	void accelerate() {
		currentSpeed += 20;
		
		if (currentSpeed > maxSpeed) {
			currentSpeed = maxSpeed;
			System.out.println("Poveche ne moga da vdigna ot "  + maxSpeed);
		}
	}
	
	void changeGearUp() {
		if ((currentGear >= '1') && (currentGear <= '4') )
			currentGear++;
		else 
			System.out.println("Nqma nagore");
	}
	
	void changeGearDown() {
		if ((currentGear >= '2') && (currentGear <= '5') )
			currentGear--;
		else 
			System.out.println("Nqma nadolu");
	}
	
	void changeGear(char newGear) {
		if (((newGear >= '1') && (newGear <= '5')) || (newGear == 'R') || (newGear == 'N'))
			currentGear = newGear;
		else 
			System.out.println("Kva e taq predavka ve");
	}

	
	void changeColor(String newColor) {
		if ((newColor != null) && (!newColor.equals("")) ) {
			color = newColor;
		}
	}
	
	void printCar(){
		System.out.println("Model: " + this.model);
		System.out.println("Max speed: " + this.maxSpeed);
		System.out.println("Current speed: " + this.currentSpeed);
		System.out.println("Color: " + this.color);
		System.out.println("Current gear: " + this.currentGear);
		System.out.println("Price: " + this.price);
		System.out.println("Is the car sport: " + this.isSportCar);
	}
}
