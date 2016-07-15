package Task1;

public class Computer {

	int year = 1970;
	double price = 0;
	boolean isNotebook = false;
	double hardDiskMemory = 500;
	double freeMemory = 400;
	String operationSystem = "";

	Computer() {
		this.isNotebook = false;
		this.operationSystem = "Win XP";
	}

	Computer(int year, double price, double hardDiskMemory, double freeMemory, String operationSystem) {
		this();
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
		this.operationSystem = operationSystem;
	}

	Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory, String operationSystem) {
		this(year, price, hardDiskMemory, freeMemory, operationSystem);
		this.isNotebook = isNotebook;
	}
	
	void changeOperationSystem(String newOperationSystem) {
		if (newOperationSystem == null || newOperationSystem.equals("")) {
			System.out.println("No such operation system! ");
		} else {
			this.operationSystem = newOperationSystem;
		}
	}

	void useMemory(int memory) {
		if (memory > this.freeMemory) {
			System.out.println("Not enough free memory! ");
		} else {
			this.freeMemory -= memory;
		}
	}
	
	int comparePrice(Computer c){
		if(this.price < c.price){
			System.out.println("This computer has lower price than the other one! ");
			return -1;
		}
		if(this.price > c.price){
			System.out.println("This computer has higher price than the other one! ");
			return 1;
		}
		System.out.println("Both computers have the same price! ");
		return 0;
	}

	void print() {
		System.out.println("Year: " + this.year);
		System.out.println("Price: " + this.price);
		System.out.println("Portable: " + this.isNotebook);
		System.out.println("Hard disk memory: " + this.hardDiskMemory + "Gb");
		System.out.println("Free memory: " + this.freeMemory + "Gb");
		System.out.println("Operation system: " + this.operationSystem);
	}

}
