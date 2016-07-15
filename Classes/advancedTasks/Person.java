package advancedTasks;

public class Person {
	int age;
	String name;
	Person[] friends;
	long personalNumber;
	Gender genderType;
	double money;
	Car car;

	Person() {
		this.age = 0;
		this.friends = new Person[3];
	}

	Person(String name, long personalNumber, Gender type, double money) {
		this();

		if ((this.name != null) && (this.name.length() >= 2)) {
			this.name = name;
		} else {
			this.name = "No name here";
		}

		if ((personalNumber > 0) && ("" + personalNumber).length() == 10) {
			this.personalNumber = personalNumber;
		} else {
			System.out.println("Kvo e tova EGN ve moshennik?!");
		}

		this.genderType = type;
		
		if(money < 0){
			System.out.println("You can't create a person with negative money! ");
		}else{
			this.money = money;
		}
	}

	void buyCar(Car car) {

		if (car != null) {
			this.car = car;
			this.car.changeOwner(this);
			this.money -= car.price;
		} else{
			System.out.println("Invalid car! ");
		}
	}

	double sellCarForScrap() {
		if (this.car != null) {
			this.money += this.car.calculateCarPriceForScrap(0.5);
			this.car = null;
		}else{
			System.out.println("You have no car to sell! ");
		}

		return this.money;
	}
}
