	package advancedTasks;

public class CarShop {
	Car[] cars;
	int countCars;
	
	CarShop(int capacity){
		if(capacity <= 0){
			System.out.println("Invalid capacity! ");
		}else{
			this.cars = new Car[capacity];
		}
		this.countCars = 0;
	}
	
	boolean addCar(Car car){
		if(cars[this.countCars] != null){
			System.out.println("No place for another car! ");
			return false;
		}else{
			this.cars[this.countCars] = car;
			this.countCars++;
			return true;
		}
	}
	
	Car getNextCar(){
		int point = this.countCars - 1;
		if(point > 0){
			return this.cars[point];
		}
		
		return null;
	}
	
	void sellNextCar(Person buyer){
		if(this.getNextCar() != null){
			buyer.car = this.getNextCar();
			this.removeCar(this.getNextCar());
		}
	}
	
	void removeCar(Car car){
		for (int index = 0; index < cars.length; index++) {
			if(this.cars[index] == car){
				Car temp = this.cars[index];
				this.cars[index] = car;
				car = temp;
				
				this.cars[this.cars.length - 1] = null;
				this.countCars--;
			}
		}
	}
	
	void showAllCarsInTheShop(){
		for (int index = 0; index < this.countCars; index++) {
			this.cars[index].printCar();
		}
	}
}
